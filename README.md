**Projeto Alunos**

Este é o Projeto Alunos, um sistema desenvolvido por mim em Spring Boot com o objetivo de gerenciar informações de alunos de maneira prática e eficiente.
Criei este projeto inicialmente para aprofundar meus conhecimentos em desenvolvimento de aplicações web, especialmente no que diz respeito à integração com bancos de dados relacionais e à implementação de operações CRUD. Ao longo do desenvolvimento, busquei que o sistema fosse simples, mas completo, servindo tanto como um material de estudo quanto como uma base funcional para projetos futuros.

**Objetivos do projeto**

-Implementar um backend funcional que permita criar, listar, atualizar e excluir alunos de forma segura e organizada.
-Garantir que todos os dados sejam armazenados corretamente no SQL Server, possibilitando persistência e consultas reais.
-Construir uma estrutura de código clara e didática, facilitando a compreensão e a manutenção, seja por mim ou por outros desenvolvedores que desejem estudar ou expandir o projeto.
-Oferecer um exemplo prático de aplicação Spring Boot, que possa servir como referência para aprendizado ou como ponto de partida para projetos mais complexos.

**Tecnologias utilizadas**

-Spring Boot: para a construção do backend e gerenciamento de dependências.
-SQL Server: para persistência de dados e operações de CRUD.
-JPA/Hibernate: para mapeamento objeto-relacional e simplificação do acesso ao banco.

**Como executar o projeto**

-Criar o banco de dados
-Crie um banco chamado AlunosDB no SQL Server.
-Certifique-se de que a instância do SQL Server esteja configurada para aceitar conexões TCP/IP (porta padrão 1433).
-Configurar a aplicação
-Abra o arquivo src/main/resources/application-example.properties.

**Configure seu usuário e senha do SQL Server**

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=AlunosDB
spring.datasource.username=USUARIO
spring.datasource.password=SENHA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.SQLServerDialect

**Compilar e executar**

No terminal, dentro da pasta do projeto, execute:

mvn clean install
mvn spring-boot:run

Assim sistema estará disponível na porta 8080 e pronto para receber requisições.

**Testar os endpoints**

Utilize o Postman ou o navegador para acessar os endpoints /alunos e verificar o funcionamento das operações CRUD.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
**Students Project**

This is the Students Project, a system I developed in Spring Boot with the purpose of managing student information in a practical and efficient way.
I initially created this project to deepen my knowledge in web application development, especially regarding integration with relational databases and implementing CRUD operations. Throughout the development, I aimed for the system to be simple, yet complete, serving both as study material and as a functional base for future projects.

**Project Goals**

-Implement a functional backend that allows creating, listing, updating, and deleting students in a secure and organized way.
-Ensure that all data is properly stored in SQL Server, enabling persistence and real queries.
-Build a clear and didactic code structure, making it easy to understand and maintain, either by me or by other developers who wish to study or expand the project.
-Provide a practical Spring Boot application example that can serve as a learning reference or as a starting point for more complex projects.

**Technologies Used**

-Spring Boot: for backend construction and dependency management.
-SQL Server: for data persistence and CRUD operations.
-JPA/Hibernate: for object-relational mapping and simplifying database access.

**How to Run the Project**

-Create the Database
-Create a database called AlunosDB in SQL Server.
-Make sure the SQL Server instance is configured to accept TCP/IP connections (default port: 1433).
-Configure the Application
-Open the file src/main/resources/application-example.properties.

**Set your SQL Server username and password**

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=AlunosDB
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.SQLServerDialect

**Compile and Run**

In the terminal, inside the project folder, execute:

mvn clean install
mvn spring-boot:run

The system will then be available on port 8080 and ready to receive requests.

**Test the Endpoints**

Use Postman or your browser to access the /alunos endpoints and check the functionality of the CRUD operations.
