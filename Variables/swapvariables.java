import java.util.Scanner;

public class swapvariables{
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // swapping two variables without using a third variable
    int num1, num2;

    System.out.print("Enter the first number : ");
    num1 = scanner.nextInt();

    System.out.print("Enter the second number : ");
    num2 = scanner.nextInt();

    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;

    System.out.println("After swapping:-");
    System.out.printf("First Number : %d\n", num1);
    System.out.printf("Second Number : %d\n", num2);

    
    // swapping two variables using a third variable
    int n1, n2, n3;

    System.out.print("Enter the first number : ");
    n1 = scanner.nextInt();

    System.out.print("Enter the second number : ");
    n2 = scanner.nextInt();

    n3 = n1;
    n1 = n2;
    n2 = n3;

    System.out.println("After swapping:-");
    System.out.printf("First Number : %d\n", n1);
    System.out.printf("Second Number : %d\n", n2);


    scanner.close();
  }

}
