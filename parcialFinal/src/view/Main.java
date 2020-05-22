package view;

import controller.MainController;
import excepciones.ExceptionOne;
import excepciones.ExceptionTwo;
import processing.core.PApplet;

public class Main extends PApplet {

	private MainController mainController;

	boolean primerMensaje;
	boolean segundoMensaje;
	
	public static void main(String[] args) {
		PApplet.main("view.Main");
	}

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		mainController = new MainController(this);
		primerMensaje = false;
		segundoMensaje = false;
	}

	public void draw() {
		
		
		mainController.draw();
		
		fill(255);
		rect(0,0,500,55);
		fill (100);
		textSize(10);
		text("Sanos" + mainController.contadorSanas(),10,10);
		text("Infectados" + mainController.contadorInfectadas(),90,10);
		text("Recuperados" + mainController.contadorRecuperadas(),200,10);
		
	}
	
	
	
	
	/*
	 *public void draw() {
		
		mc.draw();
		verficarchoque();
		if (mensaje1==true) {
			//coloco el txt
			
		}else if (mensaje2==true) {
			
			
		}
		fill(255);
		noStroke();
		
		rect(0,0,600,100);
		
		
		fill (15);
		textSize(10);
		text("Sanos" + mc.contadors(),10,10);
		
	} 
	 * 
	 * */
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void keyPressed() {
		mainController.keyPressed(key);
	}
	
	public void TraerExcepcionUno() {
		
		try {
			mainController.llamarExcepcionUno();
		}catch(ExceptionOne e){
			primerMensaje = true;
			e.printStackTrace();
		}
	}
	
	public void TraerExcepcionDos() {
		try {
			mainController.llamarExcepcionDos();
		} catch (ExceptionTwo e) {
			segundoMensaje = true;
			e.printStackTrace();
		}
	}

}
