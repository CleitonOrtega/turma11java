package array;

public class exercicio1 {

	public static void imprimirVetor() {
		int vetorA[] = {1,0,5,-2,-5,7},soma = 0;
		
		for(int x = 0;x < vetorA.length;x++) {
			System.out.printf("\n%d",vetorA[x]);
		}
	}
	
	public static void main(String[] args) {
		
		int vetorA[] = {1,0,5,-2,-5,7},x,soma = 0;
		
		
		System.out.println("A) O vetor é: ");
		imprimirVetor();
		
		System.out.println();
		soma = vetorA[0] + vetorA[1] + vetorA[5];
		System.out.printf("B)A soma nas posições 0,1 e 5 do Vetor é: %d",soma);
		System.out.println();
		
		vetorA[4] = 100;
		System.out.printf("\nC) O vetor de 4° posição é: %d, com a soma de 100 ele vira: %d",vetorA[4]-100,vetorA[4]);
		System.out.println("\n");
		
		System.out.println("D) Os valores do vetor são: ");
		for(x = 0;x < vetorA.length;x++) {
			System.out.printf("\n%d",vetorA[x]);
		}
		
	}

}
