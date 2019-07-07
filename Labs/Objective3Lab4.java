import java.util.Scanner;

public class Objective3Lab4{
  public static void main(String[] args) {
    String firstName;
    String lastName;
    int age;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your first name? ");
    firstName = keyboard.next();

    System.out.println("What is your last name? ");
    lastName = keyboard.next();

    System.out.println("How old are you? ");
    age = keyboard.nextInt();

    System.out.println("First name: " + firstName + ", " + "Last Name: " + lastName + ", " + "Age: " + age + " ");
  }
}
