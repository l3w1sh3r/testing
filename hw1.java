import java.util.Scanner;

public class TaxiFareCals {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      double km = scanner.nextDouble();
      double totalFare = 0;
      if (km < 0) {
      System.out.printf("Invalid input");
      } else if (km <= 1) {
        totalFare = 15000;
      } else if (km <= 5) {
        totalFare = 15000 + (km - 1) * 13000;
      } else {
        totalFare = 15000 + 4 * 13000 + (km - 5) * 11000;
      }
      if (km > 120) {
        totalFare = totalFare * 0.9;
      }

      System.out.printf("Total Fare: %.2f VND\n", totalFare);
        
      scanner.close();
    }
}
