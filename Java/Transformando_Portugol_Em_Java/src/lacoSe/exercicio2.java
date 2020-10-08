package lacoSe;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("Digite o Primeiro valor inteiro: ");
		n1 = tec.nextInt();
		System.out.print("Digite o Segundo valor inteiro: ");
		n2 = tec.nextInt();
		System.out.print("Digite o Terceiro valor inteiro: ");
		n3 = tec.nextInt();
		System.out.println("A ordem decrescente correta é:");
		
		if (n1 <= n2 && n1 <= n3) {
            if (n2 <= n3) {
                System.out.printf("Primeiro Maior %d",n1);
                System.out.printf("\nSegundo Maior %d",n2);
                System.out.printf("\nTerceiro Maior %d",n3);
            } else {
                System.out.printf("Primeiro Maior %d",n1);
                System.out.printf("\nSegundo Maior %d",n3);
                System.out.printf("\nTerceiro Maior %d",n2);
            }
        } else if (n2 <= n1 && n2 <= n3) {
            if (n1 <= n3) {
                System.out.printf("Primeiro Maior %d",n2);
                System.out.printf("\nSegundo Maior %d",n1);
                System.out.printf("\nTerceiro Maior %d",n3);
            } else {
                System.out.printf("Primeiro Maior %d",n2);
                System.out.printf("\nSegundo Mairo %d",n3);
                System.out.printf("\nTerceiro Maior %d",n1);
            }
        } else {
            if (n1 <= n2) {
                System.out.printf("Primeiro Maior %d",n3);
                System.out.printf("\nSegundo Maior %d",n1);
                System.out.printf("\nTerceiro Maior %d",n2);
            } else {
                System.out.printf("Primeiro Maior %d",n3);
                System.out.printf("\nSegundo Maior %d",n2);
                System.out.printf("\nTerceiro Maior %d",n1);
            }
        }
		
		tec.close();
	}

}
