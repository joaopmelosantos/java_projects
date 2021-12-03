import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int celsiusTemperature;

        System.out.print("Type the celsius temperature you would like to convert: ");
        celsiusTemperature = value.nextInt();
        value.close();

        final float kelvinTemperature = celsiusTemperature + 273.15f;
        final float fahreheintTemperature = (celsiusTemperature * 1.8f) + 32;
        final float reaumurTemperature = celsiusTemperature * 0.8f;
        final float rankineTemperature = (celsiusTemperature + 273.15f) * 1.8f;

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
