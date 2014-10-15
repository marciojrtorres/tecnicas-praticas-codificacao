public class NumberUtil2 {

	public static boolean ehImpar(int numero) {
		return numero % 2 != 0;		
	}
	
	public static boolean ehNegativo(int numero) {
		return numero < 0;			
	}
	
	public static boolean ehNumero(String str) {
		for (char c : str.toCharArray()) {
			if ( ! Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
}