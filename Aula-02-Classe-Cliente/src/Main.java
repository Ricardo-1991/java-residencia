import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do cliente");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o CPF do cliente");
		String cpf = scanner.nextLine();
		
		Cliente cliente = new Cliente(nome,cpf);
		
		System.out.println(cliente.getNome());
		
		System.out.println(cliente.getCpf());
		
		System.out.println("Altere o nome do cliente: ");
		nome = scanner.nextLine();
		cliente.setNome(nome);
		
		
		System.out.println("Altere o CPF do cliente: ");
		cpf = scanner.nextLine();
		cliente.setCpf(cpf);
		
		
		System.out.println(cliente.getNome());
		
		System.out.println(cliente.getCpf());
		
		
		
		
	}

}
