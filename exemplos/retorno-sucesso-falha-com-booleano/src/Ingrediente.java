public class Ingrediente {

  private String nome;
  private double quantidade;
  private String medida;
  private boolean contemCarne;

  public Ingrediente(String nome, double quantidade, String medida,
      boolean contemCarne) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.medida = medida;
    this.contemCarne = contemCarne;
  }

  public String getNome() {
    return nome;
  }

  public double getQuantidade() {
    return quantidade;
  }

  public String getMedida() {
    return medida;
  }

  public boolean contemCarne() {
    return contemCarne;
  }

  @Override
  public String toString() {
    return quantidade + " " + medida + " de " + nome;
  }

}
