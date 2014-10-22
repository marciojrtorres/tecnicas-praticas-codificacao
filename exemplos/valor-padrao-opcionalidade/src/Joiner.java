public class Joiner {

  public static String join(String entrada) {
    return entrada.replace(" ", "_");
  }

  public static String join(String entrada, String separador) {
    return entrada.replace(" ", separador);
  }

  public static void main(String[] args) {
    // usando IF para atribuir 
    // valor padrão na falta do segundo argumento
    String separador = "-";
    if (args.length > 1) separador = args[1];
    System.out.println(join(args[0], separador));
    
    // usando EAFP atribuir 
    // valor padrão na falta do segundo argumento
    try {
      separador = args[1];
    } catch(Exception e) {
      separador = "-";
    }
    System.out.println(join(args[0], separador));
    
    // usando Operador Ternário para atribuir
    // valor padrão na falta do segundo argumento
    separador = args.length > 1 ? args[1] : "-";
    System.out.println(join(args[0], separador));
  }
}