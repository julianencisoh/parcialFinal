package model;

import processing.core.PApplet;

public abstract class Figura implements Runnable {

	private int posix;
	private int posiy;
	private int tamanioX;
	private int tamanioY;
	private int colorFigura;
	private int dirX;
	private int dirY;
	private PApplet appTres;

	public Figura(int tamX, int tamY, int colorRandom, int posx, int posy, PApplet appDos) {

	}

	public void draw() {

	}

	public void mover() {

	}

	public void run() {
		mover();
	}

}
