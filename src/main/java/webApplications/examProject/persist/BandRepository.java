package webApplications.examProject.persist;

import org.springframework.data.repository.CrudRepository;

import webApplications.examProject.model.Band;

public interface BandRepository extends CrudRepository<Band, String> {
	
	

}
