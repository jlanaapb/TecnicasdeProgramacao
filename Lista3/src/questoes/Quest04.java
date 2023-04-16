package questoes;
import java.util.Scanner;

public class Quest04 {
	
	public static void countElements(float[] vectorOne,float[] vectorTwo) {
		Scanner input= new Scanner(System.in);
		int b=0;
		int quantidade=0;
		
		System.out.println(" Qual elemento deve ser buscado?");
		float element = input.nextInt();
	

		for(int a=0;a<vectorOne.length;a++) {
			
			if(vectorOne[a]==element) {
				b++;
				quantidade+=b;}
		}

		for(int a=0;a<vectorTwo.length;a++) {
			if(vectorTwo[a]==element) {
				b++;
				quantidade+=b;}
			
		}
		System.out.println("o elemento "+element+" apareceu "+b+" vezes");
	}
	
	public static void initiate() {
		Scanner input= new Scanner(System.in);
		float vectorOne[]= new float[5];
		float vectorTwo[]= new float[5];
		
			System.out.println("Digite os valores do primeiro vetor: ");
				for(int a=0; a<vectorOne.length;a++) {
					System.out.println("indice "+a+":");
					vectorOne[a]=input.nextInt();
				}
		
			System.out.println("Digite os valores do segundo vetor: ");
				for(int b=0; b<vectorTwo.length;b++) {
					System.out.println("indice "+b+":");
					vectorTwo[b]=input.nextInt();
				}
			
				countElements(vectorOne, vectorTwo);
	}
	public static void main(String[] args) {
		initiate();
		
		
		
	}

}
