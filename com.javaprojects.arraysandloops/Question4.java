import java.util.Scanner;

public class Question4 {
  public static void showQuestion(Scanner scan) {

    System.out.println("\n############ Question 4 ############");
    System.out.println(
        "\nEscreva um programa que lê 5 números e informa o maior, o menor e a média deles.");
    System.out.println("Start!\n");

    // Declaring Variables
    int[] numbers = new int[5];
    int minimunNum;
    int maximumNum;
    float media = 0f;

    // Starting Logic
    System.out.println("Type the numbers:");

    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("Number #%d: ", i + 1);
      numbers[i] = scan.nextInt();
    }

    minimunNum = numbers[0];
    maximumNum = numbers[4];

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < minimunNum) {
        minimunNum = numbers[i];
      }

      if (numbers[i] > maximumNum) {
        maximumNum = numbers[i];
      }

      media += (float) numbers[i] / (float) numbers.length;
    }

    // Ending Logic
    System.out.printf(
        "Maximum: %d\nMinimun: %d\nMedia: %.2f\n",
        maximumNum, minimunNum, media);
    System.out.println();
  }
}
