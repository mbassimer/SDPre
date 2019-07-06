import java.util.Scanner;

public class ComparingNumbers {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print( "Give me two numbers. First: " );
    first = keyboard.nextDouble();
    System.out.print( "Second: " );
    second = keyboard.nextDouble();

    if ( first < second ) {
      System.out.println( first + " is LESS THAN " + second );
    }
    if ( first <= second ) {
      System.out.println( first + " is LESS THAN/EQUAL TO " + second );
    }
    if ( first == second ) {
      System.out.println( first + " is EQUAL TO " + second );
    }
    if ( first >= second ) {
      System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
    }
    if ( first > second ) {
      System.out.println( first + " is GREATER THAN " + second );
    }
    if ( first != second ){
      System.out.println( first + " is NOT EQUAL TO " + second );

      System.out.println( "Hey." );
    } 

      // 1. Hey is a not part of the statement body, it gets ran no matter what. I put
      // the same number in and if it skipped the last statement then it would also skip Hey
  }
}
