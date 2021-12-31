package tema7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EjerTextAreaTXT extends JFrame implements ActionListener {
	JTextArea txa;
	JTextField tf1;
	JButton btn1, btn2;
	JScrollPane scrollpane1;
	String cad1;
	String texto1, lineas="";
	String remplazo=" APRENDIENDO A PROGRAMAR ";
	
	EjerTextAreaTXT(){
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
		
		File fichero = new File("MiTexto.txt");
		Scanner s=null;
		try {
		
		s = new Scanner(fichero);
			 
		while(s.hasNextLine()==true) {
			 
		String linea= s.nextLine();
			lineas+=linea;
		}
		
			txa.setText(lineas);
		
		 }catch(FileNotFoundException exp) {
				
			exp.printStackTrace();
				
		}finally{
				
				s.close();
				
			}
		
		}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
				
			//Primer evento
		if(e.getSource()==btn1) {
			cad1=tf1.getText();
			texto1=txa.getText();
			
		if(texto1.indexOf(cad1)== -1) {
			setTitle("No existe la palabra en el texto");
				
		}else {
				setTitle("Si existe la palabra en el texto");
			}
		
		}else if(e.getSource()==btn2) {
					
					try {
						
						txa.replaceRange(remplazo, 100, 135);
						
					}catch(IllegalArgumentException error) {
					setTitle("Los limites para el remplazo son incorrectos");
						error.printStackTrace();
					}
			
		}
		
	}
		
	
		
		

	
	public static void main(String[] args){
		EjerTextAreaTXT grafica1=new EjerTextAreaTXT();
		grafica1.posicionar();
		grafica1.setTitle("TextAreaTXT");
		grafica1.setBounds(10, 10, 600, 600);
		grafica1.setVisible(true);
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}
