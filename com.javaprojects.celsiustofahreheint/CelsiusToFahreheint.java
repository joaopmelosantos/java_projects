import java.util.Scanner;

public class CelsiusToFahreheint {

  public static void main(String[] args) {

    Scanner scanTemp = new Scanner(System.in);
    float celsiusTemp;

    System.out.println(
        "Type the celsius temperature you would like to convert:");

    celsiusTemp = scanTemp.nextFloat();
    scanTemp.close();

    final float fahreheintTemp = (celsiusTemp * 1.8f) + 32;

    System.out.printf(
        "%.2f °C = %.2f °F", celsiusTemp, fahreheintTemp);

  }

}
