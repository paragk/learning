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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class customers_form extends JFrame {

	protected static final String Parse = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Component MessageBox;
	static customers_form frame;
	static int id=0;
	//static items_list il;
	/**
	 * Launch the application.
	 */
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new customers_form();
					frame.setVisible(true);
					//accessing drivers from jar file
					Class.forName("com.mysql.jdbc.Driver");	
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	
	
	//creating a variable for the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db","root","parag123");
		
		PreparedStatement statement=null;
		ResultSet result=null;
		Statement stmt=null;
		private JTextField textField_3;
		
		
		
	public customers_form() throws ClassNotFoundException, SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Parag\\Desktop\\thumbnail.aspx.jpg"));
		setTitle("Customers ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setBounds(47, 25, 119, 37);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setToolTipText("Firstname\r\n");
		textField.setBounds(128, 33, 273, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setBounds(47, 60, 78, 14);
		contentPane.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Lastname\r\n");
		textField_1.setBounds(128, 57, 273, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAddress = new JLabel("Amount :");
		lblAddress.setBounds(57, 82, 91, 20);
		contentPane.add(lblAddress);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("amount\r\n");
		textField_2.setBounds(128, 82, 138, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("Add ");
		btnAdd.setToolTipText("Add New Record");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
				//here we create our query
				try {
				/*	textField.setText("");
					textField_1.setText("");
					textField_2.setText("");*/
			
					String fn=textField.getText();
					String ln=textField_1.getText();
					String am=textField_2.getText();
					
				/*	if ((fn=="") || (ln=="") || (am== ""))
					{
						JOptionPane.showMessageDialog(null, "Enter Complete Detail");
					}*/
					
					String insert="Insert into customers_data(customer_firstname,customer_lastname,customer_amount) values (?,?,?)";
					statement =  con.prepareStatement(insert);
					statement.setString(1, fn); 
					statement.setString(2, ln);
					statement.setString(3, am); 
					statement.executeUpdate();
		JOptionPane.showMessageDialog(null, "Record Updated.");
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();	
			}
		}
		});
		btnAdd.setBounds(158, 155, 78, 23);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setToolTipText("Update Record");
		btnUpdate.setBounds(246, 155, 78, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
			//	Statement st = con.createStatement();
					
				String sql = "DELETE FROM customers_data WHERE customer_id = " + textField_3.getText();
				statement =  con.prepareStatement(sql);
				statement.executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "Record Deleted.");
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
				
		});
		btnDelete.setToolTipText("Delete Record");
		btnDelete.setBounds(334, 155, 78, 23);
		contentPane.add(btnDelete);
		
		JLabel lblNewLabel_1 = new JLabel("For Item selection go here ...");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				//items_list_and_price.
				//customers_form=pp;
				//il.setVisible(true);
				frame.setVisible(false);
				
				
			}
		});
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblNewLabel_1.setBounds(270, 176, 156, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton button = new JButton("|<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					id--;
					if(id != 0)
					{
					String back="Select * from customers_data where customer_id= " + id;
					statement =  con.prepareStatement(back);
				
				//creating a variable to execute query
				result= statement.executeQuery();
				
				while(result.next())
				{
					//System.out.println("Id = " + result.getString("customer_id") + " FirstName : " + result.getString(2) + " LastName : " + result.getString(3) + " Amount : " + result.getString(4));
					textField.setText(result.getString(2));
					textField_1.setText(result.getString(3));
					textField_2.setText(result.getString(4));
					id=Integer.parseInt(result.getString(1));
					System.out.println(id);
					textField_3.setText("   "+id);
				}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "This Is the first record only.");
						statement =  con.prepareStatement("Select * from customers_data where customer_id=1");
						
						//creating a variable to execute query
						result= statement.executeQuery();
						
						while(result.next())
						{
							//System.out.println("Id = " + result.getString("customer_id") + " FirstName : " + result.getString(2) + " LastName : " + result.getString(3) + " Amount : " + result.getString(4));
							textField.setText(result.getString(2));
							textField_1.setText(result.getString(3));
							textField_2.setText(result.getString(4));
							id=Integer.parseInt(result.getString(1));
							System.out.println(id);
							textField_3.setText("   "+id);
						}
					}
				
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setToolTipText("Show previous Record");
		button.setBounds(128, 121, 45, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton(">|");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				//	int n=""
					id++;
					
					String next="Select * from customers_data where customer_id= " + id;
					statement =  con.prepareStatement(next);
				
				//creating a variable to execute query
				result= statement.executeQuery();
				
			/*	while(result.next())
				{
					//System.out.println("Id = " + result.getString("customer_id") + " FirstName : " + result.getString(2) + " LastName : " + result.getString(3) + " Amount : " + result.getString(4));
					textField.setText(result.getString(2));
					textField_1.setText(result.getString(3));
					textField_2.setText(result.getString(4));
					id=Integer.parseInt(result.getString(1));
					System.out.println(id);
					textField_3.setText("   "+id);
				}*/
				if ( result.next( ) ) {
					textField.setText(result.getString(2));
					textField_1.setText(result.getString(3));
					textField_2.setText(result.getString(4));
					id=Integer.parseInt(result.getString(1));
					System.out.println(id);
					textField_3.setText("   "+id);

				}
				else {
				result.previous( );
				
				JOptionPane.showMessageDialog(null, "End of File");
				}
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1.setToolTipText("Show Next Record");
		button_1.setBounds(313, 121, 45, 23);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.setToolTipText("Show previous Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
	
					statement =  con.prepareStatement("Select * from customers_data where customer_id=1");
				
				//creating a variable to execute query
				result= statement.executeQuery();
				
				while(result.next())
				{
					//System.out.println("Id = " + result.getString("customer_id") + " FirstName : " + result.getString(2) + " LastName : " + result.getString(3) + " Amount : " + result.getString(4));
					textField.setText(result.getString(2));
					textField_1.setText(result.getString(3));
					textField_2.setText(result.getString(4));
					id=Integer.parseInt(result.getString(1));
					System.out.println(id);
					textField_3.setText("   "+id);
				}
				
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(59, 155, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblRecordNo = new JLabel("Record No :");
		lblRecordNo.setBounds(183, 125, 64, 14);
		contentPane.add(lblRecordNo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(246, 124, 45, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button_2 = new JButton("||<");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
	
					statement =  con.prepareStatement("Select * from customers_data where customer_id=1");
				
				//creating a variable to execute query
				result= statement.executeQuery();
				
				while(result.next())
				{
					//System.out.println("Id = " + result.getString("customer_id") + " FirstName : " + result.getString(2) + " LastName : " + result.getString(3) + " Amount : " + result.getString(4));
					textField.setText(result.getString(2));
					textField_1.setText(result.getString(3));
					textField_2.setText(result.getString(4));
					id=Integer.parseInt(result.getString(1));
					System.out.println(id);
					textField_3.setText("   "+id);
					JOptionPane.showMessageDialog(null, "First Record.");
				}
				
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
		});
		button_2.setBounds(67, 121, 51, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton(">||");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					statement =  con.prepareStatement("Select * from customers_data ");
				
				//creating a variable to execute query
				result= statement.executeQuery();
				
				result.last();
				textField.setText(result.getString(2));
				textField_1.setText(result.getString(3));
				textField_2.setText(result.getString(4));
				id=Integer.parseInt(result.getString(1));
				System.out.println(id);
				textField_3.setText("   "+id);
				JOptionPane.showMessageDialog(null, "last Record.");
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_3.setBounds(368, 121, 51, 23);
		contentPane.add(button_3);
	}

	protected static void HIDE_ON_CLOSE() {
		// TODO Auto-generated method stub
		
	}
}
