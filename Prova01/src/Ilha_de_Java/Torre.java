package Ilha_de_Java;

public class Torre extends Robo{

	public Torre(int pontuacao, String nome, int id, String simbolo, Plano plano) {
		super(pontuacao, nome, id,simbolo,plano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void avancar(int avance) {
		if(avance<=2) {
		int linha = this.getPosicao().getCoordY()+ avance;
		if(linha<=this.getPlano().tamY)
		this.getPosicao().setCoordY(linha);
		
		}
	}

	@Override
	public void retroceder(int retro) {
		if(retro<=2) {
		int linha = this.getPosicao().getCoordY()- retro;
		if(linha>0)
		this.setPosicao(new Celula(linha,this.getPosicao().getCoordY()));
		}
	}

}
