package webApplications.examProject.persist;

import org.springframework.data.repository.CrudRepository;

import webApplications.examProject.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Integer> {

}
