package programs;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class server_ui extends Frame implements ActionListener{

    // awt variables

    JTextArea ta;
    JTextField tf;
    Button b1;
 
    //sql variables

    Connection con;
    Statement st;
    ResultSet rs;

    server_ui(){

        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setBackground(Color.BLACK);

        ta = new JTextArea();
        ta.setBounds(50,50,300,300);
        add(ta);

        tf = new JTextField();
        tf.setBounds(50,400,200,30);
        add(tf);

        b1 = new Button("Search");
        b1.setBounds(270,400,80,30);
        b1.addActionListener(this);
        add(b1);

        addWindowListener(new WindowAdapter(){  

            public void windowClosing(WindowEvent e) {  
        
                dispose();  
                 
            }

        });

    }
    
    public static void main(String[] args){

        new server_ui();

    }

    public void actionPerformed(ActionEvent ex){

        String a = tf.getText();

        try{

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");

            st = con.createStatement();

            String query = "SELECT * FROM person WHERE name LIKE '"+a+"' ";

            rs = st.executeQuery(query);

            while(rs.next()){

                String b = rs.getString("name");
                String c = rs.getString("last_name");
                String d = rs.getString("age");

                ta.setText(b+"\n"+c+"\n"+d+"\n");
               
            } 

        }catch(Exception e){

            System.out.println(e);

        }

    }
}