package laçoSe;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int x,y,z;
		System.out.print("Digite o Primeiro valor inteiro: ");
		x = tec.nextInt();
		System.out.print("Digite o Segundo valor inteiro: ");
		y = tec.nextInt();
		System.out.print("Digite o Terceiro valor inteiro: ");
		z = tec.nextInt();
		System.out.println("A ordem decrescente correta é:");
		
		if (x <= y && x <= z) {
            if (y <= z) {
                System.out.printf("Primeiro %d",x);
                System.out.printf("\nSegundo %d",y);
                System.out.printf("\nTerceiro %d",z);
            } else {
                System.out.printf("Primeiro %d",x);
                System.out.printf("\nSegundo %d",z);
                System.out.printf("\nTerceiro %d",y);
            }
        } else if (y <= x && y <= z) {
            if (x <= z) {
                System.out.printf("Primeiro %d",y);
                System.out.printf("\nSegundo %d",x);
                System.out.printf("\nTerceiro %d",z);
            } else {
                System.out.printf("Primeiro %d",y);
                System.out.printf("\nSegundo %d",z);
                System.out.printf("\nTerceiro %d",x);
            }
        } else {
            if (x <= y) {
                System.out.printf("Primeiro %d",z);
                System.out.printf("\nSegundo %d",x);
                System.out.printf("\nTerceiro %d",y);
            } else {
                System.out.printf("Primeiro %d",z);
                System.out.printf("\nSegundo %d",y);
                System.out.printf("\nTerceiro %d",x);
            }
        }
		
		tec.close();
	}

}
