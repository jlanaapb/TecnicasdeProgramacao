package salão;

import java.util.ArrayList;
import java.util.Calendar;

public class Teste {

	public static void main(String[] args) {
	Cliente cliente1 =new Cliente("123.456.789");
		cliente1.setId(1);
		cliente1.setNome("Josiane");
	Cliente cliente2 =new Cliente("156.263.487");
		cliente2.setId(2);
		cliente2.setNome("Natalia");
	Cliente cliente3 =new Cliente("789.456.123");
		cliente3.setId(3);
		cliente3.setNome("karen");
	
	Cabelereiro cabele1 = new Cabelereiro("Maria", "123.456.789");
	cabele1.setId(1);
	Cabelereiro cabele2 = new Cabelereiro("Juliana", "147.366.562");
	cabele1.setId(2);
	Cabelereiro cabele3 = new Cabelereiro("Ana julia", "651.654.640");
	cabele1.setId(3);
	
	Agendamento Agenda1= new Agendamento(, cliente1, cabele1);
	Agenda1.setId(1);
	Agenda1.setHora();
	Agenda1.setMinuto();

	Agendamento Agenda2= new Agendamento(, cliente2, cabele2);
	Agenda2.setId(2);
	Agenda2.setHora();
	Agenda2.setMinuto();
	
	Agendamento Agenda3= new Agendamento(, cliente3, cabele3);
	Agenda3.setId(3);
	Agenda3.setHora();
	Agenda3.setMinuto();
	
	Atendimento atend1= new Atendimento(cliente1, null, cabele1);
	Calendar data1 = Calendar.getInstance();
	data1.set(2022,10,12);
	atend1.setData(data1);
	atend1.setListaDeServico();
	
	Atendimento atend2= new Atendimento(cliente2, null, cabele2);
	Calendar data2 = Calendar.getInstance();
	data2.set(2022,10,13);
	atend1.setData(data2);
	atend1.setListaDeServico();
	
	Atendimento atend3= new Atendimento(cliente3, null, cabele3);
	Calendar data3 = Calendar.getInstance();
	data3.set(2022,10,13);
	atend1.setData(data3);
	atend1.setListaDeServico();
	

	Servico servico1= new Servico("corte reto acima dos ombros");
	servico1.setId(1);
	servico1.setNome("Channel");
	servico1.setValor(50.0);
	
	
	Servico servico2= new Servico("Corte reto abaixo dos ombros");
	servico2.setId(2);
	servico2.setNome("Long Bob");
	servico2.setValor(40.0);
	
	Servico servico3= new Servico("Corte com várias camadas");
	servico3.setId(3);
	servico3.setNome("Camadas");
	servico3.setValor(70.0);
	}
	
	

}
