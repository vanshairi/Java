import java.util.Scanner;

public class currencyConverter {
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    int choice;
    double inr, usd;

    System.out.println("****Currency Converter****");
    System.out.println("1. INR -> USD");
    System.out.println("2. USD -> INR");
    System.out.print("Enter choice : ");

    choice = scanner.nextInt();

    if (choice == 1){
      System.out.print("Enter the amount in INR : ");
      inr = scanner.nextDouble();
      usd = inr / 95.22;
      System.out.printf("Amount in USD : %.2f", usd);
    }

    else if (choice == 2){
      System.out.print("Enter the amount in USD : ");
      usd = scanner.nextDouble();
      inr = usd * 95.22;
      System.out.printf("Amount in INR : %.2f", inr);
    }

    else{
      System.out.println("Invalid Choice!!");
    }

    scanner.close();
  }

}
