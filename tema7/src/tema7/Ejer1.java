package tema7;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer1 extends JFrame {
	
	private JLabel label1, label2, label3;
	
	
	public Ejer1(){
		
		setLayout(null); 
	 
	}
	
	
	void obtener() {
		
		label1=new JLabel("El Corte Ingles");   	
		label1.setBounds(10,20,100,40); 
		add(label1); 
		label2=new JLabel("Deloitte");
		label2.setBounds(10,50,100,40);
		add(label2); 
		label3=new JLabel("Ceinmark");
		label3.setBounds(10,80,100,40);
		add(label3); 
		
}    

	public static void main(String[] ar) {
		Ejer1 grafica1=new Ejer1();
		grafica1.obtener();
		grafica1.setBounds(10,10,400,300); 
		grafica1.setVisible(true); 
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}
}

