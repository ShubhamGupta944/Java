import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
// import java.util.concurrent.Executors;
// import java.util.concurrent.ScheduledExecutorService;
// import java.util.concurrent.TimeUnit;

public class alien2 extends JFrame implements ActionListener {

     //awt variables
     TextArea ta;
     TextField tf;
     Button b1;
     
     // sql variables
     Connection con;
     Statement st;
     PreparedStatement stm;
     ResultSet rs;
 
     alien2(){
 
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

     public void db(){
 
        try{

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        }catch(Exception e){

            System.out.println(e);
        }
    }

    public void msgR(){

        //ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

       // executorservice.
        try{
 
            db();

            String query = "Select * from chat_system Where name = 'ketan'";

            st = con.createStatement();

            rs = st.executeQuery(query);

            while (rs.next()){

               String c = rs.getString("chats");

               ta.setText(c+"\n");
               
            }

        }catch(Exception e){

            System.out.println(e);

        }

    }
 
     public static void main(String[] args) {
         
        alien2 a2 = new alien2();
       
        for(int i = 0; i >= 0; i++){

            a2.msgR();

        }
 
     }

 
     public void actionPerformed(ActionEvent f){
 
         if(f.getSource() == b1){
 
           
 
         }
 
     }
    
}