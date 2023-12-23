package com.springboot.springboot.models;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "Project")
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProjectId")
    private Long projectId;

    @Column(name = "ProjectName", length = 100)
    private String projectName;

    @Column(name = "ProjectLink", length = 255)
    private String projectLink;

    @Column(name = "ProjectDescription", columnDefinition = "TEXT")
    private String projectDescription;
    
    public Project() {
    }

    public Project(String projectName, String projectLink, String projectDescription) {
        this.projectName = projectName;
        this.projectLink = projectLink;
        this.projectDescription = projectDescription;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public String getProjectDescription() {
        return projectDescription;
    }
    
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    @Override
    public String toString() {
        return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectLink=" + projectLink + ", projectDescription=" + projectDescription + "]";
    }
}
