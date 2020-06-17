package programs;

import java.util.Scanner;

public class project{

    public static void main(String[] args){

        String a, c, d;
        int b;

        System.out.println("sign-up form");

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your name");
       
        a = scan.next();

       /* System.out.println("please enter your age");

         b = scan.nextInt();*/

        System.out.println("please enter your password");

        c = scan.next();

        System.out.println("please re-enter your password");

        d = scan.next();

        /*if ( c==d ){

            System.out.println("you are ready to go"+ a);


        }else if (c!=d){

            System.out.println("please check you your password you enter the wrong password");

        }else if(b >= 18){

            System.out.println("you may proceed");

        }else{

            System.out.println("you are not 18!");

        }*/

        scan.close();

    }
}