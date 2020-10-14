package implementandoClasses;

import classes.classeContaBancaria;

public class contaBancaria {

	public static void main(String[] args) {


		classeContaBancaria Banco = new classeContaBancaria();
		
		Banco.entradaNomeConta("Cleiton Ortega dos Santos");
		Banco.entradaValorSaldo(1987.28);
		Banco.entradaValorRetirado(299.10);
		
		System.out.printf("O titular da conta é: %s",Banco.saidaNomeConta());
		System.out.printf("\nO valor atual é: %.2f",Banco.saidaValorSaldo());
		System.out.printf("\nO ultimo valor retirado foi: %.2f",Banco.saidaValorRetirado());

	}

}
