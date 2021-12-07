import java.util.Scanner;

public class DollarQuotation {

  public static void main(String[] args) {
    Scanner scanMoney = new Scanner(System.in);
    float dollarQuote;
    float brtMoney;

    System.out.println("Type the current dollar quotation:");
    dollarQuote = scanMoney.nextFloat();

    System.out.println("Type the amount you would like to convert to dollars: ");
    brtMoney = scanMoney.nextFloat();

    scanMoney.close();

    System.out.printf(
        "R$ %.2f = US$ %.2f", brtMoney, brtMoney / dollarQuote);
  }

}
