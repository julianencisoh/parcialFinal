package model;

import processing.core.PApplet;

public abstract class Figura implements Runnable, Comparable<Figura> {

	private int posix;
	private int posiy;
	private int tamanioX;
	private int tamanioY;
	private int colorFigura;
	private int dirX;
	private int dirY;
	private PApplet appTres;

	public Figura(int tamX, int tamY, int colorRandom, int posx, int posy, PApplet appDos) {
		posix = posx;
		posiy = posy;
		tamanioX = tamX;
		tamanioY = tamY;
		colorFigura = colorRandom;

	}

	public int getPosix() {
		return posix;
	}

	public void setPosix(int posix) {
		this.posix = posix;
	}

	public int getPosiy() {
		return posiy;
	}

	public void setPosiy(int posiy) {
		this.posiy = posiy;
	}

	public int getTamanioX() {
		return tamanioX;
	}

	public void setTamanioX(int tamanioX) {
		this.tamanioX = tamanioX;
	}

	public int getTamanioY() {
		return tamanioY;
	}

	public void setTamanioY(int tamanioY) {
		this.tamanioY = tamanioY;
	}

	public int getColorFigura() {
		return colorFigura;
	}

	public void setColorFigura(int colorFigura) {
		this.colorFigura = colorFigura;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getDirY() {
		return dirY;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}

	public PApplet getAppTres() {
		return appTres;
	}

	public void setAppTres(PApplet appTres) {
		this.appTres = appTres;
	}

	public void draw() {

	}

	public void mover() {

	}

	public void run() {
		mover();
	}

}
