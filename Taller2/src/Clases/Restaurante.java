package Clases;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Restaurante {
	
	//Atributos//

	private ArrayList<Ingrediente> ingredientes;
	private ArrayList<ProductoMenu> menuBase;
	private ArrayList<Pedido> pedidos;
	private ArrayList<Combo> combos;
	private ArrayList <Pedido> pedidoEnCurso;
	
	//procesamiento//
	
	public void cargarDatos() {
		
		try {
			
			ingredientes = new ArrayList<Ingrediente>();
			combos = new ArrayList<Combo>();
			menuBase = new ArrayList<ProductoMenu>();
			
			leer("./data/ingredientes.txt", 1);
			leer("./data/menu.txt", 2);
			leer("./data/combos.txt", 3);
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		System.out.println("los Ingredientes son: " );
		System.out.println("Los productos son : " + menuBase);
		System.out.println("Los combos son : "+ combos);
	}
	
	private void leer(String nombre, int opcion) throws IOException{
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		while(linea!=null) {
			String [] datos = linea.split(";");
			
			
		//////////////////////////////////////////////
			if (opcion == 1) {
				
				
			String nombreIngrediente = datos[0];
			
			int precioIngrediente = Integer.parseInt(datos[1]);
			
			
			Ingrediente ingrediente = new Ingrediente(nombreIngrediente, precioIngrediente);
			ingredientes.add(ingrediente);
			}
		//////////////////////////////////////////////
			if (opcion == 2) {
				
				
				String nombreProducto = datos[0];
				
				int precioProducto = Integer.parseInt(datos[1]);
				
				
				ProductoMenu producto = new ProductoMenu(nombreProducto, precioProducto);
				menuBase.add(producto);
			}
				
		///////////////////////////////////////////////
			if (opcion == 3) {
				
				String nombreCombo = datos[0];
				int descuento = Integer.parseInt(datos[1].replaceAll("%", ""));
				ArrayList<String> productos = new ArrayList<>();
				
				productos.add(datos[2]); productos.add(datos[3]); productos.add(datos[4]);
				
				Combo combo = new Combo(nombreCombo, descuento, productos);
				
				combos.add(combo);
				
			}
				
			
			
			linea = lector.readLine();
		}
		lector.close();
	
	}	
	
	
	//Metodos//
	
	
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public ArrayList<ProductoMenu> getMenuBase() {
		return menuBase;
	}
	public ArrayList<Pedido> getPedidios() {
		return pedidos;
	}
	public ArrayList<Combo> getCombos() {
		return combos;
	}
	public ArrayList<Pedido> getPedidoEnCurso() {
		return pedidoEnCurso;
	}
}
		
	

