package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	// Construtor para passar uma mensagem
	public DomainException(String msg) {
		super(msg);
	}
}
