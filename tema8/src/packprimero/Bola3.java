package packprimero;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

	@SuppressWarnings("serial")
	public class Bola3 extends JPanel {

	@Override
	public void paint(Graphics g) {
	Graphics2D g2d = (Graphics2D) g;
	g2d.setColor(Color.GREEN);			
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes de la bola
	g2d.fillOval(30, 50, 30, 30);
			
		}
	}
