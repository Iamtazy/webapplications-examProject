package webApplications.examProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Album")
public class Album {
	
	@Id
	@Column(name="title", nullable = false)
	@NotEmpty
	private String title;
	@NotEmpty
	private int numberOfSales;
	@NotEmpty
	@Min(value = 1975)
	private int yearOfRelease;
	@Min(value = 1)
	@Max(value = 25)
	@NotEmpty
	private double lengthInMinutes;
	@ManyToOne
	@JoinColumn(name="bandName")
	@NotEmpty
	private Band bandName;
	
	protected Album() {
		
	}

	public Album(String title, int numberOfSales, int yearOfRelease, double lengthInMinutes, Band bandName) {
		super();
		this.title = title;
		this.numberOfSales = numberOfSales;
		this.yearOfRelease = yearOfRelease;
		this.lengthInMinutes = lengthInMinutes;
		this.bandName = bandName;
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

	public double getLengthInMinutes() {
		return lengthInMinutes;
	}

	public void setLengthInMinutes(double lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}

	public Band getBandName() {
		return bandName;
	}

	public void setBandName(Band bandName) {
		this.bandName = bandName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bandName == null) ? 0 : bandName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(lengthInMinutes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (bandName == null) {
			if (other.bandName != null)
				return false;
		} else if (!bandName.equals(other.bandName))
			return false;
		if (Double.doubleToLongBits(lengthInMinutes) != Double.doubleToLongBits(other.lengthInMinutes))
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
		return "Album [title=" + title + ", numberOfSales=" + numberOfSales + ", yearOfRelease=" + yearOfRelease
				+ ", lengthInMinutes=" + lengthInMinutes + ", bandName=" + bandName + "]";
	}

	
}
