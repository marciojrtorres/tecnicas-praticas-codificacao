import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class ContatoDAO {
  public List<Contato> buscaTodos() {
    List<Contato> contatos = new ArrayList<Contato>();
    Scanner scan = null;
    try {
      File arquivo = new File("contatos.csv");
      scan = new Scanner(arquivo);
      while (scan.hasNextLine()) {
        String[] campos = scan.nextLine().split(";");
        Contato c = new Contato();
        c.setNome(campos[0]);
        c.setEmail(campos[1]);
        contatos.add(c);
      }
    } catch (FileNotFoundException e) {
      Logger.getLogger("ContatoDAO").warning(e.toString());
      throw new DAOException("Fonte de dados não encontrada", e);
    } finally {
      if (scan != null)
        scan.close();
    }
    return contatos;
  }
}