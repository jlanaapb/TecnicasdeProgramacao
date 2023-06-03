package Ilha_de_Java;

public class Celula {
	private int coordX;
	private int coordY;
	private int id;
	private Robo robo;
	private boolean bug;
	private boolean aluno;
	private String simbolo;


	public String getSimbolo() {
		return simbolo;
	}


	public Celula(int coordX, int coordY) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
		this.simbolo= "_";
		

	}


	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}


	

	public int getCoordX() {
		return coordX;
	}


	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}


	public int getCoordY() {
		return coordY;
	}


	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public Robo getRobo() {
		return robo;
	}


	public void setRobo(Robo robo) {
		
		this.robo = robo;
	}


	public boolean isBug() {
		return bug;
	}


	public void setBug(boolean bug) {
		this.bug = bug;
	}


	public boolean isAluno() {
		return aluno;
	}


	public void setAluno(boolean aluno) {
		this.aluno = aluno;
	}
	
	
	
	
	
	
	
}
