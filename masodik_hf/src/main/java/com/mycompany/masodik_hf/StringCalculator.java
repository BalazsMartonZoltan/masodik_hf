/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.masodik_hf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MártonZoltán
 */
public class StringCalculator {

    public int add(String numbers) {
        int osszeg=0;
        if (!numbers.isEmpty()) {
            String[] numbersStringList = numbers.split(",|\\;|\\\n|\\|");
            List<Integer> negativeNumbers = new ArrayList<>();
            
            for (String stringnumber : numbersStringList) {
                int intnumber=Integer.parseInt(stringnumber);
                if(intnumber<0){
                  negativeNumbers.add(intnumber);
                }
                osszeg+=intnumber;
            }
            if(negativeNumbers.size()>0){
                
                System.out.print("Negatives not allowed:");
                for (int i = 0; i < negativeNumbers.size()-1; i++) {
                    System.out.print(negativeNumbers.get(i)+", ");
                }
                return negativeNumbers.get(negativeNumbers.size()-1);
            }
            return osszeg;
        }
        return osszeg;
    }
}
