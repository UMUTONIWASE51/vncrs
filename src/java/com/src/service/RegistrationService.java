/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.service;

import com.src.domain.Belonging;
import com.src.domain.Person;
import com.src.domain.Registration;
import com.src.domain.SocialClass;
import com.src.domain.Users;
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
    
    /**
     * 
     * @param socialClass the social class object to be saved
     * @return 
     */
    public SocialClass createSocialClass(SocialClass socialClass);
    
    /**
     * 
     * @param socialClass the social class object to be edited
     */
    public void updateSocialClass(SocialClass socialClass);
    
    /**
     * 
     * @param classId the social class Id 
     * @return the social class matching the ID
     */
    public SocialClass getSocialClassById(Integer classId);
    /**
     * gets all existing classes from the DB
     * @return 
     */
    public List<SocialClass> getAllClasses();
    /**
     * 
     * @param socialclass the social class to be deleted
     */
    public void deleteSocialClass(SocialClass socialclass);
    
    /************************************************************************/
    
    /***************************** BELONGING ******************************/
    /**
     * 
     * @param belonging the belonging to be saved in DB
     * @return 
     */
    public Belonging createBelonging(Belonging belonging);
    /**
     * 
     * @param belonging the belonging to be updated
     */
   
    public void updateBelonging(Belonging belonging);
    /**
     * 
     * @param belongingId the belonging
     * @return the belonging matching the ID 
     */
    public Belonging getBelongingById(Integer belongingId);
    /**
     * 
     * @return all the existing belongings from the DB
     */
    public List<Belonging> getAllBelongings();
    /**
     * 
     * @param belonging to be deleted 
     */
    public void deleteBelonging(Belonging belonging);
    
    /************************************************************************/
    /***************************** REGISTATION ******************************/
    /**
     * 
     * @param registration
     * @return 
     */
    public Registration createRegistration(Registration registration);
    /**
     * 
     * @param registration 
     */
    public void updateRegistration(Registration registration);
    /**
     * 
     * @param registrationId 
     * @return the registration matching the ID
     */
    public Registration getRegistrationById(Integer registrationId);
    /**
     * 
     * @return all registered families form the DB
     */
    public List<Registration> getAllRegistrations();
    /**
     * 
     * @param registration 
     */
    public void deleteRegistration(Registration registration);
    
    /************************************************************************/
     /***************************** USERS ******************************/
    /**
     * 
     * @param user
     * @return 
     */
    public Users createNewUser(Users user);
            /**
             * 
             * @param user 
             */
    public void updateUser(Users user);
    /**
     * 
     * @param userId
     * @return 
     */
    public Users getUserById(Integer  userId);
    /**
     * 
     * @return 
     */
    public List<Users> getAllUsers();
    /**
     * 
     * @param user 
     */
    public void deleteUser(Users user);
    
    /************************************************************************/
    
}
