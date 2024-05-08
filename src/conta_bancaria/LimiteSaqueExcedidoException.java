package conta_bancaria;

public class LimiteSaqueExcedidoException extends Exception{
	public LimiteSaqueExcedidoException() {
		super("Limite de saque excedido!");
	}
}
