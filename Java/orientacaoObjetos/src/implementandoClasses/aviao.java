package implementandoClasses;

import java.util.Scanner;

import classes.classeAviao;

public class aviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		classeAviao Aviao = new classeAviao();
		
		final double DESCONTO = 0.8;
		
		String nomeLocal;
		
		System.out.print("Digite o pais de destino: ");
		nomeLocal = leia.next();
		Aviao.entradaPais(nomeLocal);
		Aviao.entradaValorCompra(2000);
		
		
		
		System.out.printf("O nome do pais de destino é: %s", Aviao.saidaPais());
		
		System.out.println();
		System.out.printf("O valor da compra foi: %.2f",Aviao.valorPassagem);
		System.out.println();
		
		Aviao.valorDesconto(DESCONTO);
		
		System.out.printf("O valor da compra com desconto foi: %.2f",Aviao.valorPassagem);
		
		leia.close();
	}

}
