package model;

import java.util.LinkedList;

import excepciones.ExceptionOne;
import excepciones.ExceptionTwo;
import processing.core.PApplet;

public class Logic {

	private LinkedList<Figura> figuras;
	private LinkedList<Figura> figurasDos;
	private String texto[];
	private PApplet appDos;

	public Logic(PApplet app) {
		appDos = app;
		figuras = new LinkedList<Figura>();
		figurasDos = new LinkedList<Figura>();
		texto = appDos.loadStrings("../archivos/textoUno.txt");
	}

	public void leerTxt() {

		for (int i = 0; i < texto.length; i++) {
			String[] separaPalabras = texto[i].split(",");

			String tipoFigura = separaPalabras[0];
			int tamX = Integer.parseInt(separaPalabras[1]);
			int tamY = Integer.parseInt(separaPalabras[2]);

			// Llenar si la Figura es un cuadrado o circulo

			int r = (int) (appDos.random(0, 255));
			int g = (int) (appDos.random(0, 255));
			int b = (int) (appDos.random(0, 255));
			int colorRandom = appDos.color(r, g, b);
			int posx = (int) (appDos.random(0, 450));
			int posy = (int) (appDos.random(0, 450));

			if (separaPalabras[0].contentEquals("Cuadrado")) {
				figuras.add(new Cuadrado(tamX, tamY, colorRandom, posx, posy, appDos));
			} else if (separaPalabras[0].contentEquals("Circulo")) {
				figuras.add(new Circulo(tamX, tamY, colorRandom, posx, posy, appDos));
			}

		}

	}

	public void draw() {

		appDos.background(0);
		
		for(int i = 0; i < figuras.size(); i++) {
			figuras.get(i).draw();
		
		Thread primerHilo;
		primerHilo=new Thread(figuras.get(i));
		primerHilo.start();
		
		}
		
	}

	public void ordenarNatural() {

	}

	public void ordenarParcial() {

	}

	public void mouseCliked() {

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

}
