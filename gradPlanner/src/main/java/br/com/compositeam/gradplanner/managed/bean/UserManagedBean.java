package br.com.compositeam.gradplanner.managed.bean;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.compositeam.businessmodel.dao.UserDAO;
import br.com.compositeam.businessmodel.dao.UserDAOImpl;
import br.com.compositeam.businessmodel.model.User;
import br.com.compositeam.businessmodel.service.UserService;

@ManagedBean(name="userMB")
public class UserManagedBean {
	private String email;
	private String password;
	private User user;
	
	private UserService userService;

	public String addUser(){
		user = new User();
		System.out.println(email);
		System.out.println(password);
		user.setEmail(email);
		user.setPassword(password);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		userService = context.getBean(UserService.class);
		userService.save(user);
		context.close();
		return "sucess";
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public void reset(){
		this.email = "";
		this.password= "";
	}
	
	
}
