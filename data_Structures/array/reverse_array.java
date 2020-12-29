package array;
import java.util.*;

public class reverse_array{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n;
        int a[] = new int['n'];

        System.out.println("please enter the no. of elements you want to insert: ");
        n = scan.nextInt();
        System.out.println("please enter the elements in the array: ");
        for (int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        reverse(a,n);
        scan.close();
    }

    static void reverse(int arr[], int n){
        int b[] = new int[n];
        int j = n;
        for(int i = 0; i < n; i++){
            b[j-1] = arr[i];
            j = j-1;
        }

        System.out.println("\nthis is your reversed array: ");
        for(int k = 0; k < n; k++){
            System.out.println(b[k]);
        }
    }
}
