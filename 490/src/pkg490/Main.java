/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author alexandre
 */
 class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        char k = 'i';
        String array[] = new String[100];
        int lastLine[] = new int[100];
        int cont = 0;
        int contMax = 0;
        int line = 1;
        
        for(int i =0; i < 100; i++){
            
            array[i] = "";
            
        }
        
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        k = (char) buffer.read();       
        //ideia: se a linha anterior for maior que a linha atual, completar os espaços
        // com " ". caso contrário não faço nada.
        
        
        while(buffer.ready()){      
                           
                              
                if(k != '\n') {
                    
                    if(array[cont].equals("")){
                        
                        array[cont] = String.valueOf(k);
                        
                        
                    } else {
                        
                        
                        array[cont] = String.valueOf(k) + array[cont];
                        
                    }                          
                    
                    k = (char) buffer.read();
                    cont++;
                    
                } else {
                    
                    while(cont < 100 && array[cont]!=""){
                        
                        array[cont] = " " + array[cont];
                        cont++;
                        
                    }
                    cont = 0;
                    line ++;
                    k = (char) buffer.read();
                }          
              
            
        }
        
        while(cont < 100 && array[cont]!=""){
                        
            array[cont] = " " + array[cont];
            cont++;
                        
        }
                
        for(int i = 0; i < 100; i++){
            
            if(array[i].equals("")){
                
                break;
                
            } else {
                
                   System.out.println(array[i]);    
            }
            
        }
        
    }
    
}
