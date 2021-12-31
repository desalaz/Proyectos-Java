package tema7;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
public class CuadradosCirculos extends JFrame {
	public void paint(Graphics g) { 
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(20, 100, 30, 30);
		g.drawOval(20, 50, 30, 30);	
		g.setColor(Color.GREEN);
		g.fillRect(150, 100, 30, 30);
		g.drawRect(150, 50, 30, 30);		
	}
		
	public static void main(String[] args) {
		CuadradosCirculos obj = new CuadradosCirculos();	
		obj.setTitle("Cuadrados y Circulos");
		obj.setBounds(50,50,300, 300);
		obj.setVisible(true);
        obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


