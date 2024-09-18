/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.project;

/**
 *
 * @author Shriharsha
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
public class Real extends JFrame {
	JButton jb = new JButton("Login");
	JFrame jf = new JFrame();
	JTextField tf1 = new JTextField();
	JPasswordField tf2 = new JPasswordField();
	JLabel mt = new JLabel("Welcome to Real estate Database Management Software");
	JLabel name = new JLabel("Enter the username : ");
	JLabel pass = new JLabel("Enter the password : ");
        JButton fg = new JButton("Forgot password ?");
        JButton nu = new JButton("New User ?");
        JLabel er1 = new JLabel("Error Password Please enter right password");
        JLabel er2 = new JLabel("Error UserName Please enter right Username");
 Real()
 {
	 jf.setSize(800, 400);
	 jf.setLayout(null);
	 jf.setVisible(true);
         jf.add(fg);
         fg.setBounds(180, 260, 160, 30);
         nu.setBounds(360, 260, 160, 30);
	 mt.setBounds(55, 20, 800, 100);
	 mt.setFont(mt.getFont().deriveFont(24.0f));
	 jf.add(mt);jf.add(pass);jf.add(name);jf.add(tf1);jf.add(tf2);jf.add(jb);jf.add(nu);
	 jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 name.setBounds(160, 120, 180, 25);
	 name.setFont(pass.getFont().deriveFont(15.0f));
	 pass.setBounds(160, 160, 180, 25);
	 pass.setFont(pass.getFont().deriveFont(15.0f));
	 tf1.setBounds(360,120,180, 25);
	 tf2.setBounds(360, 160, 180, 25);
	 jb.setBounds(360, 200, 100, 30);
	 
		er1.setBounds(10, 280, 280, 18);
		
		er2.setBounds(10, 280, 280, 18);
                    Connection conn = null;
                     Connection conn0 = null;
        Statement stmt = null;
        try{
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/?";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance ();
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavioiur=convertToNull",userName,password);
            //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject",userName,password);
            Statement stmt0 = conn.createStatement();
           // int s = stmt0.executeUpdate("CREATE DATABASE miniproject;");
            Statement stmt1 = conn.createStatement();
            conn.close();
            String userName0 = "root";
           String password0 = "";
            String url0 = "jdbc:mysql://localhost:3306/miniproject";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance ();
            conn = DriverManager.getConnection(url0,userName0,password0);
          // stmt1.executeUpdate("use miniproject");
            String sqlo6 = "CREATE TABLE USERS(\n" +
"NAME VARCHAR(20) ,\n" +
"PH_NO VARCHAR(16) ,\n" +
"PASS VARCHAR(20) ,\n" +
"DOB DATE)";
            Statement stmt4 = conn.createStatement();
            stmt4.executeUpdate(sqlo6);
        }
        catch(Exception lm)
        {
            System.out.println(lm);
        }
        
                fg.addActionListener(new ActionListener()
                {

             @Override
             public void actionPerformed(ActionEvent e) {
                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                  new fgp().setVisible(true);
             }
                    
                });
                
                nu.addActionListener(new ActionListener(){

             @Override
             public void actionPerformed(ActionEvent e) {
                 new NewJFrame().setVisible(true);
             }
 
 });
	 jb.addActionListener(new ActionListener()
	 {
		public void actionPerformed(ActionEvent e) {
			String userName = tf1.getText();
	         char[] password = tf2.getPassword();
	         String pswd = new String(password);
                 try{
            String userName0 = "root";
            String password0 = "";
            String url0 = "jdbc:mysql://localhost:3306/miniproject";
            //Class.forName("com.mysql.cj.jdbc.Driver").newInstance ();
            Connection conn1 = DriverManager.getConnection(url0,userName0,password0);
            Statement stmt0 = conn1.createStatement();
                 String user = "Select *from users where NAME= '"+userName+"'and PASS = '"+pswd+"'";
                 ResultSet rs0=stmt0.executeQuery(user);
			if(rs0.next())
			{
				
				
					/*JFrame m = new JFrame();
					m.setSize(50, 50);
					m.setDefaultCloseOperation(EXIT_ON_CLOSE);
					m.setVisible(true);
					*/
                                     JOptionPane.showMessageDialog(null, "Login Successfull");
					main_menu mmm = new main_menu();
			}
			else
			{
				
				JOptionPane.showMessageDialog(null, "Incorrect Username password");
			}
			
		}
                
                catch(Exception p)
                {
                    JOptionPane.showMessageDialog(null,p);
                }
                }
		 
	 });
 }
 public static void main(String[] args)
 {
	 Real r = new Real();
	 
 }
}
