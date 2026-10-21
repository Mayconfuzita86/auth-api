# 🔒 AUTHENTICATE API — Serviço de Autenticação entre Aplicações

A **AUTHENTICATE API** é um serviço de autenticação desenvolvido em Java e Spring Boot projetado para permitir a comunicação segura entre aplicações e microsserviços (*Machine-to-Machine — M2M*). O serviço utiliza credenciais de aplicação para autenticar clientes e emitir tokens **JWT**, que garantem a autorização no acesso a serviços protegidos.

Este projeto faz parte de um ecossistema de microsserviços desenvolvido com foco em segurança, organização arquitetural, integração entre serviços e boas práticas de desenvolvimento Back-End.

---

## 🎯 Objetivos do Projeto

- Implementar autenticação entre aplicações (*machine-to-machine*).
- Gerar e validar tokens JWT para autorização de acesso a recursos protegidos.
- Armazenar credenciais de forma segura utilizando *hash* criptográfico para os segredos.
- Gerenciar aplicações clientes através de operações CRUD com exclusão lógica.
- Implementar persistência de dados relacional com PostgreSQL e controle de versão via Liquibase.
- Desenvolver testes automatizados para validar regras de negócio, persistência e integrações.
- Preparar o projeto para execução local simples e futura containerização com Docker.

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Finalidade |
| :--- | :--- |
| **Java 21** | Linguagem de programação principal |
| **Spring Boot 3** | Framework para desenvolvimento da API |
| **Spring Web** | Criação de endpoints RESTful |
| **Spring Security** | Recursos de segurança, autenticação e filtros |
| **Spring Data JPA** | Persistência e abstração do acesso a dados |
| **PostgreSQL** | Banco de dados relacional |
| **Liquibase** | Controle de versão do esquema de banco de dados |
| **JWT / JJWT** | Geração e validação de tokens de acesso |
| **Bean Validation** | Validação de dados e contratos de entrada |
| **Lombok** | Redução de código *boilerplate* |
| **Springdoc OpenAPI** | Documentação interativa e testes de API (Swagger) |
| **JUnit 5 & Mockito** | Testes unitários e de integração automatizados |
| **Testcontainers** | Testes de integração com dependências em contêineres reais |
| **Maven** | Gerenciamento de dependências e automação de *build* |
| **Git & GitHub** | Controle de versionamento e hospedagem do código |

---

## 🏗️ Arquitetura do Projeto

O projeto adota uma organização em camadas limpa e bem definida, separando regras de negócio, casos de uso e detalhes de infraestrutura/persistência:

```text
authenticate-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/fuzita/
│   │   │       ├── application/
│   │   │       │   ├── controller/
│   │   │       │   ├── persistence/
│   │   │       │   │   ├── entities/
│   │   │       │   │   ├── mappers/
│   │   │       │   │   ├── repositories/
│   │   │       │   │   ├── specification/
│   │   │       │   │   └── views/
│   │   │       │   └── usecases/
│   │   │       │       ├── create/
│   │   │       │       ├── update/
│   │   │       │       ├── delete/
│   │   │       │       └── retrieve/
│   │   │       ├── common/
│   │   │       └── domain/
│   │   └── resources/
│   │       ├── db/
│   │       │   └── changelog/
│   │       └── application.yml
│   └── test/
├── .gitignore
├── pom.xml
└── README.md


