import java.util.Scanner;

public class Calculadora {
	
	public static double sum(double number1, double number2) {
		return number1 + number2;
	}
	
	public static double subtract(double number1, double number2) {
		return number1 - number2;
	}
	
	public static double multiply(double number1, double number2) {
		return number1 * number2;
	}
	
	public static double divide(double number1, double number2) {
		if(number2 != 0) {
			return number1 / number2;			
		} else {
			 throw new ArithmeticException("Não é possível dividir por zero.");
		}
	}
	
	public static void result(double number1, double number2) {
		double result = 0;
		char option;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Opção 1: +");
			System.out.println("Opção 2: -");
			System.out.println("Opção 3: *");
			System.out.println("Opção 4: /");
			System.out.println("Opção 5: 0");
			
			System.out.println("Escolha uma operador matemático para calcular os números ou digite 0 para sair: ");
			option = scanner.next().charAt(0);
		
			switch(option) {
				case '+':
					 result = sum(number1, number2);
					 System.out.println("A soma entre " + number1 + " e " + number2 + " é: " + result);
				break;
				
				case '-':
					result = subtract(number1, number2);
					System.out.println("A subtracao entre " + number1 + " e " + number2 + " é: " + result);
				break;
				
				case '*':
					result = multiply(number1, number2);
					System.out.println("A multiplicação entre " + number1 + " e " + number2 + " é: " + result);
				break;
				
				case '/':
					result = divide(number1, number2);
					System.out.println("A divisão entre " + number1 + " e " + number2 + " é: " + result);
				break;
				
				case '0':
					System.out.println("Programa finalizado.");
				break;
				default:
					System.out.println("Opção inválida");
				break;
			}
			
			System.out.println("Você deseja mudar os números do cálculo? ('s' - Sim; Qualquer tecla - Não) ");
			char changeNumber = scanner.next().charAt(0);
			
			if(changeNumber == 's') {
				System.out.println("Digite o primeiro numero: ");
				number1 = scanner.nextDouble();
				System.out.println("Digite o segundo numero: ");
				number2 = scanner.nextDouble();
			}	
		}while(option != '0');
		scanner.close();
	}
}
