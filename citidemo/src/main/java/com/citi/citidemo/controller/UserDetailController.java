package com.citi.citidemo.controller;

import java.net.Socket;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.citidemo.domain.Userdetails;
import com.citi.citidemo.service.UserDetailsService;

@RestController
public class UserDetailController {

	@Autowired
	private UserDetailsService userdetailService;
	
	@Value("${dbaddress}")
	private String dbaddress;
	
	@Value("${dbport}")
	private int dbPort;
	
	@PostMapping("filterUserDetails")
	public List<Userdetails> getFilteredUser(@RequestBody Userdetails userdetail){
		System.out.println("inside userDetails controller");
		List<Userdetails> allUsers=userdetailService.getAllUser();
		List<Userdetails> filteredUsers=allUsers.stream().filter(user -> user.getId()==userdetail.getId() || user.getAge() ==userdetail.getAge()).collect(Collectors.toList());
		System.out.println(filteredUsers);
		return filteredUsers;
	}
	
	@PostMapping(path="insertUserDetail", consumes = "application/json", produces = "application/json")
	public void addUser(@RequestBody Userdetails userdetail){
		System.out.println("inside insertUserDetail controller");
		userdetailService.save(userdetail);
	}
	
	@GetMapping("checkDbConn")
	public String checkDBConn(){
		String connStatus="false";
		System.out.println(dbaddress+"  ,  "+dbPort);
		try(Socket s=new Socket(dbaddress, dbPort) ){
			System.out.println(" inside try");
			connStatus="true";
			return connStatus;
		}catch (Exception e){
			return connStatus;
		}
	}
	
}
