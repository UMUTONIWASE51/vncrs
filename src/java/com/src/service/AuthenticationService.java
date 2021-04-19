/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.service;

import com.src.domain.User;

/**
 *
 * @author Planet Innovation
 */
public interface AuthenticationService {
    public User login(String username, String password);
    public User signup(String username, String password);
}
