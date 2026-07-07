import java.util.Scanner;

public class percentageCalculator {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int totalMarks, marksSecured;
    double percentage;

    System.out.print("Enter the marks secured : ");
    marksSecured = scanner.nextInt();

    System.out.print("Enter the total marks : ");
    totalMarks = scanner.nextInt();

    percentage = (marksSecured * 100 / totalMarks);

    System.out.printf("Percentage : %.2f", percentage);

    scanner.close();

  }

}
