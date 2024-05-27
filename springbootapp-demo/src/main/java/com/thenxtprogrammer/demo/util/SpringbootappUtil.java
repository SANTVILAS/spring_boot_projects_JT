package com.thenxtprogrammer.demo.util;

import org.springframework.stereotype.Component;

import com.thenxtprogrammer.demo.dto.ResponseDto;

@Component
public class SpringbootappUtil {

	public static ResponseDto response(Object message, Integer statusCode) {
		ResponseDto response = new ResponseDto();
		response.setMesssage(message);
		response.setStatus(statusCode);
		return response;
	}
}
