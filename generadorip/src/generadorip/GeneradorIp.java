package generadorip;

public class GeneradorIp {
	
	public int generarNumero(int min, int max) {
		int numero = 5;
		if (numero > min && numero < max) {
			return numero;
		}
		return 0;
	}
}
