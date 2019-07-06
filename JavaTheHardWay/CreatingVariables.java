public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, favoriteNumber;
    double seconds, e, checking, savings;
    String firstName, lastName, title, occupation, demographic;

    x = 10;
    y = 400;
    age = 39;
    favoriteNumber = 75;


    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    savings = 5000.25;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    occupation = "professional flutist";
    demographic = "paid";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The person's favorite number is " + favoriteNumber + "!");
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A Favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "If you have less than $ " + savings + " you are broke :)");
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "People make fun of me for being a " + occupation + " but, I think I'm cool." );
    System.out.println( "Even though I don't have friends, I get " + demographic + " lol. " );
  }
}
