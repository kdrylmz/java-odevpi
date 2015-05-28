/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package odevpi;

import java.math.BigDecimal;
/**
 *
 * @author hidalgo123
 */
public class OdevPi {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // TODO code application logic here
        
        int isaret=-1;
       float  sonuc=0;
        for( int i=1; i<=200000;i+=2)
        {
            isaret*=-1;
        sonuc+=(4/i)*isaret;
              
        System.out.printf("%.2f",sonuc);  
        }
        
        
    }
    
}
