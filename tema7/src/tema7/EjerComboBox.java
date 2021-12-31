package tema7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class EjerComboBox extends JFrame implements ActionListener {
	
	JComboBox cbox1;
	
	EjerComboBox(){
		setLayout(null);
	}
	
	
	void posicionar() {
		
		cbox1=new JComboBox();
		cbox1.setBounds(180,80,150,20);	
		add(cbox1);	
		cbox1.addActionListener(this);
		
		cbox1.addItem(" ");	
		cbox1.addItem("Madrid");
		cbox1.addItem("Barcelona");	
		cbox1.addItem("Valencia");	
	}	
	
		@Override
	public void actionPerformed(ActionEvent e) {
			
		String opcion=(String)cbox1.getSelectedItem();
		setTitle(opcion);
		
	}
	
	
	public static void main(String[] args) {
		EjerComboBox grafica1=new EjerComboBox();
		grafica1.posicionar();
		grafica1.setTitle("Combo Box");
		grafica1.setBounds(10, 10, 600, 400);
		grafica1.setVisible(true);
		grafica1.setResizable(false);
		grafica1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
