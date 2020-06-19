package com.citi.citidemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.citidemo.domain.Userdetails;
import com.citi.citidemo.repository.UserDetailsRepository;


@Service
public class UserDetailsService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	public List<Userdetails> getAllUser(){
		return (List<Userdetails>) userDetailsRepository.findAll();
	}
	
	public void save(Userdetails userdetail){
		System.out.println("inside service for save");
		userDetailsRepository.save(userdetail);
	}
	
	public Userdetails getUserById(Integer id){
		
		return userDetailsRepository.findById(id).get();
	}
}
