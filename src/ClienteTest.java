import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ClienteTest{
	
	@Test
	public void testGetNombre() {
		Cliente c = new Cliente ("pablo");
		assertEquals("pablo", c.getNombre());
	}
	
	
	@Test
	public void testAñadirCliente() {
		Cliente cliente = new Cliente("Juan");
	    cliente.añadirCliente("Pedro");
	    try (BufferedReader reader = new BufferedReader(new FileReader("clientes.csv"))) {
	    	String linea = reader.readLine();
	        assertEquals("Pedro,", linea);
	    } catch (IOException e) {
	    	e.printStackTrace();
	        }
	}
}
