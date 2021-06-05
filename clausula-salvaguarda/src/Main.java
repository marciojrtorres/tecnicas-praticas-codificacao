import java.util.Date;

public class Main {

  public static void main(String[] args) {

    System.out.println(StringUtil.padleft("teste", 10, '-')); // teste-----

    System.out.println(StringUtil.padleft("teste", 3, '-')); // teste

    System.out.println(StringUtil.padright("teste", 10, '-')); // -----teste

    System.out.println(StringUtil.padcenter("teste", 10, '-')); // --teste--- ou ---teste--

  }
}