package webApplications.examProject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="member_ID", nullable = false)
	@NotNull
	private int memberID;
	@NotEmpty
	private String name;
	@NotEmpty
	private String gender;
	@NotEmpty
	private String instrument;
	@NotNull
	private Date birthDate;
	@NotEmpty
	private String countryOfBirth;
	
	public Member(){
		
	}

	public Member(int memberID, String name, String gender, String instrument, Date birthDate, String countryOfBirth) {
		super();
		this.memberID = memberID;
		this.name = name;
		this.gender = gender;
		this.instrument = instrument;
		this.birthDate = birthDate;
		this.countryOfBirth = countryOfBirth;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
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

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((countryOfBirth == null) ? 0 : countryOfBirth.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((instrument == null) ? 0 : instrument.hashCode());
		result = prime * result + memberID;
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
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
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
		if (instrument == null) {
			if (other.instrument != null)
				return false;
		} else if (!instrument.equals(other.instrument))
			return false;
		if (memberID != other.memberID)
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
		return "Member [memberID=" + memberID + ", name=" + name + ", gender=" + gender + ", instrument=" + instrument
				+ ", birthDate=" + birthDate + ", countryOfBirth=" + countryOfBirth + "]";
	}

	
}
