package classes;

public class classePaciente {

	public String nomePaciente;
	public String doenca;
	public int idade;
	
	public void nomePaciente(String nome) {
		nomePaciente = nome;
	}
	public String saidaNomePaciente() {
		return nomePaciente;
	}
	
	public void doenca(String motivo) {
		doenca = motivo;
	}
	public String saidaDoenca() {
		return doenca;
	}
	public void anoNasc(int Nasc) {
		idade = 2020-Nasc;
	}
	public int saidaIdade() {
		return idade;
	}
	
	
	
}
