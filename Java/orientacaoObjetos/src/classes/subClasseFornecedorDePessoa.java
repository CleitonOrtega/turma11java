package classes;

public class subClasseFornecedorDePessoa extends classePessoa{

	private double valorCredito;
	private double valorDivida;
	
	
	
	public subClasseFornecedorDePessoa(String nome,String endereco,String telefone,double valorCredito, double valorDivida) {
		super();
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	public double obterSaldo(double valorCredito,double valorDivida) {
		return valorCredito - valorDivida; 
	}
}
