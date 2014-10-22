public class Main {

  public static void main(String[] args) {
    String entrada = "texto de teste";
    String saida = Joiner.join(entrada, "*");
    System.out.println(saida); // texto*de*teste
    saida = Joiner.join(entrada, "#");
    System.out.println(saida); // texto#de#teste
    saida = Joiner.join(entrada);
    System.out.println(saida); // texto_de_teste
  }
}
