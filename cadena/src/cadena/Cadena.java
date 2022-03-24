package cadena;

public class Cadena {

	public int longitud(String cadena) {
		int longitud = cadena.length();
		return longitud;
	}

	public int vocales(String cadena) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' ||
				cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || 
				cadena.charAt(i) == 'u') {
				contador++;
			}
		}
		return contador;
	}
	
	public String invertir (String cadena) {
		StringBuilder sb = new StringBuilder(cadena);
		cadena = sb.reverse().toString();
		return cadena;
	}
	
	public int contarLetra (String cadena, char caracter) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				contador ++;
			}
		}
		return contador;
	}
}
