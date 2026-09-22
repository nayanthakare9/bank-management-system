package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

// import bank.SignUp2;

import javax.swing.*;

public class SignUp extends JFrame implements ActionListener {
    JTextField textname,textfname,textmail,textIsMarried,textAdd,textcity,textPIN,textstate;
    JDateChooser datechooser;
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    Random ran = new Random();
    long first4 = (ran.nextLong()% 9000L)+1000L;

    String first = " "+ Math.abs(first4);
    SignUp(){
        super("APPLICATION FORM");

        //bank logo png 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        //heading for application form 
        JLabel label1 =new JLabel("APPLICATION FORM NO: "+first);
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        label1.setBounds(160, 20, 600, 40);
        add(label1);

        //page no.
        JLabel label2 = new JLabel("page no.1");
        label2.setFont(new Font("ralway",Font.BOLD,22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        //personal Details //heading
        JLabel label3 = new JLabel("Personal Details:");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(300,110,600,30);
        add(label3);

        //user information textfields ->> name
        JLabel labelName = new JLabel("Name: ");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        //textfield for name
        textname = new JTextField();
        textname.setFont(new Font("Ralway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);

        //personal details ->> fathers name
        JLabel labelfName = new JLabel("Fathers Name: ");
        labelfName.setFont(new Font("Ralway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        //textfield for fathers name 
        textfname = new JTextField();
        textfname.setFont(new Font("Ralway",Font.BOLD,14));
        textfname.setBounds(300,240,400,30);
        add(textfname);

        //personal details ->> DOB
        JLabel labelDOB = new JLabel("Birth Date: ");
        labelDOB.setFont(new Font("Ralway",Font.BOLD,20));
        labelDOB.setBounds(100,340,200,30);
        add(labelDOB);

        //CALENDER
        datechooser =new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(300,340,400,30);
        add(datechooser);

        //personal details-->Gender
        JLabel labelG =new JLabel("Gender: ");
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        //radio buttons for gender 
        //Male button
        r1= new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        //female button
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);
        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        //personal details -->Email
        JLabel mail = new JLabel("Email Address: ");
        mail.setFont(new Font("Ralway",Font.BOLD,20));
        mail.setBounds(100,390,200,30);
        add(mail);

        //textfeild for email
        textmail = new JTextField();
        textmail.setFont(new Font("Ralway",Font.BOLD,14));
        textmail.setBounds(300,390,400,30);
        add(textmail);
        
        //personal details-->is married or not 
        JLabel IsMarried = new JLabel("Marital Status: ");
        IsMarried.setFont(new Font("Ralway",Font.BOLD,20));
        IsMarried.setBounds(100,440,200,30);
        add(IsMarried);

        //Radio Button for marital status
        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Ralway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2 = new JRadioButton("unMarried");
        m2.setFont(new Font("Ralway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        add(m2);

        m3 = new JRadioButton("Divorced");
        m3.setFont(new Font("Ralway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(600,440,100,30);
        add(m3);
        ButtonGroup isMarried =new ButtonGroup();
        isMarried.add(m1);
        isMarried.add(m2);
        isMarried.add(m3);

        // //textfiels for marital status
        // textIsMarried = new JTextField();
        // textIsMarried.setFont(new Font("Ralway",Font.BOLD,14));
        // textIsMarried.setBounds(300,440,400,30);
        // add(textIsMarried);


        //personal details--> address
        JLabel Add = new JLabel("Address: ");
        Add.setFont(new Font("Ralway",Font.BOLD,20));
        Add.setBounds(100,490,200,30);
        add(Add);

        //textfeild for Address
        textAdd = new JTextField();
        textAdd.setFont(new Font("Ralway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        //personal details--> city
        JLabel city = new JLabel("city: ");
        city.setFont(new Font("Ralway",Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);

        //textfeild for city
        textcity= new JTextField();
        textcity.setFont(new Font("Ralway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        //personal details-->PIN
        JLabel PIN = new JLabel("PIN: ");
        PIN.setFont(new Font("Ralway",Font.BOLD,20));
        PIN.setBounds(100,590,200,30);
        add(PIN);

        //textfeild for PIN
        textPIN = new JTextField();
        textPIN.setFont(new Font("Ralway",Font.BOLD,14));
        textPIN.setBounds(300,590,400,30);
        add(textPIN);

        //personal details --> state
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Ralway",Font.BOLD,20));
        state.setBounds(100,640,200,30);
        add(state);

        //textfeild for state
        textstate = new JTextField();
        textstate.setFont(new Font("Ralway",Font.BOLD,14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next = new JButton("NEXT");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));        
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textname.getText();
        String fname = textfname.getText();
        String dob = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "male";
        }else if(r2.isSelected()){
            gender = "female";
        }
        String mail = textmail.getText();
        String ismarried = null;
        if(m1.isSelected()){
            ismarried = "married";
        }else if(m2.isSelected()){
            ismarried = "unmarried";
        }else if(m3.isSelected()){
            ismarried = "other";
        }
        String add = textAdd.getText();
        String city = textcity.getText();
        String pin = textPIN.getText();
        String state = textstate.getText(); 

        try {
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill All the Fields ");
            }else{
                Conn conn1 =new Conn();
                String q ="insert into signup values('"+formno+"' , '"+name+"' , '"+fname+"' , '"+dob+"' , '"+gender+"' , '"+mail+"' , '"+ismarried+"' , '"+add+"' , '"+city+"' , '"+pin+"' , '"+state+"')";
                conn1.statement.executeUpdate(q);
                new SignUp2(first);
                setVisible(false);
            }
            
        } catch (Exception E) {
            E.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        new SignUp();
    }   
}
