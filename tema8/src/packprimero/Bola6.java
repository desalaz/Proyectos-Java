package packprimero;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

import javax.swing.*;
public class Bola6 extends JFrame  implements ActionListener   {         
	Scanner teclado = new Scanner(System.in);
	String passw;
	int veloc=10;
	int wbola;
	int hbola;
	
	public int getVeloc() {
		return veloc;
	}

	public void setVeloc(int veloc) {
		this.veloc = veloc;
	}



	Bola5 bola=new Bola5();
	JTextField tx1= new JTextField();
	JLabel lb= new JLabel("Contraseña");
	JPanel panel2= new JPanel();
	

	Bola6(){
	tx1.setBounds(80, 20, 80, 40);	
	lb.setBounds(80, 50, 100, 50);
	panel2.setLayout(null);
	panel2.setVisible(true);
	panel2.add(tx1);
	panel2.add(lb);
	add(panel2);
	tx1.addActionListener(this);
		
	}
	
	public int teclear() {
		System.out.println("Teclea la velocidad de la bola:");
		veloc=teclado.nextInt();
		return veloc;	
	}
	
	
	public void repetir() {
	for(;;) { 					//colocar un bucle infinito for(;;){} es lo mismo while(true) {}
		
		bola.moverBola();
		bola.repaint();
		
		
		
		try {
			Thread.sleep(veloc);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		  }
	   }	
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		panel2.setVisible(false);
		passw=tx1.getText();	
		Color c= Color.GREEN;
		bola.setPassw(passw);
		bola.setC(c);
		add(bola);
		if(passw.equals(""))
		setTitle("No se puede cambiar el color");
		
		}

	
	}			

