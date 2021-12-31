package tema7;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ejer1VersArrays extends JFrame {
	
	private JLabel [] label= { new JLabel("El Corte Ingles"), new JLabel( "Doloitte"),new JLabel("Ceinmark")};

	int fila=5;
	
	public Ejer1VersArrays(){
		setLayout(null);
	}
	
	
	void obtener() {
		for (int x=0; x<label.length;x++) {
			label[x].setBounds(10, fila, 100, 50);
			add(label[x]);
			fila+=40;
				
			}
	}
	
	
	public static void main(String[] ar) {
		Ejer1VersArrays grafica1=new Ejer1VersArrays();
		grafica1.obtener();
		grafica1.setBounds(10,10,400,300); 
		grafica1.setVisible(true); 
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	
	}
	
	
}
