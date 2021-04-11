/**
 *
 */
package com.src.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity to persist the registration in the Village database
 * @author Planet Innovation
 */
@Entity
public class Registration implements Serializable{
private static  final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer registrationId;
    private String village;
    private Date registrationDate;
    @ManyToOne
    @JoinColumn(name="person_id")
    private Person familyChief;
    @ManyToOne
    @JoinColumn(name="class_id")
    private SocialClass socialClass;
    //@OneToMany
    private ArrayList<Person> members = new ArrayList<>();
    //@OneToMany
    private ArrayList<Belonging> belongings = new ArrayList<>();

    public Registration(String village, Date registrationDate, Person familyChief, SocialClass socialClass) {
        this.village = village;
        this.registrationDate = registrationDate;
        this.familyChief = familyChief;
        this.socialClass = socialClass;
    }
    
    

    /**
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * @param village the village to set
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * @return the registrationDate
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * @param registrationDate the registrationDate to set
     */
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * @return the familyChief
     */
    public Person getFamilyChief() {
        return familyChief;
    }

    /**
     * @param familyChief the familyChief to set
     */
    public void setFamilyChief(Person familyChief) {
        this.familyChief = familyChief;
    }

    /**
     * @return the registrationId
     */
    public Integer getRegistrationId() {
        return registrationId;
    }

    /**
     * @return the members
     */
    public ArrayList<Person> getMembers() {
        return members;
    }

    /**
     * @param person the Person to be added as family member
     */
    public void addMember(Person person) {
        getMembers().add(person);
    }

    /**
     * @return the belongings
     */
    public ArrayList<Belonging> getBelongings() {
        return belongings;
    }

    /**
     * @param belonging the Belonging to be added to te list of Belongings
     */
    public void addBelonging(Belonging belonging) {
        getBelongings().add(belonging);
    }

    public SocialClass getSocialClass() {
        return socialClass;
    }

    public void setSocialClass(SocialClass socialClass) {
        this.socialClass = socialClass;
    }

}
