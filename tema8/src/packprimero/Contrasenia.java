package packprimero;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Contrasenia extends JPanel{
		private String passw;
		private Color c=Color.RED;
		private int x = (int) (Math.random() * 210);
		private int y = (int) (Math.random() * 200);
		private int distx = 1;
		private int disty = 1;
		
		@Override
		public void paint(Graphics g) {
			super.paint(g); 
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(c);
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes de la bola
			g2d.fillOval(x, y, 30, 30);
				
			}
	
		public void moverBola() {
			
			x= x+distx;
			y= y+disty; 
			
			if(x==(250)) {
			distx =-distx;
			}
				
			if(x==0) {
			distx = 1;
			}
			
			if(y==(250)) {
			 disty = -disty;	
			}
			
			if(y==0) {
				disty = 1;
			}	
			
			
			
		}

		public String getPassw() {
			return passw;
		}

		public void setPassw(String passw) {
			this.passw = passw;
		}

		public Color getC() {
			return c;
		}

		public void setC(Color c) {
			if(!getPassw().equals("")) {
				this.c = c;
			}
		}	
	
}
