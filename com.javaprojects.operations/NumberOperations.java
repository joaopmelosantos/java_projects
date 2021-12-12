public class NumberOperations {

  public int addition(int number1, int number2) {
    return number1 + number2;
  }

  public int subtraction(int number1, int number2) {
    return number1 - number2;
  }

  public int multiplication(int number1, int number2) {
    return number1 * number2;
  }

  public int division(int number1, int number2) {
    if (number2 == 0) {
      System.out.println("Not divided by zero");
      return 0;
    } else {
      return number1 / number2;
    }
  }

}
