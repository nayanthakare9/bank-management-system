package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pinChange extends JFrame {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    pinChange(String pin){

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1 =new JLabel("CHANGE YOUR PIN");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(430,180,400,35);
        l3.add(l1);

        JLabel l2 =new JLabel("New PIN");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(430,220,150,35);
        l3.add(l2);

        p1 = new JPasswordField();
        setBackground(new Color(128,128,128));
        setForeground(Color.WHITE);
        setFont(new Font("Raleway",Font.BOLD,16));
        p1.setBounds(600,220,180,25);
        l3.add(p1);

        JLabel l4 =new JLabel("ReEnter New PIN");
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("System",Font.BOLD,16));
        l4.setBounds(430,260,400,35);
        l3.add(l4);

        p2 = new JPasswordField();
        setBackground(new Color(128,128,128));
        setForeground(Color.WHITE);
        setFont(new Font("Raleway",Font.BOLD,16));
        p2.setBounds(600,260,180,25);
        l3.add(p2);

        b1 = new JButton("CHANGE");
        b1.setBounds(700,367,150,30);
        b1.setBackground(new Color(128,128,128));
        b1.setForeground(Color.WHITE);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,411,150,30);
        b2.setBackground(new Color(128,128,128));
        b2.setForeground(Color.WHITE);
        l3.add(b2);
        


        



         setSize(1550,1080);
         setLayout(null);
         setLocation(0,0);
         setVisible(true);       
        }
    public static void main(String[] args) {
        new pinChange("");
    }
    
}
