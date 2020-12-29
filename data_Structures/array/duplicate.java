package array;

import java.util.*;

public class duplicate{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n;
        int a[] = new int['n'];

        System.out.println("please enter the number of elements you want to insert: ");
        n = scan.nextInt();
        System.out.println("please enter the elements: ");
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        findDuplicate(a);
        scan.close();
    }

    static void findDuplicate(int arr[]){
        for(int k = 0; k < arr.length; k++){
            for(int p = k+1; p < arr.length; p++){
                if(arr[k] == arr[p]){
                    System.out.println(arr[k]);
                }
            }
        }
    }
}