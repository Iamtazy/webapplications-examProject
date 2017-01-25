package webApplications.examProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import webApplications.examProject.model.Band;
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
	public String albumRemove(@RequestParam(required=true) Integer id, RedirectAttributes redirectAttr) {
		if (bandManager.findAlbumIdInBands(id)) {
			redirectAttr.addFlashAttribute("error", "Can't remove an Album when it's used as a foreign key in a Band object!  Please delete the Band first!");
			return "redirect:/albums";
		}
		albumManager.deleteAlbumById(id);
		return "redirect:/albums";
	}
	
	@RequestMapping("/memberRemove")
	public String memberRemove(@RequestParam(required=true) Integer id, RedirectAttributes redirectAttr) {
		if (bandManager.findMemberIdInBands(id)) {
			redirectAttr.addFlashAttribute("error", "Can't remove a Member when it's used as a foreign key in a Band object!  Please delete the Band first!");
			return "redirect:/members";
		}
		memberManager.deleteMemberById(id);
		return "redirect:/members";
	}
	
	@RequestMapping("/bandRemove")
	public String bandRemove(@RequestParam(required=true) Integer id) {
		bandManager.deleteBandById(id);
		return "redirect:/bands";
	}

}
