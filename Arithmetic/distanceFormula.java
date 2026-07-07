import java.util.Scanner;

public class distanceFormula {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double x1, x2, y1, y2, distance;

    System.out.print("Enter the initial x position : ");
    x1 = scanner.nextDouble();

    System.out.print("Enter the initial y position : ");
    y1 = scanner.nextDouble();

    System.out.print("Enter the final x position : ");
    x2 = scanner.nextDouble();

    System.out.print("Enter the final y position : ");
    y2 = scanner.nextDouble();    

    distance = Math.pow((Math.pow((x2-x1), 2) + Math.pow(y2-y1, 2)), 0.5);
    
    System.out.printf("Required Distance : %.2f",distance);

    scanner.close();

  }

}
