package semgrupodedados;

class Cliente {
  Integer codigo;
  String  nome;
  Telefone telefone = new Telefone();
  String  CPF;
  
  @Override
  public String toString() {
    return "Cliente [codigo=" + codigo + ", nome=" + nome + ", ddd=" + telefone.ddd
        + ", numero=" + telefone.numero + ", CPF=" + CPF + "]";
  }
}
