package variadico;

public class Breadcrumb {
  
  private String level0;
  private String separator;
  
  public Breadcrumb(String nivel0, String separator) {
    this.level0 = nivel0;
    this.separator = separator;
  }
  
  public Breadcrumb() { this("Home", " > "); }
  
  public String get() { return level0; }
  
  public String get(String... levels) {
    StringBuilder builder = new StringBuilder(level0);
    for (String level : levels) {
      builder.append(separator)
             .append(level);
    }
    return builder.toString();
  }
  

  public static void main(String[] args) {
    Breadcrumb caminho = new Breadcrumb();    
    // Home
    System.out.println(caminho.get()); 
    // Home > Livros
    System.out.println(caminho.get("Livros")); 
    // Home > Livros > Informática
    System.out.println(caminho.get("Livros", "Informática"));
    // Home > Livros > Informática > Banco de Dados
    System.out.println(caminho.get("Livros", "Informática", "Banco de Dados"));
    // Home > Livros > Informática > Banco de Dados > PostgreSQL
    System.out.println(caminho.get("Livros", "Informática", "Banco de Dados", "PostgreSQL"));
  }
}