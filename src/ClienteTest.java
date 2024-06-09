import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.junit.internal.JUnitSystem;

public class ClienteTest{
	
	@Test
	public void testGetNombre() {
		Cliente c = new Cliente ("pablo");
		assertEquals("pablo", c.getNombre());
	}
	
	@Test
	//no se hacerlo
	public void testAñadirCliente() {
		
	}
	
}
