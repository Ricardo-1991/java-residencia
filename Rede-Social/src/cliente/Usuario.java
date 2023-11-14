package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String email;
	private String nacionalidade;
	private int quantidadeDePostagens = 0;
	private int pontuacao = 0;
	
	private ArrayList<String> postagens;
	
	public Usuario(String nome, String email, String nacionalidade){
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.postagens = new ArrayList<String>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
	
	public int getQuantidadeDePostagens() {
		return quantidadeDePostagens;
	}

	public void setQuantidadeDePostagens(int quantidadeDePostagens) {
		this.quantidadeDePostagens = quantidadeDePostagens;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public void adicionaPostagem(String postagem) {
		quantidadeDePostagens++;
	}
	
	public void alteraPontuacao(int delta) {
		if(delta > 0) {
			pontuacao += delta;
		} else {
			pontuacao -= delta;
		}
	}
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do usuário: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o email do usuario: ");
		String email = scanner.nextLine();
		System.out.println("Digite a nacionalidade do usuario: ");
		String nacionalidade = scanner.nextLine();
		
		Usuario usuario = new Usuario(nome, email, nacionalidade);
		
		String postagem;
		
		boolean flag = true;
		int option;
		
		do {
			System.out.println("Digite uma postagem: ");
			postagem = scanner.nextLine();
			usuario.adicionaPostagem(postagem);
			System.out.println("Deseja fazer mais uma postagem?");
			System.out.println("Opção 1 - Sim");
			System.out.println("Opção 2 - Não");
			option = scanner.nextInt();
			scanner.nextLine();
			if(option == 1) {
				flag = true;
			} else {
				flag = false;
			}
		}while(flag == true);
		
		usuario.alteraPontuacao(-2);
		
		System.out.println(usuario.getPontuacao());
		
		System.out.println(usuario.getQuantidadeDePostagens());
		

	
		scanner.close();
	}
	
}
