import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
	public static  ArrayList<Integer> userInputIntNumbers(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual será o tamanho da lista?");
		int size = scanner.nextInt();
		ArrayList<Integer> arrayNumbers = new ArrayList<Integer>();
		
		for(int i = 0; i < size; i++) {
			System.out.print("Elemento " + (i + 1) + ": ");	
			arrayNumbers.add(scanner.nextInt());
		}
		return arrayNumbers;
	}
	
	public static ArrayList<Integer> userInputRandomNumbers(){
		Scanner scanner = new Scanner(System.in);
		Random randomNumbers = new Random();
		
		System.out.println("Qual será o tamanho da lista?");
		int size = scanner.nextInt();
		ArrayList<Integer> arrayRandomNumbers = new ArrayList<Integer>();
		
		for(int i = 0; i < size; i++) {
			arrayRandomNumbers.add(randomNumbers.nextInt(100));
		}
		scanner.close();
		return arrayRandomNumbers;
		
	}
	
	public static int sumAllnumbers(ArrayList<Integer> array) {
		int result = 0;
		for(int i = 0; i < array.size(); i++) {
			result += array.get(i);
		}
		return result;
	}
	
	public static int findTheBiggerNumber(ArrayList<Integer> array) {
		int maxNumber = array.get(0);
		for(int number : array) {
			if(number > maxNumber) {
				maxNumber = number;
			}
		}
		return maxNumber;
	}
	
	public static int findTheSmallerNumber(ArrayList<Integer> array) {
		int minNumber = array.get(0);
		for(int number : array) {
			if(number < minNumber) {
				minNumber = number;
			}
		}
		return minNumber;
	}
	
	public static void printArrayElements(ArrayList<Integer> array) {
		for(int number : array) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
