package trabalho;

import java.util.Random;

public class Bug {
	private int quantBug;
	private int coordx;
	private int coordy;
	private Plano plano;
	
	Random rand=new Random();
	
	public Bug(int coordx, int coordy) {
		super();
		this.coordx = coordx;
		this.coordy = coordy;
	}



	
//
//	while .. é menor ou igual ao numero de alunos pedidos
//	e api 
//	 for pra ser x aleatorio e y aleatorio
	//verificar se tem aluno se tiver (booblean) tentar outra celula
	
	public int getQuantBug() {
		return quantBug;
	}



	public void setQuantBug(int quantBug) {
		if (quantBug>plano.tamanhoPlano())
		this.quantBug = quantBug;
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
