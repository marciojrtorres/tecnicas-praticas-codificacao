package solucao;

public class Moeda {

  private String simbolo = "R$";
  private int inteiro;
  private int centavos;

  public Moeda(String valor) {
    String[] partes = valor.split(" ");
    if (partes.length == 2) {
      this.simbolo = partes[0];
      String[] valores = partes[1].split(",");
      if (valores.length == 2 
          && ehInteiro(valores[0]) 
          && ehInteiro(valores[1])) {
          this.inteiro = Integer.parseInt(valores[0]);
          this.centavos = Integer.parseInt(valores[1]);
      } else {
        this.simbolo = "R$";        
      }
    }
  }
  
  private boolean ehInteiro(String s) {
    for (char c : s.toCharArray()) {
      if (!Character.isDigit(c)) {
        return false;
      }
    }
    return true;
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
    return simbolo + " " + inteiro + "," 
        + String.format("%02d", centavos);
  }
}
