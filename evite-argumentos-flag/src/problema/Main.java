package problema;

public class Main {
  public static void main(String[] args) {
    int n = StringUtil.count("texto", "Um texto ou um Grande Texto de exemplo", true);
    System.out.println(n); // quanto vale n?
    int n2 = StringUtil.count("texto", "Um texto ou um Grande Texto de exemplo", false);
    System.out.println(n2); // quanto vale n2?
  }
}
