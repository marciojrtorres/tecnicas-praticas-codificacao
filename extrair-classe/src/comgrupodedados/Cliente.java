package comgrupodedados;

class Cliente {
  Integer codigo;
  String  nome;
  // telefone
  String  ddd;
  String  numero;
  // fim telefone
  String  CPF;
  
  @Override
  public String toString() {
    return "Cliente [codigo=" + codigo + ", nome=" + nome + ", ddd=" + ddd
        + ", numero=" + numero + ", CPF=" + CPF + "]";
  }
}
