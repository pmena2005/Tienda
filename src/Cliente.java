import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Cliente {
	
	private String nombre;
	
	public Cliente(String nombre) {
		setNombre(nombre);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void añadirCliente(String nombre) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("clientes.csv"));
			writer.write(nombre + ",");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
