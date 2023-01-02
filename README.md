# CucumberTest-MyFirstTime
## Implementação para resolução dos cenários utilizando Junit com Cocumber. ##
![Cocumber](https://miro.medium.com/max/936/1*r0UqtChar0tzusPS7fi9YQ.png)
![Cocumber](https://junit.org/junit4/images/junit5-banner.png)



## Implementação ##
![JavaImplementacao](https://media.discordapp.net/attachments/895889200270946347/1040767114547568740/image.png)
A implementação do código foi realizada na classe conta e adiocionando os atributos: Conta:int, saque:int, clienteEspecial:boolean e saldo:int

## Adcionando JUnit para testes unitários ##
#### Aplicando as dependências do JUnit ####
![Depency Junit](https://media.discordapp.net/attachments/895889200270946347/1040766309702574231/image.png)
O JUnit é um framework open-source, que se assemelha ao raio de testes software java, com suporte à criação de testes automatizados na linguagem de programação Java. Esse framework facilita a criação e manutenção do código para a automação de testes com apresentação dos resultados.

## Adicionando a classe Runner ##
![Foto da classe runner](https://media.discordapp.net/attachments/895889200270946347/1040769345246216253/image.png)

(JUnit Runner with @CucumberOptions)Está classe serve para executar Junit Runner com o cocumber e assim ter anotações para axiliar os testes feitos.

#### Explicando anotações das classes Runner ####

##### Snippets - O Cucumber gera snippets de código no estilo Underscore por padrão. Se você quiser alterar o formato dos snippets de pepino, poderá definir o tipo de snippet em suas opções de pepino. Existem dois tipos de fragmentos #####

##### Pretty - Imprime a fonte Gherkin com cores adicionais e rastreamentos de pilha para erros. #####

#### Monochrome - Esta opção pode ser definida como verdadeira ou falsa (o valor padrão é falso). Se for definido como verdadeiro, significa que a saída do console para o teste do Cucumber é muito mais legível. E se for definido como falso, a saída do console não será tão legível quanto deveria. Para praticar basta adicionar o código 'monochrome = true' na classe TestRunner. ####

##### STRICT - Se a opção strict for definida como false, no momento da execução, se o pepino encontrar alguma etapa indefinida/pendente, o pepino não falhará na execução e as etapas indefinidas serão ignoradas e BUILD será bem-sucedido. E se a opção Strict estiver definida como verdadeira, no momento da execução, se o pepino encontrar alguma etapa indefinida/pendente, o pepino falhará na execução e as etapas indefinidas serão marcadas como falha e BUILD é FALHA. Esta é a aparência da saída do console: #####

##### DryRun - Esta opção pode ser definida como true ou false (o valor padrão é false). Se estiver definido como verdadeiro, significa que o Cucumber apenas verificará se cada etapa mencionada no arquivo de recurso possui código correspondente escrito no arquivo de definição de etapa ou não. Portanto, caso alguma função seja perdida na Definição de Etapa para qualquer Etapa no Arquivo de Recurso, ela nos dará a mensagem. Portanto, se você estiver escrevendo cenários primeiro e depois implementando definições de etapas, adicione dryRun = true.#####

##### Features - Opções de recursos ajuda o Cucumber a localizar o arquivo Feature na estrutura de pastas do projeto. Tudo o que precisamos fazer é especificar o caminho da pasta e o Cucumber encontrará automaticamente todos os arquivos de extensão ' .features ' na pasta. #####

# Imagens do desenvolvimento # 


#### Given - 1 - cenário - cliente especial ####
![Given - 1 - cenário - cliente especial](https://media.discordapp.net/attachments/895889200270946347/1043294550732570695/image.png) 

#### When - 1 - cenário - cliente especial ####
![When - 1 - cenário - cliente especial](https://media.discordapp.net/attachments/895889200270946347/1043294671876661358/image.png) 

#### Then - 1 - cenário - cliente especial ####
![Then - 1 - cecário - cliente especial](https://media.discordapp.net/attachments/895889200270946347/1043294723848282162/image.png) 


#### Given - 2 - cenário - cliente comum ####
![Given - 2 - cenário - cliente comum](https://media.discordapp.net/attachments/895889200270946347/1043294818073321512/image.png) 

#### When - 2 - cenário - cliente comum ####
![When - 2 - cenário - cliente comum](https://media.discordapp.net/attachments/895889200270946347/1043294891788222584/image.png) 

#### Then - 2 - cenário - cliente comum ####
![Then - 2 - cecário - cliente comum](https://media.discordapp.net/attachments/895889200270946347/1043295174584963132/image.png) 


# Saída no console # 

### Execuntando o 1 cenário onde o cliente especial está efetuando um saque de 100 reais, com o saldo atual de -300 reais e assim ficando com saldo final de -400 ###
![Exec cénario 1](https://media.discordapp.net/attachments/895889200270946347/1043297013976014918/image.png)

#### Saída no console Junit avisando que todos passos deram certos e o segundo cenário não foi executado pois o tipo do cliente é ESPECIAL ####
![saída no console](https://media.discordapp.net/attachments/895889200270946347/1043298011532513371/image.png)

### Execuntando o 2 cenário onde o cliente normal está efetuando um saque de 200 rais, com o saldo atual de -250 reais e recebendo a mensagem "Saldo Insuficiente" ###
![Exec cénario 2](https://media.discordapp.net/attachments/895889200270946347/1043299189209186386/image.png)

#### Saída no console Junit avisando que todos passos deram certos, junto a saída do conselo informando que saldo é insoficiente e o primeiro cenário não foi executado pois o tipo do cliente É NORMAL ####
![saída no console](https://media.discordapp.net/attachments/895889200270946347/1043300311701401670/image.png)

### Execuntando o 2 cenário onde o cliente normal está efetuando um saque de 100 rais, com o saldo atual de 250 reais e operação realizada com sucesso ###
![Exec cénario 2](https://media.discordapp.net/attachments/895889200270946347/1043301288668049448/image.png)

#### Saída no console Junit avisando que todos passos deram certos, junto a saída do conselo informando que saque foi realizado! ####
![saída no console](https://media.discordapp.net/attachments/895889200270946347/1043303227011125248/image.png)

# Conclusão # 

 Combinando as ferramentas podemos implementar BDD em nossos projetos muito facilmente e assim diminiuir erros no desenvolvimento.
