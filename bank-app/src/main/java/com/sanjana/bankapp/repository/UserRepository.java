package com.sanjana.bankapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.sanjana.bankapp.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	 public Boolean existsByEmail(String Email);
	  

}
