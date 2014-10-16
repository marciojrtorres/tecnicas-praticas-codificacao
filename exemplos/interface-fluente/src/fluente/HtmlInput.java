package fluente;

public class HtmlInput extends HtmlElement {

  private String id;
  private String name;
  private String type;
  private String value;

  public String getId() {
    return id;
  }

  public HtmlInput setId(String id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public HtmlInput setName(String name) {
    this.name = name;
    return this;
  }

  public String getType() {
    return type;
  }

  public HtmlInput setType(String type) {
    this.type = type;
    return this;
  }

  public String getValue() {
    return value;
  }

  public HtmlInput setValue(String value) {
    this.value = value;
    return this;
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
