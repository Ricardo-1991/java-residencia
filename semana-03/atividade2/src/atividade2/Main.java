package atividade2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char resp;
		do {
		  System.out.println("Adicione um número da lista: ");
		  int number = scanner.nextInt();
		  ListaNumeros.novoNumero(number);
		  System.out.println("Deseja adicionar um novo número? s / n");
		  resp = scanner.next().charAt(0);
		}while(resp != 'n');
		
		ListaNumeros.ordena();
		System.out.println(ListaNumeros.media());
		ListaNumeros.listaTodosOsNumeros();
		System.out.println(ListaNumeros.mediana());
		
		System.out.println("Digite um numero para saber qual posição de grandeza ele está na lista: ");
		int n = scanner.nextInt();
		System.out.println(ListaNumeros.colocadoEm(n));
		scanner.close();
	}

}
