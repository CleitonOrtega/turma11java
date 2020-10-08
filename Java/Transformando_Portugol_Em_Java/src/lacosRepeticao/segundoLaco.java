package lacosRepeticao;

import java.util.Scanner;

public class segundoLaco {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int contadorNumero = 0;
		char opcao;
		
		do {
		contadorNumero = contadorNumero + 1;
		System.out.printf("%d",contadorNumero);	
		System.out.print("\nDeseja continuar? S - Sim ou N - Não: ");
		opcao = tec.next().toUpperCase().charAt(0);
		
		}while(opcao == 'S');

		System.out.printf("Você escolheu não, o numero final foi: %d\nObrigado por utilizar o programa!",contadorNumero);
		tec.close();
	}

}
