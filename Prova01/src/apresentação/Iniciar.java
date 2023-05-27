package apresentação;
import trabalho.*;
import java.util.Scanner;

public class Iniciar {
	private String nomeJogador;
	private int coordenadasX;
	private int coordenadasY;
	Plano plano;
	
	public void DadosIniciais() {
		System.out.println("Digite seu nome: ");
		 Scanner entrada = new Scanner(System.in);
		 nomeJogador = entrada.nextLine();
		 
		 this.plano=new Plano(coordenadasX, coordenadasY);
		 
		 System.out.println("Seja bem vindo " +nomeJogador+"! Digite o tamanho do tabuleiro: ");
		 System.out.print("X: ");
		 coordenadasX= entrada.nextInt();
		 plano.setTamX(coordenadasX);
		 System.out.print("Y: ");
		 coordenadasY= entrada.nextInt();
		 plano.setTamY(coordenadasY);
		 
		 System.out.println("Digite a quantidade de alunos: ");
		 
		 
		 System.out.println("Digite a quantidade de bugs: ");
		 
	}
	
	public String relatorioFinal() {
		
		String saida="";
		saida="Jogador: "+nomeJogador+"";
		
		return saida;
		
	}
	
	
	
}
