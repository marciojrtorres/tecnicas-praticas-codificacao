package problema;

import java.util.ArrayList;
import java.util.List;

public class Produto {

  private String descricao;
  private Double valor;

  public Produto(String descricao, Double valor) {
    this.descricao = descricao;
    this.valor = valor;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  private static List<Produto> produtos = 
      new ArrayList<Produto>();

  static {
    produtos.add(new Produto("TV LCD", 1500.0));
    produtos.add(new Produto("TV LCD 3D", 2500.0));
    produtos.add(new Produto("TV Smart LCD 3D", 2800.0));
    produtos.add(new Produto("TV Plasma", 1200.0));
  }

  public static List<Produto> busca(
      Double vlrMaximo, Double vlrMinimo) {
    
    if (vlrMinimo == null) {
      vlrMinimo = Double.MIN_VALUE;
    }
    
    if (vlrMaximo == null) {
      vlrMaximo = Double.MAX_VALUE;
    }
    
    List<Produto> lista = new ArrayList<Produto>();
    
    for(Produto p : Produto.produtos) {
      if (p.getValor() != null
          && p.getValor() >= vlrMinimo 
          && p.getValor() <= vlrMaximo) {
        lista.add(p);
      }
    }
    
    return lista;   
  }
  
  public static void main(String[] args) {
    List<Produto> entre2000e3000 = busca(2000.0, 3000.0);
    List<Produto> partir2000 = busca(2000.0, null);
    List<Produto> ateh2000 = busca(null, 2000.0);
  }
  
}