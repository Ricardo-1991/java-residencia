import java.util.ArrayList;
import java.util.List;

public class Quiz {
	private String pergunta;
	private ArrayList<String> respostas = new ArrayList<String>();
	private int alternativa;
	
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta; 
	}
	
	public void getRespostas() {
		for(int i = 0; i < respostas.size(); i++) {
			System.out.println("indice: " + i + "respostas: " + respostas.get(i));
		}
	}
	
	public void setRespostas(List<String> respostas) {
		this.respostas.addAll(respostas);
	}
	
}
