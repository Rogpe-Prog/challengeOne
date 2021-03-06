# Desafio Capitulo 01 by DevSuperior
# Trilha Spring & React - 2021

## Enunciado

### Você deverá entregar um projeto Spring Boot 2.4.x contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:

* Busca paginada de recursos
* Busca de recurso por id
* Inserir novo recurso
* Atualizar recurso
* Deletar recurso

### O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar Maven como gerenciador de dependência, e Java 11 como linguagem.

### Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir

#### Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS

# Testes no Postman

## O professor já terá preparado em seu computador as requisições Postman abaixo. Todas elas deverão funcionar corretamente:

### Busca paginada de clientes
`GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name`

### Busca de cliente por id
`GET /clients/1`

### Inserção de novo cliente
`POST /clients `
`{`
  `"name": "Maria Silva",`
  `"cpf": "12345678901",`
  `"income": 6500.0,`
  `"birthDate": "1994-07-20T10:30:00Z",`
  `"children": 2`
`}`

### Atualização de cliente
`PUT /clients/1`
`{`
  `"name": "Maria Silvaaa",`
  `"cpf": "12345678901",`
  `"income": 6500.0,`
  `"birthDate": "1994-07-20T10:30:00Z",`
  `"children": 2`
`}`

### Deleção de cliente
`DELETE /clients/1`
