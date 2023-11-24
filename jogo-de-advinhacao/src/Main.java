import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int generateNumber = random.nextInt(100) + 1;
		boolean gotIt = false;
		System.out.println(generateNumber);
		while(!gotIt) {
			System.out.println("Qual o número gerado?");
			int userGuessed = scanner.nextInt();
			
			if(userGuessed == generateNumber) {
				System.out.println("Número aleatório: " + generateNumber);
				System.out.println("Numero chutado: " + userGuessed);
				System.out.println("Parabéns, você acertou!");
				gotIt = true;
			} else if(userGuessed < generateNumber - 20) {
				System.out.println("Numero chutado: " + userGuessed);
				System.out.println("Chute muito baixo!");
			} else if(userGuessed > generateNumber + 20) {
				System.out.println("Numero chutado: " + userGuessed);
				System.out.println("Chute muito alto!!");
			} else {
				System.out.println("Está muito quente! Continue tentando!");
			}

	}
	scanner.close();
}

}
