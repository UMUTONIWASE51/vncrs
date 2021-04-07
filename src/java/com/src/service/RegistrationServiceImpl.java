/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.src.service;

import com.src.dao.GeneralDao;
import com.src.domain.Person;
import java.util.Date;

/**
 *
 * @author Planet Innovation
 */
public class RegistrationServiceImpl implements RegistrationService{

    private Person person = new Person("", "", new Date(), "", "", "", "");
    GeneralDao<Person> personDao = new GeneralDao<>(Person.class);

    public RegistrationServiceImpl() {
    }
    
    
    
    private boolean isExistPerson(String nid){
        if(personDao.findById(nid) == null){
            return false;
        }
        
        return true;
    }
    
//    public String generateSocialClass(Property prop){
//        
//        if(prop.isCar() && prop.isHouse() && prop.isFurnitures()){
//            return "Upper";
//        }else if(prop.isCar() && prop.isHouse()){
//            return "Middle";
//        }else if(prop.isHouse() && prop.isFurnitures()){
//            return "Working";
//        }else{
//           return "poor"; 
//        }
//    }
    
    
    @Override
    public Person registerNewPerson(String nid) {
        
        try {
            if(isExistPerson(nid)){
                throw new RuntimeException("Person Arleady Registered");
            }
            
//            String socialClass = generateSocialClass(prop);
//            String previousCountry = prevC.getCode();
            
            person = new Person("", "", new Date(), "", "", "", "");
            
            Person retPerson = new Person("", "", new Date(), "", "", "", "");
            personDao.create(person);
            if(retPerson != null){
                return retPerson;
            }
            throw new RuntimeException("System Message: validation Error");
        } catch (Exception e) {
            throw new RuntimeException("Internal Server Error: "+e.getMessage());
        }
    }
}
