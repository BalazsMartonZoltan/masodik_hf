/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.masodik_hf;

import java.util.ArrayList;

/**
 *
 * @author MártonZoltán
 */
public class StringCalculator {

    public int add(String numbers) {
        int osszeg=0;
        if (!numbers.isEmpty()) {
            String[] numbersStringList = numbers.split(",");
            
            for (String stringnumber : numbersStringList) {
                int intnumber=Integer.parseInt(stringnumber);
                
                osszeg+=intnumber;
            }
            return osszeg;
        }
        return osszeg;
    }
}
