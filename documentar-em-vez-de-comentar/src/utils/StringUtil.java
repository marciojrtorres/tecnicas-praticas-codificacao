package utils;

/**
 * Classe utilitária com métodos estáticos
 * usados para lidar com strings.
 * 
 * @author Márcio Torres
 * @version 1.0
 *
 */
public class StringUtil {
  
  /**
   * padchar padrão
   */
  public static final char ESPACO = ' ';

  /**
   * Centraliza uma string dado um número de
   * colunas e caractere de preenchimento, por exemplo:
   * 
   * <code>
   * center("java", 10, '#').equals("###java###")
   * </code>
   * 
   * @param string  
   *        string a ser centralizada
   * @param columns 
   *        número de colunas
   * @param padchar 
   *        caractere de preenchimento
   * 
   * @return 
   * a string centralizada precedida e seguida
   * pelo caractere de pad até o número de colunas
   * 
   * @throws IllegalArgumentException
   * se a largura for menor que o comprimento da string
   */
  public static String center(
      String string, int columns, char padchar) {
    
    if (columns < string.length()) {
      throw new IllegalArgumentException(
          String.format("largura (%d) menor que a string (%d)", 
              columns, string.length())
      );
    }

    char[] chars = string.toCharArray();

    int pads = columns - chars.length;

    char[] stringComPad = new char[columns];

    for (int i = 0; i < columns; i++) {
      if (i < pads / 2)
        stringComPad[i] = padchar;
      else if (i >= pads / 2 + chars.length)
        stringComPad[i] = padchar;
      else
        stringComPad[i] = chars[i - pads / 2];
    }

    return new String(stringComPad);
  }

}