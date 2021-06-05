package solucao;

public class Data {

  public static String deBRparaISO(String dataBR) {
    String[] partes = dataBR.split("/");
    String dia = partes[0];
    String mes = partes[1];
    String ano = partes[2];
    return String.format("%s-%s-%s", ano, mes, dia);
  }

}