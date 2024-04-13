package com.javatechie.service;

import com.javatechie.Entity.Employee;
import com.javatechie.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Employee createNewEmployee(Employee employee)
    {
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        employee.setRoles("DEFAULT_ROLE");
        return repository.save(employee);

    }

    public List<Employee> getEmployee(){
        return repository.findAll();
    }

    public Employee getEmployee(Integer id){
        return repository.findById(id).orElseThrow(()->new RuntimeException("Employee not found with this id"));
    }

    public Employee changeRoleOfEmployee(Employee employee){
      Employee existingEmployee = getEmployee((employee.getId()));
        existingEmployee.setRoles(employee.getRoles());
        return repository.save(existingEmployee);
    }

}
