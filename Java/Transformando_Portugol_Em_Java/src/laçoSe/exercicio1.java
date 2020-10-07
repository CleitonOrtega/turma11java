package laçoSe;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("Digite o Primeiro valor inteiro: ");
		n1 = tec.nextInt();
		System.out.print("Digite o Segundo valor inteiro: ");
		n2 = tec.nextInt();
		System.out.print("Digite o Terceiro valor inteiro: ");
		n3 = tec.nextInt();
		
		if( (n1 > n2) &&  (n1 > n3) ) {
			System.out.printf("O Primeiro valor(%d) é o maior numero entre %d,%d,%d",n1,n1,n2,n3);
		}
		else if((n2 > n1) && (n2 > n3)) {
			System.out.printf("O Segundo valor(%d) é o maior numero entre %d,%d,%d",n2,n1,n2,n3);
		}
		else if((n3 > n1) && (n3 > n2)) {
			System.out.printf("O Terceiro valor(%d) é o maior numero entre %d,%d,%d",n3,n1,n2,n3);
		}
		else {
			System.out.printf("Existe 2 numeros ou mais iguais!");
		}
		
		tec.close();
	}

}
