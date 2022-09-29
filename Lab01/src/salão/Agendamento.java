package salão;
import java.util.Calendar;

public class Agendamento {
private int Id;
private Calendar Data;
public Cliente clienteAgendado;
private int Hora;
private int Minuto;
public Cabelereiro cabelereiro;

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getData() {
	return Data;
}
public void setData(String data) {
	Data = data;
}
public int getHora() {
	return Hora;
}
public void setHora(int hora) {
	Hora = hora;
}
public int getMinuto() {
	return Minuto;
}
public void setMinuto(int minuto) {
	Minuto = minuto;
}
public Agendamento(Calendar data, Cliente c2, Cabelereiro ca3) {
	super();
	 Data = Calendar.getInstance();
	 clienteAgendado = c2;
	 Ca3 = ca3;
}



}
