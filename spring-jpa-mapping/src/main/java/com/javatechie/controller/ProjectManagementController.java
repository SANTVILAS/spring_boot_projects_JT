package com.javatechie.controller;

import ch.qos.logback.core.CoreConstants;
import com.javatechie.entity.Engineer;
import com.javatechie.entity.Project;
import com.javatechie.service.ProjectManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectManagementController {

    @Autowired
    private ProjectManagementService service;

    @PostMapping("/pro")
    public Project saveNewProject(@RequestBody Project project){
        System.out.println("Hello");
        return service.saveProject(project);
    }

    @GetMapping("/projects")
    public List<Project> getProjects(){
        return service.getProject();
    }


    @GetMapping("/engineers")
    public List<Engineer> getEngineers(){
        return service.getEngineeres();
    }



    @DeleteMapping("/project/{projectId}")
    public String deleteProject(@PathVariable int projectId) {
        return service.deleteProject(projectId);
    }

}
