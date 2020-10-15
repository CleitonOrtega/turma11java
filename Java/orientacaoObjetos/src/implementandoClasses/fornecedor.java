package implementandoClasses;

import classes.classePessoa;
import classes.subClasseFornecedorDePessoa;

public class fornecedor {

	public static void main(String[] args) {
		
		classePessoa Pessoa = new classePessoa();
		subClasseFornecedorDePessoa Forn = new subClasseFornecedorDePessoa(Pessoa.getNome(),Pessoa.getEndereco(),Pessoa.getTelefone(),2149, 2148.50);
		
		Pessoa.setNome("Felipe Ortega dos santos");
		Pessoa.setEndereco("Rua Jos� da Costa Gavi�o,305");
		Pessoa.setTelefone("Sem est� informa��o!");
		
		System.out.printf("O nome da pessoa �: %s",Pessoa.getNome());
		System.out.printf("\nO endere�o dele �: %s",Pessoa.getEndereco());
		System.out.printf("\nO telefone dele �: %s",Pessoa.getTelefone());
		System.out.printf("\nO total de Credito dele �: %.2f",Forn.getValorCredito());
		System.out.printf("\nO total de Divida dele �: %.2f",Forn.getValorDivida());
		System.out.printf("\nO credito restante dela �: %.2f",Forn.obterSaldo(Forn.getValorCredito(), Forn.getValorDivida()));
	}

}
