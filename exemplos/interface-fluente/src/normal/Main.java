package normal;

public class Main {
  public static void main(String[] args) {

    HtmlInput input1 = new HtmlInput();
    input1.setId("usuario");
    input1.setName("usuario");
    input1.setType("text");

    HtmlInput input2 = new HtmlInput();
    input2.setId("senha");
    input2.setName("senha");
    input2.setType("password");

    HtmlInput input3 = new HtmlInput();
    input3.setValue("Login");
    input3.setType("submit");

    HtmlForm form = new HtmlForm();
    form.setAction("/login.php");
    form.setMethod("post");
    form.addClass("fancy");
    form.addClass("shadowed");
    form.setId("form-login");
    form.addElement(input1);
    form.addElement(input2);
    form.addElement(input3);

    String f = form.getHtmlString();

    System.out.println(f);

  }
}
