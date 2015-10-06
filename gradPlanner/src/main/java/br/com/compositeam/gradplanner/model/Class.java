package br.com.compositeam.gradplanner.model;

import java.util.ArrayList;

public class Class {

	private String code;
	private ClassPeriod classPeriod;
	private Discipline discipline;
	private String description;
	private String teacher;
	private ArrayList<ClassSchedules> schedules;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public ClassPeriod getClassPeriod() {
		return classPeriod;
	}
	
	public void setClassPeriod(ClassPeriod classPeriod) {
		this.classPeriod = classPeriod;
	}
	
	public Discipline getDiscipline() {
		return discipline;
	}
	
	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTeacher() {
		return teacher;
	}
	
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public ArrayList<ClassSchedules> getSchedules() {
		return schedules;
	}

	public void setSchedules(ArrayList<ClassSchedules> schedules) {
		this.schedules = schedules;
	}
	
	
		
}