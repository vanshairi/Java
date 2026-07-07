import java.util.Scanner;

public class powerCalculator {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double num, power;

    System.out.print("Enter the number : ");
    num = scanner.nextDouble();

    System.out.print("Enter the power : ");
    power = scanner.nextDouble();

    System.out.printf("Answer : %.2f", Math.pow(num, power));

    scanner.close();

  }

}
