package br.com.compositeam.gradplanner.model;

public class Discipline {

	private int code;
	private String name;
	private int quantityOfCredits;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantityOfCredits() {
		return quantityOfCredits;
	}
	
	public void setQuantityOfCredits(int quantityOfCredits) {
		this.quantityOfCredits = quantityOfCredits;
	}
	
}
