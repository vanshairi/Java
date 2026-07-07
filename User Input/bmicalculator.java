import java.util.Scanner;

public class bmicalculator {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double weight, height, bmi;

    System.out.print("Enter your weight (in kg) : ");
    weight = scanner.nextDouble();

    System.out.print("Enter your height (in m) : ");
    height = scanner.nextDouble();

    bmi = weight / Math.pow(height, 2);
    System.out.printf("Your BMI : %.2f", bmi);

    

    scanner.close();

  }

}
