package programs;

import java.util.Scanner;

public class addition{

    public static void main(String[] args) {

        int a,b,c;

        Scanner Scan = new Scanner(System.in);
        System.out.println("please enter 1st no.");
        a = Scan.nextInt();

       System.out.println("please enter 2nd no.");
       b = Scan.nextInt();

       c=a+b;
       
       System.out.println(c+" is the sum");

       Scan.close();

    }
}