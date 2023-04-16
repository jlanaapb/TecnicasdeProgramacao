package questoes;

import java.util.Scanner;

public class Quest13 {

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
			
				equalElements(vectorOne, vectorTwo);
	}

	public static void equalElements(float[] vectorOne,float[] vectorTwo) {
	
		float equal[]=new float[5];
		float elem=0;
		
		for(int i=0; i<vectorOne.length; i++) {
			for(int j=0;j<vectorOne.length-1;j++) {
				if(vectorOne[i]==vectorTwo[j])
					elem = vectorOne[i];
					equal[i]= elem;
				}
			}
		
		for(int b=0;b<equal.length;b++)
			System.out.println(equal[b]);
	}
	public static void main(String[] args) {
		float vectorOne[]= new float[5];
		float vectorTwo[]= new float[5];

		initiate(vectorOne, vectorTwo);
		equalElements(vectorOne, vectorTwo);
	}

}
