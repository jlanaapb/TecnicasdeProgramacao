package Ilha_de_Java;

public class Andador extends Robo{
	
	
	

	public Andador(int pontuacao, String nome, int id, String simbolo, Plano plano) {
		super(pontuacao, nome, id, simbolo, plano);
		
	}
	
	public void avancar(int avance) {
		
		int linha = this.getPosicao().getCoordX()+ avance;
			if(linha<=this.getPlano().tamX)
			this.getPosicao().setCoordX(linha);
			
	}


	public void retroceder(int retro) {
		int linha = this.getPosicao().getCoordX()- retro;
		if(linha>0)
		this.setPosicao(new Celula(linha,this.getPosicao().getCoordY()));
	}

}
