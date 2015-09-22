package br.com.compositeam.gradplanner.managed.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="userMB")
public class UserManagedBean {
	private int id;
	private String name;
	private String surname;
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String addUser(){
		System.out.println("Added user");
		return "Sucess";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
