package br.com.compositeam.gradplanner.model;

public class Mention {
	
	private String description;
	private String abreviation;
	
	//Empty constructor
	public Mention()
	{
		
	}
	
	//Full constructor
	public Mention(String description, String abreviation)
	{
		this.description = description;
		this.abreviation = abreviation;
	}
	
	//Getters and setters
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAbreviation() {
		return abreviation;
	}
	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}
	
	

}
