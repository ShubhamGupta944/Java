package programs;

import java.util.*;

public class alphabet_A{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n, i, j;
        
        System.out.println("please enter the no. of line in which you want to make the alphabet");

        n = scan.nextInt();

        for(i = 0; i < n; i++){

            for(j = 0; j <= n/2; j++) {
                
                if((j == 0 || j == n/2) && i != 0 ||
                 
                i == 0 && j != 0 && j != n/2 ||
                
                i == n/2)

                    System.out.println("*");

                 else

                     System.out.println(" ");                
 
            }

            System.out.println();

        }

        scan.close();
        
    }
}