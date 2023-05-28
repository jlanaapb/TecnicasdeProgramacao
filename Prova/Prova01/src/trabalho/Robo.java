package trabalho;

public abstract class Robo implements IMovimento {
	private int pontuacao;
	private String nome;
	private int id;
	private Celula posicaoInicial;
	
	public Robo(int pontuacao, String nome, int id) {
		super();
		this.pontuacao = pontuacao;
		this.nome = nome;
		this.id = id;
		this.posicaoInicial = new Celula(1,1);
		
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

	public Celula getPosicaoInicial() {
		return posicaoInicial;
	}

	public void setPosicaoInicial(Celula posicaoInicial) {
		
		this.posicaoInicial = posicaoInicial;
	}


	//metodo de resgatee de aluno, modificacao da pontuação(retorna pontuação?)
	

	
}


