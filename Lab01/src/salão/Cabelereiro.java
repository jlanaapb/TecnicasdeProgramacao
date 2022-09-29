package salão;

public class Cabelereiro {
private int Id;
private String Nome;
private String CPF;

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
	if(Nome.length()>3)
		this.Nome=nome;
}
public String getCPF() {
	return CPF;
}
public void setCPF(String cPF) {
	CPF = cPF;
}


public Cabelereiro(String Nome, String CPF) {
	this.Nome=Nome;
	this.CPF=CPF;
	
}
}
