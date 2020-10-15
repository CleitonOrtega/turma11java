package implementandoClasses;

import classes.classePessoa;
import classes.subClasseFornecedorDePessoa;

public class fornecedor {

	public static void main(String[] args) {
		
		classePessoa Pessoa = new classePessoa();
		subClasseFornecedorDePessoa Forn = new subClasseFornecedorDePessoa(Pessoa.getNome(),Pessoa.getEndereco(),Pessoa.getTelefone(),2149, 2148.50);
		
		Pessoa.setNome("Felipe Ortega dos santos");
		Pessoa.setEndereco("Rua José da Costa Gavião,305");
		Pessoa.setTelefone("Sem está informação!");
		
		System.out.printf("O nome da pessoa é: %s",Pessoa.getNome());
		System.out.printf("\nO endereço dele é: %s",Pessoa.getEndereco());
		System.out.printf("\nO telefone dele é: %s",Pessoa.getTelefone());
		System.out.printf("\nO total de Credito dele é: %.2f",Forn.getValorCredito());
		System.out.printf("\nO total de Divida dele é: %.2f",Forn.getValorDivida());
		System.out.printf("\nO credito restante dela é: %.2f",Forn.obterSaldo(Forn.getValorCredito(), Forn.getValorDivida()));
	}

}
