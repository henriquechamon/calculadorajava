import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Coloque dois números:");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();

    System.out.println("Coloque um operador:");
    char operator = input.next().charAt(0);

    double result;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        System.out.println("Error: Operador inválido");
        return;
    }

    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}
