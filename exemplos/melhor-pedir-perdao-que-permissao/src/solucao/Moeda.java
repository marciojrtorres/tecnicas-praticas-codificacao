package solucao;

public class Moeda {

  private String simbolo;
  private int inteiro;
  private int centavos;

  public Moeda(String valor) {
    try {
      String[] partes = valor.split(" ");
      this.simbolo = partes[0];
      String[] valores = partes[1].split(",");
      this.inteiro = Integer.parseInt(valores[0]);
      this.centavos = Integer.parseInt(valores[1]);
    } catch (Exception e) {
      this.simbolo = "R$";
      this.inteiro = 0;
      this.centavos = 0;
    }
  }

  public String getSimbolo() {
    return simbolo;
  }

  public int getInteiro() {
    return inteiro;
  }

  public int getCentavos() {
    return centavos;
  }

  @Override
  public String toString() {
    return simbolo + " " + inteiro + "," + String.format("%02d", centavos);
  }
}
