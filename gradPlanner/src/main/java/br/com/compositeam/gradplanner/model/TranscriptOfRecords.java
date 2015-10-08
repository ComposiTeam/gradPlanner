package br.com.compositeam.gradplanner.model;

import java.util.ArrayList;


public class TranscriptOfRecords {
	
	private double ira; // IRA is a number who represents the mentions of a student
	private Student student;
	private ArrayList<Result> results;
	
	//Empty Constructor
	public TranscriptOfRecords()
	{
		
	}
	
	//Full constructor
	public TranscriptOfRecords(double ira, Student student, ArrayList<Result> results)
	{
		this.ira = ira;
		this.student = student;
		this.results = results;
	}

	public Double getIra() {
		return ira;
	}

	public void setIra(Double ira) {
		//Faltam validações
		this.ira = ira;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ArrayList<Result> getResults() {
		return results;
	}

	public void setResults(ArrayList<Result> results) {
		this.results = results;
	}
	
	/*
	 * This method calculates the IRA of a student
	 * params: result: ArrayList of results of the student
	 * return: IRA is a double value
	 * */
	private double calculateIRA(ArrayList<Result> results)
	{
		
		double ira = 0;
		
		/**Method under construction**/
		
		
		return ira;
	}

}
