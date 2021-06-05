package fabrica;

public class Dado {

  private int valor;
  private final int lados;

  private Dado(int lados) {
      this.lados = lados;
  }
  
  public static Dado lados(int lados) {
    return new Dado(lados);
  }
  
  public static Dado seisLados() {
    return new Dado(6);
  }
  
  public int getLados() {
    return lados;
  }
  
  public void joga() {
    this.valor = (int) (Math.random() * lados + 1);
  }
  
  public int getValor() {
    return valor;
  }
  
  @Override
  public String toString() {    
    return "Dado(lados:" + lados + ", valor:" + valor + ")";
  }
  
  public static void main(String[] args) {
    Dado dado = Dado.seisLados();
    for (int i = 0; i < 10; i++) {
      dado.joga();
      System.out.println(dado);
    }
    dado = Dado.lados(20);
    for (int i = 0; i < 10; i++) {
      dado.joga();
      System.out.println(dado);
    }
  }
}