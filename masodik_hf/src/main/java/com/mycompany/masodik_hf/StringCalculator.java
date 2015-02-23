/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.masodik_hf;

/**
 *
 * @author MártonZoltán
 */
public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String [] numbersList=numbers.split(",");
      
      switch(numbersList.length){
          case 1: return Integer.parseInt(numbersList[0]) ;
      }
    }
}
