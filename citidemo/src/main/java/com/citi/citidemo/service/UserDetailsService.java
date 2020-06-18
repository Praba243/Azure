package com.citi.citidemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.citidemo.domain.Userdetails;
import com.citi.citidemo.repository.UserDetailsRepository;


@Service
public class UserDetailsService {

	@Autowired
	UserDetailsRepository userdetailRepo;
	
	public List<Userdetails> getAllUser(){
		return userdetailRepo.findAll();
	}
	
	public void save(Userdetails userdetail){
		userdetailRepo.save(userdetail);
	}
	
	public Userdetails getUserById(Integer id){
		
		return userdetailRepo.findById(id).get();
	}
}
