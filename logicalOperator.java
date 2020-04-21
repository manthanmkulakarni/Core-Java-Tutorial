/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manthanmkulakarni
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=10,b=20,c=5;
        
        boolean r1,r2;
        
        r1=a>b;
        r2=b>c;
        
        System.out.println("Or "+(r1||r2));
        
        r1=a<b;
        r2=b>c;
        
        System.out.println("And "+(r1&&r2));
        
        
        
        System.out.println("Not "+!(r1&&r2));
        
       
        
        
 
        
    }
    
}
