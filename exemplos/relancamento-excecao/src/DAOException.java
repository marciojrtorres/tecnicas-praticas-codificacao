

public class DAOException extends RuntimeException {
	
	public DAOException(String mensagem, Throwable excecaoOrigem) {
		super(mensagem, excecaoOrigem);
	}

}
