import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class alien extends JFrame implements ActionListener{

    //awt variables
    TextArea ta;
    TextField tf;
    Button b1;
    
    // sql variables
    Connection con;
    Statement st;
    PreparedStatement stm;
    ResultSet rs;

    alien(){

        ta = new TextArea();
        ta.setBounds(50,50,200,200);
        ta.setEditable(false);

        tf = new TextField();
        tf.setBounds(50,300,120,27);

        b1 = new Button("send");
        b1.setBounds(180,300,70,27);
        b1.addActionListener(this);

        add(ta);
        add(tf);
        add(b1);

        setLayout(null);
        setVisible(true);
        setSize(400,400);

        
    }

    public static void main(String[] args) {
        
        new alien();

    }

    public void db(){

        try{

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        }catch(Exception e){

            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent f){

        if(f.getSource() == b1){

            String a = tf.getText().trim();
            // String b = "aggarwal";

            ta.setText(a+"\n");

            try{

                db();

                String query = "update chat_system set chats = ?" + " where name = 'ketan'";

                stm = con.prepareStatement(query);

                stm.setString(1, a);

                stm.execute();

            }catch(Exception e){

                System.out.println(e);

            }

        }

    }

}