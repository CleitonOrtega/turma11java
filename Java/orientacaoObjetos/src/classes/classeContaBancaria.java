package classes;

public class classeContaBancaria {

	public String nomeConta;
	public double valorRetirado;
	public double valorSaldo = 0.0;
	
	
	public void entradaNomeConta(String nome) {
		nomeConta = nome;
	}
	public String saidaNomeConta() {
		return nomeConta;
	}
	public void entradaValorSaldo(double saldo) {
		valorSaldo = saldo;
	}
	public double saidaValorSaldo() {
		return valorSaldo;
	}
	public void entradaValorRetirado(double valor) {
		valorRetirado = valor;
	}
	public double saidaValorRetirado() {
		return valorRetirado;
	}
	
	
	
	
	
	
	
}
