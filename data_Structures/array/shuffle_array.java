package array;

import java.util.*;

public class shuffle_array {
    public static void main(String[] args) {
        int n, m;
        int arr[] = new int['n'];
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the no. of elements you want to enter: ");
        n = scan.nextInt();
        System.out.println("please enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("please enter the no. m: ");
        m = scan.nextInt();

        solution a = new solution();
        System.out.println(a.shuffle(arr, m));

        scan.close();

    }
}

class solution {
    int[] shuffle(int arr[], int m) {

        int n = arr.length;
        int counter = 0;
        int arr1[] = new int[n];

        for (int i = 0; i < m; i++) {
            arr1[counter++] = arr[i];
            arr1[counter++] = arr[i + m];
        }

        return arr1;
    }
}