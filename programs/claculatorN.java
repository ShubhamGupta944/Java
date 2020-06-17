package programs;

import java.util.Scanner;

public class claculatorN{

    public static void main(String[] args){

        int a,b,c;
        char n;

        Scanner scan = new Scanner(System.in);

        System.out.println("this program is an quite capable program because it can do addition using ('+') \nsubtraction by using ('-') multiplication by using ('*') \nand last but not the least divide ('/')\n");

        for(int i = 0; i < 10; i++){

            System.out.println(i+"\n");

            System.out.println("please enter your 1st no.");
            a = scan.nextInt();

            System.out.println("please enter your operator");
            n = scan.next().charAt(0);

            System.out.println("please enter your 2nd no.");
            b = scan.nextInt();

            if(n == '+'){

                c = a + b;
                System.out.println(c+" is the sum of your given no.\n");

            }else if(n == '-'){

                c = a - b;
                System.out.println(c+" is the remainder of your given no.\n");

            }else if(n == '*'){

                c = a * b;
                System.out.println(c+" is the product of your given no.\n");
                
            }else if(n == '/'){

                c = a / b;
                System.out.println(c+" is the questent of your given no.\n");

            }else{

                System.out.println("please enter an valid operator");

            }

            //if (c != 0) {

            //}
        
        }
        
        scan.close();
    }
    
}