package packprimero;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;


	public class Bola1 extends JFrame {

	@Override
	public void paint(Graphics g) {
	super.paint(g);
	Graphics2D g2d = (Graphics2D) g;
	g2d.setColor(Color.RED);			
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes de la bola
	g2d.fillOval(50, 60, 30, 30);	//columna (x), fila (y), ancho, alto
	//g2d.drawOval(30, 50, 30, 30);	// columna (x), fila (y), ancho, alto	
		}
		public static void main(String[] args) {
			
			Bola1 obj = new Bola1();	
			
			obj.setBounds(0,0,300, 300);
			obj.setVisible(true);
            obj.setResizable(false);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

