package com.thenxtprogrammer.demo.dto;

import lombok.Data;

@Data
public class ResponseDto {

	private Object messsage;

	private Integer status;

	public Object getMesssage() {
		return messsage;
	}

	public void setMesssage(Object messsage) {
		this.messsage = messsage;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
