package com.sanjana.bankapp.Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjana.bankapp.Entity.User;
import com.sanjana.bankapp.dto.AccountInfo;
import com.sanjana.bankapp.dto.BankRespose;
import com.sanjana.bankapp.dto.EmailDetails;
import com.sanjana.bankapp.dto.UserRequest;
import com.sanjana.bankapp.repository.UserRepository;
import com.sanjana.bankapp.utils.AccountUtils;
@Service
public class UserServiceImpl implements UserService {

@Autowired	
	UserRepository userrepo;

@Autowired
 EmailService emailService;
	
	
	@Override
	public BankRespose createAccount(UserRequest userRequest) {
		// TODO Auto-generated method stub
		//check if user already has anaccount
		if(userrepo.existsByEmail(userRequest.getEmail())) {
			 return BankRespose.builder()
					.responseCode(AccountUtils.ACCOUNT_EXIST_CODE)
					.responseMessage(AccountUtils.Account_EXISTS_MESSAGE)
					.accountInfo(null)
					.build();
			

		}
		
	
		User newUser = User.builder()
				.firstName(userRequest.getFirstName())
				.lastName(userRequest.getLastName())
				.otherName(userRequest.getOtherName())
				.gender(userRequest.getGender())
				.stateOfOrigin(userRequest.getStateOfOrigin())
				.address(userRequest.getAddress())
				.accountNumber(AccountUtils.generateAccountNumber())
				.accountBalance(BigDecimal.ZERO)
				.email(userRequest.getEmail())
				.phoneNumber(userRequest.getPhoneNumber())
				.alternateNumber(userRequest.getAlternateNumber())
				.status("ACTIVE")
		        .build();
		User saveUser = userrepo.save(newUser);
		
		 //send anemailalert
		EmailDetails emailDetails = EmailDetails.builder()
				.recipient(saveUser.getEmail())
				.subject("ACCOUNT CREATION")
				.message("Congrutulationyouraccount has been successfully created with AccountName"+
				saveUser.getFirstName()+" "+ saveUser.getLastName()+" "+ saveUser.getOtherName()
				+"\nAccount Number"+saveUser.getAccountNumber()+" ")
				.build();
		emailService.sendEmailAlert(emailDetails);
		
		return BankRespose.builder()
			   .responseCode(AccountUtils.ACCOUNT_CREATION_SUCCESS)
			   .responseMessage(AccountUtils.ACCOUNT_CREATION_MESSAGE)
			   .accountInfo(AccountInfo.builder()
					   .accountBalance(saveUser.getAccountBalance())
					   .accountNumber(saveUser.getAccountNumber())
					   .accountname(saveUser.getFirstName()+ " "+ saveUser.getLastName()+" "+ saveUser.getOtherName())
					  .build())
			   
			   .build();
		
		
		}

	
	
	
}
