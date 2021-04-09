/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Ibyiciro by'ubudehe nk'uko biri mu Rwanda (upper, middle, working, poor)
 *
 * @author Planet Innovation
 */
@Entity
public class SocialClass implements Serializable {
private static  final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "auto_gen", sequenceName = "A")
    private Integer classId;
    private String description;
    
    public SocialClass(){}

    public SocialClass(String description) {
        this.description = description;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
