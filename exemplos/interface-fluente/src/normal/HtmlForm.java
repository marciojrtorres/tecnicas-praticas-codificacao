package normal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HtmlForm {

  private String id;
  private String action;
  private String method;
  private List<String> classes = new ArrayList<String>();
  private List<HtmlElement> elementos = new ArrayList<HtmlElement>();

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public List<String> getClasses() {
    return classes;
  }

  public void addClass(String clazz) {
    this.classes.add(clazz);
  }

  public void addElement(HtmlElement element) {
    this.elementos.add(element);
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
