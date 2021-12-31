package packprimero;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TresBolas extends JPanel {

	 int x = 10;
	 int y = 10;
	
	 int x1 = 120;
	 int y1 = 10;
	 
	 int x2 = 240;
	 int y2 = 10;
	 
	 int distx = 1;
	 int disty = 1;
	  
	 int distx1=1;
	 int disty1=1;
	
	 int distx2=1;
	 int disty2=1;

	
	public void moverBola() { 
					
			x= x+distx;
			y= y+distx;
			
			
			if(x==250) {
			distx =-distx;
				
			}
					
			if(x==0) {
			distx = 1;
				
			}	
				
			if(y==250) {
			disty = -disty;
					 
			}
					
			if(y==0) {
			disty = 1;
						
			}
			
			
	//  <!----------------------------------------------------------------->				
				//x1=x1+distx1;
				y1=y1+disty1;	
					
				if (y1==250) {
				disty1=-disty1;
				}
				
				if(y1==0) {
				disty1= 1;
				}
	//  <!----------------------------------------------------------------->					
			
				x2= x2-distx2;		//x es columna
				y2= y2+distx2;		// y es fila
				
				
				if(y2==250) {
				distx2 =-distx2;
					
				}
				
				if(x2==250) {
					distx2 = 1;
								
				}
				
		} 
	 
	 
	 
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d=(Graphics2D) g;
		Graphics2D g2d1=(Graphics2D) g;
		Graphics2D g2d2=(Graphics2D) g;
		
		
		if(x < 120) {
			
		g2d.setColor(Color.MAGENTA);
		
		}else {
			g2d.setColor(Color.GREEN);
			
		}
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);	
			
			
		if(y1 < 100) {
			
			g2d1.setColor(Color.PINK);
			
			}else {
				g2d1.setColor(Color.BLACK);
				
			}
			
			g2d1.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
			g2d1.fillOval(x1, y1, 30, 30);		
		
			
		if(x2 > 120) {
			g2d2.setColor(Color.ORANGE);
		}else {
			g2d2.setColor(Color.CYAN);
		}
		
		g2d2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2d2.fillOval(x2, y2,30,30);	
			
	}
	
		
	
		
	public static void main(String[] args) {
		JFrame miventana=new JFrame();			
		miventana.setBounds(0,0,300, 300);
		miventana.setVisible(true);
        miventana.setResizable(false);
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       TresBolas obj=new TresBolas();
       miventana.add(obj);
  
     	for(;;) {
     		obj.moverBola();
     		obj.repaint();
     	 
     		try {

				Thread.sleep(5);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			  }		
     	
     	} 
   }
             
	
}
