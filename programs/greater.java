package programs;

import java.util.Scanner;

public class greater{

    public static void main(String[] args){

        int a,b,c;

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your first no.");
        a = scan.nextInt();

        System.out.println("please enter your second no.");
        b = scan.nextInt();

        System.out.println("please enter your third no.");
        c = scan.nextInt();

        if ((a>b)&&(a>c)){

            System.out.println(a+" is greater than the "+b+" "+c);
     
        }else if ((b>a)&&(b>c)){

            System.out.println(b+" is greater than the "+a+ " "+c);
     
        } else if((c>a)&&(c>b)){

            System.out.println(c+" is greater than the "+a+" "+b);
        
        }else{

            System.out.println("all numbers are equal");

        }

        scan.close();
        
    }
    
}