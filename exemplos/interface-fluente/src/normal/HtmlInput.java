package normal;

public class HtmlInput extends HtmlElement {

  private String id;
  private String name;
  private String type;
  private String value;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  protected String getHtmlString() {
    StringBuilder builder = new StringBuilder();
    builder.append("<input");
    if (id != null)
      builder.append(" id=\"").append(id).append("\"");
    if (name != null)
      builder.append(" name=\"").append(name).append("\"");
    if (type != null)
      builder.append(" type=\"").append(type).append("\"");
    if (value != null)
      builder.append(" value=\"").append(value).append("\"");
    return builder.append("/>").toString();
  }

}
