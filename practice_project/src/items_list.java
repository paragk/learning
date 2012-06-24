import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
 


public class items_list extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	String price_per_kg;
	String amount;
	private JTextField textField_3;

	/**
	 * Create the frame.
	 */
	public items_list() {
		setTitle("Items Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 358);
		getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Daal", "Rajma", "Sugar", "Salt", "Surf", "Soap", "Shampoo"}));
		comboBox.setBounds(51, 36, 79, 20);
		getContentPane().add(comboBox);

		JLabel lblCustomerName = new JLabel("Customer Name :");
		lblCustomerName.setBounds(172, 39, 87, 14);
		getContentPane().add(lblCustomerName);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(269, 36, 155, 20);
		getContentPane().add(comboBox_1);
		
		JLabel lblItemSelected = new JLabel("Item Selected :");
		lblItemSelected.setBounds(183, 81, 87, 14);
		getContentPane().add(lblItemSelected);
		
		textField = new JTextField();
		textField.setBounds(269, 78, 155, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPricePerKg = new JLabel("Price per kg :");
		lblPricePerKg.setBounds(193, 127, 73, 14);
		getContentPane().add(lblPricePerKg);
		
		textField_1 = new JTextField();
		textField_1.setBounds(269, 124, 79, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAmountBought = new JLabel("Amount Bought :");
		lblAmountBought.setBounds(172, 165, 87, 14);
		getContentPane().add(lblAmountBought);
		
		textField_2 = new JTextField();
		textField_2.setBounds(269, 162, 79, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGm = new JLabel("gms");
		lblGm.setBounds(358, 165, 46, 14);
		getContentPane().add(lblGm);
		
		JLabel lblRs = new JLabel("Rs.");
		lblRs.setBounds(358, 127, 34, 14);
		getContentPane().add(lblRs);
		
		JLabel lblCalculatedAmount = new JLabel("Calculated Amount :");
		lblCalculatedAmount.setBounds(161, 208, 120, 14);
		getContentPane().add(lblCalculatedAmount);

		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
		private JTextComponent formattedTextField;

		public void actionPerformed(ActionEvent arg0) {
				
				//calculating the amount for the customer
				price_per_kg = textField_1.getText();
				System.out.println(price_per_kg);
				amount = textField_2.getText();
				System.out.println(amount);
				
				double cal=(Double.parseDouble(price_per_kg)*((Double.parseDouble(amount))/1000));
				textField_3.setText("" + cal);   // Double.toString(cal)
				System.out.println(cal);
				
			}
		});
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(184, 244, 105, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnUpdateRecord = new JButton("Update Record");
		btnUpdateRecord.setBounds(299, 244, 125, 23);
		getContentPane().add(btnUpdateRecord);
		
		textField_3 = new JTextField();
		textField_3.setBounds(269, 205, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblRs_1 = new JLabel("Rs.");
		lblRs_1.setBounds(365, 208, 39, 14);
		getContentPane().add(lblRs_1);
	/*	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);*/

		//combo box selected item into textbox selected item
		String selected_item = (String) comboBox.getSelectedItem();
		textField.setText(selected_item);
		
		textField_3 = new JTextField();
		textField_3.setBounds(269, 205, 79, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
