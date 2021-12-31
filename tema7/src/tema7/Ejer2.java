package tema7;

import javax.swing.*;
/*import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;*/

public class Ejer2 extends JFrame {
	
	private JLabel label0,label1, label2, label3;
	private JTextField t1;
	private JCheckBox chbx1;
	private JComboBox combox1;
	private JButton btn1;
	
	
	public Ejer2() {
		
		setLayout(null); 
	}
	
	void posicionar() {
		label0=new JLabel("INTERFAZ GRÁFICA");   	
		label0.setBounds(150,-5,120,40); 
		add(label0); 
		
		label1=new JLabel("Nombre:");   	
		label1.setBounds(10,30,100,40); 
		add(label1); 
		label2=new JLabel("Entregado:");
		label2.setBounds(10,60,100,40);
		add(label2); 
		label3=new JLabel("Provincia:");
		label3.setBounds(10,100,100,40);
		add(label3); 
		
		t1=new JTextField();
		t1.setBounds(90,40,250,20);
		add(t1);
		
		chbx1=new JCheckBox();
		chbx1.setBounds(90, 60, 40, 40);
		add(chbx1);
		
		combox1=new JComboBox();
		combox1.setBounds(90, 110, 100, 20);
		add(combox1);
		
		btn1=new JButton("Pulsar");
		btn1.setBounds(120, 160, 150, 50);
		add(btn1);
}    

	public static void main(String[] ar) {
		Ejer2 grafica1=new Ejer2();
		grafica1.posicionar();
		grafica1.setTitle("Ejercicio Interfaz Gráfica");
		grafica1.setBounds(10,10,400,300); 
		grafica1.setVisible(true); 
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		
	}
}