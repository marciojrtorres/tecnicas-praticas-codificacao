package sem;

public class Seguranca {
  public static NivelAcesso privilegio(Usuario usuario) {
    NivelAcesso nivel = null;
    if (!usuario.isBloqueado()) {
      if (usuario.getCargo() != null) {
        if (usuario.getCargo() == Cargo.Gerente) {
          nivel = NivelAcesso.Administrador;
        } else if (usuario.getCargo() == Cargo.Funcionario) {
          nivel = NivelAcesso.Operador;
        }
      } else {
        nivel = NivelAcesso.Visitante;
      }
    } else {
      nivel = NivelAcesso.Nenhum;
    }
    return nivel; // único retorno do método
  }
  
  public static void geraSenha(Usuario usuario) {
    if (usuario != null) {
      if (!usuario.isBloqueado()) {
        usuario.setSenha(java.util.UUID.randomUUID().toString().split("-")[0]);
      }
    }
  }
}
