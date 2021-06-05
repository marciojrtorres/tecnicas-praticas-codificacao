package javaapi;

public class Main {
  public static void main(String[] args) {
    // NÃO FLUENTE:
    StringBuilder strBuilder = new StringBuilder();
    strBuilder.append("Data: ");
    strBuilder.append("___/___/___");
    strBuilder.append(" ");
    strBuilder.append("Nome: ");
    strBuilder.append("_________________");
    String str = strBuilder.toString();
    System.out.println(str);
    
    // FLUENTE:
    StringBuilder strBuilder2 = new StringBuilder();
    String str2 = strBuilder2
        .append("Data: ")
        .append("___/___/___")
        .append(" ")
        .append("Nome: ")
        .append("_________________")
        .toString();
    System.out.println(str2);
  }
}