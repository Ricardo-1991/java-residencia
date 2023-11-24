import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> userInputArray = ManipulaArray.userInputIntNumbers();
		ArrayList<Integer> randomNumbersArray = ManipulaArray.userInputRandomNumbers();
		
		System.out.println("Lista com elementos inteiros digitados:");
		ManipulaArray.printArrayElements(userInputArray);
		System.out.println("Lista com elementos aleatórios");
		ManipulaArray.printArrayElements(randomNumbersArray);
		
		int totalNumbersSum = ManipulaArray.sumAllnumbers(userInputArray);
		int totalRandomNumbersSum = ManipulaArray.sumAllnumbers(randomNumbersArray);
		
		System.out.println("Total dos números digitados: " + totalNumbersSum);
		System.out.println("Total dos números aleatórios: " + totalRandomNumbersSum);
		
		int maxNumber = ManipulaArray.findTheBiggerNumber(userInputArray);
		int maxRandomNumber = ManipulaArray.findTheBiggerNumber(randomNumbersArray);
		
		System.out.println("Maior número entre os numeros digitados: " + maxNumber);
		System.out.println("Maior número entre os numeros aleatórios: " + maxRandomNumber);
		
	}

}
