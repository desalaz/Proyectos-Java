package packprimero;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.*;

@SuppressWarnings("serial")
public class BolaRebota extends JPanel{
 int x = 6;
 int y = 11;
 int distx=1;
 int disty=1;
 
 public void moverBola() {
	 x= x+distx;
	 y= y+disty;
	 
	 if(x==(155)) {
		distx =-distx;
	 }
				
	if(x==6) {
	distx = 1;
	}
	 
	if(y==(490)) {
	disty = -disty;	
		}
		
	if(y==10) {
	disty = 1;
	}
	 
	
 }
	@Override
	public void paint(Graphics g) {
		super.paint (g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 25, 25);
		g2d.setColor(Color.BLACK);
		g2d.drawRect(4, 10, 175, 510);
		
	}
	
}
