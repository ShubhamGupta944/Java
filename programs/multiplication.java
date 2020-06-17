package programs;

import java.util.Scanner;

public class multiplication{

    public static void main(String[] args){

        int a,b,c;

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter 1st no.");
        a = scan.nextInt();

        System.out.println("please enter 2nd no.");
        b = scan.nextInt();

        c = a*b;

        System.out.println(c);

        scan.close();

    }
}