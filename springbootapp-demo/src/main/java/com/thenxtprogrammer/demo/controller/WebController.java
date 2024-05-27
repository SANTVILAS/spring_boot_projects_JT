package com.thenxtprogrammer.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thenxtprogrammer.demo.exceptions.CustomeResponseException;

@RestController
public class WebController {

	@GetMapping("/welcome")
//	@ResponseBody
	public String welcome() {
		System.out.println("hello test");
		// viewresolver
		throw new CustomeResponseException("TESTING");
	}
}
