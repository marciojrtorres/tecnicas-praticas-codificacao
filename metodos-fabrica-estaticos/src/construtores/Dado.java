package construtores;

public class Dado {

  private int valor;
  private final int lados;

  public Dado() { this(6); }

  public Dado(int lados) {
      this.lados = lados;
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
    Dado dado = new Dado();
    for (int i = 0; i < 10; i++) {
      dado.joga();
      System.out.println(dado);
    }
    dado = new Dado(20);
    for (int i = 0; i < 10; i++) {
      dado.joga();
      System.out.println(dado);
    }
  }
}