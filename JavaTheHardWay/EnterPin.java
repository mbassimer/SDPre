import java.util.Scanner;

public class EnterPin {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String typedPassword;

    typedPassword = "lucky";

     System.out.println("BEFORE WE GET STARTED PLEASE ENTER YOUR PASSWORD:");
     entry = typedPassword.equals();

     while ( ! typedPassword.equals("lucky") ) {
       System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
       System.out.print("ENTER YOUR PASSWORD: ");
     entry = typedPassword.equals();
     }

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();

    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");

  }
}
