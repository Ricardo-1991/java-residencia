import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char answer;
		int option;
		
		do {
			System.out.println("Insira uma temperatura: ");
			float temperature = scanner.nextFloat();
			System.out.println("\nInsira qual a unidade (Fahrenheit ou Celsius) da temperatura: ");
			System.out.println("Opcao 1 - Celsius");
			System.out.println("Opcao 2 - Fahrenheit");
			System.out.println("Opcao 3 - Sair");
			
			option = scanner.nextInt();
			float convertedTemperature = ConversorTemperatura.converte(temperature, option);	
			if(option == 1) {
				System.out.printf("Temperatura convertida de Celsius para Fahrenheit: %,.1f ", convertedTemperature, ".");
			} else if(option == 2) {
				System.out.printf("Temperatura convertida de Fahrenheit para Celsius: %,.1f ", convertedTemperature, ".");
			} else if(option == 3) {
				System.out.println("Programa finalizado.");
				break;
			} else {
				System.out.println("Opção inválida");
			}
			
			System.out.println("\nDeseja digitar uma nova temperatura? s/n");
			answer = scanner.next().charAt(0);
			
			if(answer == 'n') {
				System.out.println("Programa finalizado.");
			}
			
		}while(option != 3 && answer == 's');
		
		scanner.close();
		
	}

}
