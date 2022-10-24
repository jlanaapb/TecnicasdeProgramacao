
package prova;

import java.util.Random;

public class Goleiro {

private int id;
private String nome;
private int velocidade;
private int flexibilidade;
private int agilidade;
private int coordenacao;
private int forca;
private int equilibrio;

public Goleiro(int id, String nome) {
	this.id=id;
	this.nome=nome;
}

public void dadosGoleiro() {
	getNome();
	getId();
}

public int AreadeAtuacaoGoleiro(int velocidade,int flexibilidade, int agilidade, int coordenacao, int forca, int equilibrio) {
	int AAG;
	AAG=((velocidade*3)+(flexibilidade*2)+(agilidade*3)+(coordenacao*2)+(forca)+(equilibrio*2))/8;
	return AAG;
}

public void sortInitPositionAAG(int quadrante) {
	int x=0;
	int y=0;
	
	Random sort = new Random();
	if (quadrante==1) {
		x=sort.nextInt(5);
		y=sort.nextInt(9);}
	else if(quadrante==2) {
			x=sort.nextInt(5);
			y=sort.nextInt(9,17);}
	else if (quadrante==3) {
		x=sort.nextInt(5,9);
		y=sort.nextInt(9);}
	else if (quadrante==4) {
			x=sort.nextInt(5,9);
			y=sort.nextInt(9,17);
	
	}
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getVelocidade() {
	return velocidade;
}

public void setVelocidade(int velocidade) {
	this.velocidade = velocidade;
}

public int getFlexibilidade() {
	return flexibilidade;
}

public void setFlexibilidade(int flexibilidade) {
	this.flexibilidade = flexibilidade;
}

public int getAgilidade() {
	return agilidade;
}

public void setAgilidade(int agilidade) {
	this.agilidade = agilidade;
}

public int getCoordenacao() {
	return coordenacao;
}

public void setCoordenacao(int coordenacao) {
	this.coordenacao = coordenacao;
}

public int getForca() {
	return forca;
}

public void setForca(int forca) {
	this.forca = forca;
}

public int getEquilibrio() {
	return equilibrio;
}

public void setEquilibrio(int equilibrio) {
	this.equilibrio = equilibrio;
}
 

}
