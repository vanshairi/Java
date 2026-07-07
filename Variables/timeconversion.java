import java.util.Scanner;

// the program converts seconds to HH:MM:SS format

public class timeconversion {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int seconds, minutes, hours;

    System.out.print("Enter the time in seconds : ");
    seconds = scanner.nextInt();

    hours = seconds / 3600;
    seconds = seconds - hours * 3600;
    minutes = seconds / 60;
    seconds = seconds - minutes * 60;

    System.out.printf("Time : %d:%d:%d", hours, minutes, seconds);

    scanner.close();
  }

}
