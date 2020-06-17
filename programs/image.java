package programs;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ketan aggarwal
 * 
 */

public class image extends JFrame implements ActionListener
{
    JLabel lhead, lUser,lPass,lUtype,label;
    JTextField ltUser;
    JPasswordField lpPass;
    JButton lLogin,lUpdate,lget,lbrowse;
    ImageIcon img;
    Connection con;
    PreparedStatement ps;
    Statement st;
    static String id;
    String s;
    public image() {

     try
       {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database_rohan","root","");
           System.out.println("Connected Successfully");
       }
       catch(Exception e)
       {
           System.out.println("Exception:::"+e);
       }
   
        
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        lhead=new JLabel("LOGIN");
        add(lhead);
        lhead.setBounds(750,100,500,150);
        lhead.setFont(new Font(null,Font.BOLD,70));
        Font f=new Font(null,Font.BOLD,30);
        
        lUser=new JLabel("User Name :");
        add(lUser);
        lUser.setBounds(600,300,300,50);
        lUser.setFont(f);
        ltUser=new JTextField();
        add(ltUser);
        ltUser.setBounds(800,300,300,40);
        
        lPass=new JLabel("Password :");
        add(lPass);
        lPass.setBounds(600,400,300,50);
        lPass.setFont(f);
        lpPass=new JPasswordField();
        add(lpPass);
        lpPass.setBounds(800,400,300,40);
        
        lLogin=new JButton("Get");
        add(lLogin);
        lLogin.addActionListener(this);
        lLogin.setBounds(800,500,100,40);
        
        lUpdate=new JButton("Update");
        add(lUpdate);
        lUpdate.addActionListener(this);
        lUpdate.setBounds(950,500,100,40);
        
        lget=new JButton("Login");
        add(lget);
        lget.addActionListener(this);
        lget.setBounds(1100,500,100,40);
        
        lbrowse=new JButton("Browse");
        add(lbrowse);
        lbrowse.addActionListener(this);
        lbrowse.setBounds(800,550,100,40);
        
        
        img=new ImageIcon("src/Library/jas.jpeg");
        label = new JLabel();
        add(label);
        label.setBounds(750,100,500,150);
        
        setVisible(true); 
    }
        public static void main(String[] args)
    {
       new image(); 
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if(e.getSource()==lLogin)
        {
            
            
             String j=ltUser.getText();
        try
        {
            Statement stmt=con.createStatement(); 
           ResultSet rs2=stmt.executeQuery("select * from emp where name='"+j+"'");
           
           while(rs2.next())
           {
            
               ltUser.setText(rs2.getString("name"));
               lpPass.setText(rs2.getString("pass"));
                byte[] img = rs2.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);
                    label.setIcon(newImage);
        
          
           }
       }
        catch(Exception ex)
        {
            System.out.println("Hello"+e);
        }
      
          }
       if(e.getSource()==lget)
       { String v1=ltUser.getText();
       String v2=lpPass.getText();
       InputStream in;
       System.out.println(v1+" "+v2);
       try
       {  
           ps=con.prepareStatement("insert into emp(name,pass,image) values(?,?,?)");
           ps.setString(1,v1);
           ps.setString(2,v2);
           in = new FileInputStream(new File(s));
           ps.setBlob(3,in);
         
       ps.executeUpdate();
       JOptionPane.showMessageDialog(null,"Data is inserted");
  
       }
       catch(Exception e1)
               {
                 System.out.println("ERROR"+e1);  
               } 
           
       
        }
     
     
       if(e.getSource()==lUpdate)
       {
          try
       {
           String v1=ltUser.getText();
            String v2=lpPass.getText();
         
       ps=con.prepareStatement("update emp set pass='"+v2+"'  where name='"+v1+"'");
       ps.executeUpdate();
       JOptionPane.showMessageDialog(null,"Data is updated");
       }
       catch(Exception e1)
       {
           System.out.println("ERROR"+e1);
       }
  
     }
    if(e.getSource()==lbrowse)
    {
         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
         fileChooser.addChoosableFileFilter(filter);
         int result = fileChooser.showSaveDialog(null);
         
         if(result == JFileChooser.APPROVE_OPTION){

             File selectedFile = fileChooser.getSelectedFile();
             String path = selectedFile.getAbsolutePath();
             label.setIcon(ResizeImage(path));
             s = path;
              
            }else if(result == JFileChooser.CANCEL_OPTION){

            System.out.println("No Data");

         }
    }
    }

    private Icon ResizeImage(String path) {
        ImageIcon MyImage = new ImageIcon(path);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;    }
}