package solucao;
public class Main {
  public static void main(String[] args) {
    String valor = "R$ 4,95";  
    Moeda m1 = new Moeda(valor);
    System.out.println(m1.getSimbolo());
    System.out.println(m1.getInteiro());
    System.out.println(m1.getCentavos());
    System.out.println(m1);
    
    System.out.println(new Moeda("R$9,90"));  // 0,00
    System.out.println(new Moeda("R$ qqq"));  // 0,00
    System.out.println(new Moeda("R$ 9.80")); // 0,00
  }
}