package com.citi.citidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citi.citidemo.domain.Userdetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<Userdetails, Integer>{

}