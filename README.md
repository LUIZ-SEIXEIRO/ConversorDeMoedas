README.md Aprimorado:

# Conversor de Moedas em Java

Este é um conversor de moedas simples, desenvolvido em Java, que obtém taxas de câmbio atualizadas de uma API externa e permite realizar conversões entre a moeda base (BRL) e outras moedas.

## Funcionalidades

*   **Conversão de Moedas:** Converte valores de Real brasileiro (BRL) para outras moedas (USD, EUR, GBP, JPY, CAD, AUD).
*   **Taxas de Câmbio Dinâmicas:** Utiliza uma API externa para obter as taxas de câmbio mais recentes, garantindo conversões precisas.
*   **Interface de Linha de Comando (CLI):** Apresenta um menu interativo no console para que o usuário escolha a conversão desejada.
*   **Opções de Moedas Predefinidas:** Oferece seis opções de conversão para moedas populares.
*   **Tratamento de Erros:** Implementa um tratamento básico de erros para situações como falhas na requisição à API ou formato inválido do JSON.

## Como Usar

1.  **Pré-requisitos:**
    *   Certifique-se de ter o Java Development Kit (JDK) instalado em seu computador (versão 11 ou superior recomendada). Você pode verificar sua instalação executando o comando `java -version` no terminal.
    *   Recomendamos o uso de uma IDE (Ambiente de Desenvolvimento Integrado) como IntelliJ IDEA, Eclipse ou Visual Studio Code com as extensões Java.

2.  **Compilação e Execução:**
    *   **Com gerenciador de dependências (Maven ou Gradle):**
        *   Navegue até a pasta raiz do projeto (onde está o `pom.xml` ou `build.gradle`).
        *   Para compilar:
            ```bash
            mvn compile  # Para Maven
            gradle build # Para Gradle
            ```
        *   Para executar:
            ```bash
            mvn exec:java -Dexec.mainClass="com.seuusuario.conversormoedas.Main"  # Para Maven
            gradle run                                                        # Para Gradle
            ```
            (Substitua `com.seuusuario.conversormoedas.Main` pelo nome completo da sua classe principal)
    *   **Sem gerenciador de dependências:**
        *   Navegue até a pasta `src/main/java/com/seuusuario/conversormoedas/` onde está o arquivo `Main.java`.
        *   Compile: `javac Main.java`
        *   Execute: `java Main`
        *    (Certifique-se que o arquivo jar da biblioteca Jackson esteja no classpath)

3.  **Interação com o Conversor:**
    *   Após executar o programa, um menu será exibido no console com as opções de conversão.
    *   Escolha a opção desejada digitando o número correspondente e pressionando `Enter`.
    *   Digite o valor em reais (BRL) que você deseja converter e pressione `Enter`.
    *   O programa exibirá o valor convertido na moeda selecionada.
    *   Para sair do programa, escolha a opção de sair no menu.

## Dependências

*   `java.net.http` (para Java 11+) ou `org.apache.httpcomponents:httpclient` (para versões anteriores do Java).
*   `com.fasterxml.jackson.core:jackson-databind` (para manipulação de JSON).

    *   **Observação:** Se você estiver usando Maven ou Gradle, adicione estas dependências no seu `pom.xml` ou `build.gradle`. Se não, inclua o arquivo JAR desta dependência no classpath.

## API Utilizada

*   **ExchangeRate-API**: ([https://www.exchangerate-api.com/](https://www.exchangerate-api.com/)). Esta API gratuita fornece as taxas de câmbio atualizadas.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para criar *issues* para reportar erros ou sugerir novas funcionalidades e enviar *pull requests* com suas melhorias.

## Próximos Passos

*   Implementar um cache para as taxas de câmbio para otimizar a performance.
*   Melhorar a interface do usuário, tornando-a mais amigável.
*   Adicionar suporte a mais moedas.
*   Implementar um tratamento de erros mais robusto.
*   Adicionar testes unitários.

## Autor

*   Seu Nome (ou seu usuário do GitHub)

## Licença

Este projeto está sob a licença MIT. (Se você quiser adicionar uma licença, adicione a informação aqui)
content_copy
download
Use code with caution.
Markdown
