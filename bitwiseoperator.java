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
        
        int a=10,b=5;
        
        System.out.println("Not of "+a+" is "+(~a));
        
        System.out.println("Or of "+a+" , "+b+" is "+(a|b));
        
        System.out.println("And of "+a+" , "+b+" is "+(a&b));
        
        System.out.println("XOR of "+a+" , "+b+" is "+(a^b));
        
        System.out.println("Rigth shift of "+a+" is "+(a>>b));
        
        System.out.println("Left shift of "+a+" is "+(a<<b));
        
        a=-10;
        
        System.out.println("Rigth shift of "+a+" is "+(a>>b));
        System.out.println("Unsigned Rigth shift of "+a+" is "+(a>>>b));
        
        
 
        
    }
    
}
