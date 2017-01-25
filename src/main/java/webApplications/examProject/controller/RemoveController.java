package webApplications.examProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webApplications.examProject.service.AlbumManager;
import webApplications.examProject.service.BandManager;
import webApplications.examProject.service.MemberManager;

@Controller
public class RemoveController {
	
	@Autowired
	private BandManager bandManager;
	@Autowired
	private MemberManager memberManager;
	@Autowired
	private AlbumManager albumManager;
	
	@RequestMapping("/albumRemove")
	public String albumRemove(@RequestParam(required=true) Integer id) {
		albumManager.deleteAlbumById(id);
		return "redirect:/albums";
	}
	
	@RequestMapping("/memberRemove")
	public String memberRemove(@RequestParam(required=true) Integer id) {
		memberManager.deleteMemberById(id);
		return "redirect:/members";
	}
	
	@RequestMapping("/bandRemove")
	public String bandRemove(@RequestParam(required=true) Integer id) {
		bandManager.deleteBandById(id);
		return "redirect:/bands";
	}

}
