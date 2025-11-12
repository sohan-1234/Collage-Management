package collage.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login,Cancel;
    JTextField tfusername,tfPassword;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);
        
         tfusername=new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);
        
        JLabel lblpassword= new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 20);
        add(lblpassword);
        
         tfPassword=new JTextField();
        tfPassword.setBounds(150, 70, 150, 20);
        add(tfPassword);
        
        login=new JButton("LogIn");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("serif",Font.BOLD,16));
        login.addActionListener(this);
        add(login);
        
        
        Cancel=new JButton("Cancel");
        Cancel.setBounds(180, 140, 120, 30);
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.setFont(new Font("serif",Font.BOLD,16));
        Cancel.addActionListener(this);
        add(Cancel);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);
        
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==login){
            String username=tfusername.getText();
            String password=tfPassword.getText();
            
            String query="select * from login where username='"+username+"' and password='"+password+"'";
            
            try{
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    new Project();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    setVisible(false);
                }
                
            }catch(Exception a){
                a.printStackTrace();
            }
            
        }else if(e.getSource()==Cancel){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Login();
    }
}
