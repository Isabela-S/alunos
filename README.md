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
-Abra o arquivo src/main/resources/application.properties.

**Configure seu usuário e senha do SQL Server**

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=AlunosDB
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
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
