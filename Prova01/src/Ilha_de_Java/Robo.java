package Ilha_de_Java;

public abstract class Robo implements IMovimento {
	private int pontuacao;
	private String nome;
	private int id;
	private Celula posicao;
	private String simbolo;
	private Plano plano;
	
	public Robo(int pontuacao, String nome, int id, String simbolo,Plano plano) {
		super();
		this.pontuacao = pontuacao;
		this.nome = nome;
		this.id = id;
		this.posicao = new Celula(1,1);
		this.simbolo=simbolo;
		this.plano= plano;
		
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Celula getPosicao() {
		return posicao;
		
	}

	public void setPosicao(Celula posicao) {
		
		this.posicao = posicao;
	}


}


