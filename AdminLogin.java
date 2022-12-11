import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
//create NewPage class to create a new page on which user will navigate  
class AdminLogin extends JFrame implements ActionListener{
	JTextField tf;
	JButton p;
	JButton v;


    //constructor  
    AdminLogin()  
    {  
    	tf = new JTextField();
    	p = new JButton("PRODUCTS");
    	v = new JButton("VIEW PRODUCTS");
    	 p.addActionListener(this);
    	 v.addActionListener(this);
    	 JPanel  panel1 = new JPanel(new GridLayout(3, 1));  
         panel1.add(p); 
         panel1.add(v);//set username label to panel  
         panel1.add(tf);
         add(panel1);
        setDefaultCloseOperation(javax.swing.  
        WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Welcome");  
        setSize(400, 200);  
    
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//addProducts prod = new addProducts(); 
		//prod.main();
		addProd frmcb = new addProd();
		
	}
}
    
   


	
    
   /* setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(1000, 700);
    setVisible(true);
}
}
    
	@Override
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addProducts prod = new addProducts(); 
		prod.main();
		
	  }
}); 


guide.addActionListener(
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new SpeedMathGoGuide();
                dispose();
            }
        }
        );
}
}*/