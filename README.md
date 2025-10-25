# 🏗️ ArquiteturaSpring

Projeto desenvolvido com **Spring Boot** para demonstrar uma arquitetura limpa e escalável, utilizando boas práticas de desenvolvimento Java. O módulo principal implementa funcionalidades de gerenciamento de tarefas (Todo), com foco em separação de responsabilidades, validação, persistência e envio de notificações.

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database (para testes locais)
- JUnit & Mockito (para testes unitários)
- Git & GitHub

📁 Estrutura do Projeto
src/
├── main/
│   ├── java/
│   │   └── io.github.davidMarostica.arquitetura.components.Todo/
│   │       ├── MailSender.java
│   │       ├── Todo.java
│   │       ├── TodoRepository.java
│   │       ├── TodoService.java
│   │       ├── TodoValidator.java
│   │       └── TodoController.java
│   └── resources/
│       └── application.properties
├── test/
│   └── java/
│       └── io.github.davidMarostica.arquitetura.components.Todo/

📌 Funcionalidades

    ✅ Criar, listar, atualizar e excluir tarefas

    📬 Enviar notificações por e-mail (simulado via MailSender)

    🔍 Validação de dados com TodoValidator

    🧠 Lógica de negócios isolada em TodoService

    🗃️ Persistência com Spring Data JPA (TodoRepository)

    🌐 API REST com TodoController

📦 Como Executar Localmente

git clone https://github.com/davidMarostica/ArquiteturaSpring.git
cd ArquiteturaSpring

Compile e execute:
./mvnw spring-boot:run


Acesse a aplicação:
http://localhost:8080

 Testes
 ./mvnw test

Autor

David Marostica Desenvolvedor Java | Apaixonado por arquitetura de software 



    
