/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.service;

import com.src.dao.GeneralDao;
import com.src.domain.Belonging;
import com.src.domain.Person;
import com.src.domain.Registration;
import com.src.domain.SocialClass;
import com.src.domain.User;
import java.util.List;

/**
 *
 * @author Planet Innovation
 */
public class RegistrationServiceImpl implements RegistrationService {

    //private Person person = new Person("", "", new Date(), "", "", "", "");
    GeneralDao personDao = new GeneralDao(Person.class);
    GeneralDao socialClassDao = new GeneralDao(SocialClass.class);
    GeneralDao belongingDao = new GeneralDao(Belonging.class);
    GeneralDao registrationDao = new GeneralDao(Registration.class);
    GeneralDao usersDao = new GeneralDao(User.class);

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
    public void createNewPerson(Person person) {
        personDao.create(person);
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
    public void createSocialClass(SocialClass socialClass) {
        socialClassDao.create(socialClass);
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

    @Override
    public void createBelonging(Belonging belonging) {
        belongingDao.create(belonging);
    }

    @Override
    public void updateBelonging(Belonging belonging) {
        belongingDao.update(belonging);
    }

    @Override
    public Belonging getBelongingById(Integer belongingId) {
        return (Belonging) belongingDao.findById(belongingId);
    }

    @Override
    public List<Belonging> getAllBelongings() {
        return belongingDao.findAll();
    }

    @Override
    public void deleteBelonging(Belonging belonging) {
        belongingDao.delete(belonging);
    }

    @Override
    public void createRegistration(Registration registration) {
        registrationDao.create(registration);
    }

    @Override
    public void updateRegistration(Registration registration) {
        registrationDao.update(registration);
    }

    @Override
    public Registration getRegistrationById(Integer registrationId) {
        return (Registration) registrationDao.findById(registrationId);
    }

    @Override
    public List<Registration> getAllRegistrations() {
        return registrationDao.findAll();
    }

    @Override
    public void deleteRegistration(Registration registration) {
        registrationDao.delete(registration);
    }

    @Override
    public void createNewUser(User users) {
        usersDao.create(users);
    }

    @Override
    public void updateUser(User users) {
        usersDao.update(users);
    }

    @Override
    public User getUserById(Integer userId) {
        return (User) usersDao.findById(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return usersDao.findAll();
    }

    @Override
    public void deleteUser(User users) {
        usersDao.delete(users);
    }
}
