package implementandoClasses;

import classes.classeCliente;

public class cliente {

	public static void main(String[] args) {
		
		classeCliente Cliente = new classeCliente();
		
		Cliente.entradaNome("Cleiton Ortega dos Santos");
		Cliente.entradaValorCompra(150);
		
		System.out.print("O nome de usuario �: ");
		Cliente.saidaNome();
		
		System.out.println();
		System.out.printf("O valor da compra foi: %.2f",Cliente.valorCompra);
		System.out.println();
		
		Cliente.valorDesconto(0.9);
		
		System.out.printf("O valor da compra com desconto foi: %.2f",Cliente.valorCompra);
	}

}
