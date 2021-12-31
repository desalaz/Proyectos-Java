package packprimero;

import javax.swing.JFrame;

public class Bola4 extends JFrame{

	Bola3 bola=new Bola3();	
	
	Bola4(){
	add(bola);
		
	}
	public static void main(String[] args) {	
		
		Bola4 obj = new Bola4();				
		obj.setBounds(0,0,300, 300);
		obj.setVisible(true);
	    obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}

	}



