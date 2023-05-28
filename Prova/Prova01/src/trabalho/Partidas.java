package trabalho;
import java.io.ObjectInputStream.GetField;
import java.util.Random;


public class Partidas {
	Plano plano;
	private int aluno;
	Bug bug;
	private boolean jogando;
	Random rand=new Random();

	
	public void sorteioAluno(int x) {
		for (int i=0;i<x;i++) {
			Aluno aluno=new Aluno(rand.nextInt(0, plano.getTamX()),rand.nextInt(0, plano.getTamY()));
		}
	}

	public void sorteioBug() {
		for (int i=0;i<=bug.getQuantBug();i++) {
			Bug bug=new Bug(rand.nextInt(0, plano.getTamX()),rand.nextInt(0, plano.getTamY()));
		}
	}
		

	public void jogadas() {
		do {
		
	
			 //Andador (posicaoatual)==> (1,2)....//metodo de continaur pededindo ao jogador o proximo movimento do jogo 
		} while (jogando);

		
	}
	//pedir proximas jogadas 
	
	//robo, aluno e bug 
	
	
	//metodo fim jogo boolean.
	
	
	
	//metodo espaçamento
	

	
}
