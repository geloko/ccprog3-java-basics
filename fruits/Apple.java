package fruits;

public class Apple extends Fruit{
  public Apple(String color) {
    super("Apple", color);
  }

  public String getProtectedVar() {
    return this.protectedVariable;
  }

  // public void setColor(String color){
  //   this.color = color;
  // }
}
