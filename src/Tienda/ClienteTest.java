package Tienda;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ClienteTest{
	
	@Test
	public void testGetNombre() {
		Cliente c = new Cliente ("pablo");
		assertEquals("pablo", c.getNombre());
	}
	
}
