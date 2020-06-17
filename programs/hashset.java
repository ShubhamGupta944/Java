package programs;

import java.util.*;

public class hashset {

    public static void main(String[] args) {
        
        HashSet hSet = new HashSet();

        hSet.add(new Integer("1"));
        hSet.add(new Integer("2"));
        hSet.add(new Integer("3"));


        boolean blnExists = hSet.contains(new Integer("3"));

        System.out.println("3 exists in HashSet ? : "+blnExists);
        
    }
    
}