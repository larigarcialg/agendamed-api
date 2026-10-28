# 🩺 AgendaMed API

API REST desenvolvida em Java com Spring Boot para gerenciamento de pacientes, aplicando conceitos de desenvolvimento backend e arquitetura em camadas.

## 🎯 Sobre o projeto

O AgendaMed é uma API criada com o objetivo de praticar o desenvolvimento de serviços REST, organização de código e integração com banco de dados.

A aplicação permite realizar operações de cadastro, consulta, atualização e exclusão de pacientes.

## 🚀 Tecnologias utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Web** — criação dos endpoints REST
- **Spring Data JPA** — persistência de dados
- **H2 Database** — banco de dados
- **Maven** — gerenciamento de dependências

## 🏗️ Estrutura do projeto

```text
src/main/java/com/larissa/agendamed/
├── controller/
│   └── PacienteController.java
├── model/
│   └── Paciente.java
├── repository/
│   └── PacienteRepository.java
├── service/
│   └── PacienteService.java
└── AgendamedApplication.java
```

A aplicação está organizada em camadas:

- **Controller:** recebe e encaminha as requisições HTTP.
- **Model:** representa a entidade Paciente.
- **Repository:** realiza as operações de persistência.
- **Service:** concentra a lógica de negócio.

## ⚙️ Como executar o projeto

### Pré-requisitos

- Java 21
- Git

### Passos

1. Clone o repositório:

   ```bash
   git clone https://github.com/larigarcialg/agendamed-api.git
   ```

2. Entre na pasta do projeto:

   ```bash
   cd agendamed-api
   ```

3. Execute a aplicação pelo Eclipse ou utilize o Maven Wrapper no Windows:

   ```bash
   mvnw.cmd spring-boot:run
   ```

## 🔎 Funcionalidades

- Cadastro de pacientes
- Consulta de pacientes
- Atualização de dados
- Exclusão de pacientes

## 📚 Objetivo de aprendizado

Este projeto faz parte da minha jornada de aprendizado em Engenharia de Software, com foco em desenvolvimento backend, construção de APIs REST e boas práticas de organização de código.

## 👩‍💻 Autora

**Larissa Garcia**

Estudante de Engenharia de Software | Desenvolvedora em formação

[GitHub](https://github.com/larigarcialg)

---

Projeto desenvolvido para fins educacionais.
