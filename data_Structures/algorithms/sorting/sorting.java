package algorithms.sorting;

public class sorting{
    public static void main(String[] args) {
        int arr[] = {665, 869, 899, 908};
        int n = arr.length;

        for(int i = 0; i < n; i++){

            int j = n-1;
            int b = arr[i];
            int c = arr[j];
            if(b>c){
                arr[j] = b;
                arr[i] = c;
                j = j -1;
            }else{
                arr[i] = b;
                arr[j] = c; 
                j = j -1;
            }
        }

        System.out.println("sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }    
}