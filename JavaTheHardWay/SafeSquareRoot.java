import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String answer, yes;

    System.out.print("Are you Ready? ");
    answer = keyboard.nextLine();

    while ( answer .equals( !yes ) )   {
    System.out.println("I won't begin Square roots!");
    answer = yes ;
    System.out.println("\nWell let's begin. ");
  }


    System.out.print("Give me a number, and I'll find its square root. ");
    System.out.print("(No negatives, please.) " );
    x = keyboard.nextDouble();


    while ( x < 0 ) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);
  }
}
