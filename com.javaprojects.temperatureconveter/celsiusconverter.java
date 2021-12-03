import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    int celsiusTemperature;

    System.out.print("Type the celsius temperature you would like to convert: ");
    celsiusTemperature = value.nextInt();
    value.close();

    final double kelvinTemperature = celsiusTemperature + 273.15;
    final double fahreheintTemperature = (celsiusTemperature * 1.8) + 32;
    final double reaumurTemperature = celsiusTemperature * 0.8;
    final double rankineTemperature = (celsiusTemperature + 273.15) * 1.8;

    System.out.printf(celsiusTemperature
        + " °C in Kelvin = %.2f" + " K\n", kelvinTemperature);
    System.out.printf(celsiusTemperature
        + " °C in Fahreheint = %.2f" + " °F\n", fahreheintTemperature);
    System.out.printf(celsiusTemperature
        + " °C in Réaumur = %.2f" + " °Ré\n", reaumurTemperature);
    System.out.printf(celsiusTemperature
        + " °C in Kelvin = %.2f" + " Ra\n", rankineTemperature);

  }
}
