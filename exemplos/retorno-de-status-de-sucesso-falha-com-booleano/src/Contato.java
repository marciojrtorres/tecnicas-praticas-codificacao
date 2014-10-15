import java.util.ArrayList;
import java.util.List;

public class Contato {

	private String nome;
	private String sobrenome;
	private List<Telefone> telefones = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void adicionaTelefone(Telefone telefone) {
		this.telefones.add(telefone);
	}

}
