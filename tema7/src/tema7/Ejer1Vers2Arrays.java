package tema7;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Ejer1Vers2Arrays extends JFrame {
	
	private JLabel[] label=new JLabel[3];
	private String [] empresas= {"El Corte Ingles", "Doloitte", "Ceinmark"};
	
	int fila=5;
	
	public Ejer1Vers2Arrays(){
		setLayout(null);
	}
	
	void obtener() {
		for (int x=0; x<label.length;x++) {
			label[x]=new JLabel(empresas[x]);
			label[x].setBounds(10, fila, 100, 50);
			add(label[x]);
			fila+=40;
				
			}
		
	}
	
	public static void main(String[] ar) {
		Ejer1Vers2Arrays grafica1=new Ejer1Vers2Arrays();
		grafica1.obtener();
		grafica1.setBounds(10,10,400,300); 
		grafica1.setVisible(true); 
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	
	}
	
	
}
