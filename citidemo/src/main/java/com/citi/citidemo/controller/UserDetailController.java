package com.citi.citidemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.citidemo.domain.Userdetails;
import com.citi.citidemo.service.UserDetailsService;

@RestController
public class UserDetailController {

	@Autowired
	private UserDetailsService userdetailService;
	
	@GetMapping("/userDetails")
	public List<Userdetails> getAllUser(){
		return userdetailService.getAllUser();
	}
}
