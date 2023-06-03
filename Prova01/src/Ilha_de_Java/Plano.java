package Ilha_de_Java;

import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.Random;

public class Plano {
	int tamX;
	int tamY;
	private int tamPlano;
	private Aluno aluno;
	private int alunosCapt=0;
	private int bugsCapt=0;
	private Random rand=new Random();
	private ArrayList<Celula> planoDeCelulas;
	private ArrayList<Robo> listaRobo;

	public Plano(int tamX,int tamY) {
		listaRobo= new ArrayList<Robo>();
		planoDeCelulas=new ArrayList<Celula>();
	
		this.tamX=tamX;
		this.tamY=tamY;
	
		int cont=0;
		for(int l=tamX;l!=0;l--) {
			for(int c=1;c<=tamY;c++) {
				cont++;
				Celula celula = new Celula(l, c);
				planoDeCelulas.add(celula);
			}
		}
		
		listaRobo.add(new Andador(0,"Andador",1,"A",this));
		listaRobo.add(new Bispo(0,"Bispo",2,"B",this));
		listaRobo.add(new Cavalo(0,"Cavalo",3,"C",this));
		listaRobo.add(new Peao (0,"Peao",4,"P",this));
		listaRobo.add(new Rainha(0,"Rainha",5,"Ra",this));
		listaRobo.add(new Rei(0,"Rei",6,"Rei",this));
		listaRobo.add(new Torre(0,"Torre",7,"T",this));
		
		
	}
	
	
	public void sorteioAluno(int x) {
		for (int i=0;i<x;i++) {
			Aluno aluno=new Aluno(rand.nextInt(1,getTamX()),rand.nextInt(1,getTamY()));
			for(Celula celula : planoDeCelulas) {
				if(celula.getCoordX() == aluno.getCoordx() && celula.getCoordY() == aluno.getCoordy())
					celula.setAluno(true);
				
			}
		
			
		}
	}
	
	public void sorteioBug(int x) {
		for (int i=0;i<x;i++) {
			Bug bug=new Bug(rand.nextInt(1,getTamX()),rand.nextInt(1,getTamY()));
			for(Celula celula : planoDeCelulas) {
				if(celula.getCoordX() == bug.getCoordx()&& celula.getCoordY() == bug.getCoordy())
					if(celula.isAluno()==false)
						celula.setBug(true);
					
			}	
		}
	}
	
	public void adicionarRobo() {
		for (Celula celula : planoDeCelulas) {
			for (Robo robo : listaRobo) {
				if(celula.getCoordX() == robo.getPosicao().getCoordX()
						&& celula.getCoordY() == robo.getPosicao().getCoordY()) {
					celula.setRobo(robo);
					celula.setSimbolo(robo.getSimbolo());
					
			    }
			}
		}
	}
	
		public void simbolos()
		{
			for (Celula celula : planoDeCelulas) {
				for (Robo robo : listaRobo) {
					if(celula.getCoordX() == robo.getPosicao().getCoordX()&& celula.getCoordY() == robo.getPosicao().getCoordY())
						if(robo instanceof Andador)
							celula.getSimbolo();
						else if (robo instanceof Bispo)
							celula.getSimbolo();
						else if (robo instanceof Cavalo)
							celula.getSimbolo();
						else if (robo instanceof Peao)
							celula.getSimbolo();
						else if (robo instanceof Rainha)
							celula.getSimbolo();
						else if (robo instanceof Rei)
							celula.getSimbolo();
						else if (robo instanceof Torre)
							celula.getSimbolo();
					}		
				}
			}
	
		
		public void verificarCapturas() {
			for (Celula celula : planoDeCelulas) {
			for (Robo robo : listaRobo) {
				 
					if(celula.getCoordX() == robo.getPosicao().getCoordX()&& celula.getCoordY() == robo.getPosicao().getCoordY()) {
						if(celula.isBug()== true) {
							robo.setPontuacao(robo.getPontuacao()-15);	
							setBugsCapt(bugsCapt);
							celula.setBug(false);	
							}
						
						if(celula.isAluno()== true){
							robo.setPontuacao(robo.getPontuacao()+10);	
							setAlunosCapt(alunosCapt);
							celula.setAluno(false);
								
						}
					}
				}
			}
		}
		

		
	public void imprimir()
	{
		int cont = 1;
		for (Celula celula : planoDeCelulas) {
			System.out.print("["+celula.getSimbolo()+"]");
			cont++;
			if(cont==this.tamY+1)
			{
				cont=1;
				System.out.println("");
			}
		}
	}
	

		
	public int restAlunos() {
		int restAlunos=0;
		for (Celula celula : planoDeCelulas) { 
				if(celula.isAluno()==true)
					restAlunos++;
			}
		return restAlunos;
	}
	
	
public int restaBugs() {
	int restaBugs=0;
	for (Celula celula : planoDeCelulas) { {
			if(celula.isBug()==true)
				restaBugs++;
		}
	}
	return restaBugs;
}

public int tamanhoPlano() {
	return this.tamPlano=tamX*tamY;
}
	

public String campeao() {
	String campeao="";
	int pontMax=0;
		for (Robo robo : listaRobo) {
				if(robo.getPontuacao()>pontMax)
					pontMax=robo.getPontuacao();	
					campeao=robo.getNome();
		}
		
		return campeao;
	}


	public void parcial() {
		System.out.println("\n============================================");
		System.out.println("Alunos restantes:"+ restAlunos());
		System.out.println("Bugs restantes:"+ restaBugs());
		for(Robo robo : listaRobo) {
		System.out.println(robo.getNome()+" ("+ robo.getPosicao().getCoordX() +", "+ robo.getPosicao().getCoordY()+") ("+ robo.getPontuacao() +" pontos)");
			

	
		}
		System.out.println("\n=============================================");
		}
	
	public void fimDeJogo(String nomeJogador) {
		System.out.println("\n================ fim de jogo ==================");
		System.out.println("Alunos encontrados:"+ getAlunosCapt());
		System.out.println("Bugs encontrados:"+ getBugsCapt());
		for(Robo robo : listaRobo) {
		System.out.println(robo.getNome()+" ("+ robo.getPosicao().getCoordX() +", "+ robo.getPosicao().getCoordY()+") ("+ robo.getPontuacao() +" pontos)");
		}
		
		System.out.println("Campeão de "+nomeJogador+": "+ campeao());
	
	}

	
	public ArrayList<Robo> getListaRobo() {
		return listaRobo;
	}
	public void setListaRobo(ArrayList<Robo> listaRobo) {
		this.listaRobo = listaRobo;
	}
	public ArrayList<Celula> getPlanoDeCelulas() {
		return planoDeCelulas;
	}
	public void setPlanoDeCelulas(ArrayList<Celula> planoDeCelulas) {
		this.planoDeCelulas = planoDeCelulas;
	}
	public int getTamX() {
		return tamX;
	}

	public void setTamX(int tamX) {
		this.tamX = tamX;
	}

	public int getTamY() {
		return tamY;
	}

	public void setTamY(int tamY) {
		this.tamY = tamY;
	}
	
	
	
	public int getTamPlano() {
		return tamPlano;
	}


	public void setTamPlano(int tamPlano) {
		this.tamPlano = tamPlano;
	}


	public int getAlunosCapt() {
		return alunosCapt;
	}


	public void setAlunosCapt(int alunosCapt) {
		this.alunosCapt = ++alunosCapt;
	}


	public int getBugsCapt() {
		return bugsCapt;
	}


	public void setBugsCapt(int bugsCapt) {
		this.bugsCapt = ++bugsCapt;
	}
	

}
