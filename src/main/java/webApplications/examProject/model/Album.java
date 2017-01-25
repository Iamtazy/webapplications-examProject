package webApplications.examProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Album")
public class Album {
	
	@Id
	@Column(name="album_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int albumID;
	@NotEmpty
	private String title;
	@NotNull
	@Min(value = 1)
	private int numberOfSales;
	@NotNull
	@Min(value = 1975)
	private int yearOfRelease;
	
	protected Album() {
		
	}

	public Album(int albumID, String title, int numberOfSales, int yearOfRelease) {
		super();
		this.albumID = albumID;
		this.title = title;
		this.numberOfSales = numberOfSales;
		this.yearOfRelease = yearOfRelease;
	}

	public int getAlbumID() {
		return albumID;
	}

	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfSales() {
		return numberOfSales;
	}

	public void setNumberOfSales(int numberOfSales) {
		this.numberOfSales = numberOfSales;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + albumID;
		result = prime * result + numberOfSales;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearOfRelease;
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
		Album other = (Album) obj;
		if (albumID != other.albumID)
			return false;
		if (numberOfSales != other.numberOfSales)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearOfRelease != other.yearOfRelease)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Album [albumID=" + albumID + ", title=" + title + ", numberOfSales=" + numberOfSales
				+ ", yearOfRelease=" + yearOfRelease + "]";
	}

	
}
