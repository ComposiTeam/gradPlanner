package br.com.compositeam.gradplanner.model;

public class Student {
	
	private Person person;
	private String registrationNumber;
	private String passwordMW;
	
	//Empty constructor
	public Student()
	{
		
	}
	
	//Full constructor
	public Student(Person person, String registrationNumber, String passwordMW)
	{
		this.person = person;
		this.registrationNumber = registrationNumber;
		this.passwordMW = passwordMW;
	}
	
	
	/*Getters and setters*/
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getPasswordMW() {
		return passwordMW;
	}
	public void setPasswordMW(String passwordMW) {
		this.passwordMW = passwordMW;
	}
	
	

}
