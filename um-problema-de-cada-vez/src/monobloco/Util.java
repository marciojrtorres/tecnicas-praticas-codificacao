package monobloco;

public class Util {

  public static String camelizar(String str) {
    char[] strCharArray = str.toCharArray();
    int nroEspacos = 0;
    for (int i = 0; i < strCharArray.length; i++) {
      if (strCharArray[i] == ' ') {
        nroEspacos++;
      }
    }
    char[] strCamelizada = new char[strCharArray.length - nroEspacos];
    for (int i = 0, j = 0; i < strCharArray.length; i++) {
      if (strCharArray[i] != ' ') {
        if (strCharArray[i] >= 65 && strCharArray[i] <= 90) {
          strCamelizada[j++] = (char) (strCharArray[i] + 32);
        } else {
          strCamelizada[j++] = strCharArray[i];
        }
      } else {
        i++;
        if (strCharArray[i] >= 97 && strCharArray[i] <= 122) {
          strCamelizada[j++] = (char) (strCharArray[i] - 32);
        } else {
          strCamelizada[j++] = strCharArray[i];
        }
      }
    }
    return new String(strCamelizada);
  }
  // ...
  public static void main(String[] args) {
    System.out.println(camelizar("um texto de teste")); // umTextoDeTeste
  }
}
// https://github.com/marciojrtorres/tecnicas-praticas-codificacao/blob/master/um-problema-de-cada-vez/src/monobloco/Util.java
// https://git.io/JO7Kl
