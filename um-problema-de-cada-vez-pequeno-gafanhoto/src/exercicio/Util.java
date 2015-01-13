package exercicio;

public class Util {
  
  /*
   * A função de camelizar pode ser realizada em
   * três subfunções simples:
   * dividir, capitalizar e juntas
   * por exemplo:
   * cameliza("um dois tres teste")
   *   divide("um dois tres teste", ' ') == ["um", "dois", "tres", "teste"]
   *   capitaliza("dois"), capitaliza("tres"), capitaliza("teste") == ["um", "Dois", "Tres", "Teste"]   
   *   junta(["um", "Dois", "Tres", "Teste"]) == "umDoisTresTeste"
   *   
   * Regra geral: 
   * não usar métodos da API do Java como toUpperCase(), length(), etc.
   */
  
  
  public static String cameliza(String str) {
    String[] palavras = divide(str, ' ');
    for (int i = 1; i < palavras.length; i++) {
      palavras[i] = capitaliza(palavras[i]);
    }
    return junta(palavras);
  }
  
  private static String[] divide(String str, char c) {
    // TODO dividir (split) string
    // entra str = "um texto exemplo", c = ' '
    // sai ["um", "texto", "exemplo"]
    return null;
  }
  
  private static String capitaliza(String str) {
    // TODO tornar a primeira letra maiúscula e o resto minúscula
    // entra str = "texto"
    // sai "Texto"
    return null;
  }

  private static String junta(String[] strings) {
    // TODO juntar array de string
    // entra strings = ["um", "array", "de", "string"]
    // sai umarraydestring
    return null;
  }

  public static void main(String[] args) {
    // Casos de Teste:
    System.out.println(cameliza("uma string de teste"));
    System.out.println(cameliza("uma string de teste").equals("umaStringDeTeste"));
  }

}