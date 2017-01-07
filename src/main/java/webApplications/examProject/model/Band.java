package webApplications.examProject.model;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class Band {
	
	//GENERATED, TODO
	
	@NotEmpty
	private String name;
	private List<String> genres;
	private String countryOfOrigin;
	private String cityOfOrigin;
	private int numberOfAlbums;
	private int numberOfMembers;
	
	public Band() {
		
	}

	public Band(String name, List<String> genres, String countryOfOrigin, String cityOfOrigin, int numberOfAlbums,
			int numberOfMembers) {
		super();
		this.name = name;
		this.genres = genres;
		this.countryOfOrigin = countryOfOrigin;
		this.cityOfOrigin = cityOfOrigin;
		this.numberOfAlbums = numberOfAlbums;
		this.numberOfMembers = numberOfMembers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getCityOfOrigin() {
		return cityOfOrigin;
	}

	public void setCityOfOrigin(String cityOfOrigin) {
		this.cityOfOrigin = cityOfOrigin;
	}

	public int getNumberOfAlbums() {
		return numberOfAlbums;
	}

	public void setNumberOfAlbums(int numberOfAlbums) {
		this.numberOfAlbums = numberOfAlbums;
	}

	public int getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityOfOrigin == null) ? 0 : cityOfOrigin.hashCode());
		result = prime * result + ((countryOfOrigin == null) ? 0 : countryOfOrigin.hashCode());
		result = prime * result + ((genres == null) ? 0 : genres.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfAlbums;
		result = prime * result + numberOfMembers;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Band other = (Band) obj;
		if (cityOfOrigin == null) {
			if (other.cityOfOrigin != null)
				return false;
		} else if (!cityOfOrigin.equals(other.cityOfOrigin))
			return false;
		if (countryOfOrigin == null) {
			if (other.countryOfOrigin != null)
				return false;
		} else if (!countryOfOrigin.equals(other.countryOfOrigin))
			return false;
		if (genres == null) {
			if (other.genres != null)
				return false;
		} else if (!genres.equals(other.genres))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfAlbums != other.numberOfAlbums)
			return false;
		if (numberOfMembers != other.numberOfMembers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Zenekar [name=" + name + ", genres=" + genres + ", countryOfOrigin=" + countryOfOrigin
				+ ", cityOfOrigin=" + cityOfOrigin + ", numberOfAlbums=" + numberOfAlbums + ", numberOfMembers="
				+ numberOfMembers + "]";
	}
	
	

}
