package fabrica;

public class Peso {

  private int gramas;  
  
  private Peso(int gramas) {
    this.gramas = gramas;
  }
  
  public static Peso emGramas(int gramas) {
    return new Peso(gramas);
  }
  
  public static Peso emKilos(double kilos) {
    return new Peso((int) (kilos * 1000));
  }
  
  public static Peso emLibras(double libras) {
    return new Peso((int) (libras / 0.00220462262));
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
    Peso p1 = Peso.emGramas(2300);
    Peso p2 = Peso.emKilos(2300);
    Peso p3 = Peso.emLibras(2300);    
  }
}