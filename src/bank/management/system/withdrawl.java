package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {
    JTextField textField;
    JButton b1,b2;
    String pin;
    withdrawl(String pin){
        this.pin =pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1 =new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(450,180,400,35);
        l3.add(l1);

        JLabel l2 =new JLabel("(MAXIMUM Rs.10,000 ONLY)");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.ITALIC,10));
        l2.setBounds(645,205,400,20);
        l3.add(l2);

        textField =new JTextField();
        textField.setFont(new Font("Raleway",Font.BOLD,20));
        textField.setBackground(new Color(128,128,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,25);
        l3.add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBackground(new Color(128,128,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(700,366,150,30);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBackground(new Color(128,128,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,410,150,30);
        b2.addActionListener(this);
        l3.add(b2);

        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposite")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new mainClass(pin);

                }
            } catch (Exception E) {

            }
        }else if(e.getSource()==b2){
                setVisible(false);
                new mainClass(pin);
        }
    }
    public static void main(String[] args) {
        new withdrawl("");
    }
}
