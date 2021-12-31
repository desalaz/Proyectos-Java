package tema7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EjerSumarDosNumeros extends JFrame implements ActionListener{
	JLabel label1, label2, label3;
	JTextField t1,t2,t3;
	JButton btn1, btn2;
	String cadena1, cadena2;
	
	EjerSumarDosNumeros(){
		setLayout(null);
	}
	
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
		btn1.setBounds(140, 180, 100, 40);
		add(btn1);
		btn1.addActionListener(this);
		
		btn2=new JButton("Borrar");
		btn2.setBounds(250, 180, 100, 40);
		add(btn2);
		btn2.addActionListener(this);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		cadena1=t1.getText();	
		cadena2=t2.getText();
		
		try {
			
		int n1=Integer.parseInt(cadena1);
		int n2=Integer.parseInt(cadena2);
		int suma;
		suma=(n1+n2);
		
		if(e.getSource()==btn1) {
		String result=String.valueOf(suma);	
		
		 t3.setText(result);	
		 
		}  else if(e.getSource()==btn2) {
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
		}
		
	}catch(NumberFormatException excp) {
			setTitle("Teclea números");
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);	
		}
	}
	
	
	public static void main (String[] args) {
		EjerSumarDosNumeros grafica1=new EjerSumarDosNumeros();
		grafica1.posicionar();
		grafica1.setTitle("SUMAR DOS NÚMEROS");
		grafica1.setBounds(10, 10, 600, 400);
		grafica1.setVisible(true);
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	
	
	
	
}
