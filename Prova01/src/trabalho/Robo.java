package trabalho;

public abstract class Robo implements IMovimento {
	private int pontuacao;
	private String nome;
	private int id;
	private Celula celula;
	
	public Robo(int pontuacao, String nome, int id, Celula celula) {
		super();
		this.pontuacao = pontuacao;
		this.nome = nome;
		this.id = id;
		this.celula = celula;
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

	public Celula getCelula() {
		return celula;
	}

	public void setCelula(Celula celula) {
		this.celula = celula;
	}
	
	

	
}
