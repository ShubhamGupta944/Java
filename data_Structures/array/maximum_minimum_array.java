package array;

class maximum_minimum_array{

    static void max(int arr[], int n){

        int i, max;
        max = arr[0];
        for(i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("maximum: "+max);
    }
    
    static void min(int arr[], int n){
        int i, min;
        min = arr[0];
        for(i = 0; i < n; i++){
            if(arr[i] > min){
            }else{
                min = arr[i];
            }
        }
        System.out.println("minimum: "+min);
    }
    
    public static void main(String[] args) {

        int a[] = { 20, 490, 37, 1234, 4};
        int n = a.length;

        max(a, n);
        min(a, n);
    }
    
}