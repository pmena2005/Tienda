package Tienda;

import java.util.ArrayList;

public class Pedido implements InterfazPedido{
	
	public Cliente cliente = null;
	public ArrayList<LineaPedido> articulos = new ArrayList<LineaPedido>();
	
	public Pedido( ArrayList<LineaPedido> lineas , Cliente c) {
		setArticulos(lineas);
		setCliente(c);
	}

	private void setCliente(Cliente c) {
		this.cliente = c;
	}

	private void setArticulos(ArrayList<LineaPedido> lineas) {
		this.articulos = lineas;
	}
	
	public ArrayList<LineaPedido> getArticulos(){
		return this.articulos;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}

	@Override
	public double totalPedido() {
		double total = 0;
		for(LineaPedido p : this.getArticulos()){
			total += p.precioLinea;
		}
		return total;
	}

	@Override
	public void imprimirTicket() {
		Cliente cliente = this.getCliente();
		System.out.println("---------TICKET---------");
		System.out.println("Cliente: " + cliente.toString());
		System.out.println("------------------------");
		System.out.println("Articulo: " );
		for(LineaPedido p : this.getArticulos()){
			System.out.println(p.toString());
		}
		System.out.println("------------------------");
		System.out.println("TOTAL: " + this.totalPedido());
		System.out.println("------------------------");

	}

}
