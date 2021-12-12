import java.util.Scanner;

public class QuestionSelector {

  public static void selectQuestion(char questionNumber, Scanner scan) {

    switch (questionNumber) {
      case '1':
        Question1.showQuestion(scan);
        break;
      case '2':
        Question2.showQuestion(scan);
        break;
      case '3':
        Question3.showQuestion(scan);
        break;
      case '4':
        Question4.showQuestion(scan);
        break;
      case '5':
        Question5.showQuestion(scan);
        break;
      case '6':
        Question6.showQuestion(scan);
        break;
      case '7':
        Question7.showQuestion(scan);
        break;
      case '8':
        Question8.showQuestion(scan);
        break;
      default:
        System.out.println("Question not found");
        break;
    }
  }

}
