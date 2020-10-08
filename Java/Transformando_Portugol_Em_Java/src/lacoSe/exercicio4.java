package lacoSe;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double numero, resultado = 0.0;
		System.out.print("Digite um numero que direi se ele é\nImpar, Par ou Negativo: ");
		System.out.println("E se for Par irei mostrar a raiz quadrada");
		System.out.print("E se for Impar irei mostrar o numero ao quadrado: ");
		numero = tec.nextDouble();
		if (numero < 0){
			System.out.printf("Você digitou %.0f, é um numero negativo",numero);
		}else if (numero == 0) {
			System.out.println("Você digitou 0, é um numero neutro");
		}else if (numero%2 == 0){
			System.out.printf("Você digitou %.0f, é um numero Par! e positivo",numero);
			resultado = Math.sqrt(numero);
			System.out.printf("\nE a raiz quadrada é: %.2f",resultado);
		}else{
			System.out.printf("Você digitou %.0f, é um numero Impar! e positivo",numero);
			resultado = Math.pow(numero,2);
			System.out.printf("\nE ele elevado ao quadrado é: %.2f",resultado);
		}
		
		tec.close();
	}

}
