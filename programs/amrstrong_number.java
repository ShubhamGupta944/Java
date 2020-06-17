package programs;

import java.util.*;

public class amrstrong_number{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
        int number, originalNumber, remainder, result = 0;

        System.out.println("please enter an number to check that it is an armstrong number or not");

        number = scan.nextInt();
    
        originalNumber = number;
    
        while (originalNumber != 0){

            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
            
        }
    
        if(result == number){
                
            System.out.println(number + " is an Armstrong number.");

        }else{
            
            System.out.println(number + " is not an Armstrong number.");
            
        }

        scan.close();
        
    }

}