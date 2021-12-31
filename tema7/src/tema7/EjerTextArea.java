package tema7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjerTextArea extends JFrame implements ActionListener{
	JTextArea txa;
	JTextField tf1;
	JButton btn1, btn2;
	JScrollPane scrollpane1;
	String cad1;
	String texto1;
	String remplazo="Desde el cielo tus ojos me guian";
	
	EjerTextArea(){
		setLayout(null);
	}
	
	void posicionar() {
		
	txa=new JTextArea();
	scrollpane1=new JScrollPane(txa);
	scrollpane1.setBounds(80,50,400,300);	
	add(scrollpane1);	
	txa.setLineWrap(true);	
		
	tf1=new JTextField();
	tf1.setBounds(20, 400, 150, 20);
	add(tf1);
	
	btn1=new JButton("Buscar");
	btn1.setBounds(200, 440, 100, 40);
	add(btn1);
	btn1.addActionListener(this);
			
	btn2=new JButton("Remplazar");
	btn2.setBounds(200, 500, 100, 40);
	add(btn2);
	btn2.addActionListener(this);
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1) {
			cad1=tf1.getText();
			texto1=txa.getText();
		
		if(texto1.indexOf(cad1)== -1) {
			setTitle("No existe la palabra en el texto");
			
		}else {
			setTitle("Si existe la palabra en el texto");
		}
		
		}else {
			
			try {
				
				txa.replaceRange(remplazo, 100, 135);
				
			}catch(IllegalArgumentException error) {
				setTitle("Los limites para el remplazo son incorrectos");
				
			}	
			
		}	
		
	}
	
	
	public static void main(String[] args) throws Exception{
		EjerTextArea grafica1=new EjerTextArea();
		grafica1.posicionar();
		grafica1.setTitle("TextArea");
		grafica1.setBounds(10, 10, 600, 600);
		grafica1.setVisible(true);
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}


}
