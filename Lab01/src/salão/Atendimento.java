
package salão;
import java.util.ArrayList;
import java.util.Calendar;

public class Atendimento {
	public Cliente C1 = new Cliente("123.156.156");
	private Calendar data;
	private ArrayList<Servico>ListaDeServico;
	public Cabelereiro Ca1;
	public Atendimento(Cliente c1, ArrayList<Servico> listaDeServico, Cabelereiro ca1) {
		super();
		C1 = c1;
		this.data = Calendar.getInstance();
		ListaDeServico = listaDeServico;
		Ca1 = ca1;
	}
	
	public Cliente getC1() {
		return C1;
	}
	public void setC1(Cliente c1) {
		C1 = c1;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public ArrayList<Servico> getListaDeServico() {
		return ListaDeServico;
	}
	public void setListaDeServico(ArrayList<Servico> listaDeServico) {
		ListaDeServico = listaDeServico;
	}
	public Cabelereiro getCa1() {
		return Ca1;
	}
	public void setCa1(Cabelereiro ca1) {
		Ca1 = ca1;
	}
	

	
	
}

