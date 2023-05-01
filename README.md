# Projeto  - Módulo 2
## LabFood
### Introdução

Uma empresa especializada em desenvolvimento de aplicações deseja desenvolver
uma aplicação para controle de receitas online **LabFood**.

### Descrição
Aplicação construinda com a linguagem **java** utilizando o framework **Spring**
com a seguintes dependências: **Spring Web, Spring Data JPA, Lombok, PostgreSQL Driver**

A aplicação tera uma base de dados com duas tabelas “categoria” “receita”
que recebera os seguintes dados

tabela: categorias
id:
nome:
descrição:

tabela: receita
id:
nome:
ingrediente:
preparo:

com seguinte relacionamento uma categoria para varias receita


Este projeto trata-se do backend do sistema de gestão do
**LabFood** da turma Lagoinha. Seguindo o seguinte modelo relacional

colocar o diagrama aqui

como rodar roda

como sera usaudo

descerver o endpoint

**GET** `/categoria`
```JSON
{
  "id": 1,
  "nome": "gluten",
  "descricao": "esse receita contém gluten"
}
```
**GET** `/receita`
```JSON
{
  "id": 1,
  "nome": "recaita de bolo",
  "descricao": "bolo de maçã",
  "preparo": "Essa é a parte do texto na qual haverá uma explicação, mais detalhada possível, sobre como a receita deve ser executada"
}
```

