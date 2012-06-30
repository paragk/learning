import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPasswordField;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class change_password_form extends JFrame {

	private JPanel contentPane;
	String currentpassword;
	static String newpassword;
	String confirmpassword;
	char [] current_password,new_password,confirm_password;
//	char [] new_password;
//	char [] confirm_password;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	
	public change_password_form() {
		setTitle("Password Change Form");
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 191);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsername.setBounds(70, 11, 73, 14);
		contentPane.add(lblUsername);
		
		JLabel lblCurrentPassword = new JLabel("Current password :");
		lblCurrentPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCurrentPassword.setBounds(24, 37, 127, 14);
		contentPane.add(lblCurrentPassword);
		
		JLabel lblNewPassword = new JLabel("New Password :");
		lblNewPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewPassword.setBounds(39, 65, 108, 14);
		contentPane.add(lblNewPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblConfirmPassword.setBounds(20, 90, 127, 14);
		contentPane.add(lblConfirmPassword);
		
		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(147, 12, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//**----------------------------------------------------------**
				
				Connection con;
				try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db", "root", "parag123");
				PreparedStatement statement = (PreparedStatement) con.prepareStatement("Select * from login ");
				ResultSet result=statement.executeQuery();
				while(result.next())
				{
					String username=result.getString("Username");
					lblNewLabel.setText(username);
					String password = result.getString("Password");
					char [] chpassword = passwordField.getPassword();
					String cpassword = String.valueOf(chpassword);
					char [] chnpassword = passwordField_1.getPassword();
					String npassword = String.valueOf(chnpassword);
					char [] chcpassword = passwordField_2.getPassword();
					String conpassword = String.valueOf(chcpassword);
					
					if(cpassword.equals(password))
					{
						if(npassword.equals(conpassword))
						{	
							Statement stmt = (Statement) con.createStatement();
							stmt.executeUpdate("update login set Password='"
									+ npassword
									+ "'");
							
							JOptionPane.showMessageDialog(null, "Password Changed !!!");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "New and Confirm password enteries are Different !!!");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Enter correct current password !!!");
					}
				}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnChangePassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnChangePassword.setBounds(54, 120, 142, 23);
		contentPane.add(btnChangePassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(147, 35, 173, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(147, 61, 173, 20);
		contentPane.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(147, 87, 173, 20);
		contentPane.add(passwordField_2);
		
		JButton btnNewButton = new JButton("Back to Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login_form frame = new login_form();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(200, 120, 136, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
