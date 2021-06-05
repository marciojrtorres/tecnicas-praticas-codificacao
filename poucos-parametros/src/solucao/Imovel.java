package solucao;

import java.util.Collections;
import java.util.List;

public class Imovel {

  public static class FiltroImovel {
    public Integer nroQuartos;
    public Integer nroVagasCarro;
    public Double  vlrMaximoCondominio;
    public Double  vlrMaximoAluguel;
    public Boolean comFoto;
    public Boolean apartamento;
  }

  public static List<Imovel> buscar(FiltroImovel filtro) {
    // .. código necessário para buscar os imóveis
    return Collections.emptyList();
  }

  public static void main(String[] args) {

    FiltroImovel filtro = new FiltroImovel() {{
      vlrMaximoAluguel = 500.0;
      nroQuartos = 2;
      vlrMaximoCondominio = 800.0;
      apartamento = true;
      comFoto = false;
      nroVagasCarro = 2;
    }};

    List<Imovel> imoveis = Imovel.buscar(filtro);
  }
}
// https://github.com/marciojrtorres/tecnicas-praticas-codificacao/blob/master/poucos-parametros/src/solucao/Imovel.java
// https://git.io/JO5Xv
