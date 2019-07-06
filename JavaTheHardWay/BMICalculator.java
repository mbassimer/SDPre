import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double in, ft, lbs, bmi, totalInch;

    System.out.print( "Your height in ft: " );
    ft = keyboard.nextDouble();

    System.out.print( "Your remaining height in inches: " );
    in = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    lbs = keyboard.nextDouble();

    totalInch = in + ft * 12;
    bmi = 703 * lbs / (totalInch*totalInch);

    System.out.println( "Your BMI is " + bmi );
  }
}
