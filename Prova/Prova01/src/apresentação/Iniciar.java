package apresentação;
import trabalho.*;
import java.util.Scanner;

public class Iniciar {
	private String nomeJogador;
	private int coordenadasX;
	private int coordenadasY;
	private int quantAluno;
	private int quantBug;
	
	private Plano plano;
	private Aluno aluno;
	private Bug bug;
	private Robo robo;
	
	private int coordY;
	private int coordX;
	private int coordy;
	private int coordx;
	
	private int pontuacao;
	private String nome;
	private int id;
	private Celula posicaoInicial;

	
	public void dadosIniciais() {
		System.out.println("Digite seu nome: ");
		 Scanner entrada = new Scanner(System.in);
		 nomeJogador = entrada.nextLine();
		 
		 this.plano=new Plano(coordenadasX, coordenadasY);
		 this.aluno=new Aluno(coordX, coordY);
		 this.bug=new Bug(coordx,coordy);
		 
		Andador andador= new Andador(pontuacao,nome, id);
		Bispo bispo= new Bispo(pontuacao,nome, id);
		Cavalo cavalo= new Cavalo(pontuacao,nome, id);
		Peao peao= new Peao(pontuacao,nome, id);
		Rainha rainha= new Rainha(pontuacao,nome, id);
		Rei rei= new Rei(pontuacao,nome, id);
		 
		 System.out.println("Seja bem vindo " +nomeJogador+"! Digite o tamanho do tabuleiro: ");
		 System.out.print("X: ");
		 coordenadasX= entrada.nextInt();
		 plano.setTamX(coordenadasX);
		 
		 System.out.print("Y: ");
		 coordenadasY= entrada.nextInt();
		 this.plano=new Plano(coordenadasX, coordenadasY);
		 plano.setTamY(coordenadasY);
		 
		 
		 System.out.println("Digite a quantidade de alunos: ");
		 quantAluno= entrada.nextInt();//excessao
		 aluno.setQuantAluno(quantAluno);
		 
		 System.out.println("Digite a quantidade de bugs: ");
		 quantBug= entrada.nextInt();//excessao
		 bug.setQuantBug(quantBug);
		 

		 Partidas p= new Partidas();
		 p.sorteioAluno(quantAluno);
		 p.sorteioBug();
		 p.jogadas();
		 
	}
	
	
	
	
		
		
	
	

//public String relatorioFinal() {
//		
//		String saida="";
//		saida="Jogador: "+nomeJogador+"";
//		
//		return saida;
//		
//	}
	
	
	
}
