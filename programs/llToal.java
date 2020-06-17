package programs;

import java.util.*;

public class llToal {
    
    public static void main(String[] args) {
        
        LinkedList<String> l = new LinkedList<String>();

        l.add("Mercedes-Benz");
        l.add("Aston Martin");
        l.add("Lamborghini");
        l.add("Land Rover");
        l.add("Jaguar");
        l.add("AUDI");
        l.add("BMW");
        l.add("Tesla");
        l.add("volkswagen");

        List<String> aList = new ArrayList<String>(l);

        for(Object i: aList){

            System.out.println(i);

        }
    }
}