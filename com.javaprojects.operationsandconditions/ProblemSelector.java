import java.util.Scanner;

public class ProblemSelector {
  public static void selectProblem(char problem, Scanner input) {
    switch (problem) {
      case '1':
        Problem1.showProblem(input);
        break;
      case '2':
        Problem2.showProblem(input);
        break;
      case '3':
        Problem3.showProblem(input);
        break;
      case '4':
        Problem4.showProblem(input);
        break;
      case '5':
        Problem5.showProblem(input);
        break;
      default:
        System.out.println("Question not found!");
        break;
    }
  }
}
