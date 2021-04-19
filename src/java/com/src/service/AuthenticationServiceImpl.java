/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.service;

import com.src.dao.GeneralDao;
import com.src.domain.User;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Planet Innovation
 */
public class AuthenticationServiceImpl implements AuthenticationService{

    GeneralDao<User> userDao = new GeneralDao<>(User.class);
    User user = new User();
    
    private boolean isValidUser(String username){
        if(userDao.findByName(username) == null){
            return false;
        }
        
        return true;
    }
    
    public User findUser(String username){
        user = userDao.findByName(username);
        if(user == null){
            throw new RuntimeException("User Not Found");
        }else{
            return user;
        }
    }
    
     //   START OF Hash Password PROCCESS
    private String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.reset();
        byte[] hash = digest.digest(password.getBytes());
        return bytesToStringHex(hash);
    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String bytesToStringHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    @Override
    public User login(String username, String password) {
        if(!isValidUser(username)){
            throw new RuntimeException("Account Not Found");
        }  
        
        try {
            
            user = userDao.findByName(username);
            if(user.getPassword().toString().equals(hashPassword(password))){
                return user;
            }
            throw new RuntimeException("Wrong Password");           
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    @Override
    public User signup(String username, String password){
        if(isValidUser(username)){
            throw new RuntimeException("User Arleady Exist");
        }
        
        
        try {
            String hashedPassword = hashPassword(password);
            
            user = new User(username, hashedPassword);
            userDao.create(user);
            return user;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
}
