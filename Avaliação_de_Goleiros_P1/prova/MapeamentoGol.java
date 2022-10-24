package prova;

import java.util.Iterator;

public class MapeamentoGol {

	private String  vetmappgoal[][];
	
	public void mappingoal() {
		vetmappgoal = new String [8][16];
		for (int x = 0; x <=9; x++) {
			for (int y = 0; y <=16; y++) {
				//trave
				if((x==1 && y<=15 && y!=0)||(x<=8 && x!=0 && y==1)||(x<=8 && x!=0 && y==15)) {
				}
				//fora
				else if((x==0 && y<=16)||(x<=8 && y==0)||(x<=8 && y==16)) {
				}
				//Gaveta
				else if((x==2 && y==2)||(x==2 && y==14)) {
				}
				//Gol
				else {
				}
					
			}
		}
		
	}
	
	public void quadrante() {
		String vetquadrante[][] = new String[8][16];
		int quadrante;
		for(int x=0; x<=8;x++) {
			for(int y=0;y<=16;y++) {
				if(x<4&&y<=8);
				else if(x<4&&y>8);
				else if(x<4&&y<=8);
					if(x>4&&y>8);
			}
		}
		
	}
}
