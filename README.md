# 📒 Lista de Contatos - Spring Boot

Este é um projeto simples de uma aplicação web para gerenciar contatos, desenvolvido com **Spring Boot**, **Thymeleaf** e o banco de dados **H2** (em memória).

---

## 🚀 Funcionalidades

1. **Exibir Contatos**
   - Exibe uma lista de contatos cadastrados em uma tabela.
2. **Adicionar Novo Contato**
   - Permite adicionar um novo contato com nome e e-mail.
3. **Banco de Dados**
   - O banco de dados é configurado com o H2 (em memória) e permite consultas pelo console.

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Thymeleaf** para renderização de páginas HTML.
- **H2 Database** (banco de dados em memória para fins de demonstração).
- **Bootstrap** para estilização do front-end.

---

## 📂 Estrutura do Projeto

```plaintext
src/
├── main/
│   ├── java/
│   │   └── acc.br.contatos/
│   │       ├── controller/
│   │       │   └── ContatosController.java
│   │       ├── model/
│   │       │   └── Contato.java
│   │       ├── repository/
│   │       │   └── ContatoRepository.java
│   │       └── ContatosApplication.java
│   ├── resources/
│   │   ├── static/
│   │   │   └── css/
│   │   │       └── estilo.css
│   │   ├── templates/
│   │   │   ├── contatos.html
│   │   │   └── formularioContato.html
│   │   ├── application.properties
│   │   └── import.sql
└── test/
