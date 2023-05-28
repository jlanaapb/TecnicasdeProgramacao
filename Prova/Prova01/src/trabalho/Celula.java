package trabalho;

public class Celula {
	private int coordX;
	private int coordY;
	private int id;
	private boolean robo;
	private boolean bug;
	private boolean aluno;
	private String Simbolo;
	//private IElementoDeJogo elemento;
	

	public Celula(int coordX, int coordY) {
		super();
		this.coordX = coordX;
		this.coordY = coordY;
		this.Simbolo = "*";

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


	public boolean isRobo() {
		return robo;
	}


	public void setRobo(boolean robo) {
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


	public String getSimbolo() {
		return Simbolo;
	}


	public void setSimbolo(String simbolo) {
		Simbolo = simbolo;
	}
	
	
	
	
	
	
	
}
