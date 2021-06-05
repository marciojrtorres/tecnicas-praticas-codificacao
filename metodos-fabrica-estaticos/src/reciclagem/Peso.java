package reciclagem;

public class Peso {

  private int gramas;
  private static Peso ultimoCriado = new Peso(0);
  
  private Peso(int gramas) {
    this.gramas = gramas;
  }
  
  public static Peso emGramas(int gramas) {
    if (gramas != ultimoCriado.gramas) {
      System.out.println("criando um peso de " + gramas + "g");
      ultimoCriado = new Peso(gramas);
    }
    return ultimoCriado;
  }
  
  public static Peso emKilos(double kilos) {
    return emGramas((int) (kilos * 1000));
  }
  
  public static Peso emLibras(double libras) {
    return emGramas((int) (libras / 0.00220462262));
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
    Peso p1 = Peso.emGramas(1000);
    System.out.println(p1);
    Peso p2 = Peso.emKilos(1);
    System.out.println(p2);
    Peso p3 = Peso.emLibras(2.205);
    System.out.println(p3);
  }
}