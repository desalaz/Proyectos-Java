/*En un array disponemos de 4 usuarios y en otro array sus contraseñas.Se trata
 de teclear Usuario y contraseña y si son correctos aparecerá: CORRECTO
 de lo contrario aparecerá: INCORRECTO.*/


package tema7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EjerContrasenia extends JFrame implements ActionListener {

	 String [] usuarios= {"Juan", "Desi", "Carmen","Olga"};
	 String [] claves= {"abc1", "1234","9876","xxzz"};
	
		
	 JLabel label1, label2;
	 JButton boton1;
	 JTextField t1, t2;
	
	EjerContrasenia(){
		setLayout(null);
	}
	
	
	void posicionar() {
		label1=new JLabel("Usuario");   	
		label1.setBounds(10,20,120,40); 
		add(label1); 
		label2=new JLabel("Contraseña:");
		label2.setBounds(10,60,100,40);
		add(label2); 
		
		t1=new JTextField();
		t1.setBounds(90,40,250,20);
		add(t1);
		t1.addActionListener(this);
		
		t2=new JTextField();
		t2.setBounds(90,80,250,20);
		add(t2);
		t2.addActionListener(this);
		
		 boton1=new JButton("Confirmar");
	     boton1.setBounds(40,120,200,30);
	     add(boton1);
	     boton1.addActionListener(this); 
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	boolean match=false;
		
	 String cad1=t1.getText();		//Aqui obtengo el texto tecleado en el JTextField t1 y t2
	 String pass1=t2.getText();
			 
	for(int x=0; x<usuarios.length && match==false; x++) {
				 
		if(usuarios[x].equals(cad1)==true && claves[x].equals(pass1)==true) 
					
		 match=true;
				  
		
	 }
					
		if(e.getSource()==boton1) {
			
			 if(match==true) {
				 
				 setTitle("CORRECTO");
			
		}else {
			setTitle("INCORRECTO");
			}
		}
	}	
			
			
	
		
		/*if(e.getSource()==t2) {
			
		for(y=0; y<claves.length && match==false; y++) {
			
				 pass1=t2.getText(); 
				 
				 if(pass1==claves[y]) {
						match=true;
					System.out.println(match);	
						
					}
			  
				 }
		
				 
		}*/
		
		
	
			
		
	public static void main(String[] args) {
		EjerContrasenia grafica1=new EjerContrasenia();
		grafica1.posicionar();
		grafica1.setTitle("Ejercicio Interfaz Gráfica");
		grafica1.setBounds(10,10,400,300); 
		grafica1.setVisible(true); 
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		

	}
	

}
