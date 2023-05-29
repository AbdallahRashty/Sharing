package test1;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.*;

public class lab {
	public static void main(String[] args) {
		//part 1
		JButton button = new JButton("button 1");
		button.setBounds(10,10,100,50);
		button.setFocusable(false);
		JButton button1 = new JButton("button 2");
		button1.setBounds(120,10,100,50);
		button1.setFocusable(false);
		JButton button2 = new JButton("button 3");
		button2.setBounds(230,10,100,50);
		button2.setFocusable(false);
		JButton button3 = new JButton("button 4");
		button3.setBounds(340,10,175,50);
		button3.setFocusable(false);
		JButton button4 = new JButton("button 5");
		button4.setBounds(450,10,25,50);
		button4.setFocusable(false);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,75);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        
        
        //part 2
       
        JFrame frame1 = new JFrame();
	    frame1.setSize(500, 300);
	    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    BorderLayout border = new BorderLayout();
	    Container content = frame1.getContentPane();
	    content.setLayout(border); 
	    
	    JButton button6= new JButton("Button 5(Line_End)");
	    content.add(button6,BorderLayout.EAST);
	    JButton button7 = new JButton("Button 3");
	    content.add(button7, BorderLayout.WEST);
	    JButton button8= new JButton("Button 1");
	    content.add(button8, BorderLayout.NORTH);
	    JButton button9 = new JButton("Long named Button 4");
	    content.add(button9, BorderLayout.SOUTH);
	    JButton button10= new JButton("Button 2");
	    content.add(button10, BorderLayout.CENTER);
	    frame1.setVisible(true);		
        
	    
	    
	    
	    
	}
}
