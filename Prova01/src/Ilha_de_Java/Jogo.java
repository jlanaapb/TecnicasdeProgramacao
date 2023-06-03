

package Ilha_de_Java;

import java.util.Scanner;

public class Jogo {
	private String nomeJogador;
	private int coordenadasX;
	private int coordenadasY;
	private int quantAluno;
	private int quantBug;
	private Plano plano;
	Scanner entrada = new Scanner(System.in);
	
	public void dadosIniciais() {
		System.out.println("Digite seu nome: ");
		 nomeJogador = entrada.nextLine();
 
		 System.out.println("Seja bem vindo " +nomeJogador+"! Qual o tamanho do tabuleiro? ");
		 System.out.print("X: ");
		 coordenadasX= entrada.nextInt();
		 
		 System.out.print("Y: ");
		 coordenadasY= entrada.nextInt();
		 this.plano=new Plano(coordenadasX, coordenadasY);

		 
		 System.out.println("Digite a quantidade de alunos: ");
		 setQuantAluno(quantAluno= entrada.nextInt());
		
		
		 System.out.println("Digite a quantidade de bugs: ");
		 setQuantBug(quantBug= entrada.nextInt());
		 

		 
			 
			plano.sorteioAluno(quantAluno);
			plano.sorteioBug(quantBug);
			plano.adicionarRobo();
			plano.simbolos();
			plano.imprimir();
			jogadas();
	
		
		
		 
	}
	
	
		
	public void setQuantAluno(int quantAluno) {
		if (quantAluno<(plano.tamanhoPlano())/2)
		this.quantAluno = quantAluno;
	}
	
	public void setQuantBug(int quantBug) {
		if (quantBug<(plano.tamanhoPlano())/2)
		this.quantBug = quantBug;
	}
	
	public void jogadas() {
		 Scanner entrada = new Scanner(System.in);
		
			do {
				for (Robo robo : plano.getListaRobo()) {
					System.out.println(robo.getNome()+"====  AVANÇAR-> digite 1   RETROCEDER-> digite 2");
					int move = entrada.nextInt();
					System.out.println("numero de casas: ");
					int quant = entrada.nextInt();
				
					
					if(move==1) {
						robo.avancar(quant);}
					else {
						robo.retroceder(quant);
					}
						plano.adicionarRobo();
						plano.verificarCapturas();
						

					}
				
				plano.imprimir();
				plano.parcial();
				
		}
			while (verificarContinua()==true);
	}

		
	
	public int getQuantAluno() {
		return quantAluno;
	}



	public int getQuantBug() {
		return quantBug;
	}



	public boolean verificarContinua() {
		int resp=0;
		System.out.println("Deseja continuar jogando? SIM(digite 1)   NÃO(digite 2)");
		resp= entrada.nextInt();
		
			for (Celula celula : this.plano.getPlanoDeCelulas()) {
				if(celula.isAluno()==true) {
					if(resp==1)
						return true;
				}
			}
			plano.fimDeJogo(nomeJogador);
			return false;
	}
	
	
	
	
}