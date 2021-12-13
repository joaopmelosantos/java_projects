import java.util.Scanner;

public class Problem3 {

  public static void showProblem(Scanner input) {

    System.out.println("########## Problem 3 ##########");
    System.out.println(
        "Escreva um programa que converte" +
            "temperaturas de Celsius para Farenheit.");

    float celsiusTemp;

    System.out.println(
        "Type the celsius temperature you would like to convert:");

    celsiusTemp = input.nextFloat();

    final float fahreheintTemp = (celsiusTemp * 1.8f) + 32;

    System.out.printf(
        "%.2f °C = %.2f °F\n", celsiusTemp, fahreheintTemp);

  }

}
