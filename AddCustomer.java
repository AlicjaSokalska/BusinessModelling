package BusMod;

import javax.swing.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class AddCustomer {
	private JLabel customerNo, name, age, telephone, gender, industry, address;
	private JTextField customerNoTF, nameTF, ageTF, telephoneTF, industryTF, genderTF, addressTF;

	private JButton addCustomer;
	AddButtonHandler cbHandler;

	List<String> CustomerList = new ArrayList<>();

	public void main() {
		// Window
		JFrame rect = new JFrame("Customer Details");
		rect.setSize(600, 800);
		rect.setDefaultCloseOperation(rect.EXIT_ON_CLOSE);
		// Content Pane
		Container cp = rect.getContentPane();
		cp.setLayout(null);

		customerNo = new JLabel("Customer Number: ");
		customerNo.setBounds(50, 50, 200, 30);

		name = new JLabel("Name: ");
		name.setBounds(50, 100, 200, 30);

		address = new JLabel("Address: ");
		address.setBounds(50, 150, 200, 30);

		telephone = new JLabel("Telephone: ");
		telephone.setBounds(50, 200, 200, 30);

		age = new JLabel("Age: ");
		age.setBounds(50, 250, 250, 30);

		industry = new JLabel("Industry: ");
		industry.setBounds(50, 300, 200, 30);

		gender = new JLabel("Gender: ");
		gender.setBounds(50, 350, 200, 30);

		customerNoTF = new JTextField();
		customerNoTF.setBounds(200, 50, 200, 30);

		nameTF = new JTextField();
		nameTF.setBounds(200, 100, 200, 30);

		addressTF = new JTextField();
		addressTF.setBounds(200, 150, 200, 30);

		telephoneTF = new JTextField();
		telephoneTF.setBounds(200, 200, 200, 30);

		ageTF = new JTextField();
		ageTF.setBounds(200, 250, 200, 30);

		industryTF = new JTextField();
		industryTF.setBounds(200, 300, 200, 30);

		genderTF = new JTextField();
		genderTF.setBounds(200, 350, 200, 30);

		addCustomer = new JButton("Add new Customer");
		addCustomer.setBounds(50, 400, 200, 30);

		cp.add(customerNo);
		cp.add(customerNoTF);
		cp.add(name);
		cp.add(nameTF);
		cp.add(age);
		cp.add(ageTF);
		cp.add(address);
		cp.add(addressTF);
		cp.add(telephone);
		cp.add(telephoneTF);
		cp.add(industry);
		cp.add(industryTF);
		cp.add(gender);
		cp.add(genderTF);
		cp.add(addCustomer);

		rect.setVisible(true);

		cbHandler = new AddButtonHandler();

		addCustomer.addActionListener(cbHandler);

	}

	public static void main(String[] args) {
		AddCustomer cus = new AddCustomer();
		cus.main(); // lines edited to meet JavaRanch restrictions on abbreviations
	}

	private class AddButtonHandler implements ActionListener, java.awt.event.ActionListener {
		public void actionPerformed(ActionEvent e) {

			String customerNum = customerNoTF.getText();
			CustomerList.add(customerNum);

			String customerName = nameTF.getText();
			CustomerList.add(customerName);

			String customerAge = ageTF.getText();
			CustomerList.add(customerAge);

			String customerAddress = addressTF.getText();
			CustomerList.add(customerAddress);

			String customerIndustry = industryTF.getText();
			CustomerList.add(customerIndustry);

			String customerGender = genderTF.getText();
			CustomerList.add(customerGender);
		}
	}

	public class Customer {
		public String customerNoTF;
		private String customerNum;
		private String customerName;
		private String customerAge;
		private String customerAddress;
		private String customerIndustry;
		private String customergender;

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerNum() {
			return customerNum;
		}

		public void setCustomerNum(String customerNum) {
			this.customerNum = customerNum;
		}

		public String getCustomerAge() {
			return customerAge;
		}

		public void setCustomerAge(String customerAge) {
			this.customerAge = customerAge;
		}

		public String getCustomerAddress() {
			return customerAddress;
		}

		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}

		public String getCustomerIndustry() {
			return customerIndustry;
		}

		public void setCustomerIndustry(String customerIndustry) {
			this.customerIndustry = customerIndustry;
		}

		public String getCustomergender() {
			return customergender;
		}

		public void setCustomergender(String customergender) {
			this.customergender = customergender;
		}
	}
}
