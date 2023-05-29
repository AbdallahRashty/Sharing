package test1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Random;
import java.util.Timer;
import javax.swing.BorderFactory;
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

import test1.Fourinarowgame.Drawgame;

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.TimerTask;

import javax.swing.JFrame;

public class MemoryGame extends JFrame implements MouseListener{
	
	String[] Figure = {"animal/image0.jpg","animal/image1.jpg","animal/image2.jpg",
			"animal/image3.jpg","animal/image4.jpg","animal/image5.jpg","animal/image6.jpg",
			"animal/image7.jpg","animal/image8.jpg"};
	ArrayList<Integer> FigureNUM = new ArrayList<Integer>(
			Arrays.asList(0,1,2,3,4,5,6,7,8));
	ArrayList<String> IC = new ArrayList<String>(
			Arrays.asList("C1","C2","C3","C4","C5","C6","C7","C8","C9","C10"));
	JLabel label;
	static JLabel label1,label2,label3,label4,label5,label6,label7,
	label8,label9,label10;
	String x ="question.png";
	String stop ="circle.png";
	ImageIcon I1,I2,I3,I4,I5,I6,I7,I8,I9,I10;
	String C1,C2,C3,C4,C5,C6,C7,C8,C9,C10;
	static int scoure = 0;
	MemoryGame(){
		
		I1 = new ImageIcon(x);
	    I2 = new ImageIcon("question.png");
	    I3 = new ImageIcon("question.png");
	    I4 = new ImageIcon("question.png");
	    I5 = new ImageIcon("question.png");
	    I6 = new ImageIcon("question.png");
	    I7 = new ImageIcon("question.png");
	    I8 = new ImageIcon("question.png");
	    I9 = new ImageIcon("question.png");
	    I10= new ImageIcon("question.png");
	    
		label = new JLabel();
		label.setBounds(200,20,500,200);
		label.setText("Your score is: "+scoure);
		label.setFont(new Font("Plane",Font.BOLD,20));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		
		label1 = new JLabel();
		label1.setBounds(200,75,200,200);
		label1.setIcon(I1);
		
		label2 = new JLabel();
		label2.setBounds(410,75,200,200);
		label2.setIcon(I2);
		
		label3 = new JLabel();
		label3.setBounds(620,75,200,200);
		label3.setIcon(I3);
		
		label4 = new JLabel();
		label4.setBounds(200,220,200,200);
		label4.setIcon(I4);
		
		label5 = new JLabel();
		label5.setBounds(410,220,200,200);
		label5.setIcon(I5);
		
		label6 = new JLabel();
		label6.setBounds(620,220,200,200);
		label6.setIcon(I6);
		
		label7 = new JLabel();
		label7.setBounds(200,400,200,200);
		label7.setIcon(I7);
	    
		label8 = new JLabel();
		label8.setBounds(410,400,200,200);
		label8.setIcon(I8);
		
		label9 = new JLabel();
		label9.setBounds(620,400,200,200);
		label9.setIcon(I9);
		
		label10 = new JLabel();
		label10.setBounds(620,600,200,200);
		label10.setIcon(I10);
	    
		label1.addMouseListener(this);
		label2.addMouseListener(this);
		label3.addMouseListener(this);
		label4.addMouseListener(this);
		label5.addMouseListener(this);
		label6.addMouseListener(this);
		label7.addMouseListener(this);
		label8.addMouseListener(this);
		label9.addMouseListener(this);
		label10.addMouseListener(this);
	    
		this.add(label);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(label5);
		this.add(label6);
		this.add(label7);
		this.add(label8);
		this.add(label9);
		this.add(label10);
		
		this.setTitle("Memory Game.exe");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,800);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.GREEN);
		this.setVisible(true);
	}
	public void StartGame() {

		int P;
		String h;
		Random R =new Random();
		P = R.nextInt(FigureNUM.size()-1);
		h = Figure[P];
		FigureNUM.remove(P);
		C1 = h;
		P = R.nextInt(FigureNUM.size()-1);
		h = Figure[P];
		FigureNUM.remove(P);
		C2 = h;
		P = R.nextInt(FigureNUM.size()-1);
		h = Figure[P];
		FigureNUM.remove(P);
		C3 = h;
		P = R.nextInt(FigureNUM.size()-1);
		h = Figure[P];
		FigureNUM.remove(P);
		C4 = h;
		P = R.nextInt(FigureNUM.size()-1);
		h = Figure[P];
		FigureNUM.remove(P);
		C5 = h;
		P = R.nextInt(FigureNUM.size()-1);
		h = Figure[P];
		FigureNUM.remove(P);
		C6 = h;
		P = R.nextInt(FigureNUM.size()-1);
		h = Figure[P];
		FigureNUM.remove(P);
		C7 = h;
		P = R.nextInt(FigureNUM.size()-1);
		h = Figure[P];
		FigureNUM.remove(P);
		C8 = h;
		P = R.nextInt(FigureNUM.size()-1);
		h = Figure[P];
		FigureNUM.remove(P);
		C9 = h;
		P = R.nextInt(FigureNUM.size());
		h = Figure[P];
		FigureNUM.remove(P);
		C10 = h;
	}
	public void mouseClicked(MouseEvent e) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int InitialConter=2;
			int counter = InitialConter;
			public void run() {
				
				
			}
		};
		
		if(e.getSource() == label1) {
			label1.setIcon(new ImageIcon("question.png"));
			
		}
		if(e.getSource()==label1) {
			label1.setIcon(new ImageIcon(C1));
			if(e.getSource()==label2) {
				label2.setIcon(new ImageIcon(C2));
				if(C1.equals(C2)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label2.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label2.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label2.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label3) {
				label3.setIcon(new ImageIcon(C3));
				if(C1.equals(C3)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label3.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label3.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label4) {
				label4.setIcon(new ImageIcon(C4));
				if(C1.equals(C4)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label4.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label4.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label4.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label5) {
				label5.setIcon(new ImageIcon(C5));
				if(C1.equals(C5)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label5.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label5.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label5.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label6) {
				label6.setIcon(new ImageIcon(C6));
				if(C1.equals(C6)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label6.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label6.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label6.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label7) {
				label7.setIcon(new ImageIcon(C7));
				if(C1.equals(C7)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label8) {
				label8.setIcon(new ImageIcon(C8));
				if(C1.equals(C8)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label8.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label8.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label9) {
				label9.setIcon(new ImageIcon(C9));
				if(C1.equals(C9)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label9.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label9.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label10) {
				label10.setIcon(new ImageIcon(C10));
				if(C1.equals(C10)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label10.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label10.setIcon(new ImageIcon("question.png"));  
				}
			}
		}
		else if(e.getSource()==label2) {
			label2.setIcon(new ImageIcon(C2));
			if(e.getSource()==label1) {
				label1.setIcon(new ImageIcon(C1));
				if(C1.equals(C2)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label2.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label2.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label2.setIcon(new ImageIcon("question.png"));
					label1.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label3) {
				label3.setIcon(new ImageIcon(C3));
				if(C2.equals(C3)) {
					timer.schedule(task,1000);
					label2.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label2.setEnabled(false);
					label3.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label2.setIcon(new ImageIcon("question.png"));
					label3.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label4) {
				label4.setIcon(new ImageIcon(C4));
				if(C2.equals(C4)) {
					timer.schedule(task,1000);
					label2.setIcon(new ImageIcon(stop));
					label4.setIcon(new ImageIcon(stop));
					label2.setEnabled(false);
					label4.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label2.setIcon(new ImageIcon("question.png"));
					label4.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label5) {
				label5.setIcon(new ImageIcon(C5));
				if(C2.equals(C5)) {
					timer.schedule(task,1000);
					label2.setIcon(new ImageIcon(stop));
					label5.setIcon(new ImageIcon(stop));
					label2.setEnabled(false);
					label5.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label2.setIcon(new ImageIcon("question.png"));
					label5.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label6) {
				label6.setIcon(new ImageIcon(C6));
				if(C2.equals(C6)) {
					timer.schedule(task,1000);
					label2.setIcon(new ImageIcon(stop));
					label6.setIcon(new ImageIcon(stop));
					label2.setEnabled(false);
					label6.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label2.setIcon(new ImageIcon("question.png"));
					label6.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label7) {
				label7.setIcon(new ImageIcon(C7));
				if(C2.equals(C7)) {
					timer.schedule(task,1000);
					label2.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label2.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label2.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label8) {
				label8.setIcon(new ImageIcon(C8));
				if(C2.equals(C8)) {
					timer.schedule(task,1000);
					label2.setIcon(new ImageIcon(stop));
					label8.setIcon(new ImageIcon(stop));
					label2.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label2.setIcon(new ImageIcon("question.png"));
					label8.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label9) {
				label9.setIcon(new ImageIcon(C9));
				if(C2.equals(C9)) {
					timer.schedule(task,1000);
					label2.setIcon(new ImageIcon(stop));
					label9.setIcon(new ImageIcon(stop));
					label2.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label2.setIcon(new ImageIcon("question.png"));
					label9.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label10) {
				label10.setIcon(new ImageIcon(C10));
				if(C2.equals(C10)) {
					timer.schedule(task,1000);
					label2.setIcon(new ImageIcon(stop));
					label10.setIcon(new ImageIcon(stop));
					label2.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label2.setIcon(new ImageIcon("question.png"));
					label10.setIcon(new ImageIcon("question.png"));  
				}
			}
		}
		else if(e.getSource()==label3) {
			label3.setIcon(new ImageIcon(C3));
			if(e.getSource()==label2) {
				label2.setIcon(new ImageIcon(C2));
				if(C3.equals(C2)) {
					timer.schedule(task,1000);
					label3.setIcon(new ImageIcon(stop));
					label2.setIcon(new ImageIcon(stop));
					label3.setEnabled(false);
					label2.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label3.setIcon(new ImageIcon("question.png"));
					label2.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label1) {
				label1.setIcon(new ImageIcon(C1));
				if(C3.equals(C1)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label3.setEnabled(false);
					label1.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label3.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label4) {
				label4.setIcon(new ImageIcon(C4));
				if(C3.equals(C4)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label3.setEnabled(false);
					label4.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label3.setIcon(new ImageIcon("question.png"));
					label4.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label5) {
				label5.setIcon(new ImageIcon(C5));
				if(C3.equals(C5)) {
					timer.schedule(task,1000);
					label3.setIcon(new ImageIcon(stop));
					label5.setIcon(new ImageIcon(stop));
					label3.setEnabled(false);
					label5.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label3.setIcon(new ImageIcon("question.png"));
					label5.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label6) {
				label6.setIcon(new ImageIcon(C6));
				if(C3.equals(C6)) {
					timer.schedule(task,1000);
					label3.setIcon(new ImageIcon(stop));
					label6.setIcon(new ImageIcon(stop));
					label3.setEnabled(false);
					label6.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label3.setIcon(new ImageIcon("question.png"));
					label6.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label7) {
				label7.setIcon(new ImageIcon(C7));
				if(C3.equals(C7)) {
					timer.schedule(task,1000);
					label3.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label3.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label3.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label8) {
				label8.setIcon(new ImageIcon(C8));
				if(C3.equals(C8)) {
					timer.schedule(task,1000);
					label3.setIcon(new ImageIcon(stop));
					label8.setIcon(new ImageIcon(stop));
					label3.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label3.setIcon(new ImageIcon("question.png"));
					label8.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label9) {
				label9.setIcon(new ImageIcon(C9));
				if(C3.equals(C9)) {
					timer.schedule(task,1000);
					label3.setIcon(new ImageIcon(stop));
					label9.setIcon(new ImageIcon(stop));
					label3.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label3.setIcon(new ImageIcon("question.png"));
					label9.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label10) {
				label10.setIcon(new ImageIcon(C10));
				if(C3.equals(C10)) {
					timer.schedule(task,1000);
					label3.setIcon(new ImageIcon(stop));
					label10.setIcon(new ImageIcon(stop));
					label3.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label3.setIcon(new ImageIcon("question.png"));
					label10.setIcon(new ImageIcon("question.png"));  
				}
			}
		}
		else if(e.getSource()==label4) {
			label4.setIcon(new ImageIcon(C4));
			if(e.getSource()==label2) {
				label2.setIcon(new ImageIcon(C2));
				if(C4.equals(C2)) {
					timer.schedule(task,1000);
					label4.setIcon(new ImageIcon(stop));
					label2.setIcon(new ImageIcon(stop));
					label4.setEnabled(false);
					label2.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label4.setIcon(new ImageIcon("question.png"));
					label2.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label3) {
				label3.setIcon(new ImageIcon(C3));
				if(C4.equals(C3)) {
					timer.schedule(task,1000);
					label4.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label4.setEnabled(false);
					label3.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label4.setIcon(new ImageIcon("question.png"));
					label3.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label1) {
				label1.setIcon(new ImageIcon(C1));
				if(C1.equals(C4)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label4.setIcon(new ImageIcon(stop));
					label4.setEnabled(false);
					label1.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label4.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label5) {
				label5.setIcon(new ImageIcon(C5));
				if(C4.equals(C5)) {
					timer.schedule(task,1000);
					label4.setIcon(new ImageIcon(stop));
					label5.setIcon(new ImageIcon(stop));
					label4.setEnabled(false);
					label5.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label4.setIcon(new ImageIcon("question.png"));
					label5.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label6) {
				label6.setIcon(new ImageIcon(C6));
				if(C4.equals(C6)) {
					timer.schedule(task,1000);
					label4.setIcon(new ImageIcon(stop));
					label6.setIcon(new ImageIcon(stop));
					label4.setEnabled(false);
					label6.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label4.setIcon(new ImageIcon("question.png"));
					label6.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label7) {
				label7.setIcon(new ImageIcon(C7));
				if(C4.equals(C7)) {
					timer.schedule(task,1000);
					label4.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label4.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label4.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label8) {
				label8.setIcon(new ImageIcon(C8));
				if(C4.equals(C8)) {
					timer.schedule(task,1000);
					label4.setIcon(new ImageIcon(stop));
					label8.setIcon(new ImageIcon(stop));
					label4.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label4.setIcon(new ImageIcon("question.png"));
					label8.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label9) {
				label9.setIcon(new ImageIcon(C9));
				if(C4.equals(C9)) {
					timer.schedule(task,1000);
					label4.setIcon(new ImageIcon(stop));
					label9.setIcon(new ImageIcon(stop));
					label4.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label4.setIcon(new ImageIcon("question.png"));
					label9.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label10) {
				label10.setIcon(new ImageIcon(C10));
				if(C4.equals(C10)) {
					timer.schedule(task,1000);
					label4.setIcon(new ImageIcon(stop));
					label10.setIcon(new ImageIcon(stop));
					label4.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label4.setIcon(new ImageIcon("question.png"));
					label10.setIcon(new ImageIcon("question.png"));  
				}
			}
		}
		else if(e.getSource()==label5) {
			label5.setIcon(new ImageIcon(C5));
			if(e.getSource()==label2) {
				label2.setIcon(new ImageIcon(C2));
				if(C5.equals(C2)) {
					timer.schedule(task,1000);
					label5.setIcon(new ImageIcon(stop));
					label2.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label2.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label5.setIcon(new ImageIcon("question.png"));
					label2.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label3) {
				label3.setIcon(new ImageIcon(C3));
				if(C5.equals(C3)) {
					timer.schedule(task,1000);
					label5.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label3.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label5.setIcon(new ImageIcon("question.png"));
					label3.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label4) {
				label4.setIcon(new ImageIcon(C4));
				if(C5.equals(C4)) {
					timer.schedule(task,1000);
					label5.setIcon(new ImageIcon(stop));
					label4.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label4.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label5.setIcon(new ImageIcon("question.png"));
					label4.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label) {
				label1.setIcon(new ImageIcon(C1));
				if(C1.equals(C5)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label5.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label1.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label5.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label6) {
				label6.setIcon(new ImageIcon(C6));
				if(C5.equals(C6)) {
					timer.schedule(task,1000);
					label5.setIcon(new ImageIcon(stop));
					label6.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label6.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label5.setIcon(new ImageIcon("question.png"));
					label6.setIcon(new ImageIcon("question.png")); 
				}
			}
			if(e.getSource()==label7) {
				label7.setIcon(new ImageIcon(C7));
				if(C5.equals(C7)) {
					timer.schedule(task,1000);
					label5.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label5.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label8) {
				label8.setIcon(new ImageIcon(C8));
				if(C5.equals(C8)) {
					timer.schedule(task,1000);
					label5.setIcon(new ImageIcon(stop));
					label8.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label5.setIcon(new ImageIcon("question.png"));
					label8.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label9) {
				label9.setIcon(new ImageIcon(C9));
				if(C5.equals(C9)) {
					timer.schedule(task,1000);
					label5.setIcon(new ImageIcon(stop));
					label9.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label5.setIcon(new ImageIcon("question.png"));
					label9.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label10) {
				label10.setIcon(new ImageIcon(C10));
				if(C5.equals(C10)) {
					timer.schedule(task,1000);
					label5.setIcon(new ImageIcon(stop));
					label10.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label5.setIcon(new ImageIcon("question.png"));
					label10.setIcon(new ImageIcon("question.png"));  
				}
			}
		}
		else if(e.getSource()==label6) {
			label6.setIcon(new ImageIcon(C6));
			if(e.getSource()==label2) {
				label2.setIcon(new ImageIcon(C2));
				if(C6.equals(C2)) {
					timer.schedule(task,1000);
					label6.setIcon(new ImageIcon(stop));
					label2.setIcon(new ImageIcon(stop));
					label6.setEnabled(false);
					label2.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label6.setIcon(new ImageIcon("question.png"));
					label2.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label3) {
				label3.setIcon(new ImageIcon(C3));
				if(C6.equals(C3)) {
					timer.schedule(task,1000);
					label6.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label6.setEnabled(false);
					label3.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label6.setIcon(new ImageIcon("question.png"));
					label3.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label4) {
				label4.setIcon(new ImageIcon(C4));
				if(C6.equals(C4)) {
					timer.schedule(task,1000);
					label6.setIcon(new ImageIcon(stop));
					label4.setIcon(new ImageIcon(stop));
					label6.setEnabled(false);
					label4.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label6.setIcon(new ImageIcon("question.png"));
					label4.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label5) {
				label5.setIcon(new ImageIcon(C5));
				if(C5.equals(C6)) {
					timer.schedule(task,1000);
					label6.setIcon(new ImageIcon(stop));
					label5.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label6.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label6.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label1) {
				label1.setIcon(new ImageIcon(C1));
				if(C6.equals(C1)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label6.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label6.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label6.setIcon(new ImageIcon("question.png")); 
				}
			}
			if(e.getSource()==label7) {
				label7.setIcon(new ImageIcon(C7));
				if(C6.equals(C7)) {
					timer.schedule(task,1000);
					label6.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label6.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label6.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label8) {
				label8.setIcon(new ImageIcon(C8));
				if(C6.equals(C8)) {
					timer.schedule(task,1000);
					label6.setIcon(new ImageIcon(stop));
					label8.setIcon(new ImageIcon(stop));
					label6.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label6.setIcon(new ImageIcon("question.png"));
					label8.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label9) {
				label9.setIcon(new ImageIcon(C9));
				if(C6.equals(C9)) {
					timer.schedule(task,1000);
					label6.setIcon(new ImageIcon(stop));
					label9.setIcon(new ImageIcon(stop));
					label6.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label6.setIcon(new ImageIcon("question.png"));
					label9.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label10) {
				label10.setIcon(new ImageIcon(C10));
				if(C6.equals(C10)) {
					timer.schedule(task,1000);
					label6.setIcon(new ImageIcon(stop));
					label10.setIcon(new ImageIcon(stop));
					label6.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label6.setIcon(new ImageIcon("question.png"));
					label10.setIcon(new ImageIcon("question.png"));  
				}
			}
	
		}
		else if(e.getSource()==label7) {
			label7.setIcon(new ImageIcon(C7));
			if(e.getSource()==label2) {
				label2.setIcon(new ImageIcon(C2));
				if(C7.equals(C2)) {
					timer.schedule(task,1000);
					label7.setIcon(new ImageIcon(stop));
					label2.setIcon(new ImageIcon(stop));
					label7.setEnabled(false);
					label2.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label7.setIcon(new ImageIcon("question.png"));
					label2.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label3) {
				label3.setIcon(new ImageIcon(C3));
				if(C7.equals(C3)) {
					timer.schedule(task,1000);
					label7.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label7.setEnabled(false);
					label3.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label7.setIcon(new ImageIcon("question.png"));
					label3.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label4) {
				label4.setIcon(new ImageIcon(C4));
				if(C7.equals(C4)) {
					timer.schedule(task,1000);
					label7.setIcon(new ImageIcon(stop));
					label4.setIcon(new ImageIcon(stop));
					label7.setEnabled(false);
					label4.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label7.setIcon(new ImageIcon("question.png"));
					label4.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label5) {
				label5.setIcon(new ImageIcon(C5));
				if(C5.equals(C7)) {
					timer.schedule(task,1000);
					label5.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label7.setEnabled(false);
					label5.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label5.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label6) {
				label1.setIcon(new ImageIcon(C1));
				if(C7.equals(C6)) {
					timer.schedule(task,1000);
					label6.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label6.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label6.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png")); 
				}
			}
			if(e.getSource()==label7) {
				label7.setIcon(new ImageIcon(C7));
				if(C1.equals(C7)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label8) {
				label8.setIcon(new ImageIcon(C8));
				if(C7.equals(C8)) {
					timer.schedule(task,1000);
					label7.setIcon(new ImageIcon(stop));
					label8.setIcon(new ImageIcon(stop));
					label7.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label7.setIcon(new ImageIcon("question.png"));
					label8.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label9) {
				label9.setIcon(new ImageIcon(C9));
				if(C7.equals(C9)) {
					timer.schedule(task,1000);
					label7.setIcon(new ImageIcon(stop));
					label9.setIcon(new ImageIcon(stop));
					label7.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label7.setIcon(new ImageIcon("question.png"));
					label9.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label10) {
				label10.setIcon(new ImageIcon(C10));
				if(C7.equals(C10)) {
					timer.schedule(task,1000);
					label7.setIcon(new ImageIcon(stop));
					label10.setIcon(new ImageIcon(stop));
					label7.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label7.setIcon(new ImageIcon("question.png"));
					label10.setIcon(new ImageIcon("question.png"));  
				}
			}
		}
		else if(e.getSource()==label8) {
			label8.setIcon(new ImageIcon(C8));
			if(e.getSource()==label2) {
				label2.setIcon(new ImageIcon(C2));
				if(C8.equals(C2)) {
					timer.schedule(task,1000);
					label8.setIcon(new ImageIcon(stop));
					label2.setIcon(new ImageIcon(stop));
					label8.setEnabled(false);
					label2.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label8.setIcon(new ImageIcon("question.png"));
					label2.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label3) {
				label3.setIcon(new ImageIcon(C3));
				if(C8.equals(C3)) {
					timer.schedule(task,1000);
					label8.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label8.setEnabled(false);
					label3.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label8.setIcon(new ImageIcon("question.png"));
					label3.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label4) {
				label4.setIcon(new ImageIcon(C4));
				if(C8.equals(C4)) {
					timer.schedule(task,1000);
					label8.setIcon(new ImageIcon(stop));
					label4.setIcon(new ImageIcon(stop));
					label8.setEnabled(false);
					label4.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label8.setIcon(new ImageIcon("question.png"));
					label4.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label5) {
				label5.setIcon(new ImageIcon(C5));
				if(C8.equals(C5)) {
					timer.schedule(task,1000);
					label8.setIcon(new ImageIcon(stop));
					label5.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label8.setIcon(new ImageIcon("question.png"));
					label5.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label6) {
				label6.setIcon(new ImageIcon(C6));
				if(C6.equals(C8)) {
					timer.schedule(task,1000);
					label8.setIcon(new ImageIcon(stop));
					label6.setIcon(new ImageIcon(stop));
					label8.setEnabled(false);
					label6.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label8.setIcon(new ImageIcon("question.png"));
					label6.setIcon(new ImageIcon("question.png")); 
				}
			}
			if(e.getSource()==label7) {
				label7.setIcon(new ImageIcon(C7));
				if(C8.equals(C7)) {
					timer.schedule(task,1000);
					label8.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label8.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label8.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label1) {
				label1.setIcon(new ImageIcon(C1));
				if(C1.equals(C8)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label8.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label8.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label9) {
				label9.setIcon(new ImageIcon(C9));
				if(C8.equals(C9)) {
					timer.schedule(task,1000);
					label8.setIcon(new ImageIcon(stop));
					label9.setIcon(new ImageIcon(stop));
					label8.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label8.setIcon(new ImageIcon("question.png"));
					label9.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label10) {
				label10.setIcon(new ImageIcon(C10));
				if(C8.equals(C10)) {
					timer.schedule(task,1000);
					label8.setIcon(new ImageIcon(stop));
					label10.setIcon(new ImageIcon(stop));
					label8.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label8.setIcon(new ImageIcon("question.png"));
					label10.setIcon(new ImageIcon("question.png"));  
				}
			}
		}
		else if(e.getSource()==label9) {
			label9.setIcon(new ImageIcon(C9));
			if(e.getSource()==label2) {
				label2.setIcon(new ImageIcon(C2));
				if(C9.equals(C2)) {
					timer.schedule(task,1000);
					label9.setIcon(new ImageIcon(stop));
					label2.setIcon(new ImageIcon(stop));
					label9.setEnabled(false);
					label2.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label9.setIcon(new ImageIcon("question.png"));
					label2.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label3) {
				label3.setIcon(new ImageIcon(C3));
				if(C9.equals(C3)) {
					timer.schedule(task,1000);
					label9.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label9.setEnabled(false);
					label3.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label9.setIcon(new ImageIcon("question.png"));
					label3.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label4) {
				label4.setIcon(new ImageIcon(C4));
				if(C9.equals(C4)) {
					timer.schedule(task,1000);
					label9.setIcon(new ImageIcon(stop));
					label4.setIcon(new ImageIcon(stop));
					label9.setEnabled(false);
					label4.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label9.setIcon(new ImageIcon("question.png"));
					label4.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label5) {
				label5.setIcon(new ImageIcon(C5));
				if(C9.equals(C5)) {
					timer.schedule(task,1000);
					label9.setIcon(new ImageIcon(stop));
					label5.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label9.setIcon(new ImageIcon("question.png"));
					label5.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label6) {
				label6.setIcon(new ImageIcon(C6));
				if(C6.equals(C9)) {
					timer.schedule(task,1000);
					label9.setIcon(new ImageIcon(stop));
					label6.setIcon(new ImageIcon(stop));
					label9.setEnabled(false);
					label6.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label9.setIcon(new ImageIcon("question.png"));
					label6.setIcon(new ImageIcon("question.png")); 
				}
			}
			if(e.getSource()==label7) {
				label7.setIcon(new ImageIcon(C7));
				if(C9.equals(C7)) {
					timer.schedule(task,1000);
					label9.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label9.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label9.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label8) {
				label8.setIcon(new ImageIcon(C8));
				if(C9.equals(C8)) {
					timer.schedule(task,1000);
					label9.setIcon(new ImageIcon(stop));
					label8.setIcon(new ImageIcon(stop));
					label9.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label9.setIcon(new ImageIcon("question.png"));
					label8.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label9) {
				label9.setIcon(new ImageIcon(C9));
				if(C1.equals(C9)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label9.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label9.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label10) {
				label10.setIcon(new ImageIcon(C10));
				if(C9.equals(C10)) {
					timer.schedule(task,1000);
					label9.setIcon(new ImageIcon(stop));
					label10.setIcon(new ImageIcon(stop));
					label9.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label9.setIcon(new ImageIcon("question.png"));
					label10.setIcon(new ImageIcon("question.png"));  
				}
			}
		
		}
		else if(e.getSource()==label10) {
			label10.setIcon(new ImageIcon(C10));
			if(e.getSource()==label2) {
				label2.setIcon(new ImageIcon(C2));
				if(C10.equals(C2)) {
					timer.schedule(task,1000);
					label10.setIcon(new ImageIcon(stop));
					label2.setIcon(new ImageIcon(stop));
					label10.setEnabled(false);
					label2.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label10.setIcon(new ImageIcon("question.png"));
					label2.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label3) {
				label3.setIcon(new ImageIcon(C3));
				if(C9.equals(C3)) {
					timer.schedule(task,1000);
					label10.setIcon(new ImageIcon(stop));
					label3.setIcon(new ImageIcon(stop));
					label10.setEnabled(false);
					label3.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label10.setIcon(new ImageIcon("question.png"));
					label3.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label4) {
				label4.setIcon(new ImageIcon(C4));
				if(C10.equals(C4)) {
					timer.schedule(task,1000);
					label10.setIcon(new ImageIcon(stop));
					label4.setIcon(new ImageIcon(stop));
					label10.setEnabled(false);
					label4.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label10.setIcon(new ImageIcon("question.png"));
					label4.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label5) {
				label5.setIcon(new ImageIcon(C5));
				if(C10.equals(C5)) {
					timer.schedule(task,1000);
					label10.setIcon(new ImageIcon(stop));
					label5.setIcon(new ImageIcon(stop));
					label5.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label10.setIcon(new ImageIcon("question.png"));
					label5.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label6) {
				label6.setIcon(new ImageIcon(C6));
				if(C6.equals(C10)) {
					timer.schedule(task,1000);
					label10.setIcon(new ImageIcon(stop));
					label6.setIcon(new ImageIcon(stop));
					label10.setEnabled(false);
					label6.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label10.setIcon(new ImageIcon("question.png"));
					label6.setIcon(new ImageIcon("question.png")); 
				}
			}
			if(e.getSource()==label7) {
				label7.setIcon(new ImageIcon(C7));
				if(C10.equals(C7)) {
					timer.schedule(task,1000);
					label10.setIcon(new ImageIcon(stop));
					label7.setIcon(new ImageIcon(stop));
					label10.setEnabled(false);
					label7.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label10.setIcon(new ImageIcon("question.png"));
					label7.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label8) {
				label8.setIcon(new ImageIcon(C8));
				if(C10.equals(C8)) {
					timer.schedule(task,1000);
					label10.setIcon(new ImageIcon(stop));
					label8.setIcon(new ImageIcon(stop));
					label10.setEnabled(false);
					label8.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label10.setIcon(new ImageIcon("question.png"));
					label8.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label9) {
				label9.setIcon(new ImageIcon(C9));
				if(C10.equals(C9)) {
					timer.schedule(task,1000);
					label10.setIcon(new ImageIcon(stop));
					label9.setIcon(new ImageIcon(stop));
					label10.setEnabled(false);
					label9.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label10.setIcon(new ImageIcon("question.png"));
					label9.setIcon(new ImageIcon("question.png"));  
				}
			}
			if(e.getSource()==label1) {
				label1.setIcon(new ImageIcon(C1));
				if(C1.equals(C10)) {
					timer.schedule(task,1000);
					label1.setIcon(new ImageIcon(stop));
					label10.setIcon(new ImageIcon(stop));
					label1.setEnabled(false);
					label10.setEnabled(false);
					scoure++;
				}
				else {
					timer.schedule(task,2000);
				    label1.setIcon(new ImageIcon("question.png"));
					label10.setIcon(new ImageIcon("question.png"));  
				}
			}
		}
}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}
