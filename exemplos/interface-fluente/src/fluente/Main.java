package fluente;

public class Main {
  public static void main(String[] args) {

    String form = new HtmlForm()
        .setAction("/login.php")
        .setMethod("post")
        .addClass("fancy")
        .addClass("shadowed")
        .setId("form-login")
        .addElement(
            new HtmlInput().setId("usuario").setName("usuario").setType("text"))
        .addElement(
            new HtmlInput().setId("senha").setName("senha").setType("password"))
        .addElement(new HtmlInput().setValue("Login").setType("submit"))
        .getHtmlString();

    System.out.println(form);

  }
}
