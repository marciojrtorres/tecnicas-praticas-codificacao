package particionado;

public class Util {

  public static String camelizar(String str) {
    char[] strCharArray = str.toCharArray();
    int nroEspacos = contarCaracter(' ', str);
    char[] strCamelizada = new char[strCharArray.length - nroEspacos];
    for (int i = 0, j = 0; i < strCharArray.length; i++) {
      if (strCharArray[i] != ' ') {
        strCamelizada[j++] = obterMinusculaDe(strCharArray[i]);
      } else {
        strCamelizada[j++] = obterMaiusculaDe(strCharArray[++i]);
      }
    }
    return new String(strCamelizada);
  }

  public static int contarCaracter(char c, String str) {
    char[] strCharArray = str.toCharArray();
    int ocorrencias = 0;
    for (int i = 0; i < strCharArray.length; i++) {
      if (strCharArray[i] == c) {
        ocorrencias++;
      }
    }
    return ocorrencias;
  }

  public static char obterMinusculaDe(char c) {
    if (c >= 65 && c <= 90) {
      return (char) (c + 32);
    } else {
      return c;
    }
  }

  public static char obterMaiusculaDe(char c) {
    if (c >= 97 && c <= 122) {
      return (char) (c - 32);
    } else {
      return c;
    }
  }
// ...
  public static void main(String[] args) {
    System.out.println(camelizar("um texto de teste")); // umTextoDeTeste
  }
}
// https://github.com/marciojrtorres/tecnicas-praticas-codificacao/blob/master/um-problema-de-cada-vez/src/particionado/Util.java
// https://git.io/JO5c7