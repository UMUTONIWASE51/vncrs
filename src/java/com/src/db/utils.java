/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.db;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Planet Innovation
 */
public class utils {
     public Date getDate(String date){
        try{
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat  simpleDateFormat = new SimpleDateFormat(pattern);
            return simpleDateFormat.parse(date);
                    
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new Date();
        }
}
