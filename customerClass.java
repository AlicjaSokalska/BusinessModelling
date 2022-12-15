import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class customerClass extends JFrame implements ActionListener
{ 
private static final long serialVersionUID = 1L;


JPanel panelNewItem, panelButtons, 
		panelAddItem, panelShowItem, panelVAT,
		panelCheckBoxes;

JLabel lblNum,lblName,lblType, lblExpiry ,lblItemList,lblPrice, lblQuantity;
JTextField txtNum, txtName, txtType, txtExpiry,txtPrice,txtQuantity,
txtNum1, txtName1, txtType1, txtExpiry1,txtPrice1,txtQuantity1
,txtNum2, txtName2, txtType2, txtExpiry2,txtPrice2,txtQuantity2;
JButton btnWine,btnF,btnH, btnClear, btncheckOut, btnClearAll,btnDelete,btnFinish,btnUpdate;
JTextArea WshowStock, FshowStock, HshowStock, taCheckboxes;

JCheckBox cbVAT1, cbVAT2, cbVAT3;
JCheckBox[] cbVAT;

List<String> ItemList= new ArrayList<>();

public customerClass() {
	
	
	 	super("Shop");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	 	this.setLayout(new BorderLayout());

	 	panelNewItem = new JPanel(new BorderLayout());
	 	panelButtons = new JPanel();
	 	
	 	this.add(panelNewItem, "Center");
	 	this.add(panelButtons, "South");
	    List<prodArray> itemList = new ArrayList<prodArray>();
	    itemList.add(new prodArray("Wine","Luxury",02/03/2025,50));
	    itemList.add(new prodArray("Hamper","Gift",02/03/2030,35));
	    itemList.add(new prodArray("Food","Essential",02/03/2030,35));
	  


	 	panelNewItem.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED), "catalogue"));
	 	panelAddItem = new JPanel();// new GridLayout(1,0)
	 	panelShowItem = new JPanel(new BorderLayout());
	 	panelVAT = new JPanel(new GridLayout(2,1));
	 	
	 	panelNewItem.add(panelAddItem, "North");
	 	panelNewItem.add(panelShowItem, "Center");
	 	panelNewItem.add(panelVAT, "East");
	 	
	lblNum = new JLabel("Item ID Number:");
	 	lblName = new JLabel("Name:");
	 	lblType = new JLabel("Type:");
	 	lblExpiry = new JLabel("Expiry Date:");
	 	lblPrice = new JLabel("Price:");
	 	lblQuantity = new JLabel("Quantity:"); 
	 	
	 
	 	txtName = new JTextField("Wine",10);
	 	txtType = new JTextField("Luxury",10);
	 	txtExpiry = new JTextField("02/10/2023",10);
	 	txtPrice = new JTextField("20.00",5);
	 	txtQuantity = new JTextField("10",5);
	 	

	 	txtName1 = new JTextField("Food",10);
	 	txtType1 = new JTextField("Essential",10);
	 	txtExpiry1 = new JTextField("06/11/2023",10);
	 	txtPrice1 = new JTextField("10.00",5);
	 	
	 	
	 
	 	txtName2 = new JTextField("Hamper",10);
	 	txtType2 = new JTextField("Gift",10);
	 	txtExpiry2 = new JTextField("06/10/2024",10);
	 	txtPrice2 = new JTextField("15.00",5);
	 	
	 	

	 	btnWine = new JButton("Wine");
	 	btncheckOut = new JButton("Check Out");
	 btnF = new JButton("Food");
	btnH = new JButton("Hamper");
	 	panelAddItem.add(btnWine);
	 panelAddItem.add(btnF);
	panelAddItem.add(btnH);
	panelAddItem.add(btncheckOut);
	
	 

	



	 	btnWine.addActionListener(new ActionListener() { 
 			public void actionPerformed(ActionEvent e) { 
 	ItemList.add(txtName.getText()+", "+txtType.getText() +" , "+ txtExpiry.getText()+ " , "+ txtPrice.getText()+ "euros "  );
 			WshowStock.append(ItemList.get(ItemList.size()-1)+"\n");
 			
 		}
 	} );
		btnF.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
			ItemList.add(txtName1.getText()+", "+txtType1.getText() +" , "+ txtExpiry1.getText()+ " , "+ txtPrice1.getText()+ "euros "  );
		WshowStock.append(ItemList.get(ItemList.size()-1)+"\n");
			
		}
	} );
		
		btnH.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
	ItemList.add(txtName2.getText()+", "+txtType2.getText() +" , "+ txtExpiry2.getText()+ " , "+ txtPrice2.getText()+ "euros "  );
			WshowStock.append(ItemList.get(ItemList.size()-1)+"\n");
			
		}
	} );
		
		
	 	
 	lblItemList = new JLabel("STOCK LIST :");
 	WshowStock = new JTextArea();
 	
 	panelShowItem.add(lblItemList, "North");
 	panelShowItem.add(WshowStock, "Center");
	 	
	
	 	
	 	
	 	btnClearAll = new JButton("Clear All");
		btnDelete = new JButton("Delete Item");
		
		
		
		panelButtons.add(btnDelete);
	 	
	 	panelButtons.add(btnClearAll);
	 	
	 btnClearAll.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				taCheckboxes.setText("");
				WshowStock.setText("");
				txtNum.setText("");
				txtName.setText("");
			
				txtType.setText("");
				txtExpiry.setText("");
				txtPrice.setText("");
				
				
				
			} 
	 	} );
	 
		btncheckOut.addActionListener(new ActionListener() { 
 			public void actionPerformed(ActionEvent e) { 
 				
 				checkOut page = new checkOut();
 				 page.setVisible(true);
 			} 
   	 	} ); 
	   	 	
	
	 	
	 btnDelete.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent e) { 
			int start = 0;
		      int end = 43;
		
			WshowStock.replaceRange(null, start, end);
		} 
 	} );
 	

	 	
	 	
    this.setVisible(true);
    this.setSize(1300, 500);
}



	

    public static void main(String[] args) {
            //Create and set up the window.
    	customerClass cla1 = new customerClass();
    	
       
    }





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}





}

