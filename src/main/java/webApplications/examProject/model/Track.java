package webApplications.examProject.model;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class Track {
	
	//GENERATED, TODO
	
	@NotEmpty
	private String title;
	private List<String> languages;
	private double lengthInMinutes;
	private String genre;
	
	public Track(){
		
	}

	public Track(String title, List<String> languages, double lengthInMinutes, String genre) {
		super();
		this.title = title;
		this.languages = languages;
		this.lengthInMinutes = lengthInMinutes;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public double getLengthInMinutes() {
		return lengthInMinutes;
	}

	public void setLengthInMinutes(double lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Track [title=" + title + ", languages=" + languages + ", lengthInMinutes=" + lengthInMinutes
				+ ", genre=" + genre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((languages == null) ? 0 : languages.hashCode());
		long temp;
		temp = Double.doubleToLongBits(lengthInMinutes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Track other = (Track) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (languages == null) {
			if (other.languages != null)
				return false;
		} else if (!languages.equals(other.languages))
			return false;
		if (Double.doubleToLongBits(lengthInMinutes) != Double.doubleToLongBits(other.lengthInMinutes))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	

}
