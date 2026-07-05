import java.util.Scanner;

public class evenodd {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int number;

    System.out.print("Enter the number : ");
    number = scanner.nextInt();

    if (number%2==0){
      System.out.println("EVEN");
    }
    else{
      System.out.println("ODD");
    }

    scanner.close();

  }

}
