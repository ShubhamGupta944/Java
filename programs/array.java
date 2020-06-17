package programs;

import java.util.Scanner;

class array{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("please enter the length of the array");
        a = scan.nextInt();

        int c[] = new int[a+1];

        System.out.println("enter the "+a+" elements");

        for(int i = 0; i < a; i++){
            
            c[i] = scan.nextInt();

        }

        System.out.println("enter the element you want to insert");

        b = scan.nextInt();

        c[a] = b;

        System.out.println("after inserting");

        for(int i = 0; i < a; i++){

            System.out.println(c[i]+",");

        }

        System.out.println(c[a]);

        scan.close();
    }
}