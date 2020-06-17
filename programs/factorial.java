package programs;

import java.util.*;

public class factorial {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter an integer: ");
        
        int number = scan.nextInt();

        int i,fact=1;  

         for(i=2; i <= number; i++){ 

            fact = fact*i; 

         } 

           System.out.println("Factorial of "+number+" is: "+fact);

    } 

}  