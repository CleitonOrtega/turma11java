package lacosRepeticao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int soma = 0,numDigit = 1;
		
		System.out.println("Para sair do programa digite 0!");
		
		do{
			System.out.print("Digite um numero: ");
			numDigit = tec.nextInt();
			soma = soma + numDigit;
			
		}while(numDigit != 0);
		
		System.out.printf("\nA soma de todos os numeros digitados foi: %d",soma);
		
		tec.close();
	}

}
