package com.javatechie.service;

import com.javatechie.Entity.Employee;
import com.javatechie.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class EmployeeUserDetailsService implements UserDetailsService {

    @Autowired
  private EmployeeRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Employee> employee = repository.findByUserName(username);
        return
                employee
                        .map(EmployeeUserDetails::new)
                        .orElseThrow(() -> new UsernameNotFoundException(username + " not found in system"));
    }
}
