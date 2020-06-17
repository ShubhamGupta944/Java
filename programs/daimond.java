package programs;

import java.util.Scanner;

class daimond{
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int i, j, n, space = 1;

        System.out.println("please enter no. of rows");
        n = scan.nextInt();

        space = n-1;

        for(j = 1; j <= n; j++){

            for(i = 1; i <= space; i++){

                System.out.print(" ");

            }
            
            space--;

            for(i = 1; i <= 2*j-1; i++){

                System.out.print("*");

            }

            System.out.println("");

        }

        space = 1;

        for(j = 1; j <= n-1; j++){

            for(i=1; i <= space; i++){

                System.out.print(" ");

            }

            space++;

            for(i =1; i <= 2 *(n-j)-1; i++){

                System.out.print("*");
            }

            System.out.println("");
            scan.close();

        }
    }

}