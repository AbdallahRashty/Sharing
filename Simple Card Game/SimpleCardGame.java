package test1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import java.util.Random;

public class SimpleCardGame extends JFrame implements ActionListener {
	JButton button;
	JRadioButton c1;
	JRadioButton c2;
	JRadioButton c3;
	JRadioButton c4;
	JComboBox CB;
	JPanel panel,panel1;
	JLabel label,label1,label2; 
	int sc = 10;
	String[] Figure = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","King"};
	String[] c = {"acec.jpg","2c.jpg","3c.jpg","4c.jpg","5c.jpg","6c.jpg","7c.jpg","8c.jpg","9c.jpg","10c.jpg","jackc.jpg","queenc.jpg","kingc.jpg"};
	String[] d = {"aced.jpg","2d.jpg","3d.jpg","4d.jpg","5d.jpg","6d.jpg","7d.jpg","8d.jpg","9d.jpg","10d.jpg","jackd.jpg","queend.jpg","kingd.jpg"};
	String[] h = {"aceh.jpg","2h.jpg","3h.jpg","4h.jpg","5h.jpg","6h.jpg","7h.jpg","8h.jpg","9h.jpg","10h.jpg","jackh.jpg","queenh.jpg","kingh.jpg"};
	String[] s = {"aces.jpg","2s.jpg","3s.jpg","4s.jpg","5s.jpg","6s.jpg","7s.jpg","8s.jpg","9s.jpg","10s.jpg","jacks.jpg","queens.jpg","kings.jpg"};
	String x = "back.jpg";
	ImageIcon I1 ;
	Random R;
	ButtonGroup group;
	
	public SimpleCardGame(){
		
		CB = new JComboBox(Figure);
		CB.setBounds(100,60,60,30);
		
		label = new JLabel("Your score is: 10");
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setBackground(Color.GRAY);
		label.setBounds(100,0,300,50);
		
		I1 = new ImageIcon(x);
		label1 = new JLabel();
		label1.setBackground(Color.GRAY);
		label1.setBounds(180,160,100,110);
		label1.setIcon(I1);
		
		label2 = new JLabel();
		label2.setBackground(Color.GRAY);
		label2.setBounds(280,160,100,110);
		label2.setIcon(I1);
		
		
		
		c1 = new JRadioButton("Club");
		c2 = new JRadioButton("Dimand");
		c3 = new JRadioButton("Heart");
		c4 = new JRadioButton("Spade");
		button = new JButton();
		button.setText("Check");
		button.setBounds(190,350,100,60);
		button.setFocusable(false);
		c1.setBounds(175,60,70,30);
		c2.setBounds(175,90,70,30);
		c3.setBounds(275,60,70,30);
		c4.setBounds(275,90,70,30);

		group = new ButtonGroup();
	    group.add(c1);
		group.add(c2);
		group.add(c3);
		group.add(c4);
		
		c1.setBackground(Color.GRAY);
		c2.setBackground(Color.GRAY);
		c3.setBackground(Color.GRAY);
		c4.setBackground(Color.GRAY);
		
		c1.setFocusable(false);
		c2.setFocusable(false);
		c3.setFocusable(false);
		c4.setFocusable(false);
		
		CB.addActionListener(this);
		button.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		
		
		this.add(label);
		this.add(label1);
		this.add(label2);
		this.add(button);
		this.add(CB);
		this.add(c1);
		this.add(c2);
		this.add(c3);
		this.add(c4);
		
		this.setTitle("this is my cards game");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.GRAY);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		R = new Random();
		String u = "";
		String s1 = CB.getSelectedItem().toString();
		String s2 = "";
		String p = "";
		String f = "";
		if(c1.isSelected()) {
			s2 = "c";
		}
		if(c2.isSelected()) {
			s2 = "d";
		}
		if(c3.isSelected()) {
			s2 = "h";
		}
		if(c4.isSelected()) {
			s2 = "s";
		}
		 
		label1.setIcon(new ImageIcon("Cards/"+s1+s2+".jpg"));
		
		if(e.getSource()==button) {
			int a = R.nextInt(4);
			int b = R.nextInt(13);
			p=b+"";
			
			if(a==1) {
				label2.setIcon(new ImageIcon("Cards/"+c[b]));
				u = "Cards/"+c[b];
				f = "c";
			}
			else if(a==2) {
				label2.setIcon(new ImageIcon("Cards/"+d[b]));
				u = "Cards/"+d[b];
				f = "d";
			}
			else if(a==3) {
				label2.setIcon(new ImageIcon("Cards/"+h[b]));
				u = "Cards/"+h[b];
				f = "h";
			}
			else if(a==4) {
				label2.setIcon(new ImageIcon("Cards/"+s[b]));
				u = "Cards/"+s[b];
				f = "s";
			}
			if("Cards/"+s1+s2+".jpg"==u) {
				sc+=10;
				label.setText("Your score is:"+sc);
			}
			if(s1==p) {
				sc+=5;
				label.setText("Your score is:"+sc);
			}
			if(s2==f) {
				sc+=3;	
				label.setText("Your score is:"+sc);
			}
			else {
				sc--;
				label.setText("Your score is:"+sc);
			
			}
			if(sc>=25) {
				label.setText("You Won");
				button.setEnabled(false);
				CB.setEnabled(false);
				c1.setEnabled(false);
				c2.setEnabled(false);
				c3.setEnabled(false);
				c4.setEnabled(false);
			}
			if(sc<=0) {
				label.setText("You lose, game over");
				button.setEnabled(false);
				CB.setEnabled(false);
				c1.setEnabled(false);
				c2.setEnabled(false);
				c3.setEnabled(false);
				c4.setEnabled(false);
				
			}
							
		}
	}
}




