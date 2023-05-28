package trabalho;

import java.util.ArrayList;


public class Plano {
	int tamX;
	int tamY;
	public int tamPlano;
	

	private ArrayList<Celula> planoDeCelulas;
	private ArrayList<Robo> listaRobo;

	public Plano(int tamX,int tamY) {
		listaRobo = new ArrayList<Robo>();
		planoDeCelulas=new ArrayList<>();
		int cont=0;
		for(int l=tamX;l!=0;l--) {
			System.out.println(" ");
			for(int c=tamY;c!=0;c--) {
				cont++;
				Celula celula = new Celula(l, c);
				planoDeCelulas.add(celula);
				System.out.print(cont+" "+l+"-"+c+" ");
			}
		}
	}
	
	while(verificar())
	public void verificar()
	{
		for (Celula celula : planoDeCelulas) {
			if(celula.isAluno()==true)
				return true
				
				
				if(celula.getCoordX() == robo.getPosicaoInicial().getCoordX()
						&& celula.getCoordY() == robo.getPosicaoInicial().getCoordY())
				{
					if(robo instanceof Andador)
					{
						celula.setSimbolo(simbolo do robo);
					}
				}
			}
			
		}
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
	
	public int tamanhoPlano() {
		return this.tamPlano=tamX*tamY;
	}
	
	public void imprimmir()
	{
		int cont = 1;
		for (Celula celula : planoDeCelulas) {
			System.out.println(""+celula.getSimbolo());
			cont++;
			if(cont==this.tamY)
			{
				cont=1;
				System.out.println("");
			}
		}
	}
	
	public Celula retornarCelula(int x, int y) {
		for (Celula celula : planoDeCelulas) {
			if(celula.getCoordX()==x && celula.getCoordY()==y) {
				return celula;
			}
		}
		return null;
	}
	
	
//	public void verificarSeTemRobo() {
//		for (int i = 0; i < listaCelulas.size(); i++) {
//			Celula aux = listaCelulas.get(i);
//			if (listaCelulas.get(i).robo != null) {
//				System.out.println("tem robo" + aux.robo.nome + "  - x: " + aux.posicaoX + "  - y: " + aux.posicaoY);
//			}
//		}
//	}
//	public Celula retornarCelula(int x, int y) {
//
//		for (int i = 0; i < listaCelulas.size(); i++) {
//			if (listaCelulas.get(i).posicaoX == x && listaCelulas.get(i).posicaoY == y) {
//				return listaCelulas.get(i);
//			}
//		}
//		return null;
//	}
//
//	public void retornarCelulas() {
//		for (int i = 0; i < listaCelulas.size(); i++) {
//			System.out.println(listaCelulas.get(i).imprimir());
//		}
//	}
	
}
