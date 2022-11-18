@tag
	Feature: Cliente faz saque de dinheiro Com um Cliente, eu gostaria de sacar dinheiro em caixa eletronico,
 	para que eu nao tenha que esperar numa fila de banco.

  @tag1
  Scenario: Cliente especial com saldo negativo
    Given Um cliente especial com saldo atual de -300 reais
    When for solicitado um saque no valor de 100 reais
    Then deve efutuar o saque e atualizar o saldo da conta para -400 reais
 
 @tag2
   Scenario: Cliente comum com saldo negativo
    Given Um cliente comum com saldo atual de 250 reais
    When solicitar um saque no valor de 100 reais
    Then não deve efutuar o saque e deve retornar a mensagem Saldo Insuficiente
    
    
    
# = OBS.: Quando for testar com o saldo negativo em ambos cenários, favor ir no arquivo Conta.java e fazer a operação da variável saldo * -1    
# = OBS.: E pedirá alterações nos metódos, o CUCUMBER vai mostrar no console os metódos com alterações por causa do valor negativo quando for cliente comum 