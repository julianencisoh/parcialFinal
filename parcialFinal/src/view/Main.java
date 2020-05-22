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
		if(primerMensaje == true) {
			
		}else if (segundoMensaje == true) {
			
		}
	}

	public void mouseClicked() {
		mainController.mouseClicked();
	}

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
