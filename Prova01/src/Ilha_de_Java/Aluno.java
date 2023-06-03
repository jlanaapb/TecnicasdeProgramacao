package Ilha_de_Java;


public class Aluno {
	private int coordx;
	private int coordy;
	private Plano plano;
	private String simbolo= "Al";
	
	public String getSimbolo() {
		return simbolo;
	}


	public Aluno(int coordx, int coordy) {
		super();
		this.coordx = coordx;
		this.coordy = coordy;
	}


	public int getCoordx() {
		return coordx;
	} 
	public void setCoordx(int coordx) {
		this.coordx = coordx;
	}
	public int getCoordy() {
		return coordy;
	}
	public void setCoordy(int coordy) {
		this.coordy = coordy;
	}
}
