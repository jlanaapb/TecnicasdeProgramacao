package salão;

public class Servico {
	private int Id;
	private String Nome;
	private float Valor;
	private String Descricao;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		if(id>0);
		this.Id=id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		if(Nome.length()>5)
		this.Nome = nome;
	}
	public float getValor() {
		return Valor;
	}
	public void setValor(float valor) {
		if(Valor>0)
		Valor = valor;
	}
	public String getDescrição() {
		return Descricao;
	}
	
	public void setDescrição(String descricao) {
		if(Descricao.length()>10)
			this.Descricao = descricao;
		
	}
	
	
}
