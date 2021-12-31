package packprimero;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

import javax.swing.JFrame;
import javax.swing.JPanel;
	@SuppressWarnings("serial")
	public class Bola5 extends JPanel {
		private String passw;
		private static Color c=Principal.getC();
		private int x = (int) (Math.random() * 490);
		private int y = (int) (Math.random() * 430);
		private int distx = 1;
		private int disty = 1;
		private int w=Principal.getAncho();
		private int h=Principal.getAlto();
		
		private int wbola=Principal.getWbola();
		private int hbola=Principal.getHbola();
		
	public void moverBola() { 
					
		/*	 
		 int num=(int) (Math.random() * 300); //De este modo los números random al ser el mismo el
		 									 // recorrido es en la misma trayectoria
			x = num;
			y = num;	
			*/
		/*	 
			 x= (int) (Math.random() * 300);
			 y= (int) (Math.random() * 300);
			 */
			 
		
	/*	x=x+1;			//Este modo es el que simula el desplazamiento de la bola
		x=x+2;
				*/
		
		
		
		x= x+distx;
		y= y+disty; 
		
		if(x==(w-50)) {
		distx =-distx;
		}
			
		if(x==0) {
		distx = 1;
		}
		
		if(y==(h-55)) {
		 disty = -disty;	
		}
		
		if(y==0) {
			disty = 1;
		}
		
	}
	
	
	
		@Override
		public void paint(Graphics g) {
		super.paint(g); 
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(getC());
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);//suaviza los bordes de la bola
		g2d.fillOval(x, y, wbola, hbola);
			
		}
	
		public Color getC() {
			return c;
		}

		public void setC(Color c) {
			if(!getPassw().equals("")) {
				this.c = c;
			}
					
		}

		public String getPassw() {
			return passw;
		}

		public void setPassw(String passw) {
			this.passw = passw;
		}	
		
		
	}
	
	

