package programs;

import java.sql.*;

public class exception {

    public static void main(String[] args) {
        
        Connection con;

        try {
           
            int array[] = new int[10];
            array[10] = 30 / 0;

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("", "root", "");

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
 
        } catch(Exception e){

            System.out.println(e.getMessage());
        }
    }
    
}