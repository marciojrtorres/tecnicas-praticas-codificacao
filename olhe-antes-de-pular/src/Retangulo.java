public class Retangulo {
  private int largura;
  private int altura;
  
  public Retangulo(int largura, int altura) {
    this.largura = largura;
    this.altura = altura;
  }
  
  public Retangulo(String laString) {
    String[] la = laString.split("x");
    if (la.length == 2) {
      if (ehInteiro(la[0]) && ehInteiro(la[1])) {
        this.largura = Integer.parseInt(la[0]);
        this.altura = Integer.parseInt(la[1]);
      } else {
        this.largura = 0;
        this.altura = 0;
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