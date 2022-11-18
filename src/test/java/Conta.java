import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Aqui estamos criando uma classe para fazer os testes em cada cen�rio
 * @author lucas
 *
 */
public class Conta {	
/**
 * Temos o atributos da nossa classe logo abaixo:
 * clienteEspecial: para representar se o cliente � do tipo especial
 * conta: representa o saldo atual da conta do cliente 
 * saldo: vari�vel para receber o valor que o cliente deseja sacar.
 */
	public boolean clienteEspecial = false;
	public int conta;
	public int saque;
	public int saldo;
	
	
	
/**
 * A tag before segundo a documenta��o do Cocumber serve para executar um met�do antes de todos os
 * outros
 */

	public boolean isClienteEspecial() {
		return clienteEspecial;
	}


	public void setClienteEspecial(boolean clienteEspecial) {
		this.clienteEspecial = clienteEspecial;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public int getSaque() {
		return saque;
	}


	public void setSaque(int saque) {
		this.saque = saque;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	/**
	 *1 Cenário - Cenário que o Cliente do tipo especial quer realizar um saque em sua conta negativada ou positivada.
	 * Se a conta estiver negativa e ocorrer o saque, o saldo ficará mais negativado do que estava.
	 * Caso sua conta esteja positivada, o saque vai realizar a diferen�a e atualizar o valor.
	 * 
	 * 
	 * 
	 * @param int1 este parametro serve para informar o valor que o cliente especial ira sacar da conta
	 * e assim aumento o valor negativado
	 * 
	 * @author Lucas Spizzica
	 * 
	 * Dado: um cliente especial com o saldo atual de X
	 */

	/*Neste metódo e cliente especial está recebendo valor que está na sua conta*/
	@Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
	public void um_cliente_especial_com_saldo_atual_de_reais(int conta) throws Throwable {
		if (this.clienteEspecial == true) {
			setConta(conta);
		} else
			  throw new PendingException();
	}

	
	/**
	 * Quando: o cliente solicitar� um saque no valor qualquer em reais e a solicitação sera feita 
	 * @param saque
	 */
	@When("^for solicitado um saque no valor de (\\d+) reais$")
	public void for_solicitado_um_saque_no_valor_de_reais(int saque) throws Throwable {
		if (this.clienteEspecial == true) {
			setSaque(saque);
		} else
			  throw new PendingException();
	}

	
	/**
	 * Então: efutuará a operação de saque da conta e atualizar o valor do saldo
	 * @param int1
	 */
	@Then("^deve efutuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
	public void deve_efutuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int saque) throws Throwable {
		if (this.clienteEspecial == true) {
			setSaldo(getConta() - (getConta()));
		} else
			  throw new PendingException();
	}

	/**
	 * 2 Cenário - Cenário Cliente comum tentando fazer um saque com conta negativada
	 * 
	 * Dado: o cliente do tipo comum irá realizar um saque com o saldo de sua conta
	 * so o saldo for negativo, notificar com a mensagem: "Saldo insuficinete", se for positivo e 
	 * e o saldo maior que o saque, será liberado o seu dinheiro
	 * 
	 * 
	 * Aqui um cliente comum com saldo negativo ou positivo sera declarado
	 * @param conta, este parametro representa o valor no o cliente vai possuir em sua conta
	 */
	@Given("^Um cliente comum com saldo atual de (\\d+) reais$")
	public void umClienteComumComSaldoAtualDeReais(int conta) throws Throwable {
		
		if (this.clienteEspecial == false) {
			setConta(conta);
		} 
		else {
			  throw new PendingException();
			}
	}

	
	/**
	 * Quando: o cliente comum solicitar um saque em sua conta com determinado valor
	 * @param saque será atribuido com o valor que o cliente deseja sacar
	 */
	@When("^solicitar um saque no valor de (\\d+) reais$")
	public void solicitar_um_saque_no_valor_de_reais(int saque) throws Throwable {
	
		if ( this.clienteEspecial == false) {
			setSaque(saque);
		} else
			  throw new PendingException();
	}

	/**
	 * 
	 * Então: Aqui verificará se o saldo do cliente é positivo e o saque for abaixo da quantia que deseja sacar, 
	 * se for verdadeiro o saque vai ser feito. Caso não seja verdade, o cliente ão vai conseguir sacar e deve 
	 * receber a mensagem "Saldo insuficiente!!" indicando que não possui um saldo suficiente para realizar a operação
	 *  de saque.
	 *  
	 */
	@Then("^não deve efutuar o saque e deve retornar a mensagem Saldo Insuficiente$")
	public void não_deve_efutuar_o_saque_e_deve_retornar_a_mensagem_Saldo_Insuficiente() throws Throwable {
		if (this.conta > 0 && this.saque <= this.conta && this.clienteEspecial == false ) {
			setSaldo(getConta() - (getSaldo()));
			System.out.println("Saque realizado com sucesso!");
			
		} else if (this.saque > this.conta || this.conta < 0 ) {
			System.out.println("Saldo insuficiente!!!!!!");
		}
		else{
			  throw new PendingException();
			}
		
	}
}
