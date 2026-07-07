import java.util.Scanner;

public class temperatureconversion {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double celsius, fahrenheit;
    int choice;

    System.out.println("****Temperature Converter****");
    System.out.println("1. Celsius -> Fahrenheit");
    System.out.println("2. Fahrenheit -> Celsius");

    System.out.print("Enter choice : ");
    choice = scanner.nextInt();

    if (choice == 1){
      System.out.print("Enter temperature in Celsius : ");
      celsius = scanner.nextDouble();
      fahrenheit = celsius * 1.8 + 32;
      System.out.printf("Temperature in Fahrenheit : %.2f", fahrenheit);
    }

    else if (choice == 2) {
      System.out.print("Enter temperature in Fahrenheit : ");
      fahrenheit = scanner.nextDouble();
      celsius = (fahrenheit - 32) / 1.8;
      System.out.printf("Temperature in Celsius : %.2f", celsius);
    }

    else{
      System.out.println("Invalid Choice");
    }

    scanner.close();

  }

}
