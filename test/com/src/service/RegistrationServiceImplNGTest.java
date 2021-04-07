/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.service;
import com.src.domain.Person;
import java.util.Date;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Planet Innovation
 */
public class RegistrationServiceImplNGTest {

    String nid = "1199800078";
    Person person = new Person("", "", new Date(), "", "", "", "");
    RegistrationService registrationService = new RegistrationServiceImpl();

    public RegistrationServiceImplNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @Test
    public void testGenerateSocialClass() {

    }

    @Test
    public void testRegisterNewPerson() {
        person = registrationService.registerNewPerson(nid);
        Assert.assertEquals(person.getNid(), nid);
    }

    @Test
    public void testGetPerson() {
    }

    @Test
    public void testSetPerson() {
    }

    @Test
    public void testGetChildrens() {
    }

    @Test
    public void testSetChildrens() {
    }

}
