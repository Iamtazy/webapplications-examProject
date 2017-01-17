package webApplications.examProject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Band {
	
	@Id
	@Column(name="name", nullable = false)
	@NotEmpty
	private String name;
	@NotEmpty
	private String genre;
	@NotEmpty
	private String countryOfOrigin;
	@NotEmpty
	private String cityOfOrigin;
	@NotEmpty
	private int numberOfAlbums;
	@NotEmpty
	private int numberOfMembers;
	@OneToMany(mappedBy="bandName")
	private List<Album> albums;
	@OneToMany(mappedBy="band")
	private List<Member> members;
	@OneToOne
	private Publisher publisher;
	
	public Band() {
		
	}

	public Band(String name, String genre, String countryOfOrigin, String cityOfOrigin, int numberOfAlbums,
			int numberOfMembers, List<Album> albums, List<Member> members, Publisher publisher) {
		super();
		this.name = name;
		this.genre = genre;
		this.countryOfOrigin = countryOfOrigin;
		this.cityOfOrigin = cityOfOrigin;
		this.numberOfAlbums = numberOfAlbums;
		this.numberOfMembers = numberOfMembers;
		this.albums = albums;
		this.members = members;
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((albums == null) ? 0 : albums.hashCode());
		result = prime * result + ((cityOfOrigin == null) ? 0 : cityOfOrigin.hashCode());
		result = prime * result + ((countryOfOrigin == null) ? 0 : countryOfOrigin.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((members == null) ? 0 : members.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfAlbums;
		result = prime * result + numberOfMembers;
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
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
		if (numberOfAlbums != other.numberOfAlbums)
			return false;
		if (numberOfMembers != other.numberOfMembers)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Band [name=" + name + ", genres=" + genre + ", countryOfOrigin=" + countryOfOrigin + ", cityOfOrigin="
				+ cityOfOrigin + ", numberOfAlbums=" + numberOfAlbums + ", numberOfMembers=" + numberOfMembers
				+ ", albums=" + albums + ", members=" + members + ", publisher=" + publisher + "]";
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
}
