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
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.print.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.*;
 


public class items_list extends JFrame {
	
	private JTextField textField_1;
	private JTextField textField_2;
	String price_per_kg1,price_per_kg2,price_per_kg3,price_per_kg4,price_per_kg5,price_per_kg6,price_per_kg7,price_per_kg8,price_per_kg9,price_per_kg10;
	Double amount;
	String c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	int count=1,count1=1;
	static int no=0;
	String bill;
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
	 private JTextField textField_32;
	 private JTextField textField_33;
	 private JTextField textField_34;
	 private JTextField textField_35;
	 private JTextField textField_36;
	 private JTextField textField_37;
	 private JTextField textField_38;
	 private JTextField textField_39;
	 private JTextField textField_40;
	 private JTextField textField_41;
	 private JTextField textField_42;
	 private JTextField textField_43;
	 private JTextField textField_44;
	 private JTextField textField_45;
	 private JTextField textField_46;
	 private JTextField textField_47;
	 private JTextField textField_48;
	 private JTextField textField_49;
	 private JTextField textField_50;
	 private JTextField textField_51;
	 private JTextField textField_52;
	 private JTextField textField_53;
	 private JTextField textField_54;
	 private JTextField textField_55;
	 private JTextField textField_56;
	 private JTextField textField_57;
	 private JTextField textField_58;
	 private JTextField textField_59;
	 private JTextField textField_60;
	 private JTextField textField_61;
	
	/**
	 * @throws SQLException 
	 * Create the frame.
	 * @throws  
	 */
	public items_list() {
		
		final JComboBox comboBox_1 = new JComboBox();
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
		
		getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				try
				{
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db","root","parag123");
				if(count==1)
				{
				PreparedStatement statement =  con.prepareStatement("Select * from customers_data ");
			//	PreparedStatement statement1=con.prepareStatement("Select * from items_list");
				//creating a variable to execute query
				ResultSet result= statement.executeQuery();
				// result2=statement.executeQuery(statement1);
	
				while(result.next())
				{
					String s = result.getString(2) + " " + result.getString(3);
				    comboBox_1.addItem(s);
					//System.out.println("Id = " + result.getString(1) + " FirstName : " + result.getString(2) + " LastName : " + result.getString(3) + " Amount : " + result.getString(4));
				}
				}
				if(count1==1)
				{
					
				PreparedStatement statement =  con.prepareStatement("Select * from items_list ");
			
				//creating a variable to execute query
				ResultSet result= statement.executeQuery();
				// result2=statement.executeQuery(statement1);
	
				while(result.next())
				{
					String s = result.getString("items");
				    comboBox.addItem(s);
				    comboBox_2.addItem(s);
				    comboBox_3.addItem(s);
				    comboBox_4.addItem(s);
				    comboBox_5.addItem(s);
				    comboBox_6.addItem(s);
				    comboBox_7.addItem(s);
				    comboBox_8.addItem(s);
				    comboBox_9.addItem(s);
				    comboBox_10.addItem(s);
					//System.out.println("Id = " + result.getString(1) + " FirstName : " + result.getString(2) + " LastName : " + result.getString(3) + " Amount : " + result.getString(4));
				}
				}
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
					System.out.println("Connection con");
				}
				count++;
				count1++;
			}
		});
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Parag\\Desktop\\thumbnail.aspx.jpg"));
		setTitle("Items Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 353);
		getContentPane().setLayout(null);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("class.forname");
		}
		
		
		
		comboBox.setBounds(81, 47, 79, 20);
		getContentPane().add(comboBox);
		
		JLabel lblCustomerName = new JLabel("Customer Name :");
		lblCustomerName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCustomerName.setBounds(10, 11, 125, 14);
		getContentPane().add(lblCustomerName);
		
		comboBox_1.setBounds(162, 9, 155, 20);
		getContentPane().add(comboBox_1);
		
		JLabel lblItemSelected = new JLabel("Particulars :");
		lblItemSelected.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblItemSelected.setBounds(10, 50, 101, 14);
		getContentPane().add(lblItemSelected);
		
		JLabel lblPricePerKg = new JLabel("Pieces :");
		lblPricePerKg.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPricePerKg.setBounds(170, 50, 94, 14);
		getContentPane().add(lblPricePerKg);
		
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_1.setText("");
			}
		});
		textField_1.setText("0");
		textField_1.setBounds(215, 47, 40, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAmountBought = new JLabel("Weight :");
		lblAmountBought.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmountBought.setBounds(262, 50, 141, 14);
		getContentPane().add(lblAmountBought);
		
		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_2.setText("");
			}
		});
		textField_2.setText("0");
		textField_2.setBounds(316, 47, 57, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGm = new JLabel("kg");
		lblGm.setBounds(378, 50, 46, 14);
		getContentPane().add(lblGm);
		
		JLabel lblRs = new JLabel("Rs.");
		lblRs.setBounds(698, 50, 23, 14);
		getContentPane().add(lblRs);
		
		JLabel lblCalculatedAmount = new JLabel("Amount :");
		lblCalculatedAmount.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCalculatedAmount.setBounds(721, 50, 58, 14);
		getContentPane().add(lblCalculatedAmount);
		
		JButton btnNewButton = new JButton("Calculate Total");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
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
		
		btnNewButton.setBounds(588, 276, 156, 35);
		getContentPane().add(btnNewButton);
		
		JButton btnUpdateRecord = new JButton("Update Record");
		btnUpdateRecord.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
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
						DecimalFormat df = new DecimalFormat("#.##");
						String sprecise_a=df.format(a);
					    System.out.println(sprecise_a);
					
						System.out.println("" + a);
						Double supdateAmount = a + amount;
						DecimalFormat df1 = new DecimalFormat("#.##");
						String sprecise_ua=df1.format(supdateAmount);
				        System.out.println(sprecise_ua);
				        updateAmount=Double.parseDouble(sprecise_ua);
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
				br5c3 = textField_16.getText();
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
		btnUpdateRecord.setBounds(453, 282, 125, 23);
		getContentPane().add(btnUpdateRecord);
		
		JLabel lblRs_1 = new JLabel("Rs.");
		lblRs_1.setBounds(830, 50, 23, 14);
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
		textField_3.setBounds(771, 47, 57, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		comboBox_2.setBounds(81, 69, 79, 20);
		getContentPane().add(comboBox_2);
		comboBox_3.setBounds(81, 91, 79, 20);
		getContentPane().add(comboBox_3);
		comboBox_4.setBounds(81, 114, 79, 20);
		getContentPane().add(comboBox_4);
		comboBox_5.setBounds(81, 137, 79, 20);
		getContentPane().add(comboBox_5);
		comboBox_6.setBounds(81, 160, 79, 20);
		getContentPane().add(comboBox_6);
		comboBox_7.setBounds(81, 183, 79, 20);
		getContentPane().add(comboBox_7);
		comboBox_8.setBounds(81, 206, 79, 20);
		getContentPane().add(comboBox_8);
		comboBox_9.setBounds(81, 228, 79, 20);
		getContentPane().add(comboBox_9);
		comboBox_10.setBounds(81, 251, 79, 20);
		getContentPane().add(comboBox_10);
		
		JLabel lblNewLabel = new JLabel("Particulars :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 72, 82, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Particulars :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 94, 82, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Particulars :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 117, 82, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Particulars :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 140, 82, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Particulars :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 163, 82, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Particulars :");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 186, 82, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Particulars :");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 209, 82, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Particulars :");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 231, 82, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblPricePerKg_1 = new JLabel("Pieces :");
		lblPricePerKg_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPricePerKg_1.setBounds(170, 72, 79, 14);
		getContentPane().add(lblPricePerKg_1);
		
		JLabel lblPricePerKg_2 = new JLabel("Pieces :");
		lblPricePerKg_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPricePerKg_2.setBounds(170, 94, 79, 14);
		getContentPane().add(lblPricePerKg_2);
		
		JLabel lblPricePerKg_3 = new JLabel("Pieces :");
		lblPricePerKg_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPricePerKg_3.setBounds(170, 117, 79, 14);
		getContentPane().add(lblPricePerKg_3);
		
		JLabel lblPricePerKg_4 = new JLabel("Pieces :");
		lblPricePerKg_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPricePerKg_4.setBounds(170, 140, 79, 14);
		getContentPane().add(lblPricePerKg_4);
		
		JLabel lblPricePerKg_5 = new JLabel("Pieces :");
		lblPricePerKg_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPricePerKg_5.setBounds(170, 163, 79, 14);
		getContentPane().add(lblPricePerKg_5);
		
		JLabel lblPricePerKg_6 = new JLabel("Pieces :");
		lblPricePerKg_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPricePerKg_6.setBounds(170, 186, 79, 14);
		getContentPane().add(lblPricePerKg_6);
		
		JLabel lblPricePerKg_7 = new JLabel("Pieces :");
		lblPricePerKg_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPricePerKg_7.setBounds(170, 209, 79, 14);
		getContentPane().add(lblPricePerKg_7);
		
		JLabel lblPricePerKg_8 = new JLabel("Pieces :");
		lblPricePerKg_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPricePerKg_8.setBounds(170, 231, 79, 14);
		getContentPane().add(lblPricePerKg_8);
		
		JLabel lblPricePerKg_9 = new JLabel("Pieces :");
		lblPricePerKg_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPricePerKg_9.setBounds(170, 254, 79, 14);
		getContentPane().add(lblPricePerKg_9);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("");
			}
		});
		textField.setText("0");
		textField.setBounds(215, 69, 40, 20);
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
		textField_5.setBounds(215, 91, 40, 20);
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
		textField_6.setBounds(215, 114, 40, 20);
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
		textField_7.setBounds(215, 137, 40, 20);
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
		textField_8.setBounds(215, 160, 40, 20);
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
		textField_9.setBounds(215, 183, 40, 20);
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
		textField_10.setBounds(215, 206, 40, 20);
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
		textField_11.setBounds(215, 228, 40, 20);
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
		textField_12.setBounds(215, 251, 40, 20);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblRs_2 = new JLabel("Rs.");
		lblRs_2.setBounds(698, 117, 23, 14);
		getContentPane().add(lblRs_2);
		
		JLabel lblRs_3 = new JLabel("Rs.");
		lblRs_3.setBounds(698, 140, 23, 14);
		getContentPane().add(lblRs_3);
		
		JLabel lblRs_4 = new JLabel("Rs.");
		lblRs_4.setBounds(698, 163, 23, 14);
		getContentPane().add(lblRs_4);
		
		JLabel lblRs_5 = new JLabel("Rs.");
		lblRs_5.setBounds(698, 186, 23, 14);
		getContentPane().add(lblRs_5);
		
		JLabel lblRs_6 = new JLabel("Rs.");
		lblRs_6.setBounds(698, 209, 23, 14);
		getContentPane().add(lblRs_6);
		
		JLabel lblRs_7 = new JLabel("Rs.");
		lblRs_7.setBounds(698, 231, 23, 14);
		getContentPane().add(lblRs_7);
		
		JLabel lblRs_8 = new JLabel("Rs.");
		lblRs_8.setBounds(698, 254, 23, 14);
		getContentPane().add(lblRs_8);
		
		JLabel lblRs_9 = new JLabel("Rs.");
		lblRs_9.setBounds(698, 94, 23, 14);
		getContentPane().add(lblRs_9);
		
		JLabel lblRs_10 = new JLabel("Rs.");
		lblRs_10.setBounds(698, 75, 34, 14);
		getContentPane().add(lblRs_10);
		
		JLabel lblAmountBought_1 = new JLabel("Weight :");
		lblAmountBought_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmountBought_1.setBounds(262, 72, 105, 14);
		getContentPane().add(lblAmountBought_1);
		
		JLabel lblAmountBought_2 = new JLabel("Weight :");
		lblAmountBought_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmountBought_2.setBounds(262, 94, 105, 14);
		getContentPane().add(lblAmountBought_2);
		
		JLabel lblAmountBought_3 = new JLabel("Weight :");
		lblAmountBought_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmountBought_3.setBounds(262, 117, 105, 14);
		getContentPane().add(lblAmountBought_3);
		
		JLabel lblAmountBought_4 = new JLabel("Weight :");
		lblAmountBought_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmountBought_4.setBounds(262, 140, 105, 14);
		getContentPane().add(lblAmountBought_4);
		
		JLabel lblAmountBought_5 = new JLabel("Weight :");
		lblAmountBought_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmountBought_5.setBounds(262, 163, 105, 14);
		getContentPane().add(lblAmountBought_5);
		
		JLabel lblAmountBought_6 = new JLabel("Weight :");
		lblAmountBought_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmountBought_6.setBounds(262, 186, 105, 14);
		getContentPane().add(lblAmountBought_6);
		
		JLabel lblAmountBought_7 = new JLabel("Weight :");
		lblAmountBought_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmountBought_7.setBounds(262, 209, 105, 14);
		getContentPane().add(lblAmountBought_7);
		
		JLabel lblAmountBought_8 = new JLabel("Weight :");
		lblAmountBought_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmountBought_8.setBounds(262, 231, 105, 14);
		getContentPane().add(lblAmountBought_8);
		
		JLabel lblAmountBought_9 = new JLabel("Weight :");
		lblAmountBought_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmountBought_9.setBounds(262, 257, 105, 14);
		getContentPane().add(lblAmountBought_9);
		
		textField_13 = new JTextField();
		textField_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_13.setText("");
			}
		});
		textField_13.setText("0");
		textField_13.setBounds(316, 69, 57, 20);
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
		textField_14.setBounds(316, 91, 57, 20);
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
		textField_15.setBounds(316, 114, 57, 20);
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
		textField_16.setBounds(316, 137, 57, 20);
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
		textField_17.setBounds(316, 160, 57, 20);
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
		textField_18.setBounds(316, 183, 57, 20);
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
		textField_19.setBounds(316, 206, 57, 20);
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
		textField_20.setBounds(316, 228, 57, 20);
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
		textField_21.setBounds(316, 251, 57, 20);
		getContentPane().add(textField_21);
		textField_21.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("kg");
		lblNewLabel_9.setBounds(378, 72, 46, 14);
		getContentPane().add(lblNewLabel_9);
		
		JLabel lblGms = new JLabel("kg");
		lblGms.setBounds(380, 94, 46, 14);
		getContentPane().add(lblGms);
		
		JLabel lblGms_1 = new JLabel("kg");
		lblGms_1.setBounds(378, 117, 46, 14);
		getContentPane().add(lblGms_1);
		
		JLabel lblGms_2 = new JLabel("kg");
		lblGms_2.setBounds(378, 140, 46, 14);
		getContentPane().add(lblGms_2);
		
		JLabel lblGms_3 = new JLabel("kg");
		lblGms_3.setBounds(378, 163, 46, 14);
		getContentPane().add(lblGms_3);
		
		JLabel lblGms_4 = new JLabel("kg");
		lblGms_4.setBounds(378, 186, 46, 14);
		getContentPane().add(lblGms_4);
		
		JLabel lblGms_5 = new JLabel("kg");
		lblGms_5.setBounds(378, 209, 46, 14);
		getContentPane().add(lblGms_5);
		
		JLabel lblGms_6 = new JLabel("kg");
		lblGms_6.setBounds(378, 231, 46, 14);
		getContentPane().add(lblGms_6);
		
		JLabel lblGms_7 = new JLabel("kg");
		lblGms_7.setBounds(378, 254, 46, 14);
		getContentPane().add(lblGms_7);
		
		JLabel lblAmount = new JLabel("Amount :");
		lblAmount.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount.setBounds(721, 72, 64, 14);
		getContentPane().add(lblAmount);
		
		JLabel lblAmount_1 = new JLabel("Amount :");
		lblAmount_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount_1.setBounds(721, 94, 58, 14);
		getContentPane().add(lblAmount_1);
		
		JLabel lblAmount_2 = new JLabel("Amount :");
		lblAmount_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount_2.setBounds(721, 117, 58, 14);
		getContentPane().add(lblAmount_2);
		
		JLabel lblAmount_3 = new JLabel("Amount :");
		lblAmount_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount_3.setBounds(721, 140, 58, 14);
		getContentPane().add(lblAmount_3);
		
		JLabel lblAmount_4 = new JLabel("Amount :");
		lblAmount_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount_4.setBounds(721, 163, 58, 14);
		getContentPane().add(lblAmount_4);
		
		JLabel lblAmount_5 = new JLabel("Amount :");
		lblAmount_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount_5.setBounds(721, 186, 58, 14);
		getContentPane().add(lblAmount_5);
		
		JLabel lblAmount_6 = new JLabel("Amount :");
		lblAmount_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount_6.setBounds(721, 209, 58, 14);
		getContentPane().add(lblAmount_6);
		
		JLabel lblAmount_7 = new JLabel("Amount :");
		lblAmount_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount_7.setBounds(721, 231, 58, 14);
		getContentPane().add(lblAmount_7);
		
		JLabel lblAmount_8 = new JLabel("Amount :");
		lblAmount_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAmount_8.setBounds(721, 251, 58, 14);
		getContentPane().add(lblAmount_8);
		
		textField_22 = new JTextField();
		textField_22.setText("0.0");
		textField_22.setBounds(771, 69, 57, 20);
		getContentPane().add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setText("0.0");
		textField_23.setBounds(771, 91, 57, 20);
		getContentPane().add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setText("0.0");
		textField_24.setBounds(771, 114, 57, 20);
		getContentPane().add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setText("0.0");
		textField_25.setBounds(771, 137, 57, 20);
		getContentPane().add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setText("0.0");
		textField_26.setBounds(771, 160, 57, 20);
		getContentPane().add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setText("0.0");
		textField_27.setBounds(771, 183, 57, 20);
		getContentPane().add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setText("0.0");
		textField_28.setBounds(770, 206, 58, 20);
		getContentPane().add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setText("0.0");
		textField_29.setBounds(771, 228, 57, 20);
		getContentPane().add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setText("0.0");
		textField_30.setBounds(771, 251, 57, 20);
		getContentPane().add(textField_30);
		textField_30.setColumns(10);
		
		JLabel lblRs_11 = new JLabel("Rs.");
		lblRs_11.setBounds(830, 72, 46, 14);
		getContentPane().add(lblRs_11);
		
		JLabel lblRs_12 = new JLabel("Rs.");
		lblRs_12.setBounds(830, 94, 46, 14);
		getContentPane().add(lblRs_12);
		
		JLabel lblRs_13 = new JLabel("Rs.");
		lblRs_13.setBounds(830, 117, 46, 14);
		getContentPane().add(lblRs_13);
		
		JLabel lblRs_14 = new JLabel("Rs.");
		lblRs_14.setBounds(830, 140, 46, 14);
		getContentPane().add(lblRs_14);
		
		JLabel lblRs_15 = new JLabel("Rs.");
		lblRs_15.setBounds(830, 163, 46, 14);
		getContentPane().add(lblRs_15);
		
		JLabel lblRs_16 = new JLabel("Rs.");
		lblRs_16.setBounds(830, 186, 46, 14);
		getContentPane().add(lblRs_16);
		
		JLabel lblRs_17 = new JLabel("Rs.");
		lblRs_17.setBounds(830, 209, 46, 14);
		getContentPane().add(lblRs_17);
		
		JLabel lblRs_18 = new JLabel("Rs.");
		lblRs_18.setBounds(830, 231, 46, 14);
		getContentPane().add(lblRs_18);
		
		JLabel lblRs_19 = new JLabel("Rs.");
		lblRs_19.setBounds(830, 254, 46, 14);
		getContentPane().add(lblRs_19);
		
		textField_31 = new JTextField();
		textField_31.setText("0.0");
		textField_31.setBounds(754, 280, 86, 28);
		getContentPane().add(textField_31);
		textField_31.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Rs.");
		lblNewLabel_10.setBounds(842, 287, 46, 14);
		getContentPane().add(lblNewLabel_10);
		
		
		JButton btnPrint = new JButton("Generate Bill");
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//*------------------------------------------------------------------*
				//try
				//{
			//	Document document = new Document(PageSize.A4, 50, 50, 50, 50);
				try {
					  no ++ ;
					  bill="Bill_No." + no +".pdf";
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
		btnPrint.setBounds(308, 282, 135, 23);
		getContentPane().add(btnPrint);
		
		JButton btnPrint_1 = new JButton("Print");
		btnPrint_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnPrint_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//**-----------------------------------------------------------------------------------------**
				Printpdf pdf_printer = new Printpdf();
				pdf_printer.start(bill);
				
			}
		});
		btnPrint_1.setBounds(198, 282, 105, 23);
		getContentPane().add(btnPrint_1);
		
		JLabel lblSelectItem = new JLabel("Particulars :");
		lblSelectItem.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSelectItem.setBounds(10, 254, 80, 14);
		getContentPane().add(lblSelectItem);
		
		JButton btnNewButton_1 = new JButton("Navigate Panel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navigate_panel np=new navigate_panel();
				np.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(688, 7, 165, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblTounch = new JLabel("Tounch :");
		lblTounch.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTounch.setBounds(400, 50, 62, 14);
		getContentPane().add(lblTounch);
		
		JLabel lblTounch_1 = new JLabel("Tounch :");
		lblTounch_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTounch_1.setBounds(400, 72, 62, 14);
		getContentPane().add(lblTounch_1);
		
		JLabel lblTounch_2 = new JLabel("Tounch :");
		lblTounch_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTounch_2.setBounds(400, 94, 62, 14);
		getContentPane().add(lblTounch_2);
		
		JLabel lblTounch_3 = new JLabel("Tounch :");
		lblTounch_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTounch_3.setBounds(400, 117, 62, 14);
		getContentPane().add(lblTounch_3);
		
		JLabel lblTounch_4 = new JLabel("Tounch :");
		lblTounch_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTounch_4.setBounds(400, 140, 62, 14);
		getContentPane().add(lblTounch_4);
		
		JLabel lblTounch_5 = new JLabel("Tounch :");
		lblTounch_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTounch_5.setBounds(400, 163, 62, 14);
		getContentPane().add(lblTounch_5);
		
		JLabel lblTounch_6 = new JLabel("Tounch :");
		lblTounch_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTounch_6.setBounds(400, 186, 62, 14);
		getContentPane().add(lblTounch_6);
		
		JLabel lblTounch_7 = new JLabel("Tounch :");
		lblTounch_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTounch_7.setBounds(400, 209, 62, 14);
		getContentPane().add(lblTounch_7);
		
		JLabel lblTounch_8 = new JLabel("Tounch :");
		lblTounch_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTounch_8.setBounds(400, 231, 62, 14);
		getContentPane().add(lblTounch_8);
		
		JLabel lblTounch_9 = new JLabel("Tounch :");
		lblTounch_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTounch_9.setBounds(400, 254, 62, 14);
		getContentPane().add(lblTounch_9);
		
		textField_32 = new JTextField();
		textField_32.setBounds(452, 47, 46, 20);
		getContentPane().add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setBounds(452, 69, 46, 20);
		getContentPane().add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setBounds(452, 91, 46, 20);
		getContentPane().add(textField_34);
		textField_34.setColumns(10);
		
		textField_35 = new JTextField();
		textField_35.setBounds(452, 114, 46, 20);
		getContentPane().add(textField_35);
		textField_35.setColumns(10);
		
		textField_36 = new JTextField();
		textField_36.setBounds(452, 137, 46, 20);
		getContentPane().add(textField_36);
		textField_36.setColumns(10);
		
		textField_37 = new JTextField();
		textField_37.setBounds(452, 160, 46, 20);
		getContentPane().add(textField_37);
		textField_37.setColumns(10);
		
		textField_38 = new JTextField();
		textField_38.setBounds(452, 183, 46, 20);
		getContentPane().add(textField_38);
		textField_38.setColumns(10);
		
		textField_39 = new JTextField();
		textField_39.setBounds(452, 206, 46, 20);
		getContentPane().add(textField_39);
		textField_39.setColumns(10);
		
		textField_40 = new JTextField();
		textField_40.setBounds(452, 228, 46, 20);
		getContentPane().add(textField_40);
		textField_40.setColumns(10);
		
		textField_41 = new JTextField();
		textField_41.setBounds(452, 251, 46, 20);
		getContentPane().add(textField_41);
		textField_41.setColumns(10);
		
		JLabel lblFine = new JLabel("Fine :");
		lblFine.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFine.setBounds(608, 50, 46, 14);
		getContentPane().add(lblFine);
		
		JLabel lblFine_1 = new JLabel("Fine :");
		lblFine_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFine_1.setBounds(608, 72, 46, 14);
		getContentPane().add(lblFine_1);
		
		JLabel lblZfine = new JLabel("Fine :");
		lblZfine.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblZfine.setBounds(608, 94, 46, 14);
		getContentPane().add(lblZfine);
		
		JLabel lblNewLabel_8 = new JLabel("Fine :");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_8.setBounds(608, 117, 46, 14);
		getContentPane().add(lblNewLabel_8);
		
		JLabel lblFine_2 = new JLabel("Fine :");
		lblFine_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFine_2.setBounds(608, 140, 46, 14);
		getContentPane().add(lblFine_2);
		
		JLabel lblFine_3 = new JLabel("Fine :");
		lblFine_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFine_3.setBounds(608, 163, 46, 14);
		getContentPane().add(lblFine_3);
		
		JLabel lblFine_4 = new JLabel("Fine :");
		lblFine_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFine_4.setBounds(608, 186, 46, 14);
		getContentPane().add(lblFine_4);
		
		JLabel lblFine_5 = new JLabel("Fine :");
		lblFine_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFine_5.setBounds(608, 209, 46, 14);
		getContentPane().add(lblFine_5);
		
		JLabel lblFine_6 = new JLabel("Fine :");
		lblFine_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblFine_6.setBounds(608, 231, 46, 14);
		getContentPane().add(lblFine_6);
		
		JLabel lblNewLabel_11 = new JLabel("Fine :");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_11.setBounds(608, 254, 46, 14);
		getContentPane().add(lblNewLabel_11);
		
		textField_42 = new JTextField();
		textField_42.setBounds(643, 47, 51, 20);
		getContentPane().add(textField_42);
		textField_42.setColumns(10);
		
		textField_43 = new JTextField();
		textField_43.setBounds(643, 69, 51, 20);
		getContentPane().add(textField_43);
		textField_43.setColumns(10);
		
		textField_44 = new JTextField();
		textField_44.setBounds(643, 91, 51, 20);
		getContentPane().add(textField_44);
		textField_44.setColumns(10);
		
		textField_45 = new JTextField();
		textField_45.setBounds(643, 114, 51, 20);
		getContentPane().add(textField_45);
		textField_45.setColumns(10);
		
		textField_46 = new JTextField();
		textField_46.setBounds(643, 137, 51, 20);
		getContentPane().add(textField_46);
		textField_46.setColumns(10);
		
		textField_47 = new JTextField();
		textField_47.setBounds(643, 160, 51, 20);
		getContentPane().add(textField_47);
		textField_47.setColumns(10);
		
		textField_48 = new JTextField();
		textField_48.setBounds(643, 183, 51, 20);
		getContentPane().add(textField_48);
		textField_48.setColumns(10);
		
		textField_49 = new JTextField();
		textField_49.setBounds(643, 206, 51, 20);
		getContentPane().add(textField_49);
		textField_49.setColumns(10);
		
		textField_50 = new JTextField();
		textField_50.setBounds(643, 228, 51, 20);
		getContentPane().add(textField_50);
		textField_50.setColumns(10);
		
		textField_51 = new JTextField();
		textField_51.setBounds(643, 251, 51, 20);
		getContentPane().add(textField_51);
		textField_51.setColumns(10);
		
		JLabel lblLabour = new JLabel("Labour :");
		lblLabour.setBounds(502, 50, 46, 14);
		getContentPane().add(lblLabour);
		
		JLabel lblLabour_1 = new JLabel("Labour :");
		lblLabour_1.setBounds(502, 72, 46, 14);
		getContentPane().add(lblLabour_1);
		
		JLabel lblLabour_2 = new JLabel("Labour :");
		lblLabour_2.setBounds(502, 94, 46, 14);
		getContentPane().add(lblLabour_2);
		
		JLabel lblLabour_3 = new JLabel("Labour :");
		lblLabour_3.setBounds(502, 117, 46, 14);
		getContentPane().add(lblLabour_3);
		
		JLabel lblLabour_4 = new JLabel("Labour :");
		lblLabour_4.setBounds(502, 140, 46, 14);
		getContentPane().add(lblLabour_4);
		
		JLabel lblLabour_5 = new JLabel("Labour :");
		lblLabour_5.setBounds(502, 163, 46, 14);
		getContentPane().add(lblLabour_5);
		
		JLabel lblLabour_6 = new JLabel("Labour :");
		lblLabour_6.setBounds(502, 186, 46, 14);
		getContentPane().add(lblLabour_6);
		
		JLabel lblLabour_7 = new JLabel("Labour :");
		lblLabour_7.setBounds(502, 209, 46, 14);
		getContentPane().add(lblLabour_7);
		
		JLabel lblLabour_8 = new JLabel("Labour :");
		lblLabour_8.setBounds(502, 231, 46, 14);
		getContentPane().add(lblLabour_8);
		
		JLabel lblLabour_9 = new JLabel("Labour :");
		lblLabour_9.setBounds(502, 254, 46, 14);
		getContentPane().add(lblLabour_9);
		
		textField_52 = new JTextField();
		textField_52.setBounds(547, 47, 57, 20);
		getContentPane().add(textField_52);
		textField_52.setColumns(10);
		
		textField_53 = new JTextField();
		textField_53.setBounds(547, 69, 57, 20);
		getContentPane().add(textField_53);
		textField_53.setColumns(10);
		
		textField_54 = new JTextField();
		textField_54.setBounds(547, 91, 57, 20);
		getContentPane().add(textField_54);
		textField_54.setColumns(10);
		
		textField_55 = new JTextField();
		textField_55.setBounds(547, 114, 57, 20);
		getContentPane().add(textField_55);
		textField_55.setColumns(10);
		
		textField_56 = new JTextField();
		textField_56.setBounds(547, 137, 57, 20);
		getContentPane().add(textField_56);
		textField_56.setColumns(10);
		
		textField_57 = new JTextField();
		textField_57.setBounds(547, 160, 57, 20);
		getContentPane().add(textField_57);
		textField_57.setColumns(10);
		
		textField_58 = new JTextField();
		textField_58.setBounds(547, 183, 57, 20);
		getContentPane().add(textField_58);
		textField_58.setColumns(10);
		
		textField_59 = new JTextField();
		textField_59.setBounds(547, 206, 57, 20);
		getContentPane().add(textField_59);
		textField_59.setColumns(10);
		
		textField_60 = new JTextField();
		textField_60.setBounds(547, 228, 57, 20);
		getContentPane().add(textField_60);
		textField_60.setColumns(10);
		
		textField_61 = new JTextField();
		textField_61.setBounds(547, 251, 57, 20);
		getContentPane().add(textField_61);
		textField_61.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Add New Particular");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//**------------------------------------------------------**
				
				Add_particulars_form apf = new Add_particulars_form();
				apf.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setBounds(513, 8, 165, 23);
		getContentPane().add(btnNewButton_2);
			
	}
}
