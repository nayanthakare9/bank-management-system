package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposite extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton b1,b2;

    Deposite(String pin){

        this.pin =pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1 =new JLabel("ENTER AMOUNT YOU WANT TO DEPOSITE");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(450,180,400,35);
        l3.add(l1);

        textField =new JTextField();
        textField.setFont(new Font("Raleway",Font.BOLD,20));
        textField.setBackground(new Color(128,128,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,30);
        l3.add(textField);

        b1 = new JButton("DEPOSITE");
        b1.setBackground(new Color(128,128,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(700,362,150,30);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBackground(new Color(128,128,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,406,150,30);
        b2.addActionListener(this);
        l3.add(b2);

        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount =textField.getText();
            Date date = new Date();
            if(e.getSource()==b1) {
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter the amount you want to deposit:");
                }else{
                    Conn c = new Conn();
                    c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','Deposite','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"RS. "+amount+" has been deposited successfully");
                    setVisible(false);
                    new mainClass(pin);
                }
            }else if(e.getSource()==b2){
                setVisible(false);
                new mainClass(pin);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Deposite("");
    }
}
