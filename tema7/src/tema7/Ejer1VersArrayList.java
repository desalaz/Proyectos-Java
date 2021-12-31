package tema7;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer1VersArrayList extends JFrame {

	ArrayList <JLabel> label=new ArrayList<JLabel>();
	String [] empresas= {"El corte Ingles", "Doloitte", "Ceinmark"};
	int fila=5;
	
	public Ejer1VersArrayList() {
		setLayout(null);
		
	}
	
	void obtener() {
		
		for(int x=0; x<empresas.length;x++) {
			label.add(new JLabel(empresas[x]));
			label.get(x).setBounds(10,fila,100,50);
			add(label.get(x));
			fila+=40;
			//System.out.println(empresas[x]);
		}
	
	
	}
	
	public static void main(String[] ar) {
		Ejer1VersArrayList grafica1=new Ejer1VersArrayList();
		grafica1.obtener();
		grafica1.setBounds(10,10,400,300); 
		grafica1.setVisible(true); 
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}
	
	
	
}
