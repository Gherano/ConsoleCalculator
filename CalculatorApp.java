import java.util.Scanner;
public class CalculatorApp {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("--- Simple Java Calculator ---");
	System.out.print("enter first number(a):");
	double num1 = scanner.nextDouble();
	System.out.print("enter operation (+,-,*,/):");
	char operation = scanner.next().charAt(0);
	System.out.print("enter second number(b):");
	double num2 = scanner.nextDouble();
	double result = 0.0;
	switch(operation) {
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
		if(num2 != 0) {
			result = num1/num2;
		} else {
			System.out.println("division by zero is not allowed");
			return;
		}
		break;
	default:
		System.out.println("invalid operation entered");
		return;

	}
	System.out.println("\n--- Result ---");
	System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
	scanner.close();

	}

}
