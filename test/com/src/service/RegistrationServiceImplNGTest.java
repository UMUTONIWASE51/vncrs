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
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Planet Innovation
 */
public class RegistrationServiceImplNGTest {

    private String nid;
    private Person person;
    private SocialClass socialStatus;
    private RegistrationService service;

    public RegistrationServiceImplNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        nid = "1199800078";
        person = new Person("Umutoniwas", "Daphnet", new Date(), "Female", "1199865656565656", "larsonbitch@gmail.com", "07887777777");
        socialStatus = new SocialClass("Upper");
        service = new RegistrationServiceImpl();
    }

    @Test
    public void testGenerateSocialClass() {
        service.createSocialClass(socialStatus);
        SocialClass social = service.getSocialClassById(1);
        Assert.assertEquals(social.getDescription(), "Upper");
    }

    @Test
    public void testRegisterNewPerson() {
        Person newPerson = service.createNewPerson(person);
        Assert.assertEquals(newPerson.getNid(), "1199865656565656");
    }

    @Test
    public void testGetPerson() {
    }

    @Test
    public void testSetPerson() {
    }

}
