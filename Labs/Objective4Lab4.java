import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args ) {
    Scanner scanner  = new Scanner(System.in);
    int num = 6;

    System.out.println("Please enter a number: ");
    num = scanner.nextInt();

    if(num % 2 == 0){

      System.out.println("The number is even" );
    }

    else if(num % 2 !=0) {

      System.out.println("The number is odd" );
    }

    else {
      System.out.println("The number is 0");
    }
  }
}
