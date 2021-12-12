import java.util.Scanner;

public class Question3 {

  public static void showQuestion(Scanner scan) {

    System.out.println("\n############ Question 3 ############");
    System.out.println(
        "\nEscreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.");
    System.out.println("Start!\n");

    // Declaring Variables
    int[] numbers = new int[5];

    // Starting Logic
    System.out.println("Type the numbers: ");

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Number #" + (i + 1) + ": ");
      numbers[i] = scan.nextInt();
    }

    System.out.print("\nOdd Numbers: ");
    for (int number : numbers) {
      if (number % 2 != 0) {
        System.out.printf("%d ", number);
      }
    }
    System.out.printf("\nEven Numbers: ");
    for (int number : numbers) {
      if (number % 2 == 0) {
        System.out.printf("%d ", number);
      }
    }
    System.out.println();
    // Ending Logic
  }

}
