# Descrição do Projeto

Este é um projeto de workshop de Spring Boot 3 e PostgreSQL, desenvolvido para demonstrar, de forma prática e didática, a construção de uma REST API completa.

## Tecnologias Utilizadas

- ✅ Java 17 + Spring Boot

- ✅ Spring Data JPA com suporte a H2 (em memória) e PostgreSQL

- ✅ Criação de endpoints CRUD (Create, Read, Update, Delete)

- ✅ Modelagem de entidades essenciais: Category, Product, Order e User

- ✅ Persistência via JPA/Hibernate e configuração com arquivos pom.xml e application.properties

- ✅ Testes automatizados com Spring Boot Test


## 🚀 Como Executar

### 1. Clonar o Repositório:
``` bash
git clone https://github.com/JeffSSousa/workshop-springboot3-jpa.git
```

### 2. Na sua IDE Configurar Perfis e Bancos
O projeto utiliza multiple profiles:

- Padrão (sem profile): usa H2 em memória — ideal para desenvolvimento rápido e testes.

- dev profile: usa PostgreSQL — para um ambiente mais realista.

#### **Usando H2 (default):**
 Basta rodar normalmente, não precisa de configuração adicional.

#### **Usando PostgreSQL (dev):**
1. Abra src/main/resources/application-dev.properties.

2. Ajuste a URL, usuário e senha se necessário:
``` properties
spring.datasource.url=jdbc:postgresql://localhost:5432/course_db
spring.datasource.username=meuuser
spring.datasource.password=minhasenha
```
3. Execute a aplicação usando o profile dev

### 3. Agora é só executar a aplicação spring na sua IDE de preferencia (Intellij, Eclipse, etc).


<br><br>

## 🙋 Sobre o Autor


Desenvolvido por Jefferson Sousa  
[GitHub](https://github.com/JeffSSousa) | [LinkedIn](https://www.linkedin.com/in/jefferson-sousa-8b93a81a2/)