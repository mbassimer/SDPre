import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int selection;

    while(true) {


      System.out.println("____Menu____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite Foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = keyboard.nextInt();

      if(selection==1)
      System.out.println("Hello Human");
      if(selection==2)
      System.out.println("Apple,Banana,Coconut");
      if(selection==3)
      System.out.println("Goodbye");


    }



  }
}
