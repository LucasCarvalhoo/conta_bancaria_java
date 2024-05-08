# Projeto Conta Bancária em Java

Este é um projeto simples em Java que demonstra a implementação de uma classe `Conta` para representar uma conta bancária, com suporte para operações como depósito, saque e tratamento de exceções.

## Funcionalidades

- **Depósito**: Permite ao titular da conta fazer um depósito adicionando fundos à conta.
- **Saque**: Permite ao titular da conta fazer um saque, retirando fundos da conta, com tratamento de exceções para saldo insuficiente e limite de saque excedido.

## Uso da Classe `Conta`

Para usar a classe `Conta` em seu próprio projeto, siga estas etapas:

1. Baixe o arquivo `Conta.java` e adicione-o ao seu projeto Java.
2. Importe a classe `Conta` em seus arquivos Java onde você deseja usar uma conta bancária.

   ```java
   import conta_bancaria.Conta;

3. Instancie um objeto Conta e use os métodos deposito() e saque() para interagir com a conta. Exemplo:

   ```java
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

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
