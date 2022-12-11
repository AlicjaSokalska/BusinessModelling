
import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;

public class Navigation {
		
	public static void main(String[] args) {
		JFrame frame = new JFrame(" order system");
		JTextArea textArea = new JTextArea("");
		frame.add(textArea);

		JMenu usersMenu = new JMenu("Users");
		JMenuItem loginMan = new JMenuItem("Manager Login");
		usersMenu.add(loginMan);
		JMenuItem loginAdmin = new JMenuItem("Administrator Login");
		usersMenu.add(loginAdmin);
		JMenuItem customer = new JMenuItem("Customer");
		usersMenu.add(customer);
		
		loginAdmin.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));
		
		loginAdmin.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					JLabel userLbl = new JLabel("User:");
					JLabel passLbl = new JLabel("Password:");
					JTextField userField = new JTextField();
					JPasswordField passField = new JPasswordField();
					String message = "Please enter your user name and password.";
					int result = JOptionPane.showOptionDialog(frame, 
					          new Object[] { message, userLbl, userField, passLbl, passField },
					           "Login",  JOptionPane.OK_CANCEL_OPTION,
					           JOptionPane.QUESTION_MESSAGE, null, null, null);
					if (result == JOptionPane.YES_OPTION)
					{
						textArea.append("User ["+userField.getText()+"] has logged using a ["+
									passField.getPassword().length+"] letter password.\n");
						 AdminLogin page = new AdminLogin();  
			              
				            //make page visible to the user  
				            page.setVisible(true);  
						
					}
				
				}});
		

		customer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));
		
		customer.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					JLabel userLbl = new JLabel("User:");
					JLabel passLbl = new JLabel("Password:");
					JTextField userField = new JTextField();
					JPasswordField passField = new JPasswordField();
					String message = "Please enter your user name and password.";
					int result = JOptionPane.showOptionDialog(frame, 
					          new Object[] { message, userLbl, userField, passLbl, passField },
					           "Login",  JOptionPane.OK_CANCEL_OPTION,
					           JOptionPane.QUESTION_MESSAGE, null, null, null);
					if (result == JOptionPane.YES_OPTION)
					{
						textArea.append("User ["+userField.getText()+"] has logged using a ["+
									passField.getPassword().length+"] letter password.\n");
						 AdminLogin page = new AdminLogin();  
			              
				            //make page visible to the user  
				            page.setVisible(true);  
						
					}
				
				}});
		
		
		// create a menu bar and use it in this JFrame
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(usersMenu);
		
		frame.setJMenuBar(menuBar);
		
		// Final JFrame methods to set close operation + set size and visibility!
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,400);
		frame.setVisible(true);
	    }

				

}


	


		
	





