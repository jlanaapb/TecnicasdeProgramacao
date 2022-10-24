
package prova;

public class Apresentacao {

	public static void main(String[] args) {
	MapeamentoGol mapping= new MapeamentoGol();
	mapping.quadrante();

	
	Goleiro goleiro1 = new Goleiro(1, " Pratik Skaggs ");
	System.out.println(goleiro1.AreadeAtuacaoGoleiro(5,7,8,9,6,6));
	System.out.println(goleiro1.dadosGoleiro());
	
	Goleiro goleiro2 = new Goleiro(2, "Uehudah Hack ");
	System.out.println(goleiro2.AreadeAtuacaoGoleiro(9,6,8,8,7,10));
	System.out.println(goleiro2.dadosGoleiro());
	
	Goleiro goleiro3 = new Goleiro(3, " Edison Drye ");
	System.out.println(goleiro3.AreadeAtuacaoGoleiro(5,8,5,8,10,7));
	System.out.println(goleiro3.dadosGoleiro());
	
	Goleiro goleiro4 = new Goleiro(3, " Ajani Harding ");
	System.out.println(goleiro4.AreadeAtuacaoGoleiro(6,6,5,8,7,6));
	System.out.println(goleiro4.dadosGoleiro());
	
	Goleiro goleiro5 = new Goleiro(3, " Orazio Hart ");
	System.out.println(goleiro5.AreadeAtuacaoGoleiro(5,8,7,9,9,10));
	System.out.println(goleiro5.dadosGoleiro());
	
	
	Chute chute1= new Chute(1,2,4,7);
	System.out.println(chute1.Sortgoal());
	
	Chute chute2= new Chute(2,6,3,6);
	System.out.println(chute2.Sortgoal());
	
	Chute chute3= new Chute(3,9,4,15);
	System.out.println(chute3.Sortgoal());
	
	Chute chute4= new Chute(4,5,6,11);
	System.out.println(chute4.Sortgoal());
	
	Chute chute5= new Chute(5,3,8,13);
	System.out.println(chute5.Sortgoal());
	}
	
}
