import java.util.Scanner;

public class Problem4 {

  public static void showProblem(Scanner input) {

    System.out.println("########## Problem 4 ##########");
    System.out.println(
        "Escreva um programa que recebe a cotação do dólar" +
            " do dia e, seguida recebe um valor em reais." +
            " A saída é a quantia em dólares. Use formatação" +
            " de saída para exibir os valores de acordo com" +
            " cada representação de moeda.");

    float dollarQuote;
    float brtMoney;

    System.out.println("Type the current dollar quotation:");
    dollarQuote = input.nextFloat();

    System.out.println("Type the amount you would like to convert to dollars: ");
    brtMoney = input.nextFloat();

    System.out.printf(
        "R$ %.2f = US$ %.2f\n", brtMoney, brtMoney / dollarQuote);

  }

}
