package prova;

import java.util.Random;

public class Chute{
	private int forca;
	private int quadrante;
	private int posicaoX, posicaoY;
	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getQuadrante() {
		return quadrante;
	}

	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}

	private String vetmappgoal[][];
	
	public String[][] Sortgoal(){
		int x,y;
		Random sort = new Random();
		x=sort.nextInt(8);
		y=sort.nextInt(16);
		vetmappgoal = new String [x][y];
		return vetmappgoal;
	}

	public Chute(int forca, int quadrante, int posicaoX, int posicaoY) {
		super();
		this.forca = forca;
		this.quadrante = quadrante;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}
	

}
