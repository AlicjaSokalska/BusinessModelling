import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
//create NewPage class to create a new page on which user will navigate  
class customerLogin extends JFrame implements ActionListener{
	JTextField tf;
	JButton c;
	JButton v;


    //constructor  
    customerLogin()  
    {  
    	tf = new JTextField();
    	c = new JButton("Shop");
    
    	 c.addActionListener(this);
    	 
    	 JPanel  panel1 = new JPanel(new GridLayout(3, 1));  
         panel1.add(c); 
        
         panel1.add(tf);
         add(panel1);
        setDefaultCloseOperation(javax.swing.  
        WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Welcome");  
        setSize(400, 200);  
    
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		customerClass cla1 = new customerClass();
	}
}
