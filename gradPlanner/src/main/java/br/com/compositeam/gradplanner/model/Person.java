package br.com.compositeam.gradplanner.model;

import org.hibernate.validator.constraints.br.CPF;

public class Person {
	
	private String email;
	//private User user; Commented to avoid conflict
	private String name;
	private String lastName;
	private CPF cpf;

}
