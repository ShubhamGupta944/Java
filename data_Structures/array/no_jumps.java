package array; 

import java.util.*;

public class no_jumps{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of elements you want to insert: ");
        int n = scan.nextInt();
        int a[] = new int['n'];
        System.out.println("please enter the elements");
        for(int i =0; i < n; i++){
            a[i] = scan.nextInt();
        }

        scan.close();
    }

    static void jumpCounts(int arr[]){
        int n = arr.length;
    }
}