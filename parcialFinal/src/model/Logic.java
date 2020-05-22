package model;

import java.util.LinkedList;

import excepciones.ExceptionOne;
import excepciones.ExceptionTwo;
import processing.core.PApplet;

public class Logic {

	private LinkedList<Figura> figuras;
	private String texto[];
	private PApplet appDos;
	private int personasSanas;
	private int personasInfectadas;
	private int personasRecuperadas;

	public Logic(PApplet app) {
		appDos = app;
		figuras = new LinkedList<Figura>();
		texto = appDos.loadStrings("../archivos/textoUno.txt");
		leerTxt();
	}

	public void leerTxt() {

		for (int i = 0; i < texto.length; i++) {
			String[] separaPalabras = texto[i].split(":");
			int tamFig = Integer.parseInt(separaPalabras[1]);

			// SANAS

			if (separaPalabras[0].contentEquals("sanas")) {

				int colorPersona = appDos.color(0, 255, 0);

				for (int k = 0; k < tamFig; k++) {
					int posicionx = (int) (appDos.random(1, 500));
					int posiciony = (int) (appDos.random(1, 500));
					figuras.add(new Sanas(7, 7, colorPersona, posicionx, posiciony, appDos));

				}
			}

			// INFECTADAS

			if (separaPalabras[0].contentEquals("infectadas")) {

				int colorPersona = appDos.color(0, 255, 0);

				for (int k = 0; k < tamFig; k++) {
					int posicionx = (int) (appDos.random(1, 500));
					int posiciony = (int) (appDos.random(1, 500));
					figuras.add(new Sanas(7, 7, colorPersona, posicionx, posiciony, appDos));

				}
			}

			// RECUPERADAS

			if (separaPalabras[0].contentEquals("recuperadas")) {
				int colorPersona = appDos.color(0, 255, 0);

				for (int k = 0; k < tamFig; k++) {
					int posicionx = (int) (appDos.random(1, 500));
					int posiciony = (int) (appDos.random(1, 500));
					figuras.add(new Sanas(7, 7, colorPersona, posicionx, posiciony, appDos));
                    }}}}
	

	public void draw() {

		appDos.background(0);

		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).draw();

			Thread primerHilo;
			primerHilo = new Thread(figuras.get(i));
			primerHilo.start();

		}
		appDos.textSize(25);
		
	/*	appDos.fill(0,255,0);
		appDos.rect(0, 0, 167, 55);
		appDos.fill(0);
		appDos.text("sanos", 10, 20); 
		
		
		appDos.fill(255,0,0);
		appDos.rect(167, 0, 167, 55);
		appDos.fill(0);
		appDos.text("infectados", 177, 20); 
		
		
		appDos.fill(0,0,255);
		appDos.rect(334, 0, 167, 55);
		appDos.fill(0);
		appDos.text("recuperados", 344, 20);
*/
	
	cuantosInfectados();
	}

	public void ordenarNatural() {

	}

	public void ordenarParcial() {

	}

	public void excepcionUno() throws ExceptionOne {

		// primer excepcion
		if (figuras.size() == 0) {
			throw new ExceptionOne("detente");
		}
	}

	public void excepcionDos() throws ExceptionTwo {

		// primer excepcion
		if (figuras.size() == 0) {
			throw new ExceptionTwo("detente");
		}
	}

	public void verificarchoque() {

		for (int i = 0; i < figuras.size(); i++) {
			for (int j = 0; j < figuras.size(); j++) {
				int distancia = figuras.get(i).getPosix();
				int distanciaUno = figuras.get(i).getPosiy();
				int distancias = figuras.get(j).getPosix();
				int distanciasDos = figuras.get(j).getPosiy();
				if (PApplet.dist(distancia, distanciaUno, distancias, distanciasDos) < 7) {

					if (figuras.get(i) != figuras.get(j)) {

						int direccion = figuras.get(j).getDirX();
						int direccionUno = figuras.get(j).getDirY();
						figuras.get(j).setDirX(direccion * (-1));
						figuras.get(j).setDirY(direccionUno * (-1));

						int direccionn = figuras.get(i).getDirX();
						int direccionnUno = figuras.get(i).getDirY();
						figuras.get(i).setDirX(direccionn * (-1));
						figuras.get(i).setDirY(direccionnUno * (-1));

					}}}}}
	
	
	

	public void cuantosInfectados() {
		personasSanas=0;
		personasRecuperadas=0;
		personasInfectadas=0;
		
		
		for (int j=0;j<figuras.size();j++) {
			
			if(figuras.get(j) instanceof Sanas) {
				
				personasSanas+=1;
				
			}
			
			if(figuras.get(j) instanceof Infectadas) {
				
				personasInfectadas+=1;
				
			}
			
			if(figuras.get(j) instanceof Recuperadas) {
				
				personasRecuperadas+=1;
				
			}
			
		}
		
	}

	public LinkedList<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(LinkedList<Figura> figuras) {
		this.figuras = figuras;
	}

	public String[] getTexto() {
		return texto;
	}

	public void setTexto(String[] texto) {
		this.texto = texto;
	}

	public PApplet getAppDos() {
		return appDos;
	}

	public void setAppDos(PApplet appDos) {
		this.appDos = appDos;
	}

	public int getPersonasSanas() {
		return personasSanas;
	}

	public void setPersonasSanas(int personasSanas) {
		this.personasSanas = personasSanas;
	}

	public int getPersonasInfectadas() {
		return personasInfectadas;
	}

	public void setPersonasInfectadas(int personasInfectadas) {
		this.personasInfectadas = personasInfectadas;
	}

	public int getPersonasRecuperadas() {
		return personasRecuperadas;
	}

	public void setPersonasRecuperadas(int personasRecuperadas) {
		this.personasRecuperadas = personasRecuperadas;
	}
	
}