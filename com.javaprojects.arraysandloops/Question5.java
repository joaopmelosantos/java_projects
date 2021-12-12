import java.util.Scanner;

public class Question5 {
  public static void showQuestion(Scanner scan) {
    System.out.println("\n############ Question 5 ############");
    System.out.println(
        "\nEscreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados. Ao final, informe qual o nome mais longo presente na lista.");
    System.out.println("Start!\n");

    // Declaring Variables
    String[] guests = new String[5];
    String LongestGuestName;

    // Starting Logic
    System.out.println("Type the name of the guests: ");
    for (int i = 0; i < guests.length; i++) {
      System.out.printf("Guest #%d: ", i + 1);
      guests[i] = scan.next();
    }

    LongestGuestName = guests[0];

    for (String guest : guests) {
      if (guest.length() >= LongestGuestName.length()) {
        LongestGuestName = guest;
      }
    }

    // Ending Logic
    System.out.printf(
        "Longest Guest Name: %s\n", LongestGuestName);
    System.out.println();
  }
}