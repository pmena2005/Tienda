package Tienda;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;
import org.junit.Test;

public class TiendaTest {
	
	@Test
	public void testGenerarListado() throws IOException, ParseException {
		Tienda t = new Tienda();
		ArrayList <Producto> p = t.generarListado();
		assertTrue(p.size() > 0);
	}
	
}
