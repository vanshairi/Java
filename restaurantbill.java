import java.util.Scanner;

public class restaurantbill {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int numberOfItems;
    double price=0; 
    double gst;

    System.out.print("Enter the total number of items purchased : ");
    numberOfItems = scanner.nextInt();

    for (int i=0; i<numberOfItems; i++){
      System.out.printf("Enter the price of item %d : ",i+1);
      price+=scanner.nextDouble();
    }

    System.out.print("Enter the GST rate : ");
    gst = scanner.nextDouble();

    price = price + gst * price / 100;
    
    System.out.printf("Bill With GST : %.2f", price);


    scanner.close();
  }

}
