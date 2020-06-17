package programs;

import java.util.Scanner;

public class calculator{

    public static void main(String[] args){

        int a,c,d;
        char b;

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your 1st no.");
        a = scan.nextInt();

        System.out.println("please enter your operator");
        b = scan.next().charAt(0);

        System.out.println("please enter your 2nd no.");
        c = scan.nextInt();

        switch (b) {
            
            case '+':
            d = a+c;
            System.out.println(d);
            break;

            case '-':
            d = a-c;
            System.out.println(d);
            break;

            case '*':
            d = a*c;
            System.out.println(d);

            case '/':
            d = a/c;
            System.out.println(d);

            default:
            System.out.println("please enter an valid operator");
                break;


        }

        scan.close();

    }

}