package com.thenxtprogrammer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thenxtprogrammer.domain.Registration;


//@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

	Registration findByEmail(String email);

	Registration findByUserName(String email);

	Registration findById(Integer id);

}
