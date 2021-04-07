/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.service;

import com.src.domain.Person;
import com.src.domain.SocialClass;
import java.util.List;

/**
 *
 * @author Planet Innovation
 */
public interface RegistrationService {
    
    /***************************** PERSON ***********************************/
    
    /**
     * Create a new Person to be saved into DB
     *
     * @param person the Person object to be saved
     * @return the newly created Person object with its ID
     */
    public Person createNewPerson(Person person);

    /**
     * Edits existing person
     *
     * @param person the Person object to be updated
     */
    public void updatePerson(Person person);

    /**
     * Gets a Person from the DB by specified ID
     *
     * @param personId the Person unique ID
     * @return matched Person
     */
    public Person getPersonById(Integer personId);

    /**
     * Gets all existing Persons from the DB
     *
     * @return
     */
    public List<Person> getAllPeople();

    /**
     * Deletes a given Person from DB
     *
     * @param person the Person to be deleted
     */
    public void deletePerson(Person person);
    
    /************************************************************************/
    
    /***************************** SOCIAL CLASS ******************************/
    
    public SocialClass createSocialClass(SocialClass socialClass);
    public void updateSocialClass(SocialClass socialClass);
    public SocialClass getSocialClassById(Integer classId);
    public List<SocialClass> getAllClasses();
    public void deleteSocialClass(SocialClass socialclass);
    
    /************************************************************************/
}
