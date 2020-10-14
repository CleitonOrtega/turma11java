package classes;

public class classePatinete {

	
	
	public String nomeModelo;
	public int anoLanc;
	public double valorModelo;

	
	public void entradaModelo(String nome) {
		nomeModelo = nome;
	}
	public String saidaModelo() {
		return nomeModelo;
	}
	public void entradaAno(int ano) {
		anoLanc = ano;
	}
	public int saidaAno() {
		return anoLanc;
	}
	public void entradaValor(double valor) {
		valorModelo = valor;
	}
	public double saidaValor() {
		return valorModelo;
	}
	
	
}
