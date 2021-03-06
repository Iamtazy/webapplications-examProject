package webApplications.examProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webApplications.examProject.model.Album;
import webApplications.examProject.persist.AlbumRepository;

@Service
public class AlbumManager {
	
	@Autowired
	private AlbumRepository albumRepository;
	
	public Album saveAlbum(Album album) {
		return this.albumRepository.save(album);
	}
	
	public Album getAlbumById(int id) {
		Album foundAlbum = albumRepository.findOne(id);
		return foundAlbum;
	}
	
	public List<Album> getAllAlbum() {
		Iterable<Album> it = this.albumRepository.findAll();
		List<Album> albumList = new ArrayList<>();
		for(Album a : it) {
			albumList.add(a);
		}
		return albumList;
	}
	
	public void deleteAlbumById(int id){
		albumRepository.delete(id);
	}

}
