package problema;

public class Util2 {

  public static int dias(int mes, int ano) {
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
        mes == 8 || mes == 10|| mes == 12)
      return 31;
    else if (mes == 2 && ((ano % 400 == 0)
        || (ano % 4 == 0 && ano % 100 > 0)))
      return 29;
    else if (mes == 2)
      return 28;
    else if (mes == 4 || mes == 6 ||
        mes == 9 || mes == 11)
      return 30;
    throw new IllegalArgumentException("mes invalido");
  }
}