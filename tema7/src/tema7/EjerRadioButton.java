package tema7;
import java.awt.Color;
import java.awt.Container;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class EjerRadioButton extends JFrame implements ChangeListener {
	 private JPanel panel1 =new JPanel();
	 private JPanel panel2 =new JPanel();
	 
	
	
	private JRadioButton r1, r2, r3;
	private ButtonGroup btng;
	
	EjerRadioButton(){
		
	}
	
	void posicionar() {
		
		 panel1.setLayout(null);
	     panel1.setBounds(10,10,500,400);
	     add(panel1);	
		
	     panel2.setLayout(null);
	     panel2.setBounds(10,10,500,400);
	     add(panel2);
	     
		
	     btng=new ButtonGroup();
	     r1=new JRadioButton("Color Rojo");
	     r1.setBounds(10, 20, 200, 32);
	     //r1.addChangeListener(this);
	     add(r1);
	     btng.add(r1);
	     panel1.add(r1);
	     //panel2.add(r1);
	    
		
	     r2=new JRadioButton("Color Azul");
	     r2.setBounds(10, 80, 200, 32);
	     //r2.addChangeListener(this);
	     add(r2);
	     btng.add(r2);
	     panel1.add(r2);
	    // panel2.add(r2);
		
	     
	     r3=new JRadioButton("Color Verde");
	     r3.setBounds(10, 140, 200, 32);
	     //r3.addChangeListener(this);
	     add(r3);
	     btng.add(r3);
	     panel1.add(r3);
	    // panel2.add(r3);
		
	     Color color=null; 
	     
	     panel2.setBackground(Color.RED); 
	     
	     panel1.setVisible(true);
	     panel2.setVisible(false);
	         
	     
	}
	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
		//panel1.setVisible(false);
		
		
		if(r1.isSelected()==true) {
		
		panel1.setVisible(false);
	    panel2.setVisible(true);
	     
	    
		} else if(r2.isSelected()==true) {
			panel1.setVisible(false);
			panel2.setBackground(Color.BLUE);
			panel2.setVisible(true);
			
		    
		   
		      
		}else {
			panel1.setVisible(false);
			panel2.setBackground(Color.GREEN);
			panel2.setVisible(true);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		EjerRadioButton ventana = new EjerRadioButton();
		 ventana.setLayout(null);
		 ventana.posicionar();
		 ventana.setBounds(10,10,500,400);
		 ventana.setVisible(true);
		 ventana.setResizable(false);
		 ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
	}

	

}
