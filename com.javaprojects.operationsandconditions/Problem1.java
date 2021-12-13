import java.util.Scanner;

public class Problem1 {
    public static void showProblem(Scanner input) {

        System.out.println("########## Question 1 ##########");
        System.out.println(
                "Escreva um programa que recebe dois números inteiros" +
                        "e informa o resultado das operações soma, subtração," +
                        "multiplicação e divisão. Considere sempre a ordem" +
                        "em que foram informados.");
        int number1;
        int number2;

        System.out.println("Type first number:");
        number1 = input.nextInt();

        System.out.println("Type second number");
        number2 = input.nextInt();

        System.out.printf(
                "Addition => %d + %d = %d\n",
                number1, number2, number1 + number2);

        System.out.printf(
                "Subtraction => %d - %d = %d\n",
                number1, number2, number1 - number2);

        System.out.printf(
                "Multiplication => %d * %d = %d\n",
                number1, number2, number1 * number2);

        System.out.printf(
                "Division => %d / %d = %d\n",
                number1, number2, number1 / number2);
    }
}