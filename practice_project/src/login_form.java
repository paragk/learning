import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Canvas;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import javax.swing.JTextPane;

import com.mysql.jdbc.PreparedStatement;


public class login_form extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblPassword;
	static login_form frame;
	static String Username ;
	char [] Password,correctPassword; 
	static String password_field;
	private JPasswordField passwordField;
	private JButton btnChangePassword;
	PreparedStatement statement = null,statement1=null;
	ResultSet result = null;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new login_form();
					frame.setVisible(true);
					Class.forName("com.mysql.jdbc.Driver");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		
		
	public login_form() {
		setTitle("Login Form");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 192);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(253, 64, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setVerticalAlignment(SwingConstants.BOTTOM);
		lblUsername.setBackground(new Color(192, 192, 192));
		lblUsername.setBounds(175, 65, 89, 17);
		contentPane.add(lblUsername);
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		lblPassword = new JLabel("Password :");
		lblPassword.setBackground(new Color(192, 192, 192));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setBounds(181, 90, 79, 14);
		contentPane.add(lblPassword);
	
		passwordField = new JPasswordField();
		passwordField.setBounds(253, 88, 174, 20);
		contentPane.add(passwordField);
		
		Password = passwordField.getPassword();
		password_field="admin";
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//**------------------------------------------------**
				// creating a variable for the connection
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db", "root", "parag123");
					statement = (PreparedStatement) con.prepareStatement("Select * from login ");
					result=statement.executeQuery();
					
					while(result.next())
					{
						String username = result.getString("Username");
						String spassword = result.getString("Password");
						char [] cpassword=passwordField.getPassword();
						String password = String.valueOf(cpassword);
						
						if(username.equalsIgnoreCase(textField.getText()))
						{
							if(spassword.equals(password))
							{
								navigate_panel np=new navigate_panel();
								np.setVisible(true); 
								frame.setVisible(false);
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Enter correct password !!!");
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Enter correct Username !!!");
						}
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogin.setBounds(180, 116, 89, 23);
		contentPane.add(btnLogin);
		
		btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//**---------------------------------------------------------------------------**
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db", "root", "parag123");
					statement = (PreparedStatement) con.prepareStatement("Select * from login ");
					result=statement.executeQuery();
					
					while(result.next())
					{
						String username = result.getString("Username");
										
						if(username.equalsIgnoreCase(textField.getText()))
						{
								change_password_form cpf=new change_password_form();
								cpf.setVisible(true); 
								frame.setVisible(false);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Enter correct Username !!!");
						}
					}
					} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}	
			}
		});
		
		btnChangePassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnChangePassword.setBounds(275, 116, 152, 23);
		contentPane.add(btnChangePassword);
		
	}
}
