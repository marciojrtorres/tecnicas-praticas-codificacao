package semgrupodedados;

class Main {
  public static void main(String[] args) {
    Cliente c = new Cliente();
    c.codigo = 1;
    c.CPF = "22233344422";
    c.nome = "Um Nome";
    c.telefone.ddd = "99";
    c.telefone.numero = "44556677";
    System.out.println(c);
  }
}
