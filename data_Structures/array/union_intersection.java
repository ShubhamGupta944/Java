package array;

// import java.util.*;

public class union_intersection {

    public static void main(String[] args){

        int a[] = {1,2,3,4,5,6,7,8,9};
        int b[] = {2,5,8,12};

        int n = a.length + b.length;

        // union(a, b, n);
        intersection(a, b, n);
    }

    static void union(int arr1[], int arr2[], int n){
        // int a[] = new int[n];
        // int k = arr1.length;
        // int l = arr2.length -1;

        // needed intersection to perform correct Union function
        for (int i = 0; i < n; i++){}
    }

    static void intersection(int arr1[], int arr2[], int n){
        int a[] = new int[n];
        int k = arr1.length;
        int l = arr2.length -1;
        int j = 0;

        for (int i = 0; i < k; i++){
            if(arr1[i] != arr2[l]){
                if(l == 0){
                    break;
                }
                l--;
            }else{
                a[j] = arr1[i];
                j++;
            }
        }

        System.out.println("intersection of the two arrays is: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
