import java.util.Scanner;

public class lastAndFirstDigit {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int firstDigit = 0; 
    int lastDigit = 0;
    int num;

    System.out.print("Enter the number : ");
    num = scanner.nextInt();

    lastDigit = num%10;

    while (num!=0){
      firstDigit = num % 10;
      num/=10;
    }

    System.out.printf("First Digit : %d\n", firstDigit);
    System.out.printf("Last Digit : %d", lastDigit);



    scanner.close();

  }

}
