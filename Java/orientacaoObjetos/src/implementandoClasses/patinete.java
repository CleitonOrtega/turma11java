package implementandoClasses;

import classes.classePatinete;

public class patinete {

	public static void main(String[] args) {
	
		classePatinete Patinete = new classePatinete();
		
		Patinete.entradaModelo("P-2020.15");
		Patinete.entradaAno(2020);
		Patinete.entradaValor(299.10);
		
		System.out.printf("Modelo: %s",Patinete.saidaModelo());
		System.out.printf("\nO ano de lan�amento �: %d",Patinete.saidaAno());
		System.out.printf("\nO valor atual �: %.2f",Patinete.saidaValor());
		
	}
}
