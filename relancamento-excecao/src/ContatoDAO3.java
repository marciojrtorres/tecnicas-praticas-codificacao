import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ContatoDAO3 {

  public List<Contato> buscaTodos() {

    List<Contato> contatos = new ArrayList<Contato>();

    File arquivo = new File("contatos.csv");

    Scanner scan = new Scanner(arquivo);

    while (scan.hasNextLine()) {
      String[] campos = scan.nextLine().split(";");
      Contato c = new Contato();
      c.setNome(campos[0]);
      c.setEmail(campos[1]);
      contatos.add(c);
    }

    return contatos;
  }

}
