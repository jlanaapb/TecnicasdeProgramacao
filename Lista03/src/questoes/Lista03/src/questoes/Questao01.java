package questoes;

public class Questao01 {

	public static int somatorio(int vetorum[]){
		int soma=0;
		for(int a=0;a<(vetorum.length-1);a++)
			soma= soma+vetorum[a];
		
		return soma;
	}
	
	public static int[] povoarvetor(int vetorum[]) {
		int b=0;
		for(b=0;b<(vetorum.length-1);b++) {
			vetorum[b]=b;
			System.out.println(vetorum[b]);}
			
		return vetorum;
	}
	
	public static void main(String[] args) {

		int vetorum[]= new int[5];
		
		povoarvetor(vetorum);
		System.out.println("Soma: ");
		System.out.println(somatorio(vetorum));
		
	}

}
