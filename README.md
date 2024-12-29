# Nome do Projeto

Aplicação Spring Boot conectada ao SQL Server para gerenciar usuários.

## Pré-requisitos

- Spring Boot
- Spring Data JPA
- Spring Web
- Lombok
- SQL Server

## Configuração

1. Clone o repositório.
2. No arquivo `src/main/resources/application.properties`, configure as propriedades do banco de dados:

   ```properties
   spring.datasource.url=jdbc:sqlserver://localhost;databaseName=SeuBanco
   spring.datasource.username=sa
   spring.datasource.password=SuaSenha
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true


