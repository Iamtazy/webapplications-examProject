package webApplications.examProject.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webApplications.examProject.model.Band;

@Repository
public interface BandRepository extends CrudRepository<Band, Integer> {

}
