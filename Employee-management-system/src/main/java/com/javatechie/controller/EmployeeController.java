package com.javatechie.controller;

import com.javatechie.Entity.Employee;
import com.javatechie.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to javatechie";
    }

    @PostMapping("/create")//this i want to make as nonsecure
  //  @PreAuthorize("hasAuthority('ROLE_HR')")
    public Employee onboardNewEmployee(@RequestBody Employee employee) {

        return service.createNewEmployee(employee);
    }


    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ROLE_HR') or hasAuthority('ROLE_MANAGER')")
    public List<Employee> getAll() {
        return service.getEmployee();
    }

    @GetMapping("/{Id}")
    @PreAuthorize("hasAuthority('ROLE_EMPLOYEE')")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return service.getEmployee(id);
    }

    @PutMapping("/update")
    @PreAuthorize("hasAuthority('AUTHORITY_ROLE_HR')")
    public Employee updateRoles(@RequestBody Employee employee) {
        return service.changeRoleOfEmployee(employee);
    }
}
