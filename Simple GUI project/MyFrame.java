package test1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener {
	
	JButton b1,b2;
	JFrame frame = new JFrame();
	JLabel l1 = new JLabel();
	
	public MyFrame(){
		
		
		l1 = new JLabel();
		l1.setText("Are U Stupid?");
		l1.setFont(new Font("Consolas",Font.BOLD,40));
		
		JPanel p = new JPanel();
		p.setBounds(0,0,500,110);
		p.setBackground(Color.WHITE);
		p.add(l1);
		
		b1 = new JButton("Yes!");
		b1.setBounds(100,200,70,50);
		b1.setFocusable(false);
		
		b2 = new JButton("No");
		b2.setBounds(300,200,70,50);
		b2.setFocusable(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
		this.add(p);
		this.add(b1);
		this.add(b2);
        
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			b1.setEnabled(false);
			b2.setEnabled(false);
			l1.setText("I knew it!!!!!");
			l1.setFont(new Font("Consolas",Font.BOLD,60));
		}
		if(e.getSource()==b2) {
			int X,Y;
			Random R = new Random();
			X=R.nextInt(200,400);
			Y=R.nextInt(150,300);
			b2.setBounds(X,Y,70,50);
		}
	}
}
