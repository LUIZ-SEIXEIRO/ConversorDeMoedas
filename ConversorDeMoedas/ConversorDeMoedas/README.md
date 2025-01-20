# Conversor de Moedas

Este é um simples conversor de moedas que obtém taxas de câmbio de uma API externa e permite a conversão de BRL para outras moedas.

## Como Usar

1. Certifique-se de ter o Java JDK instalado (versão 11 ou superior).
2. Compile o projeto:
    * **Se estiver usando Maven:**
        ```bash
        mvn compile
        ```
    * **Se estiver usando Gradle:**
        ```bash
        gradle build
        ```
    * **Se não estiver usando um gerenciador de dependências:** Compile diretamente o arquivo Main.java
3. Execute o projeto:
    * **Se estiver usando Maven:**
        ```bash
        mvn exec:java -Dexec.mainClass="com.seuusuario.conversormoedas.Main"
        ```
    * **Se estiver usando Gradle:**
        ```bash
       gradle run
        ```
    * **Se não estiver usando um gerenciador de dependências:** Execute a classe `Main` diretamente em sua IDE

4. Siga as instruções no console e escolha as opções de conversão de moedas.

## Dependências

* `java.net.http` (para Java 11+) ou `org.apache.httpcomponents:httpclient` (versões anteriores do java)
* `com.fasterxml.jackson.core:jackson-databind` (para manipulação de JSON)

## API Utilizada

* ExchangeRate-API (https://www.exchangerate-api.com/)

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para criar uma issue ou enviar um pull request.
