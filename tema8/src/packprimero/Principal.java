package packprimero;

import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;

public class Principal {
	private static int ancho=500;
	private static int alto=500;
	private static int wbola=30;
	private static int hbola=30;
	private static Color c=Color.ORANGE;
	
	
	
	Principal(){
		
		
	}
	
	
	
	public static Color getC() {
		return c;
	}

	public static void setC(Color c) {
		Principal.c = c;
	}


	public static int getWbola() {
		return wbola;
	}


	public static void setWbola(int wbola) {
		Principal.wbola = wbola;
	}


	public static int getHbola() {
		return hbola;
	}


	public static void setHbola(int hbola) {
		Principal.hbola = hbola;
	}

	
	public static int getAncho() {
		return ancho;
	}
	public static void setAncho(int ancho) {
		Principal.ancho = ancho;
	}
	public static int getAlto() {
		return alto;
	}
	public static void setAlto(int alto) {
		Principal.alto = alto;
	}
	
	
	public static void main(String[] args)  {	
		
		Bola6 obj = new Bola6();				
		obj.setBounds(0,0,ancho,alto);
		obj.setVisible(true);
        obj.setResizable(false);				
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.teclear();
		obj.repetir();
		
	}

}
