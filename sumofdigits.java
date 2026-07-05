import java.util.Scanner;

public class sumofdigits {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int num, sum=0;

    System.out.print("Enter the number : ");
    num = scanner.nextInt();

    while(num!=0){
      sum+=num%10;
      num=num/10;
    }

    System.out.printf("Sum of digits : %d", sum);

    scanner.close();

  }

}
