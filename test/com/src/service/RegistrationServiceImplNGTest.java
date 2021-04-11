/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.service;
import com.src.dao.GeneralDao;
import com.src.domain.Person;
import com.src.domain.Registration;
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
    private Person person, umwana, umukozi;
    private SocialClass socialStatus;
    private Registration registration;
    private RegistrationService service;

    public RegistrationServiceImplNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        service = new RegistrationServiceImpl();
        nid = "11998000097";
        //How to create a Person Object using Constructor
        person = new Person("Umutoniwase", "Daphnet", new Date(), "Female", "1199865656565656", "larsonbitch@gmail.com", "07887777777");
        umwana = new Person("Umwana", "Muto", new Date(), "Male", "", "larsonbitch@gmail.com", "07887777777");
        umukozi = new Person("Umukozi", "Karyarugo", new Date(), "Female", "1199865656565656", "larsonbitch@gmail.com", "07887777777");
        //How to create a SociaClass object using Constructor
        socialStatus = new SocialClass("Upper");
        //Saving the socialClass object before using it for Registration
        service.createSocialClass(socialStatus);
        //Saving the Person ojbect before using it for Registration
        service.createNewPerson(person);
        //How to create a Regsistration object using Constructor
        registration = new Registration("Akagari", new Date(), person, socialStatus);
        //Adding a child as a member of the family
        registration.addMember(umwana);
        //Adding a housgirl as a member of the family
        registration.addMember(umukozi);
    }

    @Test
    public void testGenerateSocialClass() {
        SocialClass social = service.getSocialClassById((Integer)1);
        Assert.assertEquals(social.getDescription(), "Upper");
    }

    @Test
    public void testCreateNewPerson() {
        Assert.assertEquals(service.getPersonById(1).getNid(), "1199865656565656");
    }

    @Test
    public void testRegisterNewComer() {
        //We only savea this Registration if and only if we already saved the Person and SocialClass objects!
        service.createRegistration(registration);
        Assert.assertNotNull(registration);
        Assert.assertEquals(registration.getFamilyChief().getFirstName(), "Umutoniwase");
        Assert.assertEquals(registration.getMembers().size(), 2);
        Assert.assertEquals(registration.getSocialClass().getDescription(), "Upper");
        Assert.assertEquals(registration.getBelongings().size(), 0);
    }

    @Test
    public void testSetPerson() {
    }

}
