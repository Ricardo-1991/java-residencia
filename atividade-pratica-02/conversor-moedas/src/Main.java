import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Conversor de Moedas");
		System.out.println("Insira qual a quantidade de dólares que deseja converter: ");
		float userDollarsInput = scanner.nextFloat();
		System.out.println("Qual a taxa de câmbio?");
		float userExchangeOption = scanner.nextFloat();
		
		float result = CurrencyConverter.converter(userDollarsInput, userExchangeOption);
		
		System.out.println("Dollars: $" + userDollarsInput);
		System.out.println("Taxa de câmbio: " + userExchangeOption);
		System.out.printf("Dólar convertido: $%.2f%n", result);
		
		scanner.close();
	}

}
