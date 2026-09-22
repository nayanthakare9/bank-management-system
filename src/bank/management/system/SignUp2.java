package bank.management.system;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SignUp2 extends JFrame implements ActionListener{

   String formno;
   JComboBox <String> comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
   JTextField textpan,textaddhar;
   JRadioButton r1,r2,e1,e2;
   JButton Next;

    SignUp2(String first){
      super ("APPLICATION FORM");
      //bank iamge icon
      ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
      Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(150,5,100,100);
      add(image);   
     
     this.formno = formno;

     JLabel l1 = new JLabel("page 2");
     l1.setFont(new Font("Raleway",Font.BOLD,22));
     l1.setBounds(300,30,600,40);
     add(l1);

     //additional details
     JLabel l2 = new JLabel("Additional details");
     l2.setFont(new Font("Raleway",Font.BOLD,22));
     l2.setBounds(300,60,600,40);
     add(l2);

     //add details-->religion
     JLabel l3 = new JLabel("Religion:");
     l3.setFont(new Font("Raleway",Font.BOLD,22));
     l3.setBounds(100,120,100,30);
     add(l3);

     //combobox for Religion
     String religion[] ={"Hindu","christian","buddhism","muslim","others"};
     comboBox = new JComboBox<>(religion);
     comboBox.setBackground(new Color(211,211,211));
     comboBox.setBounds(350,120,320,30);
     add(comboBox);

     //add details-->Category
     JLabel l4 = new JLabel("Category:");
     l4.setFont(new Font("Raleway",Font.BOLD,22));
     l4.setBounds(100,170,150,30);
     add(l4);

     //comboBox for Category 
     String Category[] ={"General","OBC","SC","ST","others"};
     comboBox2 = new JComboBox<>(Category);
     comboBox2.setBackground(new Color(211,211,211));
     comboBox2.setBounds(350,170,320,30);
     add(comboBox2);

     //add details--> Income
     JLabel l5 = new JLabel("Income:");
     l5.setFont(new Font("Raleway",Font.BOLD,22));
     l5.setBounds(100,220,100,30);
     add(l5);

     //combobox for Income
     String Income[] ={"Below 50,000","<1,50,000","<250000","5,00,000","up 5,00,000"};
     comboBox3 = new JComboBox<>(Income);
     comboBox3.setBackground(new Color(211,211,211));
     comboBox3.setBounds(350,220,320,30);
     add(comboBox3);

     //add detail--> Education
     JLabel l6 = new JLabel("Education:");
     l6.setFont(new Font("Raleway",Font.BOLD,22));
     l6.setBounds(100,270,150,30);
     add(l6);

     //combobox for education
     String Education[] ={"Non-graduate","Graduate","Post-Graduate","Diploma","others"};
     comboBox4 = new JComboBox<>(Education);
     comboBox4.setBackground(new Color(211,211,211));
     comboBox4.setBounds(350,270,320,30);
     add(comboBox4);

     //add details --> occupation
     JLabel l7 = new JLabel("Occupation:");
     l7.setFont(new Font("Raleway",Font.BOLD,22));
     l7.setBounds(100,320,150,30);
     add(l7);

     //combobox for occupation
     String Occupation[] ={"Self-employee","salaried-employee","Student","un-Employed","others"};
     comboBox5 = new JComboBox<>(Occupation);
     comboBox5.setBackground(new Color(211,211,211));
     comboBox5.setBounds(350,320,320,30);
     add(comboBox5);

     //add details --> PAN no.
     JLabel l8 = new JLabel("PAN No:");
     l8.setFont(new Font("Raleway",Font.BOLD,22));
     l8.setBounds(100,370,150,30);
     add(l8);

     //textfeild for pan no.
     JTextField textpan = new JTextField();
     textpan.setFont(new Font("Raleway",Font.BOLD,18));
     textpan.setBounds(350,370,320,30);
     add(textpan);

     //add details --> addhar no.
     JLabel l9 = new JLabel("Addhar No:");
     l9.setFont(new Font("Raleway",Font.BOLD,22));
     l9.setBounds(100,420,170,30);
     add(l9);

     //textfeild for addhar no.
     JTextField textaddhar = new JTextField();
     textaddhar.setFont(new Font("Raleway",Font.BOLD,18));
     textaddhar.setBounds(350,420,320,30);
     add(textaddhar);

     //add details --> senior cityzen
     JLabel l10 = new JLabel("Seneior Cityzen:");
     l10.setFont(new Font("Raleway",Font.BOLD,22));
     l10.setBounds(100,470,200,30);
     add(l10);

     //radio button for senior citizen
     //button yes 
     r1 = new JRadioButton("Yes");
     r1.setFont(new Font("Raleway",Font.BOLD,18));
     r1.setBackground(new Color(252,208,30));
     r1.setBounds(350,470,100,30);
     add(r1);

     //button no
     r2 = new JRadioButton("No");
     r2.setFont(new Font("Raleway",Font.BOLD,18));
     r2.setBackground(new Color(252,208,30));
     r2.setBounds(460,470,100,30);
     add(r2);

     //add details --> existing account 
     JLabel l11 = new JLabel("Existing Account:");
     l11.setFont(new Font("Raleway",Font.BOLD,22));
     l11.setBounds(100,520,200,30);
     add(l11);

     //radio button for existing account
     //button yes
     e1 = new JRadioButton("Yes");
     e1.setFont(new Font("Raleway",Font.BOLD,18));
     e1.setBackground(new Color(252,208,30));
     e1.setBounds(350,520,100,30);
     add(e1);

     //button no 
     e2 = new JRadioButton("No");
     e2.setFont(new Font("Raleway",Font.BOLD,18));
     e2.setBackground(new Color(252,208,30));
     e2.setBounds(460,520,100,30);
     add(e2);

     //add details --> form no
     JLabel l12 = new JLabel("Form No:");
     l12.setFont(new Font("Raleway",Font.BOLD,18));
     l12.setBounds(700,10,100,30);
     add(l12);
     JLabel l13 = new JLabel(formno);
     l13.setFont(new Font("Raleway",Font.BOLD,18));
     l13.setBounds(760,10,100,30);
     add(l13);

     //next button
     Next = new JButton("NEXT");
     Next.setFont(new Font("Raleway",Font.BOLD,14));
     Next.setForeground(Color.WHITE);
     Next.setBackground(Color.BLACK);
     Next.setBounds(570,640,100,30);
     Next.addActionListener(this);
     add(Next);      
      
      setLayout(null);
      setSize(850,750);
      setLocation(450,80); 
      getContentPane().setBackground(new Color(252,208,76));
      setVisible(true);

    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    


   
    public static void main(String[] args) {
       new SignUp2(""); 
    }
    
   
}
