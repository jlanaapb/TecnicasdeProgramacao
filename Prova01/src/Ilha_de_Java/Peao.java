package Ilha_de_Java;

public class Peao extends Robo{

	public Peao(int pontuacao, String nome, int id, String simbolo,Plano plano) {
		super(pontuacao, nome, id,simbolo,plano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void avancar(int avance) {
		int coluna = this.getPosicao().getCoordX()+ avance;
		if(coluna<=this.getPlano().tamX)
		this.getPosicao().setCoordX(coluna);
				
	}

	@Override
	public void retroceder(int retro) {
		int coluna = this.getPosicao().getCoordY()- retro;
		if(coluna>0)
		this.setPosicao(new Celula(coluna,this.getPosicao().getCoordY()));
			
	}

}
