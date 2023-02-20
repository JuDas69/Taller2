package Clases;

public class ProductoMenu implements Producto{
	
	// Atributos //

	private String nombre;
	private int precioBase;
	
	
	// metodos//
	public String getNombre() {
		return nombre;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public ProductoMenu(String nombre, int precioBase) {
		nombre = this.nombre;
		precioBase = this.precioBase;
	}

}