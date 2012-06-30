import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;


public class navigate_panel extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public navigate_panel() {
		setTitle("Navigate Form");
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Manage Customers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customers_form cf;
				try {
					cf = new customers_form();
					cf.setVisible(true);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(10, 21, 251, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClickHere = new JButton("Generate Bill");
		btnClickHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items_list il = new items_list();
				il.setVisible(true);
				setVisible(false);
			}
		});
		btnClickHere.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnClickHere.setBounds(10, 45, 251, 23);
		contentPane.add(btnClickHere);
	}
}
