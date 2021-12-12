import java.util.Scanner;

public class InchesToCentimeter {

  public static void main(String[] args) {

    Scanner scanInches = new Scanner(System.in);
    float inches;

    System.out.println(
        "Type the amounth of inches you would like to convert: ");
    inches = scanInches.nextFloat();
    scanInches.close();

    final float centimeter = inches * 2.54f;

    System.out.printf(
        "%.2f inches = %.2f cm\n", inches, centimeter);

  }

}
