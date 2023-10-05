# curso-mongoDB

Este repositório foi criado durante um curso de [Java](https://www.udemy.com/course/java-curso-completo/), onde o projeto é um sistema de usuários que fazem posts e comentários.


## Pré-requisitos

Para rodar o projeto é necessário:
- [Spring](https://spring.io/).
- [Postman](https://www.postman.com/) ou outra ferramenta.
- [MongoDB](https://www.mongodb.com/).
- [MongoCompass](https://www.mongodb.com/products/compass)(opcional).

## Como executar

Para executar o projeto, siga estas etapas:

1. Clone este repositório para o seu sistema local usando o Git:

   ```bash
   git clone git@github.com:PedroIvoKuhn/curso-mongoDB.git
   ```

2. Abra o terminal e inicie o banco de dados, digitando:

   ```bash
   mongodb
   ```
3. Abra sua IDE e rode o Spring.

4. Abra o Postman e faça as requisições.(Obs.: os arquivos que contem as URLs são: UserResource.java e PostResource.java)
   Por exemplo:
   ```bash
   http://localhost:8080/posts/fullsearch?text=aproveite&minDate=2018-03-22&maxDate=2018-03-30
   ```
