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
	private BandRepository bandrepo;
	
	public List<Band> getAllBand()
	{
		Iterable<Band> it = this.bandrepo.findAll();
		List<Band> list = new ArrayList<>();
		for(Band b : it)
		{
			list.add(b);
		}
		return list;
	}
	
	

}
