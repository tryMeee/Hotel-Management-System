package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class HotelManagementSystem extends JFrame implements ActionListener{

        JLabel l1,l2;
        JButton b1;
        public static final Color VERY_LIGHT_YELLOW = new Color(255,255,204);
        public HotelManagementSystem() {
		
                setSize(1366,430);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(300,300);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                JLabel lid=new JLabel("HOTEL MANAGEMENT SYSTEM");
                JLabel l2 = new JLabel("Made by:");
                JLabel l3 = new JLabel("Vansh Patel(20UCS217)");
                JLabel l4 = new JLabel("Rachit Somani(20DCS007)");
                JLabel l5 = new JLabel("Shresth Jain(20DCS009)");
                JLabel l6 = new JLabel("Shridhar Somani(20UCS188)");
                l2.setBounds(505,10,1000,50);
                l3.setBounds(505,40,1000,50);
                l4.setBounds(505,70,1000,50);
                l5.setBounds(505,100,1000,50);
                l6.setBounds(505,130,1000,50);
                l2.setFont(new Font("serif",Font.PLAIN,30));
                l3.setFont(new Font("serif",Font.PLAIN,30));
                l4.setFont(new Font("serif",Font.PLAIN,30));
                l5.setFont(new Font("serif",Font.PLAIN,30));
                l6.setFont(new Font("serif",Font.PLAIN,30));
                lid.setBounds(30,300,1500,100);
                lid.setFont(new Font("serif",Font.PLAIN,70));
                lid.setForeground(Color.cyan);
                l2.setForeground(VERY_LIGHT_YELLOW);
                l3.setForeground(VERY_LIGHT_YELLOW);
                l4.setForeground(VERY_LIGHT_YELLOW);
                l5.setForeground(VERY_LIGHT_YELLOW);
                l6.setForeground(VERY_LIGHT_YELLOW);
                l1.add(lid);
                l1.add(l2);
                l1.add(l3);
                l1.add(l4);
                l1.add(l5);
                l1.add(l6);
                
                b1.setBounds(1170,325,150,50);
		l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
}