import java.util.Scanner;

public class Problem2 {

  public static void showProblem(Scanner input) {

    System.out.println("########## Problem 2 ##########");
    System.out.println(
        "Escreva um programa que informa a" +
            "tabuada de um número informado (entre 1-10).");

    int number;

    System.out.println("\nType the number");
    number = input.nextInt();

    for (int i = 1; i < 11; i++) {
      System.out.printf(
          "%d x %d = %d\n", number, i, number * i);
    }
  }

}
