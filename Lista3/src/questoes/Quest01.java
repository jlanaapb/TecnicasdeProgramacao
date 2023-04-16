package questoes;
import java.util.Scanner;
public class Quest01 {

	public static int somatorio(int vetorum[]){
		int soma=0;
		for(int a=0;a<(vetorum.length-1);a++)
			soma= soma+vetorum[a];
		
		return soma;
	}
	
	public static int[] povoarvetor(int vetorum[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite os valores do vetor: ");
		for(int a=0; a<vetorum.length;a++) {
			System.out.println("indice "+a+":");
			vetorum[a]=input.nextInt();
		}
		return vetorum;
	}
	
	public static void main(String[] args) {

		int vetorum[]= new int[5];
		
		povoarvetor(vetorum);
		System.out.println("Soma: ");
		System.out.println(somatorio(vetorum));
		
	}

}
