import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.*;

import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 


public class items_list extends JFrame {
	
	private JTextField textField_1;
	private JTextField textField_2;
	String price_per_kg1,price_per_kg2,price_per_kg3,price_per_kg4,price_per_kg5,price_per_kg6,price_per_kg7,price_per_kg8,price_per_kg9,price_per_kg10;
	Double amount;
	String c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	int count=1;
	static int no=0;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	String s1;
	Double updateAmount;
	String name1;
	 static String br1c1;
	 static String br1c2;
	 static String br1c3;
	 static String br1c4;
	 static String br2c2;
	 static String br2c3;
	 static String br2c4;
	 static String br2c1;
	 static String br3c1;
	 static String br3c2;
	 static String br3c3;
	 static String br3c4;
	 static String br4c1;
	 static String br4c2;
	 static String br4c3;
	 static String br4c4;
	 static String br5c1;
	 static String br5c2;
	 static String br5c3;
	 static String br5c4;
	 static String br6c1;
	 static String br6c2;
	 static String br6c3;
	 static String br6c4;
	 static String br7c1;
	 static String br7c2;
	 static String br7c3;
	 static String br7c4;
	 static String br8c1;
	 static String br8c2;
	 static String br8c3;
	 static String br8c4;
	 static String br9c1;
	 static String br9c2;
	 static String br9c3;
	 static String br9c4;
	 static String br10c1;
	 static String br10c2;
	 static String br10c3;
	 static String br10c4;
	
	/**
	 * @throws SQLException 
	 * Create the frame.
	 * @throws  
	 */
	public items_list() {
		
		final JComboBox comboBox_1 = new JComboBox();
		
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(count==1)
				{
				try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db","root","parag123");
				PreparedStatement statement =  con.prepareStatement("Select * from customers_data ");
				
				//creating a variable to execute query
				ResultSet result= statement.executeQuery();
	
				while(result.next())
				{
					String s = result.getString(2) + " " + result.getString(3);
				    comboBox_1.addItem(s);
					//System.out.println("Id = " + result.getString(1) + " FirstName : " + result.getString(2) + " LastName : " + result.getString(3) + " Amount : " + result.getString(4));
				}
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
					System.out.println("Connection con");
				}
				count++;
				}
				else
				{
				}
			}
		});
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Parag\\Desktop\\thumbnail.aspx.jpg"));
		setTitle("Items Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 360);
		getContentPane().setLayout(null);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("class.forname");
		}
		
		
		final JComboBox comboBox = new JComboBox();
		final JComboBox comboBox_2 = new JComboBox();
		final JComboBox comboBox_3 = new JComboBox();
		final JComboBox comboBox_4 = new JComboBox();
		final JComboBox comboBox_5 = new JComboBox();
		final JComboBox comboBox_6 = new JComboBox();
		final JComboBox comboBox_7 = new JComboBox();
		final JComboBox comboBox_8 = new JComboBox();
		final JComboBox comboBox_9 = new JComboBox();
		final JComboBox comboBox_10 = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-------------", "Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox.setBounds(102, 47, 79, 20);
		getContentPane().add(comboBox);
		
		JLabel lblCustomerName = new JLabel("Customer Name :");
		lblCustomerName.setBounds(10, 11, 105, 14);
		getContentPane().add(lblCustomerName);
		
		comboBox_1.setBounds(125, 8, 155, 20);
		getContentPane().add(comboBox_1);
		
		JLabel lblItemSelected = new JLabel("Select item :");
		lblItemSelected.setBounds(10, 50, 101, 14);
		getContentPane().add(lblItemSelected);
		
		JLabel lblPricePerKg = new JLabel("Price per kg :");
		lblPricePerKg.setBounds(191, 50, 94, 14);
		getContentPane().add(lblPricePerKg);
		
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_1.setText("");
			}
		});
		textField_1.setText("0");
		textField_1.setBounds(269, 47, 79, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAmountBought = new JLabel("Amount Bought :");
		lblAmountBought.setBounds(384, 50, 141, 14);
		getContentPane().add(lblAmountBought);
		
		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_2.setText("");
			}
		});
		textField_2.setText("0");
		textField_2.setBounds(485, 47, 79, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGm = new JLabel("gms");
		lblGm.setBounds(567, 50, 46, 14);
		getContentPane().add(lblGm);
		
		JLabel lblRs = new JLabel("Rs.");
		lblRs.setBounds(351, 50, 23, 14);
		getContentPane().add(lblRs);
		
		JLabel lblCalculatedAmount = new JLabel("Amount :");
		lblCalculatedAmount.setBounds(607, 50, 58, 14);
		getContentPane().add(lblCalculatedAmount);
		
		JButton btnNewButton = new JButton("Calculate Total");
		btnNewButton.addActionListener(new ActionListener() {
			private JTextComponent formattedTextField;

			public void actionPerformed(ActionEvent arg0) {
				
				//calculating the amount for the customer
				price_per_kg1 = textField_1.getText();
				c1 = textField_2.getText();
				double cal1=(Double.parseDouble(price_per_kg1)*((Double.parseDouble(c1))/1000));
				textField_3.setText("" + cal1);   // Double.toString(cal)
				
				
				price_per_kg2 = textField.getText();
				c2 = textField_13.getText();
				double cal2=(Double.parseDouble(price_per_kg2)*((Double.parseDouble(c2))/1000));
				textField_22.setText("" + cal2);   // Double.toString(cal)
				
				price_per_kg3 = textField_5.getText();
				c3 = textField_14.getText();
				double cal3=(Double.parseDouble(price_per_kg3)*((Double.parseDouble(c3))/1000));
				textField_23.setText("" + cal3);   // Double.toString(cal)
				
				price_per_kg4 = textField_6.getText();
				c4 = textField_15.getText();
				double cal4=(Double.parseDouble(price_per_kg4)*((Double.parseDouble(c4))/1000));
				textField_24.setText("" + cal4);   // Double.toString(cal)
				
				price_per_kg5 = textField_7.getText();
				c5 = textField_16.getText();
				double cal5=(Double.parseDouble(price_per_kg5)*((Double.parseDouble(c5))/1000));
				textField_25.setText("" + cal5);   // Double.toString(cal)
				

				price_per_kg6 = textField_8.getText();
				c6 = textField_17.getText();
				double cal6=(Double.parseDouble(price_per_kg6)*((Double.parseDouble(c6))/1000));
				textField_26.setText("" + cal6);   // Double.toString(cal)
				

				price_per_kg7 = textField_9.getText();
				c7 = textField_18.getText();
				double cal7=(Double.parseDouble(price_per_kg7)*((Double.parseDouble(c7))/1000));
				textField_27.setText("" + cal7);   // Double.toString(cal)
				

				price_per_kg8 = textField_10.getText();
				c8 = textField_19.getText();
				double cal8=(Double.parseDouble(price_per_kg8)*((Double.parseDouble(c8))/1000));
				textField_28.setText("" + cal8);   // Double.toString(cal)
				

				price_per_kg9 = textField_11.getText();
				c9 = textField_20.getText();
				double cal9=(Double.parseDouble(price_per_kg9)*((Double.parseDouble(c9))/1000));
				textField_29.setText("" + cal9);   // Double.toString(cal)
				

				price_per_kg10 = textField_12.getText();
				c10 = textField_21.getText();
				double cal10=(Double.parseDouble(price_per_kg10)*((Double.parseDouble(c10))/1000));
				textField_30.setText("" + cal10);   // Double.toString(cal)
				
				amount=cal1+cal2+cal3+cal4+cal5+cal6+cal7+cal8+cal9+cal10;
				textField_31.setText("" + amount);
			}
		});
		
		btnNewButton.setBounds(536, 276, 105, 35);
		getContentPane().add(btnNewButton);
		
		
		
		
		JButton btnUpdateRecord = new JButton("Update Record");
		
		btnUpdateRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//*-----------------------------------------------------------------*
				try
				{
			
					name1 = (String) comboBox_1.getSelectedItem();
					String name;
					StringTokenizer command = new StringTokenizer(name1," ");
					name=command.nextToken();
					System.out.println(name);
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db","root","parag123");
					String strn = "Select customer_amount from customers_data where customer_firstname= '" + name  + "'";
					PreparedStatement statement =  con.prepareStatement(strn);
					
					//creating a variable to execute query
					ResultSet result= statement.executeQuery(strn);
					
					while(result.next())
					{
						Double a = Double.parseDouble(result.getString("customer_amount"));
						System.out.println("" + a);
						updateAmount = a + amount;
						System.out.println(updateAmount);
					}
					
					Statement stmt=con.createStatement();
					stmt.executeUpdate("update customers_data set customer_amount='"+ updateAmount.toString() +"' where customer_firstname='"+ name +"'");
				JOptionPane.showMessageDialog(null, "Record Updated.");
				br1c1 = (String) comboBox.getSelectedItem();
				br1c2 = textField_1.getText();
				br1c3 = textField_2.getText();
				br1c4 = textField_3.getText();
				br2c2 = textField.getText();
				br2c3 = textField_13.getText();
				br2c4 = textField_22.getText();
				br2c1= (String) comboBox_2.getSelectedItem();
				br3c2 = textField_5.getText();
				br3c3 = textField_14.getText();
				br3c4 = textField_23.getText();
				br3c1= (String) comboBox_3.getSelectedItem();
				br4c2 = textField_6.getText();
				br4c3 = textField_15.getText();
				br4c4 = textField_24.getText();
				br4c1= (String) comboBox_4.getSelectedItem();
				br5c2 = textField_7.getText();
				br5c3 = textField_14.getText();
				br5c4 = textField_25.getText();
				br5c1= (String) comboBox_5.getSelectedItem();
				br6c2 = textField_8.getText();
				br6c3 = textField_17.getText();
				br6c4 = textField_26.getText();
				br6c1= (String) comboBox_6.getSelectedItem();
				br7c2 = textField_9.getText();
				br7c3 = textField_18.getText();
				br7c4 = textField_27.getText();
				br7c1= (String) comboBox_7.getSelectedItem();
				br8c2 = textField_10.getText();
				br8c3 = textField_19.getText();
				br8c4 = textField_28.getText();
				br8c1= (String) comboBox_8.getSelectedItem();
				br9c2 = textField_11.getText();
				br9c3 = textField_20.getText();
				br9c4 = textField_29.getText();
				br9c1= (String) comboBox_9.getSelectedItem();
				br10c2 = textField_12.getText();
				br10c3 = textField_21.getText();
				br10c4 = textField_30.getText();
				br10c1= (String) comboBox_10.getSelectedItem();
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Error in Update.");
					e1.printStackTrace();
				}
			}
		});
		btnUpdateRecord.setBounds(400, 282, 125, 23);
		getContentPane().add(btnUpdateRecord);
		
		JLabel lblRs_1 = new JLabel("Rs.");
		lblRs_1.setBounds(744, 50, 23, 14);
		getContentPane().add(lblRs_1);
	/*	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);*/
		
		//combo box selected item into textbox selected item
	//	String selected_item = (String) comboBox.getSelectedItem();
		
		textField_3 = new JTextField();
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_3.setText("");
			}
		});
		textField_3.setText("0.0");
		textField_3.setBounds(658, 47, 83, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-------------", "Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox_2.setBounds(102, 69, 79, 20);
		getContentPane().add(comboBox_2);
		
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"-------------", "Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox_3.setBounds(102, 91, 79, 20);
		getContentPane().add(comboBox_3);	
		
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"-------------", "Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox_4.setBounds(102, 114, 79, 20);
		getContentPane().add(comboBox_4);
		
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"-------------", "Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox_5.setBounds(102, 137, 79, 20);
		getContentPane().add(comboBox_5);
		
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"-------------", "Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox_6.setBounds(102, 160, 79, 20);
		getContentPane().add(comboBox_6);
		
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"-------------", "Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox_7.setBounds(102, 183, 79, 20);
		getContentPane().add(comboBox_7);
		
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"-------------", "Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox_8.setBounds(102, 206, 79, 20);
		getContentPane().add(comboBox_8);
		
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"-------------", "Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox_9.setBounds(102, 228, 79, 20);
		getContentPane().add(comboBox_9);
		
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"-------------", "Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox_10.setBounds(102, 251, 79, 20);
		getContentPane().add(comboBox_10);
		
		JLabel lblNewLabel = new JLabel("Select item :");
		lblNewLabel.setBounds(10, 72, 82, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select item :");
		lblNewLabel_1.setBounds(10, 94, 82, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Select item :");
		lblNewLabel_2.setBounds(10, 117, 82, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Select item :");
		lblNewLabel_3.setBounds(10, 140, 82, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Select item :");
		lblNewLabel_4.setBounds(10, 163, 82, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Select item :");
		lblNewLabel_5.setBounds(10, 186, 82, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Select item :");
		lblNewLabel_6.setBounds(10, 209, 82, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Select item :");
		lblNewLabel_7.setBounds(10, 231, 82, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Select item :");
		lblNewLabel_8.setBounds(10, 254, 82, 14);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblPricePerKg_1 = new JLabel("Price per kg :");
		lblPricePerKg_1.setBounds(191, 72, 79, 14);
		getContentPane().add(lblPricePerKg_1);
		
		JLabel lblPricePerKg_2 = new JLabel("Price per kg :");
		lblPricePerKg_2.setBounds(191, 94, 79, 14);
		getContentPane().add(lblPricePerKg_2);
		
		JLabel lblPricePerKg_3 = new JLabel("Price per kg :");
		lblPricePerKg_3.setBounds(191, 117, 79, 14);
		getContentPane().add(lblPricePerKg_3);
		
		JLabel lblPricePerKg_4 = new JLabel("Price per kg :");
		lblPricePerKg_4.setBounds(191, 140, 79, 14);
		getContentPane().add(lblPricePerKg_4);
		
		JLabel lblPricePerKg_5 = new JLabel("Price per kg :");
		lblPricePerKg_5.setBounds(191, 163, 79, 14);
		getContentPane().add(lblPricePerKg_5);
		
		JLabel lblPricePerKg_6 = new JLabel("Price per kg :");
		lblPricePerKg_6.setBounds(191, 186, 79, 14);
		getContentPane().add(lblPricePerKg_6);
		
		JLabel lblPricePerKg_7 = new JLabel("Price per kg :");
		lblPricePerKg_7.setBounds(191, 209, 79, 14);
		getContentPane().add(lblPricePerKg_7);
		
		JLabel lblPricePerKg_8 = new JLabel("Price per kg :");
		lblPricePerKg_8.setBounds(191, 231, 79, 14);
		getContentPane().add(lblPricePerKg_8);
		
		JLabel lblPricePerKg_9 = new JLabel("Price per kg :");
		lblPricePerKg_9.setBounds(191, 254, 79, 14);
		getContentPane().add(lblPricePerKg_9);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("");
			}
		});
		textField.setText("0");
		textField.setBounds(269, 69, 79, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(269, 114, 34, -3);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_5.setText("");
			}
		});
		textField_5.setText("0");
		textField_5.setBounds(269, 91, 79, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_6.setText("");
			}
		});
		textField_6.setText("0");
		textField_6.setBounds(269, 114, 79, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_7.setText("");
			}
		});
		textField_7.setText("0");
		textField_7.setBounds(269, 137, 79, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_8.setText("");
			}
		});
		textField_8.setText("0");
		textField_8.setBounds(269, 160, 79, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_9.setText("");
			}
		});
		textField_9.setText("0");
		textField_9.setBounds(269, 183, 79, 20);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_10.setText("");
			}
		});
		textField_10.setText("0");
		textField_10.setBounds(269, 206, 79, 20);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_11.setText("");
			}
		});
		textField_11.setText("0");
		textField_11.setBounds(269, 228, 79, 20);
		getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_12.setText("");
			}
		});
		textField_12.setText("0");
		textField_12.setBounds(269, 251, 79, 20);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblRs_2 = new JLabel("Rs.");
		lblRs_2.setBounds(351, 72, 23, 14);
		getContentPane().add(lblRs_2);
		
		JLabel lblRs_3 = new JLabel("Rs.");
		lblRs_3.setBounds(351, 94, 23, 14);
		getContentPane().add(lblRs_3);
		
		JLabel lblRs_4 = new JLabel("Rs.");
		lblRs_4.setBounds(351, 117, 23, 14);
		getContentPane().add(lblRs_4);
		
		JLabel lblRs_5 = new JLabel("Rs.");
		lblRs_5.setBounds(351, 140, 23, 14);
		getContentPane().add(lblRs_5);
		
		JLabel lblRs_6 = new JLabel("Rs.");
		lblRs_6.setBounds(351, 163, 23, 14);
		getContentPane().add(lblRs_6);
		
		JLabel lblRs_7 = new JLabel("Rs.");
		lblRs_7.setBounds(351, 186, 23, 14);
		getContentPane().add(lblRs_7);
		
		JLabel lblRs_8 = new JLabel("Rs.");
		lblRs_8.setBounds(351, 209, 23, 14);
		getContentPane().add(lblRs_8);
		
		JLabel lblRs_9 = new JLabel("Rs.");
		lblRs_9.setBounds(351, 231, 23, 14);
		getContentPane().add(lblRs_9);
		
		JLabel lblRs_10 = new JLabel("Rs.");
		lblRs_10.setBounds(351, 254, 34, 14);
		getContentPane().add(lblRs_10);
		
		JLabel lblAmountBought_1 = new JLabel("Amount Bought :");
		lblAmountBought_1.setBounds(384, 72, 105, 14);
		getContentPane().add(lblAmountBought_1);
		
		JLabel lblAmountBought_2 = new JLabel("Amount Bought :");
		lblAmountBought_2.setBounds(384, 94, 105, 14);
		getContentPane().add(lblAmountBought_2);
		
		JLabel lblAmountBought_3 = new JLabel("Amount Bought :");
		lblAmountBought_3.setBounds(384, 117, 105, 14);
		getContentPane().add(lblAmountBought_3);
		
		JLabel lblAmountBought_4 = new JLabel("Amount Bought :");
		lblAmountBought_4.setBounds(384, 140, 105, 14);
		getContentPane().add(lblAmountBought_4);
		
		JLabel lblAmountBought_5 = new JLabel("Amount Bought :");
		lblAmountBought_5.setBounds(384, 163, 105, 14);
		getContentPane().add(lblAmountBought_5);
		
		JLabel lblAmountBought_6 = new JLabel("Amount Bought :");
		lblAmountBought_6.setBounds(384, 186, 105, 14);
		getContentPane().add(lblAmountBought_6);
		
		JLabel lblAmountBought_7 = new JLabel("Amount Bought :");
		lblAmountBought_7.setBounds(384, 209, 105, 14);
		getContentPane().add(lblAmountBought_7);
		
		JLabel lblAmountBought_8 = new JLabel("Amount Bought :");
		lblAmountBought_8.setBounds(384, 228, 105, 14);
		getContentPane().add(lblAmountBought_8);
		
		JLabel lblAmountBought_9 = new JLabel("Amount Bought :");
		lblAmountBought_9.setBounds(384, 254, 105, 14);
		getContentPane().add(lblAmountBought_9);
		
		textField_13 = new JTextField();
		textField_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_13.setText("");
			}
		});
		textField_13.setText("0");
		textField_13.setBounds(485, 69, 79, 20);
		getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_14.setText("");
			}
		});
		textField_14.setText("0");
		textField_14.setBounds(485, 91, 79, 20);
		getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_15.setText("");
			}
		});
		textField_15.setText("0");
		textField_15.setBounds(485, 114, 79, 20);
		getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_16.setText("");
			}
		});
		textField_16.setText("0");
		textField_16.setBounds(485, 137, 79, 20);
		getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_17.setText("");
			}
		});
		textField_17.setText("0");
		textField_17.setBounds(485, 160, 79, 20);
		getContentPane().add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_18.setText("");
			}
		});
		textField_18.setText("0");
		textField_18.setBounds(485, 183, 79, 20);
		getContentPane().add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_19.setText("");
			}
		});
		textField_19.setText("0");
		textField_19.setBounds(485, 206, 79, 20);
		getContentPane().add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_20.setText("");
			}
		});
		textField_20.setText("0");
		textField_20.setBounds(485, 228, 79, 20);
		getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_21.setText("");
			}
		});
		textField_21.setText("0");
		textField_21.setBounds(485, 251, 79, 20);
		getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("gms");
		lblNewLabel_9.setBounds(567, 72, 46, 14);
		getContentPane().add(lblNewLabel_9);
		
		JLabel lblGms = new JLabel("gms");
		lblGms.setBounds(567, 94, 46, 14);
		getContentPane().add(lblGms);
		
		JLabel lblGms_1 = new JLabel("gms");
		lblGms_1.setBounds(567, 117, 46, 14);
		getContentPane().add(lblGms_1);
		
		JLabel lblGms_2 = new JLabel("gms");
		lblGms_2.setBounds(567, 140, 46, 14);
		getContentPane().add(lblGms_2);
		
		JLabel lblGms_3 = new JLabel("gms");
		lblGms_3.setBounds(567, 163, 46, 14);
		getContentPane().add(lblGms_3);
		
		JLabel lblGms_4 = new JLabel("gms");
		lblGms_4.setBounds(567, 183, 46, 14);
		getContentPane().add(lblGms_4);
		
		JLabel lblGms_5 = new JLabel("gms");
		lblGms_5.setBounds(567, 209, 46, 14);
		getContentPane().add(lblGms_5);
		
		JLabel lblGms_6 = new JLabel("gms");
		lblGms_6.setBounds(567, 231, 46, 14);
		getContentPane().add(lblGms_6);
		
		JLabel lblGms_7 = new JLabel("gms");
		lblGms_7.setBounds(567, 254, 46, 14);
		getContentPane().add(lblGms_7);
		
		JLabel lblAmount = new JLabel("Amount :");
		lblAmount.setBounds(607, 72, 64, 14);
		getContentPane().add(lblAmount);
		
		JLabel lblAmount_1 = new JLabel("Amount :");
		lblAmount_1.setBounds(607, 94, 58, 14);
		getContentPane().add(lblAmount_1);
		
		JLabel lblAmount_2 = new JLabel("Amount :");
		lblAmount_2.setBounds(607, 117, 58, 14);
		getContentPane().add(lblAmount_2);
		
		JLabel lblAmount_3 = new JLabel("Amount :");
		lblAmount_3.setBounds(607, 140, 58, 14);
		getContentPane().add(lblAmount_3);
		
		JLabel lblAmount_4 = new JLabel("Amount :");
		lblAmount_4.setBounds(607, 163, 58, 14);
		getContentPane().add(lblAmount_4);
		
		JLabel lblAmount_5 = new JLabel("Amount :");
		lblAmount_5.setBounds(607, 186, 58, 14);
		getContentPane().add(lblAmount_5);
		
		JLabel lblAmount_6 = new JLabel("Amount :");
		lblAmount_6.setBounds(607, 209, 58, 14);
		getContentPane().add(lblAmount_6);
		
		JLabel lblAmount_7 = new JLabel("Amount :");
		lblAmount_7.setBounds(607, 231, 58, 14);
		getContentPane().add(lblAmount_7);
		
		JLabel lblAmount_8 = new JLabel("Amount :");
		lblAmount_8.setBounds(607, 254, 58, 14);
		getContentPane().add(lblAmount_8);
		
		textField_22 = new JTextField();
		textField_22.setText("0.0");
		textField_22.setBounds(658, 69, 83, 20);
		getContentPane().add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setText("0.0");
		textField_23.setBounds(658, 91, 83, 20);
		getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setText("0.0");
		textField_24.setBounds(655, 114, 86, 20);
		getContentPane().add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setText("0.0");
		textField_25.setBounds(655, 137, 86, 20);
		getContentPane().add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setText("0.0");
		textField_26.setBounds(655, 160, 86, 20);
		getContentPane().add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setText("0.0");
		textField_27.setBounds(655, 183, 86, 20);
		getContentPane().add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setText("0.0");
		textField_28.setBounds(655, 206, 86, 20);
		getContentPane().add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setText("0.0");
		textField_29.setBounds(655, 228, 86, 20);
		getContentPane().add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setText("0.0");
		textField_30.setBounds(655, 251, 86, 20);
		getContentPane().add(textField_30);
		textField_30.setColumns(10);
		
		JLabel lblRs_11 = new JLabel("Rs.");
		lblRs_11.setBounds(744, 72, 46, 14);
		getContentPane().add(lblRs_11);
		
		JLabel lblRs_12 = new JLabel("Rs.");
		lblRs_12.setBounds(744, 94, 46, 14);
		getContentPane().add(lblRs_12);
		
		JLabel lblRs_13 = new JLabel("Rs.");
		lblRs_13.setBounds(744, 117, 46, 14);
		getContentPane().add(lblRs_13);
		
		JLabel lblRs_14 = new JLabel("Rs.");
		lblRs_14.setBounds(744, 140, 46, 14);
		getContentPane().add(lblRs_14);
		
		JLabel lblRs_15 = new JLabel("Rs.");
		lblRs_15.setBounds(744, 163, 46, 14);
		getContentPane().add(lblRs_15);
		
		JLabel lblRs_16 = new JLabel("Rs.");
		lblRs_16.setBounds(744, 186, 46, 14);
		getContentPane().add(lblRs_16);
		
		JLabel lblRs_17 = new JLabel("Rs.");
		lblRs_17.setBounds(744, 209, 46, 14);
		getContentPane().add(lblRs_17);
		
		JLabel lblRs_18 = new JLabel("Rs.");
		lblRs_18.setBounds(744, 231, 46, 14);
		getContentPane().add(lblRs_18);
		
		JLabel lblRs_19 = new JLabel("Rs.");
		lblRs_19.setBounds(744, 254, 46, 14);
		getContentPane().add(lblRs_19);
		
		textField_31 = new JTextField();
		textField_31.setText("0.0");
		textField_31.setBounds(655, 279, 86, 28);
		getContentPane().add(textField_31);
		textField_31.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Rs.");
		lblNewLabel_10.setBounds(744, 286, 46, 14);
		getContentPane().add(lblNewLabel_10);
		
		
		JButton btnPrint = new JButton("Print Bill");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//*------------------------------------------------------------------*
				//try
				//{
			//	Document document = new Document(PageSize.A4, 50, 50, 50, 50);
				try {
					  no ++ ;
					  String bill="Bill_No." + no +".pdf";
					  Document document=new Document();
				      PdfWriter.getInstance(document,new FileOutputStream(bill));
				      document.open();  
				      String customer_name = "Customer's Name : " + name1;
				      document.add(new Paragraph("Customer's Bill",FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new Color(0,0,0))));
				      document.add(new Paragraph(customer_name,FontFactory.getFont(FontFactory.COURIER, 11, Font.BOLD, new Color(0,0,0))));
				      
				      Table t = new Table(4,10);

				      t.setBorderColor(new Color(0,0,0));

				      t.setPadding(5);

				      //t.setSpacing(5);

				      t.setBorderWidth(1);

				      Cell c1 = new Cell("Selected Item");

				      c1.setHeader(true);

				      t.addCell(c1);

				      c1 = new Cell("Amount per Kg");

				      t.addCell(c1);

				      c1 = new Cell("Quantity");

				      t.addCell(c1);
				      
				      c1= new Cell("Amount");
				      
				      t.addCell(c1);
				      t.endHeaders();
				      
				      t.addCell(br1c1);
				      t.addCell(br1c2);
				      t.addCell(br1c3);
				      t.addCell(br1c4);
				      t.addCell(br2c1);
				      t.addCell(br2c2);
				      t.addCell(br2c3);
				      t.addCell(br2c4);
				      t.addCell(br3c1);
				      t.addCell(br3c2);
				      t.addCell(br3c3);
				      t.addCell(br3c4);
				      t.addCell(br4c1);
				      t.addCell(br4c2);
				      t.addCell(br4c3);
				      t.addCell(br4c4);
				      t.addCell(br5c1);
				      t.addCell(br5c2);
				      t.addCell(br5c3);
				      t.addCell(br5c4);
				      t.addCell(br6c1);
				      t.addCell(br6c2);
				      t.addCell(br6c3);
				      t.addCell(br6c4);
				      t.addCell(br7c1);
				      t.addCell(br7c2);
				      t.addCell(br7c3);
				      t.addCell(br7c4);
				      t.addCell(br8c1);
				      t.addCell(br8c2);
				      t.addCell(br8c3);
				      t.addCell(br8c4);
				      t.addCell(br9c1);
				      t.addCell(br9c2);
				      t.addCell(br9c3);
				      t.addCell(br9c4);
				      t.addCell(br10c1);
				      t.addCell(br10c2);
				      t.addCell(br10c3);
				      t.addCell(br10c4);

					document.add(t);
					 String total = "                                                                                                                                                  Total : Rs." + amount + "/-";
					 String remainingtotal = "                                                                                                                                    Remaining Amount : Rs. " + updateAmount + "/-";
					 
				      document.add(new Paragraph(total,FontFactory.getFont(FontFactory.COURIER, 16, Font.BOLD, new Color(255,0,0))));
				      document.add(new Paragraph(remainingtotal,FontFactory.getFont(FontFactory.COURIER, 16, Font.BOLD, new Color(0,0,255))));
				      
				      document.close();
					JOptionPane.showMessageDialog(null, "pdf generated " + bill);
					System.out.println("pdf generated");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("pdf not generated");
				} catch (DocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("pdf not generated");
				}		
				
			}
		});
		btnPrint.setBounds(301, 282, 89, 23);
		getContentPane().add(btnPrint);
			
	}
}
