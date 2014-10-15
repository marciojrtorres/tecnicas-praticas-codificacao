public class Main {

	public static void main(String[] args) {

		System.out.println(NumberUtil.ehImpar(3)); // true
		System.out.println(NumberUtil.ehImpar(4)); // false
		
		System.out.println(NumberUtil.ehNegativo(3));  // false
		System.out.println(NumberUtil.ehNegativo(-3)); // true
		
		Pessoa p = new Pessoa();
		p.setNome("Alguem");
		
		p.setIdade(20);		
		System.out.println(p.isMaior()); // true
		p.setIdade(18);		
		System.out.println(p.isMaior()); // true
		p.setIdade(17);		
		System.out.println(p.isMaior()); // false
		
		
		System.out.println(NumberUtil.ehNumero("644988")); // true
		System.out.println(NumberUtil.ehNumero("431a31")); // false
		System.out.println(NumberUtil.ehNumero("a98898")); // false	

	}

}