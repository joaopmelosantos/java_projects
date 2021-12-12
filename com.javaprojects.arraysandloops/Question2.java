import java.util.Scanner;

public class Question2 {
  public static void showQuestion(Scanner scan) {

    System.out.println("\n############ Question 2 ############");
    System.out.println(
        "\nEscreva um programa que lê uma palavra e a escreve de volta ao contrário.");
    System.out.println("Start!\n");

    // Declaring Variables
    String name;
    char[] nameLetters;
    String nameBackwarded = "";

    // Starting Logic
    System.out.println(
        "Type the name you would like to get the backwards:");

    name = scan.next();

    nameLetters = new char[name.length()];

    for (int i = 0; i < nameLetters.length; i++) {
      nameLetters[i] = name.charAt(nameLetters.length - i - 1);
    }

    for (char letters : nameLetters) {
      nameBackwarded += letters;
    }

    // Ending Logic
    System.out.printf("%s <=> %s\n\n", name, nameBackwarded);
  }
}