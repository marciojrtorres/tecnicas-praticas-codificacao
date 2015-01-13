package solucao;

public class Data {
  
  public static String paraISO(String dataBr) {
    return dataBr.split("/")[2] + "-"
         + dataBr.split("/")[1] + "-"
         + dataBr.split("/")[0];
  }
  
  public static void main(String[] args) {
    System.out.println(Data.paraISO("19/08/2014"));
  }
}