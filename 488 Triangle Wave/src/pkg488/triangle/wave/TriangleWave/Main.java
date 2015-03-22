
package pkg488.triangle.wave.TriangleWave;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author alexandre
 */
public class Main {

    public static String[] band = new String[10];
    public static String[] freRep = new String[100000000];
    public static int[]    ampRep = new int[100000000];
    public static String outStr = "";
    String testInteger;
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int      amp  =  0;
        int      fre  =  0;
        int      max  = -1;
        int      cont;  
        
        String[] amplitude = {" ","1","22","333","4444","55555",
            "666666","7777777","88888888","999999999"};
        
        for(int k = 0; k < 10; k++){
            
            Main.printFre(amplitude, 1, k);
            
        }
                
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cont = Integer.valueOf(br.readLine());
        br.readLine(); 
        
        while(cont > 0){    
            
            try{
                
                amp = Integer.valueOf(br.readLine());
                
            } catch (NumberFormatException ex) {
                
                amp = Integer.valueOf(br.readLine());
                
            }
            
            try{
                
                fre = Integer.valueOf(br.readLine());
                
            } catch (NumberFormatException ex) {
                
                fre = Integer.valueOf(br.readLine());
                
            }          
            
            if(Main.ampRep[amp] != 0){
                
                int posFre = Main.ampRep[amp];
                
                if(posFre <= fre) {
                    
                    fre = fre - posFre;
                    Main.outStr = Main.outStr + Main.freRep[posFre];
                    
                    for(int i = 0; i < fre; i ++) {
                
                       Main.outStr = Main.outStr + Main.band[amp];
                       Main.freRep[fre] = Main.freRep[fre] + Main.band[amp];
                           
                    }    
                    
                } 
                                
            } else {
                
                for(int i = 0; i < fre; i ++) {
                
                    Main.outStr = Main.outStr + Main.band[amp];
                    Main.freRep[fre] = Main.freRep[fre] + Main.band[amp];
                           
                }
                
            }         
            
            cont-=1;          
            
        }
        
        br.close();
        Main.outStr = Main.outStr.trim();
        System.out.print(Main.outStr);
        
     }
    
    public static void printFre(String[] amplitude, int fre, int amp){
        
        int pos = amp - 1;
        String posSide = "";
        String negSide = "";
        int cont;
        
        if(amp == 0){
            cont = 0;
        } else {
            cont = 1;
        }
        
         for (int w = cont; w <= amp; w++) {
               
            posSide = posSide + amplitude[w] + "\n";
            if(w > 0) {
                negSide = negSide + amplitude[pos] + "\n"; 
            }             
            pos--;
            
        }
         
        Main.band[amp] = posSide + negSide;       
              
    }

}