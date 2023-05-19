package negocio;

import java.util.Random;

import apresentacao.*;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;

	public Jogo() {
		tela = new Tela();
		terminal = new Terminal();
		jogador = new Jogador();
		numeroEscolhido = (int) (Math.floor(Math.random() * 10)+1);
		jogando = true;
	}

	public void inciarJogoTerminal() {
		jogador.setNome(terminal.entradaNome());
		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual � o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
	}

	public int solicitarNumero() {
	String numero= tela.entradaDados("Informe um numero:");
	
		return Integer.parseInt(numero);
	}

	public void jogadas() {
		do {
			verificarAcerto();
		} while (jogando);

		//fimDoJogo();
	}

//	private void fimDoJogo() {
//
//		String numeros = "";
//		for (Integer numero : jogador.getListaNumeros()) {
//			numeros += " - " + numero;
//		}
//		tela.mesagem("Numeros apostados: " + numeros);
//
//	}

	public boolean verificarMenor(int numero) {
		if (numero < numeroEscolhido)
			return true;

		return false;
	}

	public void verificarAcerto() {
		int numero = solicitarNumero();
		jogador.addNumero(numero);
		if (numero == numeroEscolhido) {
			certo();
		} else {
			errado(numero);
		}
	}
	public void certo() {
		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
		tela.mesagem("Parabéns você acertou! Este foi seu número de tentativas: " + jogador.getNumeroTentativa()+
				"  Numeros apostados: "+ numeros);
		jogando = false;
	}
	public void errado(int numero) {
		if (verificarMenor(numero)) {
			tela.mesagem("Que pena,tente novamente um número maior!");
		} else {
			tela.mesagem("Que pena,tente novamente um número menor");
		}
		jogador.setNumeroTentativa();
	
	}


}
