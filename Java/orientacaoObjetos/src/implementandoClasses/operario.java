package implementandoClasses;

import classes.classePessoa;
import classes.subClasseOperarioDePessoa;

public class operario {

	public static void main(String[] args) {
		
		classePessoa Pessoa = new classePessoa();
		subClasseOperarioDePessoa Operario = new subClasseOperarioDePessoa (Pessoa.getNome(),Pessoa.getEndereco(),Pessoa.getTelefone(),1200.02);
		
		Pessoa.setNome("Cleiton Ortega dos Santos");
		Pessoa.setEndereco("Rua Jos� da Costa Gavi�o,305");
		Pessoa.setTelefone("(11) 98053-9885");
		
		System.out.printf("O nome da pessoa �: %s",Pessoa.getNome());
		System.out.printf("\nO endere�o dele �: %s",Pessoa.getEndereco());
		System.out.printf("\nO telefone dele �: %s",Pessoa.getTelefone());
		System.out.println();
		System.out.printf("Valor produzido pelo Operario: %.2f",Operario.getValorProducao());
		System.out.printf("\nO valor para o funcionario �: %.2f",Operario.valorMonetario(Operario.getValorProducao(), 50));
		
	}

}
