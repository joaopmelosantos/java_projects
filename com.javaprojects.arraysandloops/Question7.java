import java.util.Scanner;
import person.Person;

public class Question7 {
  public static void showQuestion(Scanner scan) {
    System.out.println("\n############ Question 7 ############");
    System.out.println(
        "\nEscreva um programa que lê nome e idade de 5 pessoas e ao final informa quem é o mais novo, o mais velho e qual a média de idade.");
    System.out.println("Start!\n");

    // Declaring Variables
    Person[] people = new Person[5];
    Person olderPerson = new Person();
    Person youngerPerson = new Person();
    float media = 0f;

    // Starting Logic
    for (int i = 0; i < people.length; i++) {
      people[i] = new Person();
      System.out.println("Type the person's name: ");
      people[i].name = scan.next();
      System.out.printf("Now type %s's age:\n", people[i].name);
      people[i].age = scan.nextInt();
    }

    olderPerson = people[0];
    youngerPerson = people[0];

    for (Person person : people) {
      if (person.age > olderPerson.age) {
        olderPerson = person;
      } else if (person.age < youngerPerson.age) {
        youngerPerson = person;
      }
      media += (float) person.age / (float) people.length;
    }

    // Ending Logic
    System.out.printf(
        "Youngest Person: %s with %d years old\n" +
            "Oldest Person: %s with %d years old\n" +
            "Media of Ages: %.2f\n\n",
        youngerPerson.name, youngerPerson.age,
        olderPerson.name, olderPerson.age, media);
  }
}