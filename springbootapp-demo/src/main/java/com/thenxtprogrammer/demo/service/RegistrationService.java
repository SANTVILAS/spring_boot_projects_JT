package com.thenxtprogrammer.demo.service;

import org.springframework.http.ResponseEntity;

import com.thenxtprogrammer.demo.dto.RegistrationDto;

public interface RegistrationService {

	ResponseEntity<String> registerUser(RegistrationDto registrationDto);

	long getRecordCount();

	Object getRecord(Integer id);

}
