## PICPAY SIMPLIFICADO
Este projeto é uma implementação simplificada do sistema de pagamentos PicPay do desafio de recrutamento back-end picpay, utilizando Java com o framework Spring Boot. O objetivo é fornecer uma aplicação básica de pagamentos, permitindo realizar transferências entre usuários com regras de negócios.

# Funcionalidades
- Cadastro de usuários
- Realização de transferências entre contas
- Busca de usuários

# Tecnologias Utilizadas
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2

# EndPoints
-  GET /users : retorna todos usuários
-  POST /users : cria usuário no banco de dados com os dados - firstName, lastName, document, balance, email, password e userType
-  POST /transactions : realize transaçao de uma conta para outra com os dados - value, senderID, receiverID

# Como utilizar
1. Clone o repositório
2. Acesse o diretório da pasta e rode o aplicativo com mvn spring-boot:run
3. Após isso basta utilizar os endpoints
