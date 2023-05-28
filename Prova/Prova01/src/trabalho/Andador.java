package trabalho;

public class Andador extends Robo{

	public Andador(int pontuacao, String nome, int id) {
		super(pontuacao, nome, id);
	
	}

	public void avancar() {
		int linha = this.getPosicaoInicial().getCoordX()+1;
		this.setPosicaoInicial(new Celula(linha,this.getPosicaoInicial().getCoordY()));
	
	//	y++
		
//		public void moverEsquerda() {
//			for (int i = 0; i < plano.listaCelulas.size(); i++) {
//
//				if (plano.listaCelulas.get(i).robo != null) {
//					plano.listaCelulas.get(i).robo = null;
//					plano.listaCelulas.get(i - 1).robo = this;
//				}
//			}
//
//		}
//
//		public int moverDireita() {
//			return posicaox + 1;
//		}
		// coord x e y , verifica se pode, se o mov cabe dentro do limite
		// se sim, atribui a nova posição p/ robo
		
		
	//	aqui vai ter excessao
	}


	public void retroceder() {
		
		
	}

}
