package com.javatechie.controller;

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

    @PostMapping("/projects")
    public Project saveNewProject(@RequestBody Project project){
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
