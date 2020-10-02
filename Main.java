import java.util.Scanner;
/**
 * asks user for a number, then counts down from 100 by 5's until it reaches that number, withou passing it
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // make a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for an integer
    System.out.println("Please enter an integer to count down to");
    int number = input.nextInt();

    //create countdown variable
    int countdown = 100;

    //say countdown message
    System.out.println("Count Down:");
    //start countdown loop
    do{
      //print the current countdown number
      System.out.println(countdown);

      //decrease countdown by 5
      countdown = countdown - 5;
    //if countdown is still bigger than the number, repeat
    }while(countdown >= number); 
  }
}
