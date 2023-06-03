package Ilha_de_Java;

public class Cavalo extends Robo{

	public Cavalo(int pontuacao, String nome, int id, String simbolo,Plano plano) {
		super(pontuacao, nome, id,simbolo, plano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void avancar(int avance) {
		
		if (avance<=2) {//direita cima
			int linha = this.getPosicao().getCoordX()+ avance;
			int coluna= this.getPosicao().getCoordY()+avance;
			
			if(linha<=this.getPlano().tamX && coluna<=this.getPlano().tamY)
			this.getPosicao().setCoordX(linha);
			this.getPosicao().setCoordY(coluna);
			
			
			}		
	}

	@Override
	public void retroceder(int retro) {
		if (retro<=2) {//esquerda cima
			int linha = this.getPosicao().getCoordX()- retro;
			int coluna= this.getPosicao().getCoordY()+retro;
			
			if(linha<=this.getPlano().tamX && coluna<=this.getPlano().tamY)
			this.getPosicao().setCoordX(linha);
			this.getPosicao().setCoordY(coluna);
			
			
			}
	
	}

	
}
