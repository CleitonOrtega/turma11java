package lacosRepeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int num = 0,contPar = 0,contImpar = 0,x = 0;
		
		for(x = 0;x < 10;x++) {
			System.out.print("Digite um numero: ");
			num = tec.nextInt();
			if(num%2 == 0) {
				contPar = contPar + 1;
			}else {
				contImpar = contImpar + 1;
			}
		}

		System.out.printf("\nO total de numeros Pares foi: %d",contPar);
		System.out.printf("\nO total de numeros Impares foi: %d",contImpar);
		
		tec.close();
	}

}
