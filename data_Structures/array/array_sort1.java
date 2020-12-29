package array;

public class array_sort1 {
    public static void main(String[] args) {
        int a[] = { 0, 1,1,1, 0, 0, 2, 2,2,2,2,1,0, 0, 0,1,1,1, 2,2,2,1,1,1,2,2,2,0,0,2,2};
        int n = a.length;

        int Zero, One, Two; 
        int count1 = 0, count2 = 0, count3  = 0;
        

        for(int f = 0; f < n; f++){
            if(a[f] == 0){
                count1++;
            }else if(a[f] == 1){
                count2++;
            }else if(a[f] == 2){
                count3++;
            }
        }

        Zero = count1;
        One = count2;
        Two = count3;

        int zero[] = new int[Zero];
        int one[] = new int[One];
        int two[] = new int[Two];
        
        for(int j = 0; j < zero.length; j++){
            zero[j] = 0;
        };

        for(int j = 0; j < one.length; j++){
            one[j] = 1;
        };
        
        for(int j = 0; j < two.length; j++){
            two[j] = 2;
        };

        int count = 0;
        int b[] = new int[zero.length+two.length+one.length];
        for(int k = 0; k < zero.length; k++){

            b[k] = zero[k];
            count++;
        }

        for(int l = 0; l < one.length; l++){
            b[count++] = one[l];
        }

        for(int m = 0; m < two.length; m++){
            b[count++] = two[m];
        }

        System.out.println("total no. of elements: "+n+"\n");
        // printing new sorted array
        for(int z = 0; z < b.length; z++){
            System.out.println(b[z]);
        }

        System.out.println("total no. of elements in the final array: "+b.length);

    }
}