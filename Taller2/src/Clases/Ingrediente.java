package Clases;

public class Ingrediente {
	
	// atributos //

	private String nombreIngrediente;
	private int costoAdicional;
	
	// metodos //
	
	public String getNombre() {
		return nombreIngrediente;
	}
	public int getCostoAdicional() {
		return costoAdicional;
	}
	
	//Contructor//
	
	public Ingrediente(String nombreIngrediente, int costoAdicional) {
		
		nombreIngrediente = this.nombreIngrediente;
		costoAdicional = this.costoAdicional;
	}
	
}
