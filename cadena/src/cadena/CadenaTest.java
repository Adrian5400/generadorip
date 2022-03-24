package cadena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaTest {
	private Cadena cadena;
	@Test
	void test() {
		cadena = new Cadena ();
	}
	public void longitud() {
		test();
		assertTrue(cadena.longitud("Hola") == 4);
	}

	public void vocales() {
		test();
		assertTrue(cadena.vocales("Hola") == 2);
	}
	
	public void invertir() {
		test();
		assertTrue(cadena.invertir("Hola") == "aloH");
	}
	
	public void contarLetra() {
		test();
		assertTrue(cadena.contarLetra("Hola", 'l') == 1);
	}
}
