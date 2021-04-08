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
import com.src.domain.Users;
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
    GeneralDao usersDao = new GeneralDao(Users.class);
    

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
    
     @Override
    public Belonging createBelonging(Belonging belonging) {
        
        Object newBelonging = belongingDao.create(belonging);
        if (newBelonging != null) {
            return (Belonging) newBelonging;
        }
        throw new RuntimeException("System Message: validation Error");
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
    public Registration createRegistration(Registration registration) {
        Object newRegistration  = registrationDao.create(registration);
        if (newRegistration != null) {
            return (Registration) newRegistration;
        }
        throw new RuntimeException("System Message: validation Error");
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
    public Users createNewUser(Users users) {
        
        Object newUsers = usersDao.create(users);
        if (newUsers != null) {
            return (Users) newUsers;
        }
        throw new RuntimeException("System Message: validation Error");
    }

    @Override
    public void updateUser(Users users) {
        usersDao.update(users);
    }

    @Override
    public Users getUserById(Integer userId) {
        return (Users) usersDao.findById(userId);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersDao.findAll();
    }

    @Override
    public void deleteUser(Users users) {
        usersDao.delete(users);
    }
    
     

}
