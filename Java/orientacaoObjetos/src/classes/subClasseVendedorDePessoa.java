package classes;

public class subClasseVendedorDePessoa extends classePessoa{

	private double valorVendas;
	private double comissao;
	
	
	
	public subClasseVendedorDePessoa(String nome, String endereco, double valorVendas) {
		super(nome, endereco);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao = (valorVendas - ((20*valorVendas)/100));
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
