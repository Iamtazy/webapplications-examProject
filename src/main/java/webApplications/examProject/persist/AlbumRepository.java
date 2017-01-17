package webApplications.examProject.persist;

import org.springframework.data.repository.CrudRepository;

import webApplications.examProject.model.Album;

public interface AlbumRepository extends CrudRepository<Album, String> {

}
