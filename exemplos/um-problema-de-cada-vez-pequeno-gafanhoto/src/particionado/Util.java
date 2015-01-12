package particionado;

public class Util {

  public static String cameliza(String str) {
    char[] strCharArray = str.toCharArray();
    int nroEspacos = conta(' ', str);
    char[] strCamelizada = new char[strCharArray.length - nroEspacos];
    for (int i = 0, j = 0; i < strCharArray.length; i++) {
      if (strCharArray[i] != ' ') {
        strCamelizada[j++] = minuscula(strCharArray[i]);
      } else {
        strCamelizada[j++] = maiuscula(strCharArray[++i]);
      }
    }
    return new String(strCamelizada);
  }

  public static int conta(char c, String str) {
    char[] strCharArray = str.toCharArray();
    int ocorrencias = 0;
    for (int i = 0; i < strCharArray.length; i++) {
      if (strCharArray[i] == c) {
        ocorrencias++;
      }
    }
    return ocorrencias;
  }

  public static char minuscula(char c) {
    if (c >= 65 && c <= 90) {
      return (char) (c + 32);
    } else {
      return c;
    }
  }

  public static char maiuscula(char c) {
    if (c >= 97 && c <= 122) {
      return (char) (c - 32);
    } else {
      return c;
    }
  }

  public static void main(String[] args) {
    System.out.println(cameliza("um texto de teste"));
  }
}