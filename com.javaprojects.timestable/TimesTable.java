import java.util.Scanner;

public class TimesTable {

  public static void main(String[] args) {

    Scanner scanNumber = new Scanner(System.in);
    int number;

    System.out.println("Type the number");
    number = scanNumber.nextInt();

    scanNumber.close();

    for (int i = 1; i < 11; i++) {
      System.out.printf(
          "%d x %d = %d\n", number, i, number * i);
    }

  }

}
