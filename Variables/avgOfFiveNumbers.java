import java.util.Scanner;

public class avgOfFiveNumbers {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int sum=0;

    for (int i=0; i<5; i++){
      System.out.print("Enter number : ");
      sum += scanner.nextInt();
    }

    System.out.println("Average of 5 numbers : "+ sum/5);


    scanner.close();

  }

}
