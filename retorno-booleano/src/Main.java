public class Main {
	public static void main(String[] args) {
		System.out.println(inexperiente.NumberUtil.ehImpar(3)); // true
		System.out.println(inexperiente.NumberUtil.ehImpar(4)); // false
		
		System.out.println(inexperiente.NumberUtil.ehNegativo(3));  // false
		System.out.println(inexperiente.NumberUtil.ehNegativo(-3)); // true
		
		System.out.println(inexperiente.NumberUtil.ehNumero("644988")); // true
		System.out.println(inexperiente.NumberUtil.ehNumero("431a31")); // false
		System.out.println(inexperiente.NumberUtil.ehNumero("a98898")); // false
		
		System.out.println(profissional.NumberUtil.ehImpar(3)); // true
    System.out.println(profissional.NumberUtil.ehImpar(4)); // false
    
    System.out.println(profissional.NumberUtil.ehNegativo(3));  // false
    System.out.println(profissional.NumberUtil.ehNegativo(-3)); // true
    
    System.out.println(profissional.NumberUtil.ehNumero("644988")); // true
    System.out.println(profissional.NumberUtil.ehNumero("431a31")); // false
    System.out.println(profissional.NumberUtil.ehNumero("a98898")); // false
	}
}