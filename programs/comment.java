package programs;

import java.util.Scanner;

public class comment{

    public static void main(String[] args){


         Scanner scan = new Scanner(System.in);
         System.out.println("enter number of elements");

         int n = scan.nextInt();
 
         String arr[] = new String[n];
 
         System.out.println("enter elements");
 
         for(int i=0; i<n; i++){ //for reading array
             
            arr[i] = scan.next();
 
            }

            System.out.println("these are the numeric data which you have given please verify");
 
         for(String i: arr){ //for printing array
 
             System.out.println(i);
            
            }

            scan.close();
    }

}