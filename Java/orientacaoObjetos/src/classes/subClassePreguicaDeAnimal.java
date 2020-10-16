package classes;

public class subClassePreguicaDeAnimal extends classeAnimal{

	private String maneiraDeAgir;

	public subClassePreguicaDeAnimal(String nomeRaca, int anoNasc, String somEmitido, String maneiraDeAgir) {
		super(nomeRaca, anoNasc, somEmitido);
		this.maneiraDeAgir = maneiraDeAgir;
	}

	public String getManeiraDeAgir() {
		return maneiraDeAgir;
	}

	public void setManeiraDeAgir() {
		this.maneiraDeAgir = "Subir em Árvores";
	}
	
	
	
	
	
	
	
}
