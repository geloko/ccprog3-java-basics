import java.util.Scanner;

import fruits.Apple;
import fruits.Fruit;
import fruits.Orange;

public class FruitsApp {
  public static void main(String[] args) {
    System.out.println("Welcome to our fruits app!");
    System.out.print("Enter your preferred color of apple: ");
    Scanner sc = new Scanner(System.in);

    if(sc.hasNextLine()){
      String input = sc.nextLine();

      Apple apple = new Apple(input);
      Orange orange = new Orange();

      System.out.println(apple.getType() + " is of the color " + apple.getColor());
      System.out.println(orange.getType() + " is of the color " + orange.getColor());

    }
  }
}
