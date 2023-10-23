package com.sanjana.bankapp.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

	 
	 private String firstName;
	 private String lastName;
	 private String otherName;
	 private String gender;
	 private String address;
	 private String stateOfOrigin;
	 private String phoneNumber;
	 private String alternateNumber;
	 private String email;
	
	 

	

}
