package implementandoClasses;

import classes.subClasseVendedorDePessoa;

public class vendedor {

	public static void main(String[] args) {
		
		subClasseVendedorDePessoa Vendedor = new subClasseVendedorDePessoa("Cleiton","Rua josé da costa gavião",100.10);

		
		System.out.printf("Nome do vendedor : %s",Vendedor.getNome());
		System.out.printf("\nResidencia: %s",Vendedor.getEndereco());
		System.out.printf("\nComissão: %.2f",Vendedor.getComissao());
	}

}
