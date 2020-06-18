package com.citi.citidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citi.citidemo.domain.Userdetails;

public interface UserDetailsRepository extends JpaRepository<Userdetails, Integer>{

}