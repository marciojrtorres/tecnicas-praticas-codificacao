package problema;

public class DateUtil {

  public static int dias(int mes, int ano) {
    if (mes == 1) {
      return 31;
    } else if (mes == 2) {
      if (ano % 400 == 0) {
        return 29;
      } else {
        if (ano % 4 == 0 && ano % 100 > 0) {
          return 29;
        } else {
          return 28;
        }
      }
    } else if (mes == 3) {
      return 31;
    } else if (mes == 4) {
      return 30;
    } else if (mes == 5) {
      return 31;
    } else if (mes == 6) {
      return 30;
    } else if (mes == 7) {
      return 31;
    } else if (mes == 8) {
      return 31;
    } else if (mes == 9) {
      return 30;
    } else if (mes == 10) {
      return 31;
    } else if (mes == 11) {
      return 30;
    } else if (mes == 12) {
      return 31;
    } else {
      throw new IllegalArgumentException("mes invalido");
    }
  }
  
  public static void main(String[] args) {
    System.out.println(DateUtil.dias(8, 2015));
    System.out.println(DateUtil.dias(2, 2016));
  }
}
