package questoes;

import java.util.Scanner;

public class Quest10 {

	public static void initiate(float[] vectorOne, float[] vectorTwo) {
		Scanner input= new Scanner(System.in);

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
	}
	
	public static void equality(float[] vectorOne, float[] vectorTwo) {
	
		for(int a=0,b=0;a<vectorTwo.length;a++,b++) {
			if(vectorOne[a]==vectorTwo[b])
				System.out.println("os valores do índice "+a+" em ambos os vetores são iguais");
		}	
	}
	
	public static void main(String[] args) {
		float vectorOne[]= new float[5];
		float vectorTwo[]= new float[5];
		initiate(vectorOne, vectorTwo);
		equality(vectorOne, vectorTwo);
	}

}
