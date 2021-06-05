

import java.util.HashSet;
import java.util.Set;

public class Filme {
  // pressione ALT+SHIFT+R com o cursor no título
  private String tituloOriginal;
  private int ano;
  private Set<Genero> generos = new HashSet<>();

  public Filme(String titulo, int ano, Genero... genero) {
    this.tituloOriginal = titulo;
    this.ano = ano;
    for (Genero g : genero) this.generos.add(g);
  }

  public String getTitulo() {
    return tituloOriginal;
  }

  public int getAno() {
    return ano;
  }
  
  public String getGeneros() {
    return generos.toString();
  }
  
  @Override
  public String toString() {
    return String.format("%s (%d)", tituloOriginal, ano); 
  }
}
