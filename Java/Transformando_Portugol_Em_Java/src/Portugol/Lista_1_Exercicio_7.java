package Portugol;

import java.util.Scanner;

public class Lista_1_Exercicio_7 {

	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);
		
		int a = 0 ,b = 0,c = 0,d = 0,e = 0,f = 0;
		double x = 0.0, y = 0.0;
		
		System.out.print("Informe o valor de A: ");
		a = tec.nextInt();
		System.out.print("Informe o valor de B: ");
		b = tec.nextInt();
		System.out.print("Informe o valor de C: ");
		c = tec.nextInt();
		System.out.print("Informe o valor de D: ");
		d = tec.nextInt();
		System.out.print("Informe o valor de E: ");
		e = tec.nextInt();
		System.out.print("Informe o valor de F: ");
		f = tec.nextInt();
		
		x = ( ( (c*e) - (b*f) ) / ( (a*e) - (b*d) ) );
		y =  ( ( (a*f) - (c*d) ) / ( (a*e) - (b*d) ) );
		
		System.out.printf("\nO valor de X é: %.2f\n",x);
		System.out.printf("O valor de Y é: %.2f",y);
		
		tec.close();
	
	}

}
