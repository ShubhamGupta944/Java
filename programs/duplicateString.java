package programs;

import java.util.Scanner;

public class duplicateString{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a string");

        String a = scan.next();

        char[] b = a.toCharArray(); 

        for(int i = 0; i < a.length(); i++){

            for(int j = i+1; j < a.length(); j++){

                if(b[i] == b[j]){

                    System.out.println(b[j]);

                    break;

                }
            }
        }

        scan.close();
    }
}