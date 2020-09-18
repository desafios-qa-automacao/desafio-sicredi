# Prova técnica API

Este é o projeto de API que deve ser automatizado para o desafio.

##  Requisitos
 * Java 8+ JDK deve estar instalado
 * Maven deve estar instalado e configurado no path da aplicação
 
## Como executar a aplicação 

Na raiz do projeto, através de seu Prompt de Commando/Terminal/Console execute o comando 

```bash
mvn clean spring-boot:run
```

A aplicação estará disponível através da URL [http://localhost:8080](http://localhost:8080)

Você pode trocar a porta da aplicação, caso a _8080_ já estiver em uso, adicionando a propriedade JVM `server.port`.

Exemplo:

```bash
mvn clean spring-boot:run -Dserver.port=8888
```

## Documentacão técnica da aplicação

A documentação técnica da API está disponível através do OpenAPI/Swagger em [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
