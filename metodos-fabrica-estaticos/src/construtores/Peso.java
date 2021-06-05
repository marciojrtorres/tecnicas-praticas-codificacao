package construtores;

public class Peso {

  private int gramas;
  
  public Peso(int gramas) {
    this.gramas = gramas;
  }
  
  public Peso(double kilos) {
    this.gramas = (int) (kilos * 1000);
  }
  // esse construtor não pode ser implementado
  // considerar métodos fábrica estáticos para estes casos
  public Peso(double libras) {
    this.gramas = (int) (libras / 0.00220462262);
  }
  
  public int getGramas() {
    return this.gramas;
  }
  
  public double getKilos() {
    return this.gramas / 1000.0;
  }
  
  public double getLibras() {
    return this.gramas * 0.00220462262;
  }
  
  public String toString() {
    return this.gramas + "gr";
  }
  
  public static void main(String[] args) {
    Peso p = new Peso(5000);
    System.out.println(p);
  }
  
}
