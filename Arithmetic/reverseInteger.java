import java.util.Scanner;

public class reverseInteger {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int num, reverseNum = 0;
    System.out.print("Enter the Number : ");
    num = scanner.nextInt();

    while (num!=0){
      reverseNum = reverseNum * 10 + num % 10;
      num = num / 10;
    }

    System.out.printf("Reverse Number : %d", reverseNum);

    scanner.close();

  }

}
