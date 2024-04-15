package com.javatechie.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer projectId;
    private String name;
    private String projectCode;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "project_engineer_fk",referencedColumnName ="projectId")
    private List<Engineer> engineers;


}
