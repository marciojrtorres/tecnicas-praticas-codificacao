package problema;
public class Moeda {

  private String simbolo;
  private int inteiro;
  private int centavos;
  
  public Moeda(String valor) {
    String[] partes = valor.split(" ");
    simbolo = partes[0];
    String[] valores = partes[1].split(",");
    this.inteiro = Integer.parseInt(valores[0]);
    this.centavos = Integer.parseInt(valores[1]);
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
