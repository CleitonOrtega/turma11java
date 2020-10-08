package lacosRepeticao;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int numDigit = 1,contador = 0;
		double media = 0.0, soma = 0.0;
		
		System.out.println("Para sair do programa digite 0!");
		
		do{
			System.out.print("Digite um numero: ");
			numDigit = tec.nextInt();
			if(numDigit%3 == 0 && numDigit > 0) {
				soma = soma + numDigit;
				contador = contador + 1;
			}
		}while(numDigit != 0);
		
		media = (soma/contador);
		System.out.printf("A media final é %.2f",media);
		
		tec.close();

	}

}
