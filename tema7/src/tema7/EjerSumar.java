//Se trata de crear una Interfaz gráfica para sumar dos numeros y mostrar el resultado
//Controlar que no se produzca una Exception al pulsar el botón y no haber
//caracteres numéricos en los JTextField correspondientes.Si es le caso
//debe aparecer en la barra de titulo: "Teclea números".

package tema7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class EjerSumar extends JFrame implements ActionListener{

	
	EjerSumar(){
		setLayout(null);
	}
	
	JLabel label1, label2, label3;
	JTextField t1,t2,t3;
	JButton btn1;
	String cad1, cad2;
	
	
	void posicionar() {
	label1=new JLabel("Primer Número:");
	label1.setBounds(10, 20, 100, 30);
	add(label1);
	
	label2=new JLabel("Segundo Número:");
	label2.setBounds(10, 80, 130, 30);
	add(label2);
	
	label3=new JLabel("Resultado:");
	label3.setBounds(250, 45, 100, 30);
	add(label3);
	
	t1=new JTextField();
	t1.setBounds(120, 20, 100, 40);
	add(t1);
	
	
	t2=new JTextField();
	t2.setBounds(120, 80, 100, 40);
	add(t2);
	
	
	t3=new JTextField();
	t3.setBounds(320, 45, 100, 40);
	add(t3);
	
	
	btn1=new JButton("Sumar");
	btn1.setBounds(180, 180, 100, 40);
	add(btn1);
	btn1.addActionListener(this);
 }
	

	
	@Override
	public void actionPerformed (ActionEvent e) {
		
	cad1=t1.getText();	
	cad2=t2.getText();
	
	try {
		
	int n1=Integer.parseInt(cad1);
	int n2=Integer.parseInt(cad2);
	int suma=0;
		
	suma=(n1+n2);
	
	String result=String.valueOf(suma);	
	
	 t3.setText(result);	
	 
	}catch(NumberFormatException excp) {
		
		//System.out.println(excp);
		
		setTitle("Teclea números");
		
		}
	
	}
	
	
	public static void main (String[] args) {
		EjerSumar grafica1=new EjerSumar();
		grafica1.posicionar();
		grafica1.setBounds(10, 10, 600, 400);
		grafica1.setVisible(true);
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}

}
