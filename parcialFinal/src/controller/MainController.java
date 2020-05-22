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



	public void keyPressed(char key) {

		if (key == 'c') {
			logic.ordenarNatural();

		} else if (key == 'p') {
			logic.ordenarParcial();
		}
	}
	
	
public int contadorSanas() {
		
		
		logic.getPersonasSanas();
		
		return logic.getPersonasSanas();
	}

public int contadorInfectadas() {
	
	
	logic.getPersonasInfectadas();
	
	return logic.getPersonasInfectadas();
}

public int contadorRecuperadas() {
	
	
	logic.getPersonasRecuperadas();
	
	return logic.getPersonasRecuperadas();
}


	public void llamarExcepcionUno() throws ExceptionOne {
		
		logic.excepcionUno();
	}
	
	public void llamarExcepcionDos() throws ExceptionTwo {
		
		logic.excepcionDos();
	}
	
	
}

