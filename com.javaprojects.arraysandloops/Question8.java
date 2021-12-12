import java.util.Scanner;
import person.Person;

public class Question8 {
  public static void showQuestion(Scanner scan) {
    System.out.println("\n############ Question 8 ############");
    System.out.println(
        "\nEscreva um programa que lê nome, altura e peso de 5 pessoas, calcula o IMC de cada um e ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).");
    System.out.println("Start!\n");

    // Declaring Variables
    Person[] people = new Person[5];

    // Starting Logic
    for (int i = 0; i < people.length; i++) {
      people[i] = new Person();
      System.out.printf("Person #%d\n", i + 1);
      System.out.print("Type the person's name: ");
      people[i].name = scan.next();
      System.out.printf("Now type %s's height (Ex 1,71): ", people[i].name);
      people[i].height = scan.nextFloat();
      System.out.printf("Now type %s's weight (Ex 86,4): ", people[i].name);
      people[i].weight = scan.nextFloat();
      System.out.println();

      people[i].imc = people[i].weight /
          (people[i].height * people[i].height);
    }

    for (int i = 0; i < people.length; i++) {
      if (people[i].imc < 18.5f || people[i].imc > 25f) {
        System.out.printf("%s is not with the ideal IMC (%.2f)\n",
            people[i].name, people[i].imc);
      }
    }
    // Ending Logic
  }
}
