/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alexandre
 */

 class Main {

    public static void main(String[] args) throws IOException {
        
        int k   = -1;
        char c;
        int num = 0; 
      
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        k =  buffer.read();       
               
        while(buffer.ready()){

                           
           if(k >= 48 && k <= 57){
             
              switch (k) {
                     case 49: num = num + 1;
                              break;
                     case 50: num = num + 2;
                              break;
                     case 51: num = num + 3;
                              break;
                     case 52: num = num + 4;
                              break;
                     case 53: num = num + 5;
                              break;
                     case 54: num = num + 6;
                              break;
                     case 55: num = num + 7;
                              break;
                     case 56: num = num + 8;
                              break;
                     case 57: num = num + 9;
                              break;
              }
               
           } else {
        
              c = (char) k;

              if(c == 'b') {

                for(int j=0; j < num; j++){

                   System.out.print(' ');

                } 
             
                num = 0;

              } else {
            
                  if(c == '!' || c == '\n') {

                    System.out.print('\n');

                  } else {

                    for(int j=0; j < num; j++){

                      System.out.print(c);

                    }

                    num = 0;
         
                 }
            
         
         }  
                  
        }
           k = buffer.read();
     }
       System.out.println();
   }
} 