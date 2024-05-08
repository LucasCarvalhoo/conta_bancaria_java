package conta_bancaria;

public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException() {
		super("Saldo insuficiente para saque!");
	}
}
