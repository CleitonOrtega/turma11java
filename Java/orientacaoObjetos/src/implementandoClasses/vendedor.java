package implementandoClasses;

import classes.subClasseVendedorDePessoa;

public class vendedor {

	public static void main(String[] args) {
		
		subClasseVendedorDePessoa Vendedor = new subClasseVendedorDePessoa("Cleiton","Rua jos� da costa gavi�o",100.10);

		
		System.out.printf("Nome do vendedor : %s",Vendedor.getNome());
		System.out.printf("\nResidencia: %s",Vendedor.getEndereco());
		System.out.printf("\nComiss�o: %.2f",Vendedor.getComissao());
	}

}
