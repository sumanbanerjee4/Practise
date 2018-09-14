package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;



@Entity
@Table
public class Login {

	Login(){}

	public Login(String userName, String password) {
		
		super();
		UserName = userName;
		Password = password;
	}


	@Column
	String UserName;
	@Column
	String Password;
	
	@Id
	int Id;


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "Login [UserName=" + UserName + ", Password=" + Password + "]";
	}}
