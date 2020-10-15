package classes;

public class subClasseOperarioDePessoa extends classePessoa{

	private double valorProducao;
	private double valorMonetario;
	
	public subClasseOperarioDePessoa(String nome,String endereco,String telefone,double valorProducao) {
		super(nome,endereco);
		this.valorProducao = valorProducao;
		this.valorMonetario = valorMonetario;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getValorMonetario() {
		return valorMonetario ;
	}

	public void setValorMonetario(double valorMonetario) {
		this.valorMonetario = valorMonetario ;
	}
	
	public double valorMonetario(double valorProduzido,int porcentagem) {
		return valorProduzido - ((porcentagem*valorProduzido)/100);
	}
	
}
