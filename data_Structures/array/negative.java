package array;
import java.util.*;

public class negative {   
    public static void main(String[] args) {
        int n; 
        int a[] = new int['n'];
        
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of elements you want to insert: ");
        n = scan.nextInt();

        System.out.println("please enter the elements in the array: ");
        for(int i =0; i < n; i++){
            a[i] = scan.nextInt();
        }

        move(a, n);

        scan.close();
    }

    static void move(int arr[], int n){
        int b[] = new int[n];
        int j = 0;
        int m = n-1;
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                b[j] = arr[i];
                j++;
            }else{
                b[m] = arr[i];
                m--;
            }
        }

        System.out.println("This is the sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.println(b[i]);
        }
    }
}
