package solucao;

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
  
  public static List<Produto> buscaValorMinimo(
      Double vlrMinimo) {
    return buscaValorEntre(vlrMinimo, null);
  }
  
  public static List<Produto> buscaValorMaximo(
      Double vlrMaximo) {
    return buscaValorEntre(null, vlrMaximo);
  }

  public static List<Produto> buscaValorEntre(
      Double vlrMinimo, Double vlrMaximo) {
    
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
    List<Produto> entre2000e3000 = buscaValorEntre(2000.0, 3000.0);
    List<Produto> partir2000 = buscaValorMinimo(2000.0);
    List<Produto> ateh2000 = buscaValorMaximo(2000.0);
  }
  
}