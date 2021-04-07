/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Ibyiciro by'ubudehe nk'uko biri mu Rwanda (upper, middle, working, poor)
 *
 * @author Planet Innovation
 */
@Entity
public class SocialClass implements Serializable {

    @Id
    private Integer classId;
    private String description;

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
