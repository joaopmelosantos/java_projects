import java.util.Scanner;

public class ArraysAndLoops {
  public static void main(String[] args) {
    Scanner scanInput = new Scanner(System.in);
    char question;
    char projectState = 'N';

    do {

      System.out.println("\nArrays and Loops Exercises" +
          " - Select the number of the question to see it:\n" +
          "1 - Fruits Cart\n" +
          "2 - Word Backwards\n" +
          "3 - Odds and Evens\n" +
          "4 - Numbers Data\n" +
          "5 - Guest List\n" +
          "6 - Odd Letters Uppercase\n" +
          "7 - People's Age\n" +
          "8 - Group IMC\n");

      question = scanInput.next().charAt(0);

      QuestionSelector.selectQuestion(question, scanInput);

      System.out.print(
          "Wanna get back to the questions menu? Type 'Y' to yes or 'N' to no: ");

      projectState = scanInput.next().charAt(0);

      if (projectState != 'Y' && projectState != 'N') {
        do {
          System.out.println("Invalid input, type 'Y' or 'N'");
          projectState = scanInput.next().charAt(0);
        } while (projectState != 'Y' && projectState != 'N');
      }

    } while (projectState != 'N');

    System.out.println("Goodbye!!!");

    scanInput.close();
  }

}
