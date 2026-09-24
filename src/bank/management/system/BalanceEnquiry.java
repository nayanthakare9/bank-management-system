package bank.management.system;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener{
    JLabel l1,l2;
    JButton b2;
    String pin;
    BalanceEnquiry(String pin){
        this.pin=pin;

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        l1 =new JLabel("Your Current Account Balance is:");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(430,180,700,35);
        l3.add(l1);

        l2 =new JLabel();
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.ITALIC,10));
        l2.setBounds(430,220,400,35);
        l3.add(l2);

        b2 = new JButton("BACK");
        b2.setBackground(new Color(128,128,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,410,150,35);
        b2.addActionListener(this);
        l3.add(b2);


        int balance = 0;
        try {
            Conn c = new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while(resultSet.next()){
                if (resultSet.getString("type").equals("Deposite")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
               }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        l2.setText(balance+"");


        setSize(1550, 1080);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);
    }
 @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new mainClass(pin) ;
    }
    
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
   
}
