import java.util.Scanner;

public class OperationsAndConditionals {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char problemSelected;
    char projectState = 'N';

    do {
      System.out.println(
          "\n Java - Operations and Conditionals Exercises" +
              "\n Type the number of the question you like to see" +
              "\n 1 - Numbers Operations" +
              "\n 2 - Times Table" +
              "\n 3 - Celsius to Fahreheint" +
              "\n 4 - Dollar Quotation" +
              "\n 5 - Inches to Cm");

      System.out.print("Select the queston: ");
      problemSelected = input.next().charAt(0);

      ProblemSelector.selectProblem(problemSelected, input);

      System.out.printf("Wanna get back to menu " +
          "('Y' to Yes or 'N' to No): ");

      projectState = input.next().charAt(0);

      if (projectState != 'Y' && projectState != 'N') {
        do {
          System.out.println("Invalid input, type 'Y' or 'N'");
          projectState = input.next().charAt(0);
        } while (projectState != 'Y' && projectState != 'N');
      }

    } while (projectState != 'N');

    System.out.println("GoodBye!");
    input.close();

  }

}
