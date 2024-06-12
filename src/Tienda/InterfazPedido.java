package Tienda;

import java.util.ArrayList;

public interface InterfazPedido {
	
	public Cliente C = null;
	public ArrayList<LineaPedido> articulos = new ArrayList<LineaPedido>();
	
	public double totalPedido();
	public void imprimirTicket();
	
}
