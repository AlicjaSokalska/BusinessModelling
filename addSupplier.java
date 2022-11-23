import javax.swing.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class supplier {
	private JLabel supplierNo, supplierName, supplierAddress, supplierPhone, productSupplied ;
	private JTextField supplierNoTF, supplierNameTF, supplierAddressTF, supplierPhoneTF, productSuppliedTF;

	private JButton addSupplier;
	AddButtonHandler spHandler;

	List<String> SupplierList = new ArrayList<>();

	public void main() {
		// Window
		JFrame rect = new JFrame("Supplier Details");
		rect.setSize(600, 800);
		rect.setDefaultCloseOperation(rect.EXIT_ON_CLOSE);
		
		// Content Pane
		Container cp = rect.getContentPane();
		cp.setLayout(null);

		supplierNo = new JLabel("Supplier Number: ");
		supplierNo.setBounds(50, 50, 200, 30);

		supplierName = new JLabel("Name: ");
		supplierName.setBounds(50, 100, 200, 30);

		supplierAddress = new JLabel("Address: ");
		supplierAddress.setBounds(50, 150, 200, 30);

		supplierPhone = new JLabel("Telephone: ");
		supplierPhone.setBounds(50, 200, 200, 30);

		productSupplied = new JLabel("Product Supplied: ");
		productSupplied.setBounds(50, 250, 200, 30);

		//Textfields
		supplierNoTF = new JTextField();
		supplierNoTF.setBounds(200, 50, 200, 30);

		supplierNameTF = new JTextField();
		supplierNameTF.setBounds(200, 100, 200, 30);

		supplierAddressTF = new JTextField();
		supplierAddressTF.setBounds(200, 150, 200, 30);

		supplierPhoneTF = new JTextField();
		supplierPhoneTF.setBounds(200, 200, 200, 30);

		productSuppliedTF = new JTextField();
		productSuppliedTF.setBounds(200, 250, 200, 30);
		
		addSupplier = new JButton("Add new Supplier");
		addSupplier.setBounds(50, 300, 200, 30);

		cp.add(supplierNo);
		cp.add(supplierNoTF);
		
		cp.add(supplierName);
		cp.add(supplierNameTF);
		
		cp.add(supplierAddress);
		cp.add(supplierAddressTF);
		
		cp.add(supplierPhone);
		cp.add(supplierPhoneTF);
		
		cp.add(productSupplied);
		cp.add(productSuppliedTF);
		
		cp.add(addSupplier);
	

		rect.setVisible(true);

		spHandler = new AddButtonHandler();
		addSupplier.addActionListener(spHandler);

	}

	public static void main(String[] args) {
		supplier sup = new supplier();
		sup.main();
	}

	private class AddButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String sNumber = supplierNoTF.getText();
			SupplierList.add(sNumber);

			String sName = supplierNameTF.getText();
			SupplierList.add(sName);

			String sAddress = supplierAddressTF.getText();
			SupplierList.add(sAddress);

			String sPhone = supplierPhoneTF.getText();
			SupplierList.add(sPhone);

			String pSupplied = productSuppliedTF.getText();
			SupplierList.add(pSupplied);
			
		}
	}

	public class Supplier {
		public String sNumber;
		private String sName;
		private String sAddress;
		private String sPhone;
		private String pSupplied;
		
		
		public String getsNumber() {
			return sNumber;
		}
		public void setsNumber(String sNumber) {
			this.sNumber = sNumber;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
		public String getsAddress() {
			return sAddress;
		}
		public void setsAddress(String sAddress) {
			this.sAddress = sAddress;
		}
		public String getsPhone() {
			return sPhone;
		}
		public void setsPhone(String sPhone) {
			this.sPhone = sPhone;
		}
		public String getpSupplied() {
			return pSupplied;
		}
		public void setpSupplied(String pSupplied) {
			this.pSupplied = pSupplied;
		}
	}
}