package packprimero;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

	@SuppressWarnings("serial")
	public class Bola2 extends JPanel {

	@Override
	public void paint(Graphics g) {
	super.paint(g);
	Graphics2D g2d = (Graphics2D) g;
	g2d.setColor(Color.BLUE);			
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes de la bola
	g2d.fillOval(30, 50, 30, 30);
	
			
	}
	public static void main(String[] args) {
		JFrame ventana=new JFrame();			
		ventana.setBounds(0,0,300, 300);
		ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		Bola2 obj = new Bola2();
		ventana.add(obj);
		
	}

}
