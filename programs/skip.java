package programs;

public class skip{

    public static void main(String[] args){

        for(int i = 0; i < 21; i++){

            if(i % 2 == 1) continue;

            System.out.println(i);

        }
    }

}