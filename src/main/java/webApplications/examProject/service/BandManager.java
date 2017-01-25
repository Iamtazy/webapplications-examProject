package webApplications.examProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webApplications.examProject.model.Album;
import webApplications.examProject.model.Band;
import webApplications.examProject.model.Member;
import webApplications.examProject.persist.BandRepository;

@Service
public class BandManager {
	
	@Autowired
	private BandRepository bandRepository;
	
	public Band saveBand(Band band){
		return this.bandRepository.save(band);
	}
	
	public Band getBandById(int id) {
		Band foundBand = bandRepository.findOne(id);
		return foundBand;
	}
	
	public List<Band> getAllBand() {
		Iterable<Band> it = this.bandRepository.findAll();
		List<Band> bandList = new ArrayList<>();
		for(Band b : it) {
			bandList.add(b);
		}
		return bandList;
	}
	
	public void deleteBandById(int id){
		bandRepository.delete(id);
	}
	
	public boolean findAlbumIdInBands(int id) {
		List<Band> bandList = this.getAllBand();
		for(Band b : bandList) {
			List<Album> albumList = b.getAlbums();
			for(Album a : albumList) {
				if (a.getAlbumID() == id)
					return true;
			}
		}
		return false;
	}
	
	public boolean findMemberIdInBands(int id) {
		List<Band> bandList = this.getAllBand();
		for(Band b : bandList) {
			List<Member> memberList = b.getMembers();
			for(Member m : memberList) {
				if (m.getMemberID() == id)
					return true;
			}
		}
		return false;
	}

}
