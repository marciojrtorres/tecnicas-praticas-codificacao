package solucao;

public class StringUtil {

  public static int countIgnoreCase(String trecho, String string) {
    return count(trecho.toLowerCase(), string.toLowerCase());
  }

  public static int count(String trecho, String string) {
    int count = 0;
    char[] trechoCaracteres = trecho.toCharArray();
    char[] caracteres = string.toCharArray();
    for (int i = 0, j = 0; i < caracteres.length; i++) {
      if (caracteres[i] == trechoCaracteres[j++]) {
        if (j == trechoCaracteres.length) {
          count++;
          j = 0;
        }
      } else {
        j = 0;
      }
    }
    return count;
  }
}
// https://github.com/marciojrtorres/tecnicas-praticas-codificacao/blob/master/evite-argumentos-flag/src/solucao/StringUtil.java
