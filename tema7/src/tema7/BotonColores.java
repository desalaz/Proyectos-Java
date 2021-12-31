package tema7;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class BotonColores extends JFrame implements ActionListener {
	JComboBox cbox1, cbox2, cbox3;
	JLabel label1, label2, label3;
	JButton btn;
		
	BotonColores(){
		setLayout(null);
	}
	
	void posicionar() {
		
		label1=new JLabel("Rojo:");   	
		label1.setBounds(10,20,100,40); 
		add(label1); 
		label2=new JLabel("Verde:");
		label2.setBounds(10,80,100,40);
		add(label2); 
		label2=new JLabel("Azul:");
		label2.setBounds(10,140,100,40);
		add(label2); 
		
		cbox1=new JComboBox();
		cbox1.setBounds(60,35,50,20);	
		add(cbox1);	
		//cbox1.addActionListener(this);
		
		cbox2=new JComboBox();
		cbox2.setBounds(60,95,50,20);	
		add(cbox2);	
		
		
		cbox3=new JComboBox();
		cbox3.setBounds(60,155,50,20);	
		add(cbox3);	
		
		 btn=new JButton("Fijar Color");
	     btn.setBounds(20,230,100,30);
	     add(btn);
	     btn.addActionListener(this); 
		
	}
	
	void rellenar() {
		 for (int x=1; x<=255; x++) {
			 cbox1.addItem(x);
			 cbox2.addItem(x);
			 cbox3.addItem(x);
		 }
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		 Integer r=(Integer)cbox1.getSelectedItem();
		 Integer v=(Integer)cbox2.getSelectedItem(); 
		 Integer a=(Integer)cbox3.getSelectedItem();
		
		//Color colores=new Color(r, v, a);
		
		btn.setBackground(new Color(r, v, a));
		
		
	}
	
	public static void main(String[] args) {
		BotonColores grafica1=new BotonColores();
		grafica1.posicionar();
		grafica1.rellenar();
		grafica1.setTitle("Boton Colores");
		grafica1.setBounds(10, 10, 400, 400);
		grafica1.setVisible(true);
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	
	
	
	
	
}
