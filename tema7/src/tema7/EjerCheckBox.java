package tema7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EjerCheckBox extends JFrame implements ChangeListener ,ActionListener{
	
	JCheckBox check1;
	JLabel label1;
	JButton btn;
	
	EjerCheckBox(){
		setLayout(null);
	}
	
void posicionar() {
		
		label1=new JLabel("Esta de acuerdo con las normas del servicio?");   	
		label1.setBounds(10,20,300,50); 
		add(label1); 
	
		check1=new JCheckBox("Acepto");
		check1.setBounds(10, 80, 100, 20);
		add(check1);
		check1.addChangeListener(this);
		
		 btn=new JButton("Continuar");
	     btn.setBounds(10,140,100,30);
	     add(btn);
	     btn.setEnabled(false); 
	     btn.addActionListener(this);
}
	
	
	
		@Override
	public void stateChanged(ChangeEvent ev) {
		if(check1.isSelected()==true)
			btn.setEnabled(true);
		
	}

	
	
	public static void main(String[] args) {
		EjerCheckBox grafica1=new EjerCheckBox();
		grafica1.posicionar();
		grafica1.setBounds(10, 10, 500, 300);
		grafica1.setVisible(true);
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			System.exit(0);
		}
		
	}



}
