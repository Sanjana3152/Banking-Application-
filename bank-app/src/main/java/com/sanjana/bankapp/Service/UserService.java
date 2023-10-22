package com.sanjana.bankapp.Service;

import org.springframework.stereotype.Service;

import com.sanjana.bankapp.dto.BankRespose;
import com.sanjana.bankapp.dto.UserRequest;

@Service
public interface UserService {

	
	BankRespose createAccount(UserRequest userRequest); 
}
