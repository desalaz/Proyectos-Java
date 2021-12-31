package packprimero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class ContraAsteriscos extends JFrame implements ActionListener, KeyListener {
	JLabel label1, label2;
	JTextField tx1;
	JPasswordField pswfield1;
	JButton boton1;
	boolean encontrado=false;
	 String [] usuarios= {"Eider", "Leire", "Durana","Andrea"};
	 String [] claves= {"abc1", "1234","9876","xxzz"};
	
	ContraAsteriscos(){
	 setLayout(null);
	}
	
	void posicionar() {
		label1=new JLabel("Usuario:");   	
		label1.setBounds(20,30,120,40); 
		add(label1); 
		label2=new JLabel("Contraseña:");
		label2.setBounds(20,70,100,40);
		add(label2); 
		
		tx1=new JTextField();
		tx1.setBounds(100,40,150,30);
		add(tx1);
		tx1.addActionListener(this);
		
		pswfield1=new JPasswordField ();
		pswfield1.setBounds(100,80,150,30);
		add(pswfield1);
		pswfield1.addActionListener(this);
		
		boton1=new JButton("Confirmar");
	    boton1.setBounds(100,150,150,30);
	    add(boton1);
	    boton1.addActionListener(this); 
	    boton1.addKeyListener(this);
	}
	


	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent e) {
		
	if (e.getSource()==tx1) tx1.transferFocus();
		
	if (e.getSource()==pswfield1) pswfield1.transferFocus();

	String cad1=tx1.getText();
	char [] contrasenia=pswfield1.getPassword();	
	String cad2 = new String(contrasenia);
			
	for (int x=0; x<usuarios.length && encontrado==false; x++) {
		
	if (usuarios[x].equals(cad1)==true && claves[x].equals(cad2)==true){
		encontrado=true;
		}
		
	}
	
		
	if (e.getSource()==boton1) {
		boton1.transferFocus();
		
		if(encontrado==true) {
			setTitle("CORRECTO");
		}else {
			setTitle("INCORRECTO");
		}
	}
		
 }
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		int num=e.getKeyCode();		//Este metodo nos devuelve el codigo (un entero) de la tecla que ha sido pulsada
		//System.out.println(num);
		
		if(num==0) {			//Una vez confirmado el numero de la tecla que necesito (Enter=0) realizo la condicion
				
			if(encontrado==true) {
				setTitle("CORRECTO");
			}else {
				setTitle ("INCORRECTO");
			}	
		}
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}	
	

	
	public static void main(String[] args) {
	ContraAsteriscos grafica1=new ContraAsteriscos();
	grafica1.posicionar();
	grafica1.setBounds(10,10,400,300); 
	grafica1.setVisible(true); 
	grafica1.setResizable(false);
	grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	
	}

}
