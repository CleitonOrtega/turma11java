package array;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int vetor[] = new int[6],somaPar=0,somaImpar=0,somaInvalido=0;
		
		for(int x = 0;x < vetor.length;x++) {
			System.out.printf("\nDigite o %d° número: ",x+1);
			vetor[x] = tec.nextInt();
			
			if(vetor[x] <= 0) {
				System.out.println("\nNumero é 0 ou negativo,Numero Invalido!");
				somaInvalido++;
			}
			else if(vetor[x]%2 == 0) {
				somaPar++;
			}
			else {
				somaImpar++;
			}
		}
		
		for(int x = 0;x < vetor.length;x++) {
			
			if(vetor[x]%2 == 0 && vetor[x] > 0) {
				System.out.printf("\nO %d° número escolhido foi %d e ele é Par!: ",x+1,vetor[x]);
			}
			else if(vetor[x]%2 == 1 && vetor[x] > 0){
				System.out.printf("\nO %d° número escolhido foi %d e ele é Impar!",x+1,vetor[x]);
			}
		}
		System.out.printf("\nO total de numero(s) Pares foi: %d",somaPar);
		System.out.printf("\nO total de numero(s) Impares foi: %d",somaImpar);
		System.out.printf("\nO total de numero(s) Invalido(s) foram: %d",somaInvalido);
		tec.close();
	}

}
