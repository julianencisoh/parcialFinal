package model;

import processing.core.PApplet;

public class Sanas extends Figura {

	private PApplet appCinco;
	private int posx;
	private int posy;
	private int colores;
	private int tamx;
	private int tamy;
	private int dirx;
	private int diry;

	public Sanas(int tamX, int tamY, int colorRandom, int posx, int posy, PApplet appDos) {
		super(tamX, tamY, colorRandom, posx, posy, appDos);

		this.posx = posx;
		this.posy = posy;
		this.colores = colorRandom;
		this.tamx = tamX;
		this.tamy = tamY;
		this.appCinco = appDos;
		dirx = (int) appCinco.random(1, 5);
		diry = (int) appCinco.random(1, 5);

	}

	public void mover() {

		posx = posx + dirx;
		posy = posy + diry;

		if (posx < 57 || posx > 493) {

			dirx = dirx * (-1);

		}
		if (posy < 57 || posy > 493) {

			diry = diry * (-1);

		}
		
		setPosix(posx);
		setPosiy(posy);

	}

	public void draw() {

		appCinco.fill(colores);
		appCinco.ellipse(posx, posy, tamx, tamy);
	}

	public int compareTo(Figura f) {

		return 0;
	}

}