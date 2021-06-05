package solucao;

public class Data {
  private static final int[] diasMes = {0, // HACK (ou KLUGE) do índice nulo
          31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  // mês:   1   2   3   4   5   6   7   8   9   10   11   12
  private static final int FEVEREIRO = 2;

  private static boolean anoBissexto(int ano) {
    return ano % 400 == 0 || (ano % 4 == 0 && ano % 100 > 0);
  }

  private static boolean mesInvalido(int mes) {
    return mes < 1 || mes > 12;
  }

  public static int dias(int mes, int ano) {
    if (mesInvalido(mes)) {
      throw new IllegalArgumentException("Mês não é válido");
    }
    if (anoBissexto(ano) && mes == FEVEREIRO) {
      return 29;
    }
    return diasMes[mes];
  }
}