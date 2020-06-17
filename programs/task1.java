package programs;

import java.util.Scanner;

public class task1{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("please input an string");
        String a = scan.nextLine();
        String b = a.toUpperCase(); 

        System.out.println("converting the string into the lowercase letters");
        System.out.println(b.toLowerCase());

        System.out.println("total no. of characters in the above string including space is");
        System.out.println(a.length());

        for (int i = 0; i < 10; i++){

            System.out.println(a);

        }

        scan.close();
    }
}