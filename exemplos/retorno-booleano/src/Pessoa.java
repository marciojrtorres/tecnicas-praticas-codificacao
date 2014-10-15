public class Pessoa {
	
	private String nome;
	private int idade;
	
	public boolean isMaior() {
		if (idade >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
