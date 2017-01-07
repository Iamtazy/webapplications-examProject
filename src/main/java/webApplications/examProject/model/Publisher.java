package webApplications.examProject.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Publisher {
	
	//GENERATED, TODO
	
	@NotEmpty
	private int registrationNumber;
	@NotEmpty
	private String name;
	private String countryOfHQ;
	private String cityOfHQ;
	private double income;
	
	public Publisher(){
		
	}

	public Publisher(int registrationNumber, String name, String countryOfHQ, String cityOfHQ, double income) {
		super();
		this.registrationNumber = registrationNumber;
		this.name = name;
		this.countryOfHQ = countryOfHQ;
		this.cityOfHQ = cityOfHQ;
		this.income = income;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryOfHQ() {
		return countryOfHQ;
	}

	public void setCountryOfHQ(String countryOfHQ) {
		this.countryOfHQ = countryOfHQ;
	}

	public String getCityOfHQ() {
		return cityOfHQ;
	}

	public void setCityOfHQ(String cityOfHQ) {
		this.cityOfHQ = cityOfHQ;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityOfHQ == null) ? 0 : cityOfHQ.hashCode());
		result = prime * result + ((countryOfHQ == null) ? 0 : countryOfHQ.hashCode());
		long temp;
		temp = Double.doubleToLongBits(income);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + registrationNumber;
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
		Publisher other = (Publisher) obj;
		if (cityOfHQ == null) {
			if (other.cityOfHQ != null)
				return false;
		} else if (!cityOfHQ.equals(other.cityOfHQ))
			return false;
		if (countryOfHQ == null) {
			if (other.countryOfHQ != null)
				return false;
		} else if (!countryOfHQ.equals(other.countryOfHQ))
			return false;
		if (Double.doubleToLongBits(income) != Double.doubleToLongBits(other.income))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (registrationNumber != other.registrationNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Publisher [registrationNumber=" + registrationNumber + ", name=" + name + ", countryOfHQ=" + countryOfHQ
				+ ", cityOfHQ=" + cityOfHQ + ", income=" + income + "]";
	}

}
