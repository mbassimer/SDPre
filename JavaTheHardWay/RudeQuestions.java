import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, favoriteFood;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( " How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print("Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

    System.out.print( "Hey again " + name + " , what's your favorite food ?" );
    favoriteFood = keyboard.next();
    System.out.print( "So you like, " + favoriteFood + ".....hmmm, that sounds disgusting!" );


     //1.No, it doesn't malfunction whenever entering a int value for double,//
     //my guess is that some int variables are contained within double variables.//

     //2. Yes, it does blow up puting a string value where double is expected. My guess//
     //is that it does because they are static variables.//

     //3. For name value, I entered in two names with spacing and it stated that it was out of//
     //the exceptions, My age I put 25.2 and that is a double variable. For weight, I wrote in just//
     //enough which is a string variable. The income variable I placed a string type variable which threw the program.//


  }
}
