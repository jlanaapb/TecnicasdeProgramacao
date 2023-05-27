package trabalho;

import java.util.ArrayList;


public class Plano {
	int tamX;
	int tamY;

	private ArrayList<Celula> plano;

	public Plano(int tamX,int tamY) {
	
		plano=new ArrayList<>();
		int cont=0;
		for(int l=tamX;l!=0;l--) {
			System.out.println(" ");
			for(int c=tamY;c!=0;c--) {
				cont++;
				Celula celula = new Celula(cont,l, c);
				plano.add(celula);
				System.out.print(cont+" "+l+"-"+c+" ");
			}
		}
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
