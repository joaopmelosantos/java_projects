import java.util.Scanner;

public class Problem5 {

  public static void showProblem(Scanner input) {

    System.out.println("########## Problem 5 ##########");
    System.out.println(
        "Escreva um programa que realiza" +
            " conversão de medidas de polegadas" +
            " em centímetros.");

    float inches;

    System.out.println(
        "Type the amounth of inches you would like to convert: ");
    inches = input.nextFloat();

    final float centimeter = inches * 2.54f;

    System.out.printf(
        "%.2f inches = %.2f cm\n", inches, centimeter);

  }

}
