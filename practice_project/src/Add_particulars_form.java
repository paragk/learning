import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Add_particulars_form extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Create the frame.
	 */
	public Add_particulars_form() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddNewParticular = new JLabel("Add New Particular :");
		lblAddNewParticular.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAddNewParticular.setBounds(42, 11, 147, 14);
		contentPane.add(lblAddNewParticular);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String particular = textField.getText();
				if(particular.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Enter any Item");
				}
				else
				{
				// here we create our query
				try {
					java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db","root","parag123");
					String insert = "Insert into items_list(items) values (?)";
					PreparedStatement statement = (PreparedStatement) con.prepareStatement(insert);
					statement.setString(1, particular);
					statement.executeUpdate();
					JOptionPane.showMessageDialog(null, "Particular Added.");
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				
				items_list il = new items_list();
				il.setVisible(true);
				setVisible(false);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(185, 38, 134, 27);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(185, 9, 178, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
