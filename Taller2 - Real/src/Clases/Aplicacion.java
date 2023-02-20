package Clases;
import java.util.Scanner;
import java.util.ArrayList;

public class Aplicacion {
	
	private static Restaurante restaurante;

	
	
	public static void main(String[] args) {
		
		
		Restaurante restaurante1 = new Restaurante();
		restaurante = restaurante1;
	
		new Aplicacion();
		
	}
	
	public void mostrarMenu() {
		
		
		System.out.println("---BIENVENIDO, DIGITE UNA OPCION PARA CONTINUAR---");
		
		System.out.println("-1) Cargar informacion menu.");
		System.out.println("-2) Iniciar pedido.");
		System.out.println("-3) Agregar un elemento a un pedido.");
		System.out.println("-4) Cerrar pedido y guardar factura.");
		System.out.println("-5) Consultar pedido.");
		
	}
	public Aplicacion() {
		
		mostrarMenu();
		Scanner sc = new Scanner(System.in);
		
		int opcion = sc.nextInt();
		
		if (opcion == 1) {
			
			cargarMenu();
			
			System.out.println("La informacion se cargo correctamente.");
		
		}
		
	}
	
	public void cargarMenu () {
		
		restaurante.cargarDatos();
		
		}
		
	}
	
