public class Main1 {
  public static void main(String[] args) {
    long inicio = System.currentTimeMillis();
    StringBuilder s1 = new StringBuilder("teste");
    for (int i = 0; i < 10000; i++) {
      s1.append(", testando, ");
    }
    String s2 = s1.toString(); // instancia a string resultante dos appends
    long fim = System.currentTimeMillis();
    System.out.println((fim - inicio) + "ms");

  }
}