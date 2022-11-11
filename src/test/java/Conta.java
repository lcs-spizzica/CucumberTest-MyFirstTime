//import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 *  Classe conta criada e as variaveis cliente, saldo e saque.
 *  Get e Set criado para receber os valores das variaveis.
 * 
 */

public class Conta {

	
	public boolean clienteEspecial = true;
	public int conta;
	public int saque;
	public int saldo;
	
//	@Before
	public void before() {
		if (this.clienteEspecial == true) {
			System.out.println("Entrou na 1 condição");
			um_cliente_especial_com_saldo_atual_de_reais(conta);
			for_solicitado_um_saque_no_valor_de_reais(saque);
			deve_efutuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(saldo);
		} else {
			um_cliente_comum_com_saldo_atual_de_reais(conta);
			solicitar_um_saque_no_valor_de_reais(saque);
			nao_deve_efutuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente();
			System.out.print("Entrou na 2 condição\"");
		}
		
	}

	/**
	 * 1 Cenario - Cliente do tipo especial fazendo saque com sua conta negativada
	 * 
	 * Onde um cliente do tipo especial podera solicitar um saque mesmo com sua conta negativada
	 * 
	 * 
	 * @param int1 este parametro serve para informar o valor que o cliente especial ira sacar da conta
	 * e assim aumento o valor negativado
	 * 
	 * @author Lucas Spizzica
	 * 
	 * Aqui declaramos que o cliente esoecial possui um saldo negativado de 200 reais
	 */

	
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer conta) {
		if (conta instanceof Integer && this.clienteEspecial == true) {
			this.conta = conta;
		} else
			throw new io.cucumber.java.PendingException();
	}

	
	/**
	 * Aqui o cliente solicitará um saque no valor de 100 reais e a solicitaçao sera feita 
	 * @param int1
	 */
	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer saque) {
		

		if (saque instanceof Integer && this.clienteEspecial == true) {
			this.saque = saque;
		} else
			throw new io.cucumber.java.PendingException();
	}

	
	/**
	 * Aqui efutuara a operação da sua conta e aumentará sua divida na sua conta
	 * @param int1
	 */
	@Then("deve efutuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efutuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer saldo) {

		if (saldo instanceof Integer && this.clienteEspecial == true) {
			saldo = this.conta - (this.saque);
		} else
			throw new io.cucumber.java.PendingException();
	}

	
	/**
	 * 2 - Cenário Cliente comum tentando fazer um saque com conta negativada
	 * 
	 * neste cenário o cliente do tipo comum irá tentar fazer um saque com o saldo da sua conta negativado 
	 * e não conseguirá e terá uma mensagem "Saldo insuficinete"
	 * 
	 * 
	 * Aqui um cliente comum com saldo negativo sera declarado 
	 * 
	 * @param int1 este parametro representa o valor no qual o cliente comum tentara sacar da sua conta\
	 * @author Lucas Spizzica
	 */
	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer conta) {
		
		if (conta instanceof Integer && this.clienteEspecial == false) {
			this.conta = conta;
		} 
		else {
			throw new io.cucumber.java.PendingException();
			}
	}

	
	/**
	 * Aqui o cliente comum irá solicitar um saque da sua conta em um determinado valor
	 * 
	 * @param int1 aqui sera o valor que o cliente comum solitará para sacar
	 */
	@When("solicitar um saque no valor de {int} reais")
	public void solicitar_um_saque_no_valor_de_reais(Integer saque) {
	
		if (saque instanceof Integer && this.clienteEspecial == false) {
			this.saque = saque;
		} else
			throw new io.cucumber.java.PendingException();	
	}

	/**
	 * 
	 * Nessa parte o codigo retorna a mensagem de saldo insuficiente. Pois o cliente comum está com saldo negativo.
	 *  Como solicitado pelo Then o cliente comum não pode receber o saque pois o seu saldo está negativo.       
	 *  É realizado o if com uma condição de saldo e tipo do cliente.
	 *  Sendo cliente comum e saldo negativo é passada a mensagem Saldo Insuficiente. e no else é realizada a execeção.
	 *  
	 */
	@Then("nao deve efutuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void nao_deve_efutuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		if (this.conta > 0 && this.saque < this.conta && this.clienteEspecial == false ) {
			saldo = this.conta - (this.saque);
		} else if (this.saque > this.conta) {
			System.out.println("Saldo insuficiente");
		}
		else{
			throw new io.cucumber.java.PendingException();}
		
	}
}
