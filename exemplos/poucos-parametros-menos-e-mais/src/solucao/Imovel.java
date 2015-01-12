package solucao;

import java.util.Collections;
import java.util.List;

public class Imovel {

  public static class FiltroImovel {
    public Integer nroQuartos, nroVagasCarro;
    public Double vlrMaximoCondominio, vlrMaximoAluguel;
    public Boolean comFoto, apartamento;
  }

  public static List<Imovel> busca(FiltroImovel filtro) {
    // código necessário para buscar os imóveis
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

    List<Imovel> imoveis = Imovel.busca(filtro);
  }
}