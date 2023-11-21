import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Digite o numero1: ");
//		int num1 = scanner.nextInt();
//		System.out.println("Digite o numero2: ");
//		int num2 = scanner.nextInt();
//		
//		System.out.println(Soma.sum(num1, num2));
//		
		
//		float grade1, grade2, grade3, height1, height2, height3;
//		
//		System.out.println("Escreva as três notas dos alunos: ");
//		grade1 = scanner.nextFloat();
//		grade2 = scanner.nextFloat();
//		grade3 = scanner.nextFloat();
//		System.out.println("Escreva os três pesos respectivamente: ");
//		height1 = scanner.nextFloat();
//		height2 = scanner.nextFloat();
//		height3 = scanner.nextFloat();
//		
//		System.out.println(MediaPonderada.calc(grade1, grade2, grade3, height1, height2, height3));
//		
//		
		Quiz quiz = new Quiz();
		
		System.out.println("Qual a pergunta?");
		String pergunta = scanner.nextLine();
		quiz.setPergunta(pergunta);
		System.out.println("Qual são as possíveis 4 respostas? Enumere exemplo: 1 - resposta, 2 - resposta... ");
		String resposta1 = scanner.nextLine();
		String resposta2 = scanner.nextLine();
		String resposta3 = scanner.nextLine();
		String resposta4 = scanner.nextLine();
		List<String> respostas = Arrays.asList(resposta1, resposta2, resposta3, resposta4);
		quiz.setRespostas(respostas);
		
	}

}
