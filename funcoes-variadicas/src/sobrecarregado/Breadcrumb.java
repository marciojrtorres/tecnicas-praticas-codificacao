package sobrecarregado;

public class Breadcrumb {

  private String level0;
  private String separator;

  public Breadcrumb(String nivel0, String separator) {
    this.level0 = nivel0;
    this.separator = separator;
  }

  public Breadcrumb() { this("Home", " > "); }

  public String get() { return level0; }

  public String get(String level1) {
    return new StringBuilder(level0)
      .append(separator).append(level1)
      .toString();
  }

  public String get(String level1, String level2) {
    return new StringBuilder(get(level1))
      .append(separator).append(level2)
      .toString();
  }

  public static void main(String[] args) {

    Breadcrumb caminho = new Breadcrumb();
    // Home
    System.out.println(caminho.get());
    // Home > Livros
    System.out.println(caminho.get("Livros"));
    // Home > Livros > Informática
    System.out.println(caminho.get("Livros", "Informática"));

  }
}
