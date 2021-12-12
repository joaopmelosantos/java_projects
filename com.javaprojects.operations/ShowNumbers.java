import java.util.Scanner;

public class ShowNumbers {

  public static void main(String[] args) {

    Scanner scanNumbers = new Scanner(System.in);
    NumberOperations operations = new NumberOperations();
    int number1;
    int number2;

    System.out.println("Type first number:");
    number1 = scanNumbers.nextInt();

    System.out.println("Type second number");
    number2 = scanNumbers.nextInt();

    scanNumbers.close();

    System.out.printf(
        "Addition => %d + %d = %d\n",
        number1, number2, operations.addition(number1, number2));

    System.out.printf(
        "Subtraction => %d - %d = %d\n",
        number1, number2, operations.subtraction(number1, number2));

    System.out.printf(
        "Multiplication => %d * %d = %d\n",
        number1, number2, operations.multiplication(number1, number2));

    System.out.printf(
        "Division => %d / %d = %d\n",
        number1, number2, operations.division(number1, number2));
  }

}
