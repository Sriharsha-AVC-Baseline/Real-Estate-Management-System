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
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.*;
public class main_menu extends JFrame {
 JFrame mm = new JFrame();
 JButton plo = new JButton("Primary Land owners");
 JButton fe = new JButton("Firm Estates");
 JButton pt = new JButton("Properties");
 JButton cb = new JButton("Customers / Buyers");
 JButton gv = new JButton("Government / Authority");
 JLabel l = new JLabel(" What are you intrested with :");
 main_menu()
 {
	 mm.setSize(500, 360);
	 mm.setLayout(null);
	 mm.setVisible(true);
	 l.setBounds(120, 20, 300, 30);
	 l.setFont(l.getFont().deriveFont(14.0f));
	 mm.add(l);
	 plo.setBounds(120, 60, 200, 24);
	 mm.add(plo);
	 fe.setBounds(120, 100, 200, 24);
	 mm.add(fe);
	 pt.setBounds(120, 140, 200, 24);
	 mm.add(pt);
	 cb.setBounds(120, 180, 200, 24);
	 mm.add(cb);
         gv.setBounds(120, 220, 200, 24);
	 mm.add(gv);
	 mm.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 plo.addActionListener(new ActionListener()
			 {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 new primary_lo().setVisible(true);
				}
		 
			 });
	 fe.addActionListener(new ActionListener()
	 {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new FE().setVisible(true);
		}
 
	 });
	 pt.addActionListener(new ActionListener()
	 {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Property().setVisible(true);
		}
 
	 });
	 cb.addActionListener(new ActionListener()
	 {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			  new Customer().setVisible(true);
                }
	 });
         gv.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 //("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 new govt().setVisible(true);
             }
         });{
     
 }
 }
                 
 /*public static void main(String[] args)
 {
	 main_menu mn = new main_menu();
 }*/
}
