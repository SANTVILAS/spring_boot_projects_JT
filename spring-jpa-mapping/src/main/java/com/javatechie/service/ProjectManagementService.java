package com.javatechie.service;

import com.javatechie.entity.Engineer;
import com.javatechie.entity.Project;
import com.javatechie.repository.EngineerRepository;
import com.javatechie.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectManagementService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private EngineerRepository engineerRepository;

    public Project saveProject(Project project){
          return projectRepository.save(project);
    }

    public List<Project> getProject(){
     return projectRepository.findAll();
    }

    public List<Engineer> getEngineeres(){
        return engineerRepository.findAll();
    }

    public String deleteProject(int projectId){
        projectRepository.deleteById(projectId);
       return "Project "+projectId + "deleted ";
    }


}
