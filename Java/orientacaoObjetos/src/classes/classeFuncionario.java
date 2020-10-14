package classes;

public class classeFuncionario {

	public String nomeFuncionario;
	public int idadeFuncionario;
	public double salarioFuncionario;

	
	public void entradaNome(String nome) {
		nomeFuncionario = nome;
	}
	public String saidaNome() {
		return nomeFuncionario;
	}
	public void entradaIdade(int i) {
		idadeFuncionario = i;
	}
	public int saidaIdade() {
		return idadeFuncionario;
	}
	public void entradaSalario(double sal) {
		salarioFuncionario = sal;
	}
	public double saidaSalario() {
		return salarioFuncionario;
	}
}
