public class Retangulo {
  private int largura;
  private int altura;
  
  public Retangulo(int largura, int altura) {
    this.largura = largura;
    this.altura = altura;
  }

  public Retangulo(String laString) {
    String[] la = laString.split("x");
    try {
      this.largura = Integer.parseInt(la[0]);
      this.altura = Integer.parseInt(la[1]);
    } catch (Exception e) {
      this.largura = 0;
      this.altura = 0;
    }
  }  
  
  public int getLargura() {
    return largura;
  }
  
  public int getAltura() {
    return altura;
  }
  
  @Override
  public String toString() {
    return largura + "x" + altura;
  }
  
  public static void main(String[] args) {
    System.out.println(new Retangulo(480, 300));
    System.out.println(new Retangulo("480x300x100"));
    System.out.println(new Retangulo("480q300"));
    System.out.println(new Retangulo("480xqwe"));    
  }
}