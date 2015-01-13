import java.util.List;

public class Main {
  public static void main(String[] args) {

    ContatoDAO2 dao = new ContatoDAO2();

    List<Contato> contatos = dao.buscaTodos();

    System.out.println(contatos);

  }
}
