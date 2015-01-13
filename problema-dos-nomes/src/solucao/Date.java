package solucao;

public class Date {

  public static String toISO(String dateBr) {
    return dateBr.split("/")[2] + "-" 
         + dateBr.split("/")[1] + "-"
         + dateBr.split("/")[0];
  }
}