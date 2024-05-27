package com.thenxtprogrammer.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thenxtprogrammer.demo.dto.RegistrationDto;
import com.thenxtprogrammer.demo.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService resgitrationService;

	@PostMapping("registerUser")
	public ResponseEntity<String> registerUser(@RequestBody @Valid RegistrationDto registrationDto) {
		return resgitrationService.registerUser(registrationDto);
	}

	@GetMapping("/getRecordCount")
	public long getRecordCount() {
		return resgitrationService.getRecordCount();
	}

	@GetMapping("/getRecord/{id}")
	public Object getRecord(@PathVariable Integer id) {

		System.out.println(id);
		return resgitrationService.getRecord(id);
	}
}

//JPA
//-> Hibernate 
//->Ib
