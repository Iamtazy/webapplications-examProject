package webApplications.examProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import webApplications.examProject.model.Album;
import webApplications.examProject.model.Band;
import webApplications.examProject.model.Member;
import webApplications.examProject.service.AlbumManager;
import webApplications.examProject.service.BandManager;
import webApplications.examProject.service.MemberManager;

@Controller
public class QueryController {
	
	@Autowired
	private BandManager bandManager;
	@Autowired
	private AlbumManager albumManager;
	@Autowired
	private MemberManager memberManager;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index(){
		return "mainPage";
	}
	
	@RequestMapping("/bands")
	public String bands(Model model) {
		List<Band> bandList = bandManager.getAllBand();
		model.addAttribute("bands", bandList);
		return "bands";
	}
	
	@RequestMapping("/members")
	public String members(Model model) {
		List<Member> memberList = memberManager.getAllMember();
		model.addAttribute("members", memberList);
		return "members";
	}
	
	@RequestMapping("/albums")
	public String albums(Model model) {
		List<Album> albumList = albumManager.getAllAlbum();
		model.addAttribute("members", albumList);
		return "albums";
	}
}
