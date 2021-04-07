/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.service;

import com.src.dao.GeneralDao;
import com.src.domain.Person;
import com.src.domain.SocialClass;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Planet Innovation
 */
public class RegistrationServiceImpl implements RegistrationService {

    //private Person person = new Person("", "", new Date(), "", "", "", "");
    GeneralDao personDao = new GeneralDao(Person.class);
    GeneralDao socialClassDao = new GeneralDao(SocialClass.class);

    public RegistrationServiceImpl() {
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
//    @Override
//    public Person registerNewPerson(String nid) {
//        
//        try {
//            if(isExistPerson(nid)){
//                throw new RuntimeException("Person Arleady Registered");
//            }
//            
////            String socialClass = generateSocialClass(prop);
////            String previousCountry = prevC.getCode();
//            
//            person = new Person("", "", new Date(), "", "", "", "");
//            
//            Person retPerson = new Person("", "", new Date(), "", "", "", "");
//            personDao.create(person);
//            if(retPerson != null){
//                return retPerson;
//            }
//            throw new RuntimeException("System Message: validation Error");
//        } catch (Exception e) {
//            throw new RuntimeException("Internal Server Error: "+e.getMessage());
//        }
//    }
    @Override
    public Person createNewPerson(Person person) {
        Object newPerson = personDao.create(person);
        if (newPerson != null) {
            return (Person) newPerson;
        }
        throw new RuntimeException("System Message: validation Error");
    }

    @Override
    public void updatePerson(Person person) {
        personDao.update(person);
    }

    @Override
    public Person getPersonById(Integer personId) {
        return (Person) personDao.findById(personId);
    }

    @Override
    public List<Person> getAllPeople() {
        return personDao.findAll();
    }

    @Override
    public void deletePerson(Person person) {
        personDao.delete(person);
    }

    @Override
    public SocialClass createSocialClass(SocialClass socialClass) {
        
        Object newClass = socialClassDao.create(socialClass);
        if (newClass != null) {
            return (SocialClass) newClass;
        }
        throw new RuntimeException("System Message: validation Error");
    }

    @Override
    public void updateSocialClass(SocialClass socialClass) {
        socialClassDao.update(socialClass);
    }

    @Override
    public SocialClass getSocialClassById(Integer classId) {
        return (SocialClass) socialClassDao.findById(classId);
    }

    @Override
    public List<SocialClass> getAllClasses() {
        return socialClassDao.findAll();
    }

    @Override
    public void deleteSocialClass(SocialClass socialclass) {
        socialClassDao.delete(socialclass);
    }
}
