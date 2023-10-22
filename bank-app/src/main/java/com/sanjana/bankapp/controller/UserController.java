package com.sanjana.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.sanjana.bankapp.Service.UserService;
import com.sanjana.bankapp.Service.UserServiceImpl;
import com.sanjana.bankapp.dto.BankRespose;
import com.sanjana.bankapp.dto.UserRequest;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserServiceImpl userSer;
	
	@PostMapping()
	public BankRespose createAccount(@RequestBody UserRequest userrequest) {
		return userSer.createAccount(userrequest);
	}
	

}
