package questoes;
import java.util.Scanner;
public class Questao02 {
	public static String initiate() {
		
	Scanner input = new Scanner(System.in);
	int vectorOne[]= new int[5];
	int vectorTwo[]= new int[5];
	
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

		return media(vectorOne,vectorTwo);
		
	}
	
	
	
	public static String media(int[] vectorOne, int[] vectorTwo) {
		int sumOne=0;
		for(int i=0; i<vectorOne.length; i++) {
			sumOne+= vectorOne[i];
		}
		sumOne=sumOne/5;
		
		int sumTwo=0;
		for(int i=0; i<vectorTwo.length; i++) {
			sumTwo+= vectorTwo[i];
		}
		sumTwo=sumTwo/5;
		
		int mediaTotal;
		
		mediaTotal=(sumOne+sumTwo)/2;
		
		
		return "Media:" + mediaTotal;
	}
	
	
	
	public static void main(String[] args) {
		int vectorOne[]= new int[5];
		int vectorTwo[]= new int[5];
		
		System.out.println(initiate());
	
		
		

	
	}

}
