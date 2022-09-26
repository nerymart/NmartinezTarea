package dol;

import java.util.Date;

public class Estudiante {
	private String firstName;
	private String middleName;
	private String surName;
	private String secondSurname;
	private String Gender;
	public Estudiante(String gender) {
		super();
		Gender = gender;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	private Date birthDate;
	private int licenseNumber;
	private Date date;
	public Estudiante() {
		super();
	}
	public Estudiante(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate, int licenseNumber, Date date) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
		this.secondSurname = secondSurname;
		
		this.birthDate = birthDate;
		this.licenseNumber = licenseNumber;
		this.date = date;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getSecondSurname() {
		return secondSurname;
	}
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
