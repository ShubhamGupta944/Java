package programs;

import java.util.*;

public class even_odd{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your integer");

        int a = scan.nextInt();

        if(a%2 == 0){

            System.out.println(a+" is a even integer");

        }else{

            System.out.println(a+" is a odd integer");
        }

        scan.close();
    }
}