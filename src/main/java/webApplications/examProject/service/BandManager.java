package webApplications.examProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webApplications.examProject.model.Band;
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

}
