package webApplications.examProject.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webApplications.examProject.model.Album;
import webApplications.examProject.model.Band;
import webApplications.examProject.model.Member;
import webApplications.examProject.service.AlbumManager;
import webApplications.examProject.service.BandManager;
import webApplications.examProject.service.MemberManager;

@Controller
public class PersistController {
	
	@Autowired
	private BandManager bandManager;
	@Autowired
	private MemberManager memberManager;
	@Autowired
	private AlbumManager albumManager;
	
	@RequestMapping("/albumForm")
	public String albumForm(@RequestParam(required=false) Integer id, @ModelAttribute("album") Album album) {
		if (id == null) {
			album.setAlbumID(0);
			album.setTitle("");
			album.setNumberOfSales(0);
			album.setYearOfRelease(0);
			album.setBand(null);
		} else {
			Album tempAlbum = albumManager.getAlbumById(id);
			album.setAlbumID(tempAlbum.getAlbumID());
			album.setTitle(tempAlbum.getTitle());
			album.setNumberOfSales(tempAlbum.getNumberOfSales());
			album.setYearOfRelease(tempAlbum.getYearOfRelease());
			album.setBand(tempAlbum.getBand());

		}
		return "albumform";
	}
	
	@RequestMapping("/insertAlbum")
	public String insertAlbum(@Valid @ModelAttribute("album") Album album, BindingResult bindigRes) {
		if (bindigRes.hasErrors())
			return "albumform";
		albumManager.saveAlbum(album);	
		return "redirect:/albums";
	}
	
	@RequestMapping("/memberForm")
	public String memberForm(@RequestParam(required=false) Integer id, @ModelAttribute("member") Member member, Model model) {
		if (id == null) {
			member.setMemberID(0);
			member.setName("");
			member.setGender("");
			member.setInstrument("");
			member.setBirthDate(null);
			member.setCountryOfBirth("");
			member.setBand(null);
			
		} else {
			Member tempMember = memberManager.getMemberById(id);
			member.setMemberID(tempMember.getMemberID());
			member.setName(tempMember.getName());
			member.setGender(tempMember.getGender());
			member.setInstrument(tempMember.getInstrument());
			member.setBirthDate(tempMember.getBirthDate());
			member.setCountryOfBirth(tempMember.getCountryOfBirth());
			member.setBand(tempMember.getBand());
		}
		return "memberform";
	}
	
	@RequestMapping("/insertMember")
	public String insertMember(@Valid @ModelAttribute("member") Member member, BindingResult bindigRes) {
		if (bindigRes.hasErrors())
			return "memberform";
		memberManager.saveMember(member);	
		return "redirect:/members";
	}
	
	@RequestMapping("/bandForm")
	public String bandForm(@RequestParam(required=false) Integer id, @ModelAttribute("band") Band band, Model model) {
		if (id == null) {
			band.setBandID(0);
			band.setName("");
			band.setGenre("");
			band.setCountryOfOrigin("");
			band.setAlbums(null);
			band.setMembers(null);
			model.addAttribute("members", memberManager.getAllMember());
			model.addAttribute("albums", albumManager.getAllAlbum());
		} else {
			Band tempBand = bandManager.getBandById(id);
			band.setBandID(tempBand.getBandID());
			band.setName(tempBand.getName());
			band.setGenre(tempBand.getGenre());
			band.setCountryOfOrigin(tempBand.getCountryOfOrigin());
			band.setAlbums(tempBand.getAlbums());
			band.setMembers(tempBand.getMembers());
			model.addAttribute("members", memberManager.getAllMember());
			model.addAttribute("albums", albumManager.getAllAlbum());
		}
		return "bandform";
	}
	
	@RequestMapping("/insertBand")
	public String insertBand(@Valid @ModelAttribute("band") Band band, BindingResult bindigRes) {
		if (bindigRes.hasErrors())
			return "redirect:/bandForm";
		bandManager.saveBand(band);	
		return "redirect:/bands";
	}
}
