import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      int UserNum;

      System.out.println("Please enter a number: ");
      UserNum = scanner.nextInt();

      if (UserNum > 0) {

        System.out.println("The number is positive. ");
       }


        else if (UserNum < 0) {

          System.out.println("The number is negative. ");
        }

        else {
          System.out.println("The number is 0.");
        }

    }
}
