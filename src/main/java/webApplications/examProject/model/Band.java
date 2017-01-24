package webApplications.examProject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Band {
	
	@Id
	@Column(name="band_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int bandID;
	@NotEmpty
	private String name;
	@NotEmpty
	private String genre;
	@NotEmpty
	private String countryOfOrigin;
	@OneToMany(mappedBy="band")
	private List<Album> albums;
	@OneToMany(mappedBy="band")
	private List<Member> members;
	
	protected Band() {
		
	}

	public Band(int bandID, String name, String genre, String countryOfOrigin, List<Album> albums,
			List<Member> members) {
		super();
		this.bandID = bandID;
		this.name = name;
		this.genre = genre;
		this.countryOfOrigin = countryOfOrigin;
		this.albums = albums;
		this.members = members;
	}

	public int getBandID() {
		return bandID;
	}

	public void setBandID(int bandID) {
		this.bandID = bandID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((albums == null) ? 0 : albums.hashCode());
		result = prime * result + bandID;
		result = prime * result + ((countryOfOrigin == null) ? 0 : countryOfOrigin.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((members == null) ? 0 : members.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (albums == null) {
			if (other.albums != null)
				return false;
		} else if (!albums.equals(other.albums))
			return false;
		if (bandID != other.bandID)
			return false;
		if (countryOfOrigin == null) {
			if (other.countryOfOrigin != null)
				return false;
		} else if (!countryOfOrigin.equals(other.countryOfOrigin))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (members == null) {
			if (other.members != null)
				return false;
		} else if (!members.equals(other.members))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Band [bandID=" + bandID + ", name=" + name + ", genre=" + genre + ", countryOfOrigin=" + countryOfOrigin
				+ ", albums=" + albums + ", members=" + members + "]";
	}

	
}
