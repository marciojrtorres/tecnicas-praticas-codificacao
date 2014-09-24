public class StringUtil {

    public static boolean eq(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        if (chars1.length != chars2.length) return false;

        for (int i = 0; i < chars1.length; i++) if (chars1[i] != chars2[i]) return false;

        return true;
    }

    public static String pad_velho(String s, int largura,
                             char pad, boolean esquerda) {

        char[] chars = s.toCharArray();

        int faltam = largura - chars.length; // 10 - daniel.length == 4

        char[] stringComPad = new char[largura]; // ex.: 10

        for (int i = 0; i < largura; i++) {
            if (esquerda) {
                if (i < faltam) stringComPad[i] = pad;
                else stringComPad[i] = chars[i - 4];
            } else {
                if (i < chars.length) stringComPad[i] = chars[i];
                else stringComPad[i] = pad;
            }
        }

        // [-,-,-,-,_,_,_,_,_,_]
        // ----
        //     daniel
        // for (int i = i; i < chars.length; i++)
        //    stringComPad[i + 4] = chars[i];

        // [d,a,n,i,e,l]
        // [-,-,-,-,_,_,_,_,_,_]
        //          ^
        // i = 4
        //

        return new String(stringComPad);
    }

    public static String padleft(String s, int largura, char pad) {
        char[] chars = s.toCharArray();

        int faltam = largura - chars.length;

        char[] stringComPad = new char[largura];

        for (int i = 0; i < largura; i++) {
            if (i < faltam) stringComPad[i] = pad;
            else stringComPad[i] = chars[i - faltam];
        }

        return new String(stringComPad);
    }

    public static String padright(String s, int largura, char pad) {
        char[] chars = s.toCharArray();

        int faltam = largura - chars.length;

        char[] stringComPad = new char[largura];

        for (int i = 0; i < largura; i++) {
            if (i < chars.length) stringComPad[i] = chars[i];
            else stringComPad[i] = pad;
        }

        return new String(stringComPad);
    }

    public static String padcenter(String s, int largura, char pad) {

        char[] chars = s.toCharArray();

        int faltam = largura - chars.length;

        char[] stringComPad = new char[largura];

        for (int i = 0; i < largura; i++) {
            if (i < faltam) stringComPad[i] = pad;
            else stringComPad[i] = chars[i - faltam];
        }

        return new String(stringComPad);
    }

}
