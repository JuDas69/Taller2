package Clases;
import java.util.ArrayList;

public class Combo implements Producto {

	// atributos //
	
	private String nombreCombo;
	private int descuento;
	private ArrayList<String> itemsProducto;
	
	// metodos //
	
	public String getDescuentCombo() {
		return nombreCombo;
	}
	public int getDescuento() {
		return descuento;
	}
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getPrecioBase() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public Combo(String nombreCombo, int descuento, ArrayList <String> itemsProducto) {
		
		nombreCombo = this.nombreCombo;
		descuento = this.descuento;
		itemsProducto = this.itemsProducto;
				
	}
	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
