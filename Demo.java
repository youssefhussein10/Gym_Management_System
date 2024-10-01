package gym;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.SwingConstants;

public class Demo extends JFrame {

	private JPanel contentPane;
	private JTextField number;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
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
	public Demo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Downloads\\pro\\photo_2023-05-10_12-50-18.jpg"));
		setTitle("Search Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		desktopPane.setForeground(new Color(0, 0, 0));
		desktopPane.setBackground(new Color(229, 141, 5));
		desktopPane.setBounds(227, 256, 537, 153);
		contentPane.add(desktopPane);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(387, 27, 140, 27);
		desktopPane.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnNewButton_1 = new JButton("New Registration");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add pn=new add();
			
				pn.setVisible(true);
			    dispose();
				
			}
		});
		btnNewButton_1.setBounds(179, 72, 174, 27);
		desktopPane.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel = new JLabel("Member (Phone/ID):");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 26, 192, 27);
		desktopPane.add(lblNewLabel);
		
		number = new JTextField();
		number.setHorizontalAlignment(SwingConstants.CENTER);
		number.setFont(new Font("Tahoma", Font.PLAIN, 15));
		number.setForeground(new Color(0, 0, 0));
		number.setBackground(new Color(255, 255, 255));
		number.setBounds(200, 27, 185, 26);
		desktopPane.add(number);
		number.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a;
			    a=JOptionPane.showConfirmDialog(null, "are you sure you want to exit ");
			      if(a==0)
			       System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(152, 110, 85, 21);
		desktopPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number.setText(" ");

				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(300, 109, 85, 22);
		desktopPane.add(btnNewButton_3);
		
		final JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Rockwell", Font.BOLD, 20));
		textArea.setBackground(new Color(0, 0, 0));
		textArea.setForeground(new Color(229, 141, 5));
		textArea.setBounds(450, 435, 450, 292);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\download\\Untitled design (6).png"));
		lblNewLabel_1.setBounds(-170, 285, 525, 493);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\\\download\\\\Untitled design (6).png"));
		lblNewLabel_3.setBounds(544, -142, 665, 670);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\pro\\Untitled design (7000).png"));
		lblNewLabel_2.setBounds(-241, -88, 581, 385);
		contentPane.add(lblNewLabel_2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String searchTerm = number.getText();
			      String phone=number.getText();
			      
			           try {
			               // Connect to the database
			               Class.forName("com.mysql.cj.jdbc.Driver");
			               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Gym", "root", "Youssefgamal66");
			    
			               // Execute the query
			               Statement stmt = conn.createStatement();
			               ResultSet rs = stmt.executeQuery("SELECT * FROM customer WHERE customer_id = " + searchTerm + " OR customer_number = '" + searchTerm + "'");
			    
			               // Display the results
			               textArea.setText("");
			               if (rs.next()) {
			                   textArea.append(" ID : " + rs.getString("customer_id") + "\n");
			                   textArea.append("Name : " + rs.getString("customer_name") + "\n");
			                   textArea.append("Age : " + rs.getString("customer_age") + "\n");
			                   textArea.append("Gender : " + rs.getString("customer_gender") + "\n");
			                   textArea.append("Phone Number : " + rs.getString("customer_number") + "\n"); 
			                   textArea.append("Membership type: " + rs.getString("customer_membership") + "\n");
			                   textArea.append("Start Date: " + rs.getString("start_date") + "\n");
			                   textArea.append("End Date: " + rs.getString("end_date") + "\n");
			                   
			                   
			                   
			                   
			                   
			                   
			                   
			               } else {
			                   textArea.append("Member not found.");
			               }
			               
			               rs.close();
			               stmt.close();
			               conn.close();
			           } catch (Exception ex) {
			               ex.printStackTrace();
			               textArea.setText("Error: " + ex.getMessage());
			           }
			       }
				
			
			
		});
	}
}
