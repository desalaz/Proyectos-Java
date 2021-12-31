package packprimero;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class PrincipalContrasenia extends JFrame implements ActionListener {

	String passw;
	
	Contrasenia bola=new Contrasenia();
	JTextField tx1= new JTextField();
	JLabel lb= new JLabel("Contraseña");
	JPanel panel2= new JPanel();
	
	PrincipalContrasenia(){
		tx1.setBounds(80, 20, 80, 40);	
		lb.setBounds(80, 50, 100, 50);
		panel2.setLayout(null);
		panel2.setVisible(true);
		panel2.add(tx1);
		panel2.add(lb);
		add(panel2);
		tx1.addActionListener(this);
	}
	
	public void repetir() {
		for(;;) { 					//colocar un bucle infinito for(;;){} es lo mismo while(true) {}
			
			bola.moverBola();
			bola.repaint();
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			  }
		   }	
		}
		
	
	
	
	public static void main(String[] args) {
		
		PrincipalContrasenia obj=new PrincipalContrasenia();	
		obj.setBounds(0, 0, 300, 300);
		obj.setVisible(true);
        obj.setResizable(false);				
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.repetir();
		

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
