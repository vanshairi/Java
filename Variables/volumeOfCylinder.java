import java.util.Scanner;

public class volumeOfCylinder {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double radius, height, volume;

    System.out.print("Enter the radius of the cylinder : ");
    radius = scanner.nextDouble();

    System.out.print("Enter the height of the cylinder : ");
    height = scanner.nextDouble();

    volume = Math.PI * Math.pow(radius, 2) * height;

    System.out.printf("Volume of cylinder : %.2f", volume);


    scanner.close();

  }

}
