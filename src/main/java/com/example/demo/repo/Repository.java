package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojo.Login;

public interface Repository extends CrudRepository<Login, Long> {
	
	

}
