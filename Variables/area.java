import java.util.Scanner;

public class area {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    double areaOfCircle, areaOfRectangle, length, breadth, radius;

    System.out.print("Enter the radius of circle : ");
    radius = scanner.nextDouble();

    System.out.print("Enter the length of rectangle : ");
    length = scanner.nextDouble();

    System.out.print("Enter the breadth of rectangle : ");
    breadth = scanner.nextDouble();

    areaOfCircle = Math.PI * Math.pow(radius, 2);
    areaOfRectangle = length * breadth;

    System.out.printf("Area of circle : %.2f\n", areaOfCircle);
    System.out.printf("Area of rectangle : %.2f", areaOfRectangle);

    scanner.close();

  }

}
