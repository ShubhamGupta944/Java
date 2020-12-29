package array;

import java.util.*;

    // Write a program to cyclically rotate array by one

public class rotate_array_one {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int n;
        int a[] = new int['n'];

        System.out.println("please enter total number of elemensts you want to insert: ");
        n = scan.nextInt();
        System.out.println("please enter the elements: ");
        for(int i =0; i<n; i++){
            a[i] = scan.nextInt();
        }

        oneRotate(a, n);

        scan.close();
        
    }

    static void oneRotate(int arr[], int n){

        int temp; 

        temp = arr[n-1];
        arr[n-1] = arr[0];
        arr[0] = temp;

        System.out.println("Rotated array is: ");
        for(int i = 0; i < n; i++ ){
            System.out.println(arr[i]);
        }
    }
    
}
