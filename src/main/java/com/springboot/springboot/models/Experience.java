package com.springboot.springboot.models;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "Experience")
public class Experience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExperienceId")
    private Long experienceId;

    @Column(name = "JobTitle", length = 100)
    private String jobTitle;

    @Column(name = "CompanyName", length = 100)
    private String companyName;

    @Column(name = "EmploymentType", length = 50)
    private String employmentType;

    @Column(name = "StartDate")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "EndDate")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "Link", length = 255)
    private String link;

    public Experience() {
    }

    public Experience(String jobTitle, String companyName, String employmentType, Date startDate, Date endDate, String description, String link) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.employmentType = employmentType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.link = link;
    }
    
    public Long getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(Long experienceId) {
        this.experienceId = experienceId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Experience [experienceId=" + experienceId + ", jobTitle=" + jobTitle + ", companyName=" + companyName + ", employmentType=" + employmentType + ", startDate=" + startDate + ", endDate=" + endDate + ", description=" + description + ", link=" + link + "]";
    }
}
