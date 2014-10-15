public class Main {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Nome");
		contato.setSobrenome("Sobrenome");
		
		contato.adicionaTelefone(new Telefone("66", "88887777"));
		
	}

}
