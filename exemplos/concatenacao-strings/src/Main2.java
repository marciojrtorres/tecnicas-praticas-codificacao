public class Main2 {
  public static void main(String[] args) {
    long inicio = System.currentTimeMillis();
    String s1 = "teste";
    for (int i = 0; i < 10000; i++) {
      s1 = s1 + ", testando, ";
    }
    long fim = System.currentTimeMillis();
    System.out.println((fim - inicio) + "ms");
  }
}