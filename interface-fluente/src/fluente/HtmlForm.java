package fluente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HtmlForm {

  private String id;
  private String action;
  private String method;
  private List<String> classes = new ArrayList<String>();
  private List<HtmlElement> elementos = new ArrayList<HtmlElement>();


  public HtmlForm setId(String id) {
    this.id = id;
    return this;
  }
  
  public HtmlForm setAction(String action) {
    this.action = action;
    return this;
  }

  public HtmlForm setMethod(String method) {
    this.method = method;
    return this;
  }
  
  public HtmlForm addClass(String clazz) {
    this.classes.add(clazz);
    return this;
  }
  
  public HtmlForm addElement(HtmlElement element) {
    this.elementos.add(element);
    return this;
  }
  
  public String getId() {
    return id;
  }
  
  public String getAction() {
    return action;
  }

  public String getMethod() {
    return method;
  }


  public List<String> getClasses() {
    return classes;
  }

  public List<HtmlElement> getElementos() {
    return elementos;
  }

  public String getHtmlString() {
    StringBuilder builder = new StringBuilder();
    builder.append("<form");
    if (id != null)
      builder.append(" id=\"").append(id).append("\"");
    if (action != null)
      builder.append(" action=\"").append(action).append("\"");
    if (method != null)
      builder.append(" method=\"").append(method).append("\"");
    if (classes.size() > 0) {
      builder.append(" class=\"");
      Iterator<String> it = classes.iterator();
      while (it.hasNext()) {
        builder.append(it.next());
        if (it.hasNext())
          builder.append(" ");
      }
      builder.append("\"");
    }
    builder.append(">");
    if (elementos.size() > 0) {
      for (HtmlElement e : elementos) {
        builder.append("\n");
        builder.append("  ").append(e.getHtmlString());
      }
    }
    return builder.append("\n</form>").toString();
  }

}
