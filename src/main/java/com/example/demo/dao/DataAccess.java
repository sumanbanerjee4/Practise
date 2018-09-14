package com.example.demo.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.pojo.Login;


@Repository
@Transactional
public class DataAccess {
	
	@Autowired
	SessionFactory sessionfactory;

	public DataAccess() {}
	
	
	public Login findById(Long id) {
		
		Session session=this.sessionfactory.getCurrentSession();
		return session.get(Login.class, id);	
	}
	
	@Transactional
	public void LoginFailed(String Username, String Password,Long id) throws LoginException {
		 
		Login s = this.findById(id);
		 
		 if(s.getUserName()== null||s.getUserName().contains("a")){
			 throw new LoginException("login Failed"  +id);
			 }		 
		 
 }


	
	
}
