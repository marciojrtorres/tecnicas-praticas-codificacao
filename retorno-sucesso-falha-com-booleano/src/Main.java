public class Main {
  public static void main(String[] args) {
    Receita r = new Receita("Escondidinho Vegetariano");
    r.setVegetariana(true);
    Ingrediente i1 = new Ingrediente("Batata", 1.0, "unidade", false);
    Ingrediente i2 = new Ingrediente("Queijo", 100.0, "gramas", false);
    Ingrediente i3 = new Ingrediente("Presunto", 100.0, "gramas", true);
    Ingrediente i4 = new Ingrediente("Catupiry", 200.0, "gramas", false);
    if (r.adicionaIngrediente(i1)) {
      System.out.println("Ingrediente " + i1 + " adicionado");
    } else {
      System.out.println("Ingrediente " + i1 + " rejeitado por conter carne");
    }
    if (r.adicionaIngrediente(i2)) {
      System.out.println("Ingrediente " + i2 + " adicionado");
    } else {
      System.out.println("Ingrediente " + i2 + " rejeitado por conter carne");
    }
    if (r.adicionaIngrediente(i3)) {
      System.out.println("Ingrediente " + i3 + " adicionado");
    } else {
      System.out.println("Ingrediente " + i3 + " rejeitado por conter carne");
    }
    if (r.adicionaIngrediente(i4)) {
      System.out.println("Ingrediente " + i4 + " adicionado");
    } else {
      System.out.println("Ingrediente " + i4 + " rejeitado por conter carne");
    }
    System.out.println(r);
  }
}