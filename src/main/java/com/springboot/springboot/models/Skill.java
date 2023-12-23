package com.springboot.springboot.models;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "Skill")
public class Skill implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SkillId")
    private Long skillId;

    @Column(name = "Category", length = 50)
    private String category;

    @Column(name = "SkillName", length = 50)
    private String skillName;

    public Skill() {
    }
    
    public Skill(String category, String skillName) {
        this.category = category;
        this.skillName = skillName;
    }
    
    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSkillName() {
        return skillName;
    }
    
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    
    @Override
    public String toString() {
        return "Skill [skillID=" + skillId + ", category=" + category + ", skillName=" + skillName + "]";
    }
}
