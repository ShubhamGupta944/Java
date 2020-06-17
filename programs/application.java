package programs;

import java.util.Scanner;

public class application{

    public static void main( String[] args) {

        int a,b,c;

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your 1st no.");
        a = scan.nextInt();
        System.out.println("please enter your 2nd no.");
        b = scan.nextInt();
        c=a+b;
        System.out.println("this is your result");
        System.out.printf("%d",c);

        scan.close();

    }
}