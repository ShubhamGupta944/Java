// Question

/**
*
* There are 16 hourglasses in arr. An hourglass sum is the sum of an hourglass' values. 
* Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass 
* sum. The array will always be 6x6.
*
**/

package programs;
import java.util.*;
public class hourGlass{
    public static void main(String[] args){

        int i, j, m, n, sum;
        int a[][] = new int['m']['n'];
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the no. of rows: ");
        m = scan.nextInt();
        System.out.println("please enter the no. of columns: ");
        n = scan.nextInt();

        // @ketanAggarwal58

        System.out.println(m+" is the no. of rows and "+n+" is the no. columns.");

        // entering the elements into the 2d array

        System.out.println("please the elements in the array: ");
        for (i = 0; i < m; i ++){
            for(j = 0; j < n; j++){
                a[i][j] = scan.nextInt();
            }
        }

        // printing the 2d array

        System.out.println("this is your 2d array: ");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j ++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("sum of a pattern HOUR_GLASS");

        sum = 0;

        // finds the sum of hour glass in a 3x3 matrix 

        if((m == 3) && (n == 3)){
            for(i = 0; i < 3; i++){     // rows of HourGlass
                for(j =0; j < 3; j++){  // columns of HourGlass
                    if(j == 1){
                        if(i == 1){
                            sum = sum + a[i][j];
                        }
                    }else{
                        sum = sum + a[i][j];
                    }
                }
            }
            System.out.println("sum = "+sum);

            // for higher order matrix 

        }else if((m>3)&&(n>3)){

            for(i = 0; i <= 3; i++){   // rows of HourGlass
                for(j = 0; j <= 3; j++){ //columns of HourGlass
                    if(j == 1){ // need to fix
                        if(i == 1){ // need to fix
                            sum = sum + a[i][j];
                        }
                    }else{
                        sum = sum + a[i][j];
                    }
                }
            }
            System.out.println("Sums: "+sum);
        }else{
            System.out.println("Can't able to find any hour_Glass pattern use a 3*3 or a higher order of matrix");
        }
        // end of program
        scan.close();
    }
}

class fun_hourg{
    fun_hourg(int a){}
}