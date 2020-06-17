package programs;

public class captial {
     
    public static void main(String[] args) {
            
        String str = "Hello My Name IS Java";
     
        for (int i = 0; i < str.length(); i++) {
        
            if(Character.isUpperCase(str.charAt(i))){    

                System.out.println(str.charAt(i));
                
            }
        }
    }        
}