package Questoes;
import java.util.Scanner;
public class quest04 {

	public static void main(String[] args) {
	
	
		int num=0;
		int index=1;
		int sum=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Digite um numero:");
		num = input.nextInt();
		
		while(index<=10) {
			sum=num*index;
			System.out.println(num+"x"+index+"="+sum);
			index++;
		}
	}

}
