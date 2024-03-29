import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

public class customers_form extends JFrame {

	protected static final String Parse = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static JTextField textField_2;
	private Component MessageBox;
	static customers_form frame;
	static int id = 0,i=0;
	int max=100;
	int [] array;
	int count=1;
	String [] ccid=new String[10];
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new customers_form();
					frame.setVisible(true);
					// accessing drivers from jar file
					Class.forName("com.mysql.jdbc.Driver");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	// creating a variable for the connection
	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/practice_db", "root", "parag123");

	PreparedStatement statement = null,statement1=null;
	ResultSet result = null;
	Statement stmt = null;
	static JTextField textField_3;
	private JTextField textField_4;

	public customers_form() throws ClassNotFoundException, SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Parag\\Desktop\\thumbnail.aspx.jpg"));
		setTitle("Customers  Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 251);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				try
				{
					if(count==1)
					{
						String s1="Select * from customers_data";
						statement1=con.prepareStatement(s1);
						i=0;
						ResultSet result1=statement1.executeQuery();
						while(result1.next())
						{	
							ccid[i]=result1.getString("customer_id");
							//System.out.println("ccid["+i+"]="+ccid[i]);
							i++;
						}
					}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				count++;
				}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(23, 25, 156, 37);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setToolTipText("Firstname\r\n");
		textField.setBounds(128, 33, 273, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblLastName.setBounds(26, 60, 102, 14);
		contentPane.add(lblLastName);

		textField_1 = new JTextField();
		textField_1.setToolTipText("Lastname\r\n");
		textField_1.setBounds(128, 57, 273, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblAddress = new JLabel("Amount :");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAddress.setBounds(42, 82, 115, 20);
		contentPane.add(lblAddress);

		textField_2 = new JTextField();
		textField_2.setToolTipText("amount\r\n");
		textField_2.setBounds(128, 82, 138, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton btnAdd = new JButton("Add ");
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAdd.setToolTipText("Add New Record");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// here we create our query
				try {

					String fn = textField.getText();
					String ln = textField_1.getText();
					String am = textField_2.getText();
					String us = textField_4.getText();

					String insert = "Insert into customers_data(customer_firstname,customer_lastname,customer_amount,customer_username) values (?,?,?,?)";
					statement = con.prepareStatement(insert);
					statement.setString(1, fn);
					statement.setString(2, ln);
					statement.setString(3, am);
					statement.setString(4, us);
					statement.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Added.");
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(159, 155, 78, 23);
		contentPane.add(btnAdd);

		// Update function button

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnUpdate.setToolTipText("Update Record");
		btnUpdate.setBounds(247, 155, 100, 100);
		contentPane.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fn = textField.getText();
				String ln = textField_1.getText();
				String am = textField_2.getText();
				String us = textField_4.getText();
				String cid = textField_3.getText();

				try {
					stmt = con.createStatement();
					stmt.executeUpdate("update customers_data set customer_firstname='"
							+ fn
							+ "', customer_lastname='"
							+ ln
							+ "',customer_amount='"
							+ am
							+ "',customer_username='"
							+us
							+"' where customer_id='" + cid + "'");
					JOptionPane.showMessageDialog(null, "Record Updated.");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Error in Update.");
					e1.printStackTrace();
				}

			}
		});

		btnUpdate.setToolTipText("Update Record");
		btnUpdate.setBounds(246, 155, 78, 23);
		contentPane.add(btnUpdate);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Statement st = con.createStatement();

					String sql = "DELETE FROM customers_data WHERE customer_id = "
							+ textField_3.getText();
					statement = con.prepareStatement(sql);
					statement.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "Record Deleted.");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		btnDelete.setToolTipText("Delete Record");
		btnDelete.setBounds(334, 155, 78, 23);
		contentPane.add(btnDelete);

		JButton button = new JButton("|<");
		button.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					id--;
					if (id != 0) {
						String back = "Select * from customers_data where customer_id= "
								+ ccid[i];
						statement = con.prepareStatement(back);

						// creating a variable to execute query
						result = statement.executeQuery();

						while (result.next()) {
							// System.out.println("Id = " +
							// result.getString("customer_id") + " FirstName : "
							// + result.getString(2) + " LastName : " +
							// result.getString(3) + " Amount : " +
							// result.getString(4));
							textField.setText(result.getString(2));
							textField_1.setText(result.getString(3));
							textField_2.setText(result.getString(4));
							textField_4.setText(result.getString(5));
							id = Integer.parseInt(result.getString(1));
							System.out.println(id);
							textField_3.setText("   " + id);
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"This Is the first record only.");
						statement = con
								.prepareStatement("Select * from customers_data where customer_id=1");

						// creating a variable to execute query
						result = statement.executeQuery();

						while (result.next()) {
							// System.out.println("Id = " +
							// result.getString("customer_id") + " FirstName : "
							// + result.getString(2) + " LastName : " +
							// result.getString(3) + " Amount : " +
							// result.getString(4));
							textField.setText(result.getString(2));
							textField_1.setText(result.getString(3));
							textField_2.setText(result.getString(4));
							id = Integer.parseInt(result.getString(1));
							System.out.println(id);
							textField_3.setText("   " + id);
						}
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				i--;
			}
		});
		button.setToolTipText("Show previous Record");
		button.setBounds(128, 121, 45, 23);
		contentPane.add(button);

		JButton button_1 = new JButton(">|");
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try
					{
					id++;
					String next = "Select * from customers_data where customer_id = " + ccid[i++];
					statement = con.prepareStatement(next);

					// creating a variable to execute query
					result = statement.executeQuery();

					if (result.next() && i<10) {
						textField.setText(result.getString(2));
						textField_1.setText(result.getString(3));
						textField_2.setText(result.getString(4));
						textField_4.setText(result.getString(5));
						id = Integer.parseInt(result.getString(1));
						System.out.println(id);
						textField_3.setText("   " + id);

					} else {
						result.previous();
						JOptionPane.showMessageDialog(null, "End of Records");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "End of Records");
					e1.printStackTrace();	
				}
					
			}
		});
		button_1.setToolTipText("Show Next Record");
		button_1.setBounds(313, 121, 45, 23);
		contentPane.add(button_1);

		JButton btnNewButton = new JButton("Show");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setToolTipText("Show previous Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					statement = con
							.prepareStatement("Select * from customers_data where customer_id=1");

					// creating a variable to execute query
					result = statement.executeQuery();
					

					while (result.next()) {
						
						textField.setText(result.getString(2));
						textField_1.setText(result.getString(3));
						textField_2.setText(result.getString(4));
						textField_4.setText(result.getString(5));
						id = Integer.parseInt(result.getString(1));
						System.out.println(id);
						textField_3.setText("   " + id);
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				i=1;
			}
		});
		btnNewButton.setBounds(59, 155, 89, 23);
		contentPane.add(btnNewButton);

		JLabel lblRecordNo = new JLabel("Record No :");
		lblRecordNo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRecordNo.setBounds(183, 125, 83, 14);
		contentPane.add(lblRecordNo);

		textField_3 = new JTextField();
		textField_3.setBounds(258, 122, 45, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JButton button_2 = new JButton("||<");
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					statement = con
							.prepareStatement("Select * from customers_data where customer_id=1");

					// creating a variable to execute query
					result = statement.executeQuery();

					while (result.next()) {
						// System.out.println("Id = " +
						// result.getString("customer_id") + " FirstName : " +
						// result.getString(2) + " LastName : " +
						// result.getString(3) + " Amount : " +
						// result.getString(4));
						textField.setText(result.getString(2));
						textField_1.setText(result.getString(3));
						textField_2.setText(result.getString(4));
						textField_4.setText(result.getString(5));
						id = Integer.parseInt(result.getString(1));
						System.out.println(id);
						textField_3.setText("   " + id);
						JOptionPane.showMessageDialog(null, "First Record.");
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				i=1;
			}

		});
		button_2.setBounds(67, 121, 51, 23);
		contentPane.add(button_2);

		JButton button_3 = new JButton(">||");
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					statement = con
							.prepareStatement("Select * from customers_data ");

					// creating a variable to execute query
					result = statement.executeQuery();

					result.last();
					textField.setText(result.getString(2));
					textField_1.setText(result.getString(3));
					textField_2.setText(result.getString(4));
					textField_4.setText(result.getString(5));
					id = Integer.parseInt(result.getString(1));
					System.out.println(id);
					textField_3.setText("   " + id);
					JOptionPane.showMessageDialog(null, "last Record.");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_3.setBounds(368, 121, 51, 23);
		contentPane.add(button_3);

		JButton btnAddNewRecord = new JButton("Add New Record");
		btnAddNewRecord.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAddNewRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		btnAddNewRecord.setBounds(10, 189, 138, 23);
		contentPane.add(btnAddNewRecord);

		textField_4 = new JTextField();
		textField_4.setBounds(128, 11, 273, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblUsername = new JLabel("UserName :");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblUsername.setBounds(27, 14, 91, 14);
		contentPane.add(lblUsername);
		
		JButton btnNewButton_1 = new JButton("Navigation Panel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navigate_panel np = new navigate_panel();
				np.setVisible(true);
				frame.setVisible(false);		
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(148, 189, 155, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Generate Bill ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items_list li = new items_list();
				li.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setBounds(303, 189, 133, 23);
		contentPane.add(btnNewButton_2);
	}

	protected static void HIDE_ON_CLOSE() {
		// TODO Auto-generated method stub

	}
}
