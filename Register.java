PK  �luU              META-INF/MANIFEST.MF��  �M��LK-.�K-*��ϳR0�3���� PK��      PK
    �luU���@   @      META-INF/REFACTORINGS.XML<?xml version="1.0" encoding="UTF-8"?>
<session version="1.0"/>PK
    1juU               scrumAssingmentpractice1/PK
    )juU�n��  �  )   scrumAssingmentpractice1/orderSystem.javapackage scrumAssingmentpractice1;
import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;

public class orderSystem {
		
	public static void main(String[] args) {
		JFrame frame = new JFrame(" order system");
		JTextArea textArea = new JTextArea("");
		frame.add(textArea);

		JMenu usersMenu = new JMenu("Users");
		JMenuItem loginMan = new JMenuItem("Manager Login");
		usersMenu.add(loginMan);
		JMenuItem loginAdmin = new JMenuItem("Administrator Login");
		usersMenu.add(loginAdmin);
		JMenuItem loginSalesp = new JMenuItem("sales person");
		usersMenu.add(loginSalesp);
		
		loginMan.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK));
		
		loginMan.addActionListener(new ActionListener() {
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
	


		
	PK
    )juU�ao)'  '  ,   scrumAssingmentpractice1/orderSystem$1.class����   < o  &scrumAssingmentpractice1/orderSystem$1  java/lang/Object  java/awt/event/ActionListener 	val$frame Ljavax/swing/JFrame; val$textArea Ljavax/swing/JTextArea; <init> .(Ljavax/swing/JFrame;Ljavax/swing/JTextArea;)V Code	    	   	 

     ()V LineNumberTable LocalVariableTable this (LscrumAssingmentpractice1/orderSystem$1; actionPerformed (Ljava/awt/event/ActionEvent;)V  javax/swing/JLabel  User:
     ! (Ljava/lang/String;)V # 	Password: % javax/swing/JTextField
 $  ( javax/swing/JPasswordField
 '  + )Please enter your user name and password. - Login
 / 1 0 javax/swing/JOptionPane 2 3 showOptionDialog t(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;IILjavax/swing/Icon;[Ljava/lang/Object;Ljava/lang/Object;)I 5 java/lang/StringBuilder 7 User [
 4  
 $ : ; < getText ()Ljava/lang/String;
 4 > ? @ append -(Ljava/lang/String;)Ljava/lang/StringBuilder; B ] has logged using a [
 ' D E F getPassword ()[C
 4 H ? I (I)Ljava/lang/StringBuilder; K ] letter password.

 4 M N < toString
 P R Q javax/swing/JTextArea ? ! e Ljava/awt/event/ActionEvent; userLbl Ljavax/swing/JLabel; passLbl 	userField Ljavax/swing/JTextField; 	passField Ljavax/swing/JPasswordField; message Ljava/lang/String; result I StackMapTable b java/awt/event/ActionEvent d java/lang/String 
SourceFile orderSystem.java EnclosingMethod i $scrumAssingmentpractice1/orderSystem k l main ([Ljava/lang/String;)V InnerClasses NestHost            	 
            9     *+� *,� *� �                              V     �� Y� M� Y"� N� $Y� &:� 'Y� ):*:*� � YSY,SYSY-SYS,� .6� 1*� � 4Y6� 8� 9� =A� =� C�� GJ� =� L� O�       >     
    !  " & # * $ . % I & L ' P $ U ( Z * t + � * � /    R    �       � S T  
  U V   u W V   l X Y  & c Z [  * _ \ ]  U 4 ^ _  `    � �   a   $ ' c    e    f g    h j m   
         n    hPK
    )juU+�i  i  *   scrumAssingmentpractice1/orderSystem.class����   < l  $scrumAssingmentpractice1/orderSystem  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this &LscrumAssingmentpractice1/orderSystem; main ([Ljava/lang/String;)V  javax/swing/JFrame   order system
     (Ljava/lang/String;)V  javax/swing/JTextArea   
  
     add *(Ljava/awt/Component;)Ljava/awt/Component; ! javax/swing/JMenu # Users
    & javax/swing/JMenuItem ( Manager Login
 % 
   +  , 0(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem; . Administrator Login 0 sales person
 2 4 3 javax/swing/KeyStroke 5 6 getKeyStroke (II)Ljavax/swing/KeyStroke;
 % 8 9 : setAccelerator (Ljavax/swing/KeyStroke;)V < &scrumAssingmentpractice1/orderSystem$1
 ; >  ? .(Ljavax/swing/JFrame;Ljavax/swing/JTextArea;)V
 % A B C addActionListener "(Ljava/awt/event/ActionListener;)V E javax/swing/JMenuBar
 D 	
 D H  I ((Ljavax/swing/JMenu;)Ljavax/swing/JMenu;
  K L M setJMenuBar (Ljavax/swing/JMenuBar;)V
  O P Q setDefaultCloseOperation (I)V
  S T U setSize (II)V
  W X Y 
setVisible (Z)V args [Ljava/lang/String; frame Ljavax/swing/JFrame; textArea Ljavax/swing/JTextArea; 	usersMenu Ljavax/swing/JMenu; loginMan Ljavax/swing/JMenuItem; 
loginAdmin loginSalesp menuBar Ljavax/swing/JMenuBar; 
SourceFile orderSystem.java InnerClasses NestMembers !               /     *� �    
       
             	      V     �� Y� L� Y� M+,� W�  Y"� $N� %Y'� ):-� *W� %Y-� ):-� *W� %Y/� ):-� *WN� 1� 7� ;Y+,� =� @� DY� F:-� GW+� J+� N+��� R+� V�    
   N     
      $  /  6  A  H  S  Z  e  s 3 | 4 � 6 � 9 � : � ; � <    R    � Z [   
 � \ ]   � ^ _  $ z ` a  / o b c  A ] d c  S K e c  | " f g   h    i j   
  ;       k     ;PK   �luU��                      META-INF/MANIFEST.MF��  PK
 
    �luU���@   @                a   META-INF/REFACTORINGS.XMLPK
 
    1juU                         �   scrumAssingmentpractice1/PK
 
    )juU�n��  �  )               scrumAssingmentpractice1/orderSystem.javaPK
 
    )juU�ao)'  '  ,             M	  scrumAssingmentpractice1/orderSystem$1.classPK
 
    )juU+�i  i  *             �  scrumAssingmentpractice1/orderSystem.classPK      �  o    