package questoes;
import java.util.Arrays;
import java.util.Scanner;
public class Quest06 {

	int vectorOne[];
	
	public static void sortVector(int[] vectorOne) {
		int vectorSorted[]=new int[5];

		for(int i=0; i<vectorOne.length; i++) {
				for(int j=0;j<vectorOne.length-1;j++) {
					if(vectorOne[i]<vectorOne[j]) {
						int aux=vectorOne[i];
						vectorOne[i]=vectorOne[j];
						vectorOne[j]=aux;
					}
				}
		}
		for(int i=0;i<vectorOne.length;i++) {
			System.out.println("indice:" + i + " --- valor:"+vectorOne[i]);
		}
	}

	public static void populateVector(int[] vectorOne) {
		Scanner input= new Scanner(System.in);
		System.out.println("Digite os valores do vetor: ");
		for(int a=0; a<vectorOne.length;a++) {
			System.out.println("indice "+a+":");
			vectorOne[a]=input.nextInt();
		}
	}
	
	
	public static void main(String[] args) {
		int vectorOne[]= new int[5];
		
			populateVector(vectorOne);
			sortVector(vectorOne);
		
	}

}
