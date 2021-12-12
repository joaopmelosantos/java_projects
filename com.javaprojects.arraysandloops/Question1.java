import java.util.Scanner;

public class Question1 {
  public static void showQuestion(Scanner scan) {

    System.out.println("\n############ Question 1 ############");
    System.out.println(
        "\nEscreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final da entrada dos 5 itens, exiba a lista completa.");
    System.out.println("Start!\n");

    // Declaring Variables
    String[] fruitsCart = new String[5];

    // Starting Logic
    System.out.println("Type the fruits you would like to add:");

    for (int i = 0; i < fruitsCart.length; i++) {
      System.out.printf("Fruit #%s: ", i + 1);
      fruitsCart[i] = scan.next();
    }

    // Ending Logic
    System.out.printf(
        "Fruits Cart: %s, %s, %s, %s, %s.\n\n",
        fruitsCart[0], fruitsCart[1], fruitsCart[2],
        fruitsCart[3], fruitsCart[4]);

  }
}
