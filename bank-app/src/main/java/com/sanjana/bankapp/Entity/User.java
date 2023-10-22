package com.sanjana.bankapp.Entity;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 
 private String firstName;
 private String lastName;
 private String otherName;
 private String gender;
 private String address;
 private String stateOfOrigin;
 private String phoneNumber;
 private String alternateNumber;
 private String email;
 private String status;
 private String accountNumber;
 private BigDecimal accountBalance;
 @CreationTimestamp
 private LocalDateTime createdAt;
 @UpdateTimestamp
 private LocalDateTime modifiedAt;



public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getOtherName() {
	return otherName;
}

public void setOtherName(String otherName) {
	this.otherName = otherName;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getStateOfOrigin() {
	return stateOfOrigin;
}

public void setStateOfOrigin(String stateOfOrigin) {
	this.stateOfOrigin = stateOfOrigin;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getAlternateNumber() {
	return alternateNumber;
}

public void setAlternateNumber(String alternateNumber) {
	this.alternateNumber = alternateNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public BigDecimal getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(BigDecimal accountBalance) {
	this.accountBalance = accountBalance;
}

public LocalDateTime getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
}

public LocalDateTime getModifiedAt() {
	return modifiedAt;
}

public void setModifiedAt(LocalDateTime modifiedAt) {
	this.modifiedAt = modifiedAt;
}
 
 
 
 
}
