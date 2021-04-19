/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.service;

import com.src.domain.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Planet Innovation
 */
public class AuthenticationServiceTest {
    
    public AuthenticationServiceTest() {
    }

    AuthenticationService authenticationService = new AuthenticationServiceImpl();
    
    User user = new User();
    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @Test
    public void testFindUser() {
    }

    @Test
    public void testBytesToStringHex() {
    }

    @Test
    public void testLogin() {
    }

    @Test
    public void testSignup() {
        user = authenticationService.signup("dar", "password");
        Assert.assertEquals(user.getUsername(), "dar");
    }
    
}
