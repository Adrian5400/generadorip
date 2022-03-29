package generadorip;

public class GeneradorIp {
	
	public int generarNumero(int min, int max) {
		int numero = (int) (Math.random() * max + min);
		return numero;
	}
	
	public String generarIp() {
		StringBuilder sb = new StringBuilder();
		sb.append(generarNumero(0, 254));
		sb.append(".");
		sb.append(generarNumero(0, 254));
		sb.append(".");
		sb.append(generarNumero(0, 254));
		sb.append(".");
		sb.append(generarNumero(0, 254));
		return sb.toString();
	}
}
