package webApplications.examProject.model;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class Album {
	
	//GENERATED, TODO
	
	@NotEmpty
	private String title;
	private int numberOfSales;
	private Date releaseDate;
	private double lengthInMinutes;
	
	public Album() {
		
	}

	public Album(String title, int numberOfSales, Date releaseDate, double lengthInMinutes) {
		super();
		this.title = title;
		this.numberOfSales = numberOfSales;
		this.releaseDate = releaseDate;
		this.lengthInMinutes = lengthInMinutes;
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

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getLengthInMinutes() {
		return lengthInMinutes;
	}

	public void setLengthInMinutes(double lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(lengthInMinutes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numberOfSales;
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
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
		Album other = (Album) obj;
		if (Double.doubleToLongBits(lengthInMinutes) != Double.doubleToLongBits(other.lengthInMinutes))
			return false;
		if (numberOfSales != other.numberOfSales)
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Album [title=" + title + ", numberOfSales=" + numberOfSales + ", releaseDate=" + releaseDate
				+ ", lengthInMinutes=" + lengthInMinutes + "]";
	}
	
	

}
