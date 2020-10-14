package classes;

public class classeCliente {

	public String nomeCliente;
	public double valorCompra;
	public double valorDesconto;
		
	public void entradaNome(String nome) {
		nomeCliente = nome;
	}
	public String saidaNome() {
		return nomeCliente;
	}
	
	public void entradaValorCompra(double valor) {
		valorCompra = valor;
	}
	
	public double saidaValorCompra() {
		
		return valorCompra;
		
	}
	
public  void valorDesconto (double valor) {
		
		this.valorCompra = valorCompra * valor;
		
	}
	
}