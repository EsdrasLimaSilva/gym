# Projeto DIO - Conhecendo Spring Data JPA na prática

Este repositório é um projeto criado no bootcamp de java para
conhecer o Spring Data JPA criando uma REST api simples de uma academia

## Requerimentos

Para rodar esse projeto você precisará ter o <strong>JDK 17 instalado</strong> e um 
banco Relacional criado. Neste projeto utilizei o mySQL como RDBMS mas você pode utilizar 
qualquer sistema que queira desde que substitua a dependência do mySQL pelo sistema escolhido no arquivo pom.xml.

## Como rodar

Para rodar este projeto recomendo o uso da IDE IntelliJ porque elá fará toda a configuração e build da aplicação
sem maiores transtornos. Para rodar a aplicação siga os seguintes passos:

1. Clone este repositório para sua máquina
2. Certifique-se que possui o JDK 17 instalado
3. Crie um banco de dados relacional (de preferência utilizando mySQL)
4. Caso queira utilizar outro sistema de gerenciamento como postgreSQL, substituir a dependência no arquivo pom.xml
5. bem como o <strong>spring.datasource.driverClassName</strong>, <strong>spring.jpa.database-platform</strong>, <strong>spring.jpa.database</strong> e
o <strong>spring.datasource.url</strong>(lembrando que você precisrá alterar o nome do arquivo na url de qualquer forma) no arquivo application.properties.
6. Troque o usuário e a senha do banco de dados ainda no arquivo application.properties.
7. Clique no botão play para rodar aplicação e utilize qualquer API client para fazer as requisições. Recomendo o Postman.
8. Para consulta direta ao banco, recomendo utilizar o DBeaver.