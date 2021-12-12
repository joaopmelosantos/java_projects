import java.util.Scanner;

public class Question6 {
  public static void showQuestion(Scanner scan) {
    System.out.println("\n############ Question 6 ############");
    System.out.println(
        "\nEscreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.");
    System.out.println("Start!\n");

    // Declaring Variables
    String name;
    char[] nameLetters;
    String result = "";

    // Starting Logic
    System.out.println("Type the name: ");
    name = scan.next();

    nameLetters = name.toCharArray();

    for (int i = 0; i < nameLetters.length; i++) {
      if (i % 2 != 0) {
        nameLetters[i] = Character.toUpperCase(nameLetters[i]);
      }
    }

    for (char letter : nameLetters) {
      result += letter;
    }

    // Ending Logic
    System.out.printf("Result: %s\n\n", result);
  }
}