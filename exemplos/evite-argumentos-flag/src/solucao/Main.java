package solucao;

public class Main {

  public static void main(String[] args) {
    int n = StringUtil.countIgnoreCase("texto", "Um texto ou um Meta-Texto de exemplo");
    System.out.println(n == 2);
  }

}
