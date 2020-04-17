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

        int num1,num2,result;
        float num3;
        
        num1=9;
        num2=5;
        
        
        
        result=num1+num2;
        System.out.println("addition "+result);
        
        result=num1-num2;
        System.out.println("sub "+result);
        
        result=num2-num1;
        System.out.println("sub "+result);
        
        result=num2*num1;
        System.out.println("mul "+result);
        
        num3=num1/num2;
        result=num1%num2;
        System.out.println("div "+num3);
        System.out.println("reminder "+result);
        
        //shorthand operators 
        
        result=1;
        
        result+=2;
        
        System.out.println("addition assignmaent "+result);
        
        result-=4;
        
        System.out.println("sub assignmaent "+result);
        
        result*=2;
        System.out.println("mul assignmaent "+result);
        
        num3=2.2f;
        
        num3/=2;
        System.out.println("div assignmaent "+num3);
        
        result%=2;
        System.out.println("mod assignmaent "+result);
                
        
        
        //increment and decrement operator  or unary operator
        
        System.out.println("unary");
        
        result=0;
        
        result++;
        result++;
        
        System.out.println("increment "+result);
        
        result--;
        
        System.out.println("decrement "+result);
                
        
        
        
        
        
        
    }
    
}
