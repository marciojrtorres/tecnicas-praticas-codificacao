package sem;

public class Main {
  public static void main(String[] args) {
    Usuario u = new Usuario();
    System.out.println(Seguranca.privilegio(u)); // Visitante
    u.setBloqueado(true);
    System.out.println(Seguranca.privilegio(u)); // Nenhum
    u.setBloqueado(false);
    u.setCargo(Cargo.Gerente);
    System.out.println(Seguranca.privilegio(u)); // Administrador
    u.setCargo(Cargo.Funcionario);
    System.out.println(Seguranca.privilegio(u)); // Operador
  }
}
