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
		System.out.print("\nDeseja continuar? S - Sim ou N - N�o: ");
		opcao = tec.next().toUpperCase().charAt(0);
		
		}while(opcao == 'S');

		System.out.printf("Voc� escolheu n�o, o numero final foi: %d\nObrigado por utilizar o programa!",contadorNumero);
		tec.close();
	}

}
