package controller;

import excepciones.ExceptionOne;
import excepciones.ExceptionTwo;
import model.Logic;
import processing.core.PApplet;
import view.Main;

public class MainController {

	private PApplet app;
	private Logic logic;

	public MainController(Main main) {
		app = main;
		logic = new Logic(app);
	}

	public void draw() {

		logic.draw();
	}

	public void mouseClicked() {
		logic.mouseCliked();
	}

	public void keyPressed(char key) {

		if (key == 'n') {
			logic.ordenarNatural();

		} else if (key == 'p') {
			logic.ordenarParcial();
		}
	}

	public void llamarExcepcionUno() throws ExceptionOne {
		
		logic.excepcionUno();
	}
	
	public void llamarExcepcionDos() throws ExceptionTwo {
		
		logic.excepcionDos();
	}
	
	
	
	
}
