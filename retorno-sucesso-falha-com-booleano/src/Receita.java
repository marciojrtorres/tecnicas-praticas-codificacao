import java.util.ArrayList;
import java.util.List;

public class Receita {

  private String nome;
  private boolean vegetariana;
  private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

  public boolean adicionaIngrediente(Ingrediente i) {
    if (this.vegetariana && i.contemCarne()) {
      return false;
    }
    ingredientes.add(i);
    return true;
  }

  public Receita(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public boolean isVegetariana() {
    return vegetariana;
  }

  public void setVegetariana(boolean vegetariana) {
    this.vegetariana = vegetariana;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder("Receita de " + nome);
    str.append("\n----------------------\n");
    for (Ingrediente i : ingredientes) {
      str.append(i).append("\n");
    }
    return str.toString();
  }

}
