package com.thenxtprogrammer.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.thenxtprogrammer.demo.dto.RegistrationDto;
import com.thenxtprogrammer.demo.exceptions.CustomeResponseException;
import com.thenxtprogrammer.domain.Registration;
import com.thenxtprogrammer.repository.RegistrationRepository;

@Service("register")
@Primary
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;

//	@Autowired
//	private SpringbootappUtil springbootappUtil;

	public ResponseEntity<String> registerUser(RegistrationDto registrationDto) {
		// insert a record in db

		try {

			// check for email and userName

			Registration reg = registrationRepository.findByEmail(registrationDto.getEmail());

			if (reg != null) {
				throw new CustomeResponseException("Email Already Exist");
			}

			reg = registrationRepository.findByUserName(registrationDto.getUserName());

			if (reg != null) {
				throw new CustomeResponseException("Username Already Exist");
			}

			Registration registration = new Registration();

			registration.setCity(registrationDto.getCity());
			registration.setEmail(registrationDto.getEmail());// null
			registration.setFirstName(registrationDto.getFirstName());
			registration.setLastName(registrationDto.getLastName());
			registration.setMobNo(registrationDto.getMobNo());
			registration.setState(registrationDto.getState());
			registration.setUserName(registrationDto.getUserName());

			registrationRepository.save(registration);

			return new ResponseEntity<String>("registration successful!", HttpStatus.CREATED);

		} catch (CustomeResponseException e) {
			throw e;
		} catch (DataAccessException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public long getRecordCount() {

		return registrationRepository.count();
	}

	@Override
	public Object getRecord(Integer id) {

//		Registration registration = registrationRepository.getOne(id);
		Registration registration = registrationRepository.findById(id);

//		Map<String,String> responseMap = new HashMap<>();
//		
//		responseMap.put("firstName", registration.getFirstName());

		RegistrationDto registrationDto = new RegistrationDto();

		registrationDto.setCity(registration.getCity());
		registrationDto.setEmail(registration.getEmail());
		registrationDto.setFirstName(registration.getFirstName());
		registrationDto.setLastName(registration.getLastName());
		
		
		
		return registrationDto;
	}

}
