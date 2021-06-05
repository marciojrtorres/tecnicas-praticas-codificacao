package com;

public class Usuario {

  private String nome;
  private String senha;
  private Cargo cargo;
  private boolean bloqueado;
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Cargo getCargo() {
    return cargo;
  }
  
  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }
  
  public boolean isBloqueado() {
    return bloqueado;
  }
  
  public void setBloqueado(boolean bloqueado) {
    this.bloqueado = bloqueado;
  }

  @Override
  public String toString() {
    return "Usuario [cargo=" + cargo + ", bloqueado=" + bloqueado + "]";
  }
  
}
