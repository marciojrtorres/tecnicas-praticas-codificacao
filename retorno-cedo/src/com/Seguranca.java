package com;

public class Seguranca {
  public static NivelAcesso privilegio(Usuario usuario) {
    if (usuario.isBloqueado()) {
      return NivelAcesso.Nenhum;
    }
    if (Cargo.Gerente.equals(usuario.getCargo())) {
      return NivelAcesso.Administrador;
    }
    if (Cargo.Funcionario.equals(usuario.getCargo())) {
      return NivelAcesso.Operador;
    }
    return NivelAcesso.Visitante;
  }
  
  public static void geraSenha(Usuario usuario) {
    if (usuario == null || usuario.isBloqueado()) {
      return; // retorna sem gerar a senha
    }
    usuario.setSenha(java.util.UUID.randomUUID().toString().split("-")[0]);
  }
}
