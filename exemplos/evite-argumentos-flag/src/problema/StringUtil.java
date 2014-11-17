package problema;

public class StringUtil {

  public static int count(String pattern, String text, 
                          boolean isInsensitive) {

    if (isInsensitive) {
      pattern = pattern.toLowerCase();
      text = text.toLowerCase();
    }
    int count = 0;
    char[] patternChars = pattern.toCharArray();
    char[] textChars = text.toCharArray();
    for (int i = 0, j = 0; i < textChars.length; i++) {
      if (textChars[i] == patternChars[j]) {
        j++;
        if (j == patternChars.length) {
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
