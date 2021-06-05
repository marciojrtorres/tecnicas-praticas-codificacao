package problema;

public class StringUtil {

  public static int count(String trecho, String string, boolean indiferente) {

    if (indiferente) { // se a caixa não importa, trata todas em minúsculas.
      trecho = trecho.toLowerCase();
      string = string.toLowerCase();
    }

    int count = 0;
    char[] caracteresTrecho = trecho.toCharArray();
    char[] caracteres = string.toCharArray();
    // sim, eu vou implementar a contagem no 💪
    for (int i = 0, j = 0; i < caracteres.length; i++) {
      if (caracteres[i] == caracteresTrecho[j++]) {
        if (j == caracteresTrecho.length) {
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
// https://github.com/marciojrtorres/tecnicas-praticas-codificacao/blob/master/evite-argumentos-flag/src/problema/StringUtil.java
