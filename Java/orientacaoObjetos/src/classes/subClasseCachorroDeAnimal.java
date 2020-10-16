package classes;

public class subClasseCachorroDeAnimal extends classeAnimal{

	private String maneiraDeAgir;


	public subClasseCachorroDeAnimal(String nomeRaca, int anoNasc, String somEmitido) {
		super(nomeRaca, anoNasc, somEmitido);
	}


	public String getManeiraDeAgir() {
		return maneiraDeAgir;
	}


	public void setManeiraDeAgir() {
		this.maneiraDeAgir = "Correr";
	}
	
}