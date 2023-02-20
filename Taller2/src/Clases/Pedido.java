package Clases;

import java.util.ArrayList;

public class Pedido {
	
	//Atributos//

	private ArrayList<Producto> itemsPedido;
	
	private int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	
	//Constructor//
	
	public void pedido (int numeroPedidos, int idPedido, String nombreCliente, String direccionCliente) {
		
		numeroPedidos = this.numeroPedidos;
		idPedido = this.idPedido;
		nombreCliente = this.nombreCliente;
		direccionCliente = this.direccionCliente;
	}
	// metodos //
	
	public int getNumeroPedidos() {
		return numeroPedidos;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}

}