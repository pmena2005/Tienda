package Tienda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class Main {

	
	public static void main(String[] args) throws IOException, ParseException{
		Tienda t = new Tienda();
		Scanner scan = new Scanner(System.in);
		//t.imprimirArticulos();
		int opcion = 1;
		String nombre;
		double precio;
		int cant , id , option;
		boolean fin = false;
		Producto prodAux = null;
		ArrayList<LineaPedido> lineasPedidosAux = new ArrayList<LineaPedido>();
		while(opcion != 0) {
			System.out.println("Que quieres hacer? \n 1. Ver productos \n 2. Añadir producto \n 3. Añadir cliente \n 4. Vender productos \n 0. Salir");
			opcion = scan.nextInt();
			switch(opcion) {
			case 1: t.imprimirArticulos();break;
			case 2: 
				System.out.println("Que producto quieres añadir?");
				nombre = scan.nextLine();
				System.out.println("Cuanto va a costar?");
				precio = scan.nextDouble();
				Producto p = new Producto(nombre, precio, (int)(Math.random()*10)+1);
				t.añadirProducto(p);
			case 3: 
				System.out.println("Como se llama el cliente?");
				nombre = scan.nextLine();
				t.añadirCliente(nombre);break;
			case 4:
				do { 
					
					System.out.println("Escribe el id del producto");
					id = scan.nextInt();
					System.out.println("Escribe la cantidad del producto");
					cant = scan.nextInt();
					prodAux = t.buscarPorId(id);
					lineasPedidosAux.add(new LineaPedido(prodAux , cant));
					System.out.println("Quieres seguir con la compra?");
					option = scan.nextInt();
					fin = option == 0;
				}while(!fin);
				Pedido pedido = new Pedido(lineasPedidosAux , new Cliente("Pepe"));
				pedido.imprimirTicket();
			case 0: System.out.println("Que tenga un buen dia <3"); break;
			}
		}
	}
	
}
