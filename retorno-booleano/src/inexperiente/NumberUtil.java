package inexperiente;

public class NumberUtil {

	public static boolean ehImpar(int numero) {
		if (numero % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean ehNegativo(int numero) {
		if (numero < 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean ehNumero(String str) {
		int numeros = 0;
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				numeros++;
			}
		}
		if (numeros == str.length()) {
			return true;
		} else {
			return false;
		}
	}
}
