package webApplications.examProject.model;

import java.util.Date;
import java.util.List;

public class Member {
	
	//GENERATED, TODO
	
	private int ID;
	private String name;
	private String gender;
	private List<String> instruments;
	private Date birthDate;
	private String countryOfBirth;
	private String cityOfBirth;
	
	public Member(){
		
	}

	public Member(int iD, String name, String gender, List<String> instruments, Date birthDate, String countryOfBirth,
			String cityOfBirth) {
		super();
		ID = iD;
		this.name = name;
		this.gender = gender;
		this.instruments = instruments;
		this.birthDate = birthDate;
		this.countryOfBirth = countryOfBirth;
		this.cityOfBirth = cityOfBirth;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<String> instruments) {
		this.instruments = instruments;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public String getCityOfBirth() {
		return cityOfBirth;
	}

	public void setCityOfBirth(String cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((cityOfBirth == null) ? 0 : cityOfBirth.hashCode());
		result = prime * result + ((countryOfBirth == null) ? 0 : countryOfBirth.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((instruments == null) ? 0 : instruments.hashCode());
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
		Member other = (Member) obj;
		if (ID != other.ID)
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (cityOfBirth == null) {
			if (other.cityOfBirth != null)
				return false;
		} else if (!cityOfBirth.equals(other.cityOfBirth))
			return false;
		if (countryOfBirth == null) {
			if (other.countryOfBirth != null)
				return false;
		} else if (!countryOfBirth.equals(other.countryOfBirth))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (instruments == null) {
			if (other.instruments != null)
				return false;
		} else if (!instruments.equals(other.instruments))
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
		return "Member [ID=" + ID + ", name=" + name + ", gender=" + gender + ", instruments=" + instruments
				+ ", birthDate=" + birthDate + ", countryOfBirth=" + countryOfBirth + ", cityOfBirth=" + cityOfBirth
				+ "]";
	}
	
	

}
