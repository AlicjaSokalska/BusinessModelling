package busModelling;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

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

public class Main extends JFrame implements ItemListener
{ 
	private static final long serialVersionUID = 1L;
	

    JPanel panelNewItem, panelButtons, 
    		panelAddItem, panelShowItem, panelVAT,
    		panelCheckBoxes;
    
	JLabel lblNum,lblName,lblType, lblExpiry ,lblItemList,lblPrice, lblQuantity;
	JTextField txtNum, txtName, txtType, txtExpiry,txtPrice,txtQuantity;
	JButton btnAdd, btnClear, btnFinish, btnClearAll,btnDelete,btnUpdate;
	JTextArea taShowStock, taCheckboxes;
    
    JCheckBox cbVAT1, cbVAT2, cbVAT3;
    JCheckBox[] cbVAT;
    
    List<String> ItemList= new ArrayList<>();
    
    public Main() {
   	 	super("STOCK AND PRODUCT DETAILS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
   	 	this.setLayout(new BorderLayout());

   	 	panelNewItem = new JPanel(new BorderLayout());
   	 	panelButtons = new JPanel();
   	 	
   	 	this.add(panelNewItem, "Center");
   	 	this.add(panelButtons, "South");
   	 	
   	 	panelNewItem.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED), "New Item"));
   	 	panelAddItem = new JPanel(); //new GridLayout(1,0)
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
   	 	
   	 txtNum = new JTextField("10",5);
   	 	txtName = new JTextField("Wine",10);
   	 	txtType = new JTextField("Luxury",10);
  	 	txtExpiry = new JTextField("02/10/2023",10);
  	 	txtPrice = new JTextField("€20.00",5);
   	 	txtQuantity = new JTextField("10",5);
  	 	
  	 	
  	 	
   	 	btnAdd = new JButton("Add Item");
   	 	btnClear = new JButton("Clear");
   	 	
   	 panelAddItem.add(lblNum);
   	panelAddItem.add(txtNum);
   	 	panelAddItem.add(lblName);
   	 	panelAddItem.add(txtName);
   	 	panelAddItem.add(lblType);
   	 	panelAddItem.add(txtType);
   	   panelAddItem.add(lblExpiry);
        panelAddItem.add(txtExpiry);
        
        panelAddItem.add(lblPrice);
        panelAddItem.add(txtPrice);
        panelAddItem.add(lblQuantity);
        panelAddItem.add(txtQuantity);
        
   	 	panelAddItem.add(btnAdd);
   	 	panelAddItem.add(btnClear);
   	
   	 	
   	 	btnAdd.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) { 
	 			ItemList.add(txtNum.getText()+", "+txtName.getText()+", "+txtType.getText() +" , "+ txtExpiry.getText()+ " , "+ txtPrice.getText()+" , "+txtQuantity.getText()  );
	 			taShowStock.append(ItemList.get(ItemList.size()-1)+"\n");
	 		}
	 	} );
   	 	
   	 	btnClear.addActionListener(new ActionListener() { 
   	 			public void actionPerformed(ActionEvent e) { 
   	 			txtNum.setText("");
   	 				txtName.setText("");
   	 			txtType.setText("");
   	 		txtExpiry.setText("");
   	 		txtPrice.setText("");
   	 		txtQuantity.setText("");
   	 			
   	 			} 
   	 	} );
   	 	
	 	lblItemList = new JLabel("STOCK LIST :");
	 	taShowStock = new JTextArea();
	 	
	 	panelShowItem.add(lblItemList, "North");
	 	panelShowItem.add(taShowStock, "Center");
   	 	   	 	
   	 	panelCheckBoxes = new JPanel(new GridLayout(0,1));
   	 	taCheckboxes = new JTextArea();
   	 	cbVAT1 = new JCheckBox("@20%");
   	 	cbVAT2 = new JCheckBox("@10%");
   	 	cbVAT3 = new JCheckBox("@5%");
   	 	
   	 	panelCheckBoxes.add(cbVAT1);
   	 	panelCheckBoxes.add(cbVAT2);
   	 	panelCheckBoxes.add(cbVAT3);
   	 	
   	 	panelVAT.add(panelCheckBoxes);
   	 	panelVAT.add(taCheckboxes);

   	 	cbVAT1.addItemListener(this);
   	 	cbVAT2.addItemListener(this);
   	 	cbVAT3.addItemListener(this);
   	 	
   	 	btnFinish = new JButton("Finish");
   	 	btnClearAll = new JButton("Clear All");
   		btnDelete = new JButton("Delete Item");
   		btnUpdate = new JButton("Update Item");
   		
   		panelButtons.add(btnUpdate);
   		panelButtons.add(btnDelete);
   	 	panelButtons.add(btnFinish);
   	 	panelButtons.add(btnClearAll);
   	 	
   	 btnClearAll.addActionListener(new ActionListener() { 
 			public void actionPerformed(ActionEvent e) { 
 				taCheckboxes.setText("");
 				taShowStock.setText("");
 				txtNum.setText("");
 				txtName.setText("");
 			
 				txtType.setText("");
 				txtExpiry.setText("");
 				txtPrice.setText("");
 				txtQuantity.setText("");
 				
 				cbVAT1.setSelected(false);
 				cbVAT2.setSelected(false);
 				cbVAT3.setSelected(false);
 			} 
   	 	} );
   	   	 	
   	 	btnFinish.addActionListener(new ActionListener() { 
 			public void actionPerformed(ActionEvent e) { 
 				
 				Main.this.dispose();
 				//System.exit(0);
 			} 
   	 	} );
   	 	
   	 btnDelete.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				int start = 0;
			      int end = 43;
			
				taShowStock.replaceRange(null, start, end);
			} 
	 	} );
	 	
   	 btnUpdate.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				
				int start = 0;
			      int end = 2;
			
				taShowStock.replaceRange("7", start, end);
				
	 			
			} 
	 	} );
   	 	
   	 	
        this.setVisible(true);
        this.setSize(1300, 500);
	}
    

	@Override
	public void itemStateChanged(ItemEvent e) {
		String selectedModules = "";
		
		if (cbVAT1.isSelected()) {
			selectedModules += cbVAT1.getText()+"\n";
		}
		
		if (cbVAT2.isSelected()) {
			selectedModules += cbVAT2.getText()+"\n";
		}
		
		if (cbVAT3.isSelected()) {
			selectedModules += cbVAT3.getText()+"\n";
		}
		
		taCheckboxes.setText(selectedModules);
	}
    
        public static void main(String[] args) {
                //Create and set up the window.
        	Main frmcb = new Main();
           
        }}

