package bank.management.system;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUp3 extends JFrame{
    JRadioButton r1,r2,r3,r4;
    JTextField cardno;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    SignUp3(){

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);  

        //page no
        JLabel l1 =new JLabel("page 3");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,30,400,40);
        add(l1);

        //account dwtails
        JLabel l2 = new JLabel("Account details:");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,60,400,40);
        add(l2); 

        //account details --> account type
        JLabel l3 = new JLabel("Account Type");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,140,200,30);
        add(l3);

        //radio button for Account type
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,150,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,220,150,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,250,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,180,150,30);
        add(r4);

        ButtonGroup acctype= new ButtonGroup();
        acctype.add(r1);
        acctype.add(r2);
        acctype.add(r3);
        acctype.add(r4);

        // acc details --> card no
        JLabel l4 =new JLabel("Card No:");
        l4.setFont(new Font("Raleway",Font.BOLD,22));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5 = new JLabel("Enter 16-Digit card Number");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,22));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7 = new JLabel("(it would appear on atm/chequebook and statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,22));
        l8.setBounds(100,370,300,20);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(330,370,300,20);
        add(l9);

        JLabel l10 = new JLabel("(4 digit pin)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11 = new JLabel("Services Require:");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,450,200,20);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(new Color(215,252,252));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(new Color(215,252,252));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(new Color(215,252,252));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("(i here by declares that the above entered details are correct to my best knowledge)",true);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(new Color(215,252,252));
        c7.setBounds(100,680,600,20);
        add(c7);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel();
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,100,30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250,720,100,30);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,720,100,30);
        add(c);

         



        // //car no. textfeild
        // JTextField cardno =new JTextField();
        // cardno.setFont(new Font("Raleway",Font.BOLD,18));
        // cardno.setBounds()

    

        
        



        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);

    }
    public static void main(String[] args) {
        new SignUp3();
    }
    
}

