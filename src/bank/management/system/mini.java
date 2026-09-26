package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {

    JButton button;
    String pin;

    public mini(String pin) {

        getContentPane().setBackground(new Color(255, 204, 204));

        setSize(400, 600);
        setLocation(20, 20);
        setLayout(null);

        this.pin = pin;

        // Name
        JLabel label2 = new JLabel("Nayan Thakare");
        label2.setBounds(150, 20, 200, 20);
        label2.setFont(new Font("system", Font.BOLD, 15));
        add(label2);

        // Card number
        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 350, 20);
        add(label3);

        // Transactions
        JLabel label1 = new JLabel();
        label1.setBounds(20, 140, 350, 250);
        label1.setVerticalAlignment(SwingConstants.TOP);
        add(label1);

        // Balance
        JLabel label4 = new JLabel();
        label4.setBounds(20, 420, 350, 20);
        add(label4);

        // Get card number
        try {

            Conn c = new Conn();

            ResultSet resultSet = c.statement.executeQuery(
                    "select * from login where pin = '" + pin + "'"
            );

            while (resultSet.next()) {

                String cardNo = resultSet.getString("card_no");

                label3.setText(
                        "card_no: "
                                + cardNo.substring(0, 4)
                                + "XXXXXXXX"
                                + cardNo.substring(12)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Get transactions
        try {

            int balance = 0;

            Conn c = new Conn();

            ResultSet resultSet = c.statement.executeQuery(
                    "select * from bank where pin = '" + pin + "'"
            );

            StringBuilder transactions = new StringBuilder();

            transactions.append("<html>");

            while (resultSet.next()) {

                String date = resultSet.getString("date");
                String type = resultSet.getString("type");
                String amount = resultSet.getString("amount");

                transactions.append(date)
                        .append("&nbsp;&nbsp;&nbsp;")
                        .append(type)
                        .append("&nbsp;&nbsp;&nbsp;")
                        .append(amount)
                        .append("<br><br>");

                if (type.equals("Deposite")) {
                    balance += Integer.parseInt(amount);
                } else {
                    balance -= Integer.parseInt(amount);
                }
            }

            transactions.append("</html>");

            label1.setText(transactions.toString());

            label4.setText("Your total balance is Rs. " + balance);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Exit button
        button = new JButton("Exit");
        button.setBounds(20, 500, 100, 25);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }
}
