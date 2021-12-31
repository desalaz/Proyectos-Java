package maquina;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.io.*;

public class Maquina extends JFrame implements ActionListener, ChangeListener{
	private JComboBox cbox1, cbox2, cbox3;
	private JButton btn1;
	private ButtonGroup rbtng;
	private JTextField t1, t2;
	int colum= 20;
	int fila, opcion1;
	String opcion2, cad1, result, productos;
	float vueltos;
	String [] titulos = {"BEBIDAS", "PRECIO", "PAGO"};
	String [] bebidas = {"Agua", "Chocolate", "Café"};
	String [] precios = {" 1.50 ", " 2.20 "," 0.75 "};
	private JRadioButton [] botones= new JRadioButton[bebidas.length];
	private JLabel[] label=new JLabel[titulos.length];
	private JLabel [] label2= { new JLabel("Euros"), new JLabel( "Centimos"),new JLabel("VUELTAS")};
	FileWriter escritura;
	String infoCliente;
	
	public Maquina(){
		setLayout(null);
	}
	
	void posicionar() {
		fila=50;
		for(int x=0; x<label.length; x++) {
			label[x]=new JLabel(titulos[x]);
			label[x].setBounds(colum, 10, 100, 50);
			add(label[x]);
			colum+=180;
		
		}
		
		
		rbtng=new ButtonGroup();
		for (int r=0; r<botones.length; r++) {
			botones[r]=new JRadioButton(bebidas[r]);
			botones[r].setBounds(10, fila, 100, 50);
			add(botones[r]);
			rbtng.add(botones[r]);
			fila+=50;
			botones[r].addChangeListener(this);
			
		}
		
		t1=new JTextField();
		t1.setBounds(200,70,50,150);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(400,150,100,35);
		add(t2);
		
		btn1=new JButton("Extraer");
	    btn1.setBounds(280,280,200,40);
	    add(btn1);
	    btn1.addActionListener(this); 	
	}
	
	void obtener() {
		fila=50;
		
		//Utilizando el bucle foreach
		
		for (JLabel y: label2) {
			y.setBounds(330, fila, 100, 50);	
			add(y);
			fila+=50;
			}
		
		cbox1=new JComboBox();
		cbox1.setBounds(400,68,80,20);	
		add(cbox1);	
		cbox1.addActionListener(this);
			for(int e=0; e<=5;e++) {
				cbox1.addItem(e);
			}
		
		
		cbox2=new JComboBox();
		cbox2.setBounds(400,115,80,20);	
		add(cbox2);
		cbox2.addActionListener(this);	
		for(float c =0.0f; c<=1.0f; c+=0.05f) {
			DecimalFormatSymbols miseparador = new DecimalFormatSymbols();
			miseparador.setDecimalSeparator('.');
			DecimalFormat df =new DecimalFormat("#0.00",miseparador);	
				String valorformat = df.format(c);
			
				cbox2.addItem(valorformat);
		}
		
		//cbox2.addItem(String.format("%.2f", c));
		//cbox2.addItem((double)Math.round(c * 100d) / 100);
		
		cbox3=new JComboBox();
		cbox3.isEditable();
		cbox3.setBounds(20,280,150,20);	
		add(cbox3);	
		cbox3.addActionListener(this);
		
		cbox3.addItem(" ");	
		cbox3.addItem("Marcos");
		cbox3.addItem("Julia");	
		cbox3.addItem("Teresa");
		cbox3.addItem("Pedro");
		
	}
	

	
	@Override
	public void stateChanged(ChangeEvent exp) {
		for (int i=0; i<3;i++) {
		
			if (botones[i].isSelected()==true) {
				productos=bebidas[i];
				t1.setText(precios[i]);
		} 
			
	}	
 }
			
		
	@Override
	public void actionPerformed(ActionEvent e) {
			
	try {	
		
	opcion1=(int) cbox1.getSelectedItem();
	
	String opc1=String.valueOf(opcion1);

	opcion2=(String)cbox2.getSelectedItem();	

	String cad1=t1.getText();	
	
	
	float n1= Float.parseFloat(opc1);
	float n2=Float.parseFloat(opcion2);
	float valor=Float.parseFloat(cad1);
	float suma;

	suma=(n1 + n2);
	
	
	
	if(e.getSource()==btn1) {
		
		if(suma<valor) {
			
			setTitle("DINERO INSUFICIENTE");
			
		}else if (suma == valor){
			
			vueltos = suma - valor;
			DecimalFormatSymbols miseparador = new DecimalFormatSymbols();
			miseparador.setDecimalSeparator('.');
			DecimalFormat df =new DecimalFormat("#0.00",miseparador);
			result=df.format(vueltos);
			//result=String.valueOf(vueltos);
			t2.setText(result);
			setTitle("EXTRAYENDO SU PRODUCTO");
			
		}else if (suma > valor){
			
			vueltos = suma - valor;
		// result=String.valueOf(vueltos);
			DecimalFormatSymbols miseparador = new DecimalFormatSymbols();
			miseparador.setDecimalSeparator('.');
			DecimalFormat df =new DecimalFormat("#0.00",miseparador);
			result=df.format(vueltos);
			t2.setText(result);
			setTitle("EXTRAIGA SU PRODUCTO Y RETIRE SU CAMBIO: "+result);
		}
		
		

	infoCliente=(String)cbox3.getSelectedItem();
			
	escritura=new FileWriter("C:/Users/Usuario1/Desktop/Estadisticas.txt", true);
		
	escritura.write("Nombre: " + infoCliente + ", producto: "+productos+ ", precio: "+cad1+", pagó: " +opc1 + " + " 
	+ opcion2+ " y su cambio fue: " + result + "\n");
			
		
	}	
	
	escritura.close();
	
	}catch(Exception error) {
		//System.out.println(error);
	}
	
		
}
	
	public static void main(String[] args) {
		Maquina grafica1=new Maquina();
		grafica1.posicionar();
		grafica1.obtener();
		grafica1.setTitle("ELIGE TU PRODUCTO");
		grafica1.setBounds(10, 10, 600, 400);
		grafica1.setVisible(true);
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
