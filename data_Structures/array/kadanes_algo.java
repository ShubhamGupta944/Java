package array;

import java.util.*;

public class kadanes_algo{
    public static void main(String[] args){
        int n;
        int a[] = new int['n'];
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of elements you want to insert: ");
        n = scan.nextInt();
        System.out.println("please enter the elements: ");
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        scan.close();
    }

    static void maxSubarraySum(int arr[], int n){
        // int temp, sum;

        for(int i = 0; i < n; i++){
            // if(){}
        }
    }

}