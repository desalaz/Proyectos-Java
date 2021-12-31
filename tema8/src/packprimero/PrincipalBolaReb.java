package packprimero;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class PrincipalBolaReb extends JFrame implements ActionListener{

	BolaRebota bola=new BolaRebota();
	Timer tiempo;
	int intervalo= 4;    //este int se transforma en milisigundos
	
	JButton btn1= new JButton("Iniciar");
	JButton btn2= new JButton("Detener");
	JPanel panel2= new JPanel();
	
	PrincipalBolaReb (){
		
		add(bola);
		tiempo=new Timer(intervalo, new Accion ());
		//tiempo.start();
		
		btn1.setBounds(5, 30, 30, 40);
		btn1.addActionListener(this);
		btn2.setBounds(40, 30, 30, 40);
		btn2.addActionListener(this);
		
		panel2.setBounds(10, 10, 100, 100);
		panel2.setVisible(true);
		panel2.add(btn1);
		panel2.add(btn2);
		add(panel2, BorderLayout.NORTH);
				
		
	}
	
	class Accion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			bola.moverBola();
			bola.repaint();
			
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		PrincipalBolaReb obj =new PrincipalBolaReb();
		obj.setBounds(0,0,200,600);
		obj.setVisible(true);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		 if (event.getSource()==btn1) {
			 tiempo.start();
			 
		 } else {
			 
			 tiempo.stop();
		 }
	}
}
