package gym;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class login {

	private JFrame mo;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.mo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mo = new JFrame();
		mo.getContentPane().setBackground(new Color(0, 0, 0));
		mo.getContentPane().setForeground(Color.BLACK);
		mo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("UserName ");
		lblNewLabel_2.setForeground(new Color(229, 141, 5));
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Urdu Typesetting", Font.BOLD, 30));
		lblNewLabel_2.setBounds(295, 357, 309, 49);
		mo.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password ");
		lblNewLabel_3.setForeground(new Color(229, 141, 5));
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Urdu Typesetting", Font.BOLD, 30));
		lblNewLabel_3.setBounds(295, 399, 205, 49);
		mo.getContentPane().add(lblNewLabel_3);
		
		final JCheckBox show = new JCheckBox("Show Password");
		show.setForeground(Color.WHITE);
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (show.isSelected()) {
					pass.setEchoChar((char)0); }
				else {pass.setEchoChar('*');}
			}
		});
		show.setBackground(Color.BLACK);
		show.setFont(new Font("Tahoma", Font.BOLD, 10));
		show.setBounds(453, 465, 113, 21);
		mo.getContentPane().add(show);
		
		user = new JTextField();
		user.setForeground(new Color(0, 0, 0));
		user.setBounds(453, 379, 209, 27);
		mo.getContentPane().add(user);
		user.setFont(new Font("Tahoma", Font.BOLD, 18));
		user.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(560, 515, 138, 33);
		mo.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un=user.getText();
				String pas=pass.getText();

				if (un.equals("youssefgamal")&&pas.equals("212102366")) {
					
					JOptionPane.showMessageDialog(null, " Welcome YOUSSEF GAMAL");
					
					Demo pi=new Demo();
					pi.setVisible(true);
					mo.setVisible(false);
					
				}
				else if (un.equals("youssefhussein")&&pas.equals("212103168")) {
					
					JOptionPane.showMessageDialog(null, " Welcome YOUSSEF HUSSEIN");
					Demo pi=new Demo();
					pi.setVisible(true);
					mo.setVisible(false);
				}
				
		else if (un.equals("mazensalah")&&pas.equals("212103212")) {
					
					JOptionPane.showMessageDialog(null, " Welcome MAZEN SALAH");
					Demo pi=new Demo();
					pi.setVisible(true);
					mo.setVisible(false);
				}
else if (un.equals("ahmedkhaled")&&pas.equals("21210")) {
					
					JOptionPane.showMessageDialog(null, " Welcome Eng.AHMED KHALED");
					Demo pi=new Demo();
					pi.setVisible(true);
					mo.setVisible(false);
				}
else if (un.equals("ayaebraheem")&&pas.equals("21210")) {
	
	JOptionPane.showMessageDialog(null, " Welcome Eng.AYA EBRAHEEM");
	Demo pi=new Demo();
	pi.setVisible(true);
	mo.setVisible(false);
}
				else if (un.equals("moemenhassan")&&pas.equals("212103128")) {
	
	JOptionPane.showMessageDialog(null, " Welcome MOEMEN HASSAN");
	Demo pi=new Demo();
	pi.setVisible(true);
	mo.setVisible(false);
}
				else if (un.equals("youssefsemoOn")&&pas.equals("212102860")) {
	
	JOptionPane.showMessageDialog(null, " Welcome YOUSSEF SEMOON");
	Demo pi=new Demo();
	pi.setVisible(true);
	mo.setVisible(false);
}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect username or password ");
				}
				
				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				    user.setText("");
				    pass.setText("");
				    
				   }
			
		});
		btnNewButton_1.setBounds(295, 515, 138, 33);
		mo.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a;
			    a=JOptionPane.showConfirmDialog(null, "are you sure you want to exit ");
			      if(a==0)
			       System.exit(0);
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(428, 572, 138, 33);
		mo.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Welcome");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(453, 326, 159, 21);
		mo.getContentPane().add(lblNewLabel_4);
		
		pass = new JPasswordField();
		pass.setForeground(new Color(0, 0, 0));
		pass.setFont(new Font("Tahoma", Font.BOLD, 18));
		pass.setBounds(453, 420, 209, 28);
		mo.getContentPane().add(pass);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\pro\\Untitled design (7000).png"));
		lblNewLabel.setBounds(87, 224, 557, 123);
		mo.getContentPane().add(lblNewLabel);
		mo.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Downloads\\pro\\photo_2023-05-10_12-50-18.jpg"));
		mo.setTitle("login Page");
		mo.setBounds(100, 100, 1000, 800);
		mo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
