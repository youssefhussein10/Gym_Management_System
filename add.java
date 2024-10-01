package gym;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class add extends JFrame {

 private JPanel contentPane;
 private JTextField textField;
 private JTextField textField_1;
 private JTextField textField_2;
 private JTextField textField_3;
 private JTextField textField_4;
 private JTextField textField_5;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     add frame = new add();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the frame.
  */
 public add() {
 	setTitle(" Add Member");
 	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Downloads\\pro\\photo_2023-05-10_12-50-18.jpg"));
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 1000, 800);
  contentPane = new JPanel();
  contentPane.setForeground(new Color(0, 0, 0));
  contentPane.setBackground(new Color(0, 0, 0));
  contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JDesktopPane desktopPane_1 = new JDesktopPane();
  desktopPane_1.setBorder(null);
  desktopPane_1.setForeground(new Color(10, 0, 0));
  desktopPane_1.setBackground(new Color(128, 128, 128));
  desktopPane_1.setBounds(285, 107, 414, 580);
  contentPane.add(desktopPane_1);
  
  JLabel lblNewLabel = new JLabel("Phone number :");
  lblNewLabel.setForeground(Color.BLACK);
  lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
  lblNewLabel.setBounds(10, 359, 151, 19);
  desktopPane_1.add(lblNewLabel);
  
  textField = new JTextField();
  textField.setHorizontalAlignment(SwingConstants.CENTER);
  textField.setForeground(Color.BLACK);
  textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
  textField.setBounds(189, 356, 200, 25);
  desktopPane_1.add(textField);
  textField.setColumns(10);
  
  JLabel lblNewLabel_1 = new JLabel("Name :");
  lblNewLabel_1.setForeground(Color.BLACK);
  lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
  lblNewLabel_1.setBounds(10, 251, 85, 25);
  desktopPane_1.add(lblNewLabel_1);
  
  textField_1 = new JTextField();
  textField_1.setHorizontalAlignment(SwingConstants.CENTER);
  textField_1.setForeground(Color.BLACK);
  textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
  textField_1.setBounds(189, 251, 200, 25);
  desktopPane_1.add(textField_1);
  textField_1.setColumns(10);
  
  JLabel lblNewLabel_2 = new JLabel("Age :");
  lblNewLabel_2.setForeground(Color.BLACK);
  lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
  lblNewLabel_2.setBounds(10, 284, 70, 28);
  desktopPane_1.add(lblNewLabel_2);
  
  JLabel lblNewLabel_3 = new JLabel("Gender :");
  lblNewLabel_3.setForeground(Color.BLACK);
  lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
  lblNewLabel_3.setBounds(10, 322, 107, 22);
  desktopPane_1.add(lblNewLabel_3);
  
  textField_2 = new JTextField();
  textField_2.setHorizontalAlignment(SwingConstants.CENTER);
  textField_2.setForeground(Color.BLACK);
  textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
  textField_2.setBounds(189, 286, 200, 25);
  desktopPane_1.add(textField_2);
  textField_2.setColumns(10);
  
  textField_3 = new JTextField();
  textField_3.setHorizontalAlignment(SwingConstants.CENTER);
  textField_3.setForeground(Color.BLACK);
  textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
  textField_3.setBounds(189, 321, 200, 25);
  desktopPane_1.add(textField_3);
  textField_3.setColumns(10);
  
  JLabel lblNewLabel_4 = new JLabel("Membership term :");
  lblNewLabel_4.setForeground(Color.BLACK);
  lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
  lblNewLabel_4.setBounds(10, 392, 188, 22);
  desktopPane_1.add(lblNewLabel_4);
  
  textField_4 = new JTextField();
  textField_4.setHorizontalAlignment(SwingConstants.CENTER);
  textField_4.setForeground(Color.BLACK);
  textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
  textField_4.setBounds(189, 391, 200, 25);
  desktopPane_1.add(textField_4);
  textField_4.setColumns(10);
  
  JLabel lblNewLabel_5 = new JLabel("End Date :");
  lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
  lblNewLabel_5.setForeground(new Color(0, 0, 0));
  lblNewLabel_5.setBounds(10, 429, 107, 19);
  desktopPane_1.add(lblNewLabel_5);
  textField_5 = new JTextField();
  textField_5.setHorizontalAlignment(SwingConstants.CENTER);
  textField_5.setForeground(Color.BLACK);
  textField_5.setBackground(Color.WHITE);
  textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
  textField_5.setBounds(189, 426, 200, 25);
  desktopPane_1.add(textField_5);
  textField_5.setColumns(10);
  
  JButton btnNewButton = new JButton("Submit");
  
          
  btnNewButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
              String phone  = textField.getText();             
              String name = textField_1.getText();
              String age = textField_2.getText();
              String gender=textField_3.getText();
              String membertype=textField_4.getText();
              String end_date=textField_5.getText();
                
              
           try {
               // Connect to the database
           
       try {
        Class.forName("com.mysql.cj.jdbc.Driver");
       } catch (ClassNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
       }
         
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gym", "root", "Youssefgamal66");
                    
               
                        String sql = "INSERT INTO customer (customer_number, customer_name, customer_age,customer_gender,customer_membership,end_date) VALUES (?, ?, ?, ?, ?, ?)";
                        PreparedStatement stat = conn.prepareStatement(sql);
                        stat.setString(1, phone); // replace personPhone with the actual phone number
                        stat.setString(2, name); // replace personName with the actual name
                        stat.setString(3, age);
                        stat.setString(4, gender);
                        stat.setString(5, membertype);
                        stat.setString(6,end_date );
                        
                        int rows = stat.executeUpdate();
                         

                        // Close the prepared statement and connection
                        stat.close();
                        conn.close(); 
                        JOptionPane.showMessageDialog(null, "member added successfully");
               
          
           } catch (SQLException e1) {
        
              e1.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e1.getMessage());
           }
   }
  });
  btnNewButton.setBackground(new Color(0, 0, 0));
  btnNewButton.setForeground(new Color(229, 141, 5));
  btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
  btnNewButton.setBounds(135, 461, 151, 25);
  desktopPane_1.add(btnNewButton);
  
  JLabel lblNewLabel_6 = new JLabel("New Member");
  lblNewLabel_6.setForeground(new Color(229, 141, 5));
  lblNewLabel_6.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
  lblNewLabel_6.setBounds(148, 181, 151, 52);
  desktopPane_1.add(lblNewLabel_6);
  
  JLabel lblNewLabel_7 = new JLabel("");
  lblNewLabel_7.setBounds(-198, 45, 573, 149);
  desktopPane_1.add(lblNewLabel_7);
  lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\pro\\Untitled design (7000).png"));
  
  JTextArea textArea = new JTextArea();
  textArea.setBackground(new Color(0, 0, 0));
  textArea.setBounds(37, 45, 341, 116);
  desktopPane_1.add(textArea);
  
  JButton btnNewButton_1 = new JButton("Clear");
  btnNewButton_1.setBackground(new Color(0, 0, 0));
  btnNewButton_1.setForeground(new Color(255, 255, 255));
  btnNewButton_1.addActionListener(new ActionListener() {
  	public void actionPerformed(ActionEvent e) {
  		textField_1.setText("");
  		textField_2.setText("");
  		textField_3.setText("");
  		textField_4.setText("");
  		textField_5.setText("");
  		textField.setText("");
  	}
  });
  btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
  btnNewButton_1.setBounds(135, 489, 151, 25);
  desktopPane_1.add(btnNewButton_1);
  
  JButton btnNewButton_2 = new JButton("Exit");
  btnNewButton_2.setBackground(new Color(0, 0, 0));
  btnNewButton_2.setForeground(new Color(255, 255, 255));
  btnNewButton_2.addActionListener(new ActionListener() {
  	public void actionPerformed(ActionEvent e) {
  		int a;
  		a=JOptionPane.showConfirmDialog(null, "are you sure");
  		 if(a==0)
		       System.exit(0);
  	}
  });
  btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
  btnNewButton_2.setBounds(319, 545, 85, 25);
  desktopPane_1.add(btnNewButton_2);
  
  JButton btnNewButton_3 = new JButton("Back");
  btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
  btnNewButton_3.setForeground(new Color(255, 255, 255));
  btnNewButton_3.setBackground(new Color(0, 0, 0));
  btnNewButton_3.addActionListener(new ActionListener() {
  	public void actionPerformed(ActionEvent e) {
  		Demo pi=new Demo();
		pi.setVisible(true);
		dispose();
  	}
  });
  btnNewButton_3.setBounds(10, 545, 85, 25);
  desktopPane_1.add(btnNewButton_3);
  
  JLabel lblNewLabel_8 = new JLabel("");
  lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\WhatsApp Image 2023-05-17 at 11.19.20 AM (1).jpeg"));
  lblNewLabel_8.setBounds(363, 490, 623, 273);
  contentPane.add(lblNewLabel_8);
  
  JLabel lblNewLabel_9 = new JLabel("");
  lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\WhatsApp Image 2023-05-17 at 11.17.31 AM.jpeg"));
  lblNewLabel_9.setBounds(-338, 474, 596, 515);
  contentPane.add(lblNewLabel_9);
  
  JLabel lblNewLabel_10 = new JLabel("");
  lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\WhatsApp Image 2023-05-16 at 7.51.47 PM.jpeg"));
  lblNewLabel_10.setBounds(-186, 301, 638, 191);
  contentPane.add(lblNewLabel_10);
  
  JLabel lblNewLabel_11 = new JLabel("");
  lblNewLabel_11.setBounds(631, 0, 629, 411);
  contentPane.add(lblNewLabel_11);
  lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\WhatsApp Image 2023-05-19 at 3.35.36 AM.jpeg"));
 }
}