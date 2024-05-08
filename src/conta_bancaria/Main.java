package conta_bancaria;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.setNumero(8102);
		c1.setTitular("Lucas");
		c1.setSaldo(1000);
		c1.setLimiteSaque(300);
		
		System.out.println(c1);
		try {
			c1.saque(400);
		} catch (SaldoInsuficienteException e) {
			// TODO Bloco catch gerado automaticamente
			e.printStackTrace();
		} catch (LimiteSaqueExcedidoException e) {
			// TODO Bloco catch gerado automaticamente
			e.printStackTrace();
		}
		System.out.println(c1);
	}

}
