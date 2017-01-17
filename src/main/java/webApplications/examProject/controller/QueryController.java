package webApplications.examProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import webApplications.examProject.model.Band;
import webApplications.examProject.service.BandManager;

@Controller
public class QueryController {
	
	@Autowired
	private BandManager bandManager;
	
	@RequestMapping("/index")
	public String index() {
		return "index"; 
	}
	
	@RequestMapping("/bands")
	public String bands(@ModelAttribute("bands") ArrayList<Band> bandList) {
		bandList = (ArrayList<Band>) bandManager.getAllBand();
		return "bands";
	}

}
