package solucao;

public class DateUtil {
  private static final
    int[] diasMes = {0, 31, 28, 31, 30,
                        31, 30, 31, 31,
                        30, 31, 30, 31};

  private static final
    int FEVEREIRO = 2;
  
  private static boolean anoBissexto(int ano) {
    return ano % 400 == 0 || (ano % 4 == 0 && ano % 100 > 0);
  }
  
  private static boolean mesInvalido(int mes) {
    return mes < 1 || mes > 12;
  }
  
  public static int dias(int mes, int ano) {
    if (mesInvalido(mes)) 
      throw new IllegalArgumentException("mes invalido");
    if (anoBissexto(ano) && mes == FEVEREIRO) 
      return 29;
    return diasMes[mes];
  }
}