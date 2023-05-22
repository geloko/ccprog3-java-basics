package fruits;

public class Fruit {
  private String type;
  private String color;
  protected String protectedVariable = "I AM A PROTECTED VARIABLE";


  public Fruit(String type, String color) {
    this.type = type;
    this.color = color;
  }

  public String getType() {
    return this.type;
  }

  public String getColor() {
    return this.color;
  }
}
