package webApplications.examProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import webApplications.examProject.model.Band;

@Component
public class BandConverter implements Converter<Integer, Band> {

	@Autowired
	private BandManager bandManager;
	
	@Override
	public Band convert(Integer arg0) {
		Band band = bandManager.getBandById(arg0);
		return band;
	}

}
