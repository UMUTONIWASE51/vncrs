/**
 *
 */
package com.src.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity that has all information about a physical person
 * 
 * @author Planet Innovation
 */
@Entity
public class Person implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer personId;
    private String firstName;
    private String lastName;
    private Date dob;
    private String gender;
    private String nid;
    private String email;
    private String phone;

    /**
     * @param firstName
     * @param lastName
     * @param dob
     * @param gender
     * @param nid
     * @param email
     * @param phone
     */
    public Person(String firstName, String lastName, Date dob, String gender, String nid, String email, String phone) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.nid = nid;
        this.email = email;
        this.phone = phone;
    }

    /**
     * @return the personId
     */
    public Integer getPersonId() {
        return personId;
    }

    //	/**
    //	 * @param personId the personId to set
    //	 */
    //	public void setPersonId(Integer personId) {
    //		this.personId = personId;
    //	}
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the nid
     */
    public String getNid() {
        return nid;
    }

    /**
     * @param nid the nid to set
     */
    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
