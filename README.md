# Desenvolvimento Web - Projeto Base com Spring Boot

## Descrição da Atividade

Nesta atividade, desenvolvemos um projeto base utilizando o framework Spring Boot, abordando diversos aspectos essenciais para o desenvolvimento de aplicações web. O projeto foi configurado a partir do Spring Initializr, com as seguintes especificações:

- **Gerenciamento de Dependências**: Maven
- **Linguagem**: Java, versão 17
- **Versão do Spring**: 3.0.0
- **Empacotamento**: JAR
- **Dependências Adicionais**: Spring Web

Após a configuração inicial, realizamos os seguintes passos:

1. **Configuração do Projeto**:
    - Importação do projeto no Spring Tool Suite.
    - Configuração do banco de dados H2 em memória para testes.

2. **Modelagem da Entidade User**:
    - Criação da classe `User` com atributos básicos: `id`, `nome`, `email`, `telefone` e `password`.
    - Implementação de construtores, getters, setters, métodos `hashCode` e `equals`, e a interface `Serializable`.
    - Adição das anotações `@Entity` e `@Table`.

3. **Implementação do Controller UserResource**:
    - Criação da classe `UserResource` anotada com `@RestController` e `@RequestMapping`.
    - Implementação de endpoints para operações CRUD.

4. **Configuração do Banco de Dados**:
    - Adição das dependências do Spring Data JPA e H2 no `pom.xml`.
    - Criação dos arquivos `application.properties` e `application-test.properties` para configuração do banco de dados.

5. **Implementação do Repositório UserRepository**:
    - Criação da interface `UserRepository` estendendo `JpaRepository`.

6. **População do Banco de Dados**:
    - Criação da classe `TestConfig` para popular o banco de dados H2 em tempo de execução.

7. **Implementação do Serviço UserService**:
    - Criação da interface `UserService` e implementação dos métodos `findAll`, `findById`, `insert`, `delete` e `update`.

8. **Tratamento de Exceções**:
    - Criação das classes de exceção `ResourceNotFoundException`, `StandardError` e `ResourceExceptionHandler`.
    - Implementação de métodos para tratamento de exceções, utilizando `@ControllerAdvice` e `@ExceptionHandler`.

## Aprendizados

Durante a realização desta atividade, tivemos a oportunidade de consolidar conhecimentos importantes relacionados ao desenvolvimento de aplicações web utilizando Spring Boot. Alguns dos principais aprendizados incluem:

- **Configuração de Projetos Spring Boot**: Aprendemos a utilizar o Spring Initializr para configurar rapidamente um projeto Spring Boot com as dependências necessárias.
- **Modelagem de Entidades**: Entendemos como modelar entidades JPA e configurar mapeamentos com anotações.
- **Operações CRUD**: Implementamos operações básicas de CRUD utilizando Spring Data JPA e compreendemos a importância de repositórios para acesso a dados.
- **Configuração de Banco de Dados**: Configuramos um banco de dados H2 em memória para testes e entendemos como persistir e consultar dados de forma eficiente.
- **Criação de Controllers**: Aprendemos a criar controllers RESTful para expor endpoints que permitem interagir com nossa aplicação.
- **Tratamento de Exceções**: Implementamos um mecanismo robusto para tratamento de exceções, garantindo respostas adequadas para diferentes cenários de erro.
- **Testes de API**: Utilizamos ferramentas como Postman para testar os endpoints da API, garantindo que todas as funcionalidades implementadas estejam funcionando corretamente.

Esta atividade proporcionou uma visão abrangente do ciclo de desenvolvimento de uma aplicação web completa utilizando Spring Boot, desde a configuração inicial até a implementação de funcionalidades e tratamento de exceções.
