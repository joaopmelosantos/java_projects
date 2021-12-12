import java.util.Scanner;

public class christmas {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int lines;

    System.err.println("Type the number: ");
    lines = input.nextInt();
    input.close();

    for (int i = 0; i < lines; i++) {
      for (int j = 0; j < lines - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
