package delegar_iteracao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotaFiscal implements Iterable<Item> {

  private int numero;
  private String cliente;
  private List<Item> itens = new ArrayList<Item>();
  
  public NotaFiscal(int numero, String cliente) {
    this.numero = numero;
    this.cliente = cliente;
  }
  
  public void addItem(Item item) {
    this.itens.add(item);
  }

  @Override
  public Iterator<Item> iterator() {
    // REPASSANDO O ITERATOR DE ARRAYLIST
    return itens.iterator();
  }
  
  public static void main(String[] args) {
    NotaFiscal notaFiscal = new NotaFiscal(12345, "Cliente de Exemplo") {{
      addItem(new Item() {{
        codigo = 1; descricao = "TV LED Samsung";
        preco = 1224.49; quantidade = 1.0;
      }});
      
      addItem(new Item() {{
        codigo = 1; descricao = "BluRay Player Philips";
        preco = 297.99; quantidade = 1.0;
      }});
    }};
    // ITERANDO A NOTA:
    for (Item item : notaFiscal) {
        System.out.println(item.descricao);
    }
  } 
}