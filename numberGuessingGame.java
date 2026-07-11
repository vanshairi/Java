import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int guess;
    int attempts = 0;

    int randomNumber = random.nextInt(1,101);

    System.out.println("This is a number guessing game");
    System.out.println("Guess a number between 1-100");

    do{
      System.out.print("Enter a Guess : ");
      guess = scanner.nextInt();
      attempts++;

      if(guess<randomNumber){
        System.out.println("TOO LOW!! Try again");
      }

      else if(guess>randomNumber){
        System.out.println("TOO HIGH!! Try again");
      }

    }while(guess != randomNumber);

    System.out.println("You guessed it!!");
    System.out.println("You took " + attempts+" attempts");
    scanner.close();

  }

}
