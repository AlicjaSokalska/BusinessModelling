import javax.swing.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class addProduct {
	private JLabel productNo, productName, productExpiry, productType;
	private JTextField productNoTF, productNameTF, productExpiryTF,productTypeTF;

	private JButton addProduct;
	AddButtonHandler cbHandler;

	List<String> ProductList = new ArrayList<>();

	public void main() {
		// Window
		JFrame rect = new JFrame("Product Details");
		rect.setSize(800, 800);
		rect.setDefaultCloseOperation(rect.EXIT_ON_CLOSE);
		// Content Pane
		Container cp = rect.getContentPane();
		cp.setLayout(null);

		productNo = new JLabel("Item Number: ");
		productNo.setBounds(50, 50, 200, 30);

		productName = new JLabel("Item Name: ");
		productName.setBounds(50, 100, 200, 30);

		productExpiry = new JLabel("Item Expiry Date: ");
		productExpiry.setBounds(50, 150, 200, 30);

		productType = new JLabel("Item Type: Gift ,Luxury or Essential");
		productType.setBounds(50, 200, 300, 30);

		

		productNoTF = new JTextField("3");
	productNoTF.setBounds(400, 50, 200, 30);

		productNameTF = new JTextField("Perfume");
		productNameTF.setBounds(400, 100, 200, 30);

		productExpiryTF = new JTextField("12/FEB/2024");
		productExpiryTF.setBounds(400, 150, 200, 30);

		productTypeTF = new JTextField("Luxury");
		productTypeTF.setBounds(400, 200, 200, 30);

		
	        
		addProduct = new JButton("Add new Product");
		addProduct.setBounds(400, 300, 200, 30);

		cp.add(productNo);
		cp.add(productNoTF);
		cp.add(productName);
		cp.add(productNameTF);
		cp.add(productExpiry);
		cp.add(productExpiryTF);
		cp.add(productType);
		cp.add(productTypeTF);
		
		
		cp.add(addProduct);

		rect.setVisible(true);

		cbHandler = new AddButtonHandler();

		addProduct.addActionListener(cbHandler);

	}

	public static void main(String[] args) {
		addProduct prod = new addProduct();
		prod.main(); // lines edited to meet JavaRanch restrictions on abbreviations
	}

	public JLabel getProductType() {
		return productType;
	}

	public void setProductType(JLabel productType) {
		this.productType = productType;
	}

	
	
	
	private class AddButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String productNum = productNoTF.getText();
			ProductList.add(productNum);

			String productName = productNameTF.getText();
			ProductList.add(productName);

			String productExpiry =productExpiryTF.getText();
			ProductList.add(productExpiry);

			String productType =productTypeTF.getText();
			ProductList.add(productType);


	}

	public class Product {
		public String productNo;
		private String productName;
		private String productExpiry;
		private String productType;
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProductExpiry() {
			return productExpiry;
		}
		public void setProductExpiry(String productExpiry) {
			this.productExpiry = productExpiry;
		}
		public String getProductType() {
			return productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
		}
	

	}}}
