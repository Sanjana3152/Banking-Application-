package com.sanjana.bankapp.utils;

import java.time.Year;

public class AccountUtils {
	
	//2023+randomsisdigits
	public static final String ACCOUNT_EXIST_CODE="001";
	public static final String Account_EXISTS_MESSAGE ="THIS user already has an account";
	public static final String ACCOUNT_CREATION_SUCCESS="002";
	public static final String ACCOUNT_CREATION_MESSAGE="Account has been Successfully created";
	
		
	
		public static String generateAccountNumber() {
			
			
			Year currentYear= Year.now();
			int min=100000;
	 
			int max=999999;
			//generate a random numberbeetweenmin max
			int randNumber = (int) Math.floor(Math.random() *(max - min + 1)+min);
			// convert the current and reandom number tostring
			String year=String.valueOf(currentYear);
			
			String randomNumber = String.valueOf(randNumber);
			
			StringBuilder accountNumber =new StringBuilder();
			
			return accountNumber.append(year).append(randNumber).toString();
			
	
			
			
			
			
		}
}
