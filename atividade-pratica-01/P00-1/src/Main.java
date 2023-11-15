import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		double number1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double number2 = scanner.nextDouble();
		
		Calculadora.result(number1, number2);	
		scanner.close();
	}

}
