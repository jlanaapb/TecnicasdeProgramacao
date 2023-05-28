package trabalho;


public class Aluno {
	private int quantAluno;
	private int coordx;
	private int coordy;
	private Plano plano;
	
	public Aluno(int coordx, int coordy) {
		super();
		this.coordx = coordx;
		this.coordy = coordy;
	}


	public int getQuantAluno() {
		return quantAluno;
	}
	public void setQuantAluno(int quantAluno) {
		if (quantAluno<plano.tamanhoPlano())
		this.quantAluno = quantAluno;
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
