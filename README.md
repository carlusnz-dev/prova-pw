# Prova de PW
## Aplicações para a Web || Gerenciador de Filmes
Alunos:
* Carlos Alberto
* Tatiane Nunes

## Construção do Projeto
### 1. Criação do Projeto
Utilizamos as ferramentas do Spring Boot para criar o projeto, com as seguintes dependências:
* Spring Web
* Spring Data JPA
* Thymeleaf
* MySQL Driver
* Validate

Também foi utilizado o banco de dados MySQL, junto da IDE IntelliJ IDEA.
Script de criação do banco de dados:
```sql
CREATE DATABASE IF NOT EXISTS `gerenciador_filmes`;
USE `gerenciador_filmes`;
CREATE TABLE `filmes` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `titulo` varchar(255) NOT NULL,
    `genero` varchar(255) NOT NULL,
    `duracao` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

### 2. Criação das Entidades
As entidades foram criadas com o auxílio do Spring Data JPA, com os seguintes atributos:
* Filme
    * id
    * titulo
    * genero
    * duracao

### 3. Criação dos Repositórios
Os repositórios foram criados com o auxílio do Spring Data JPA, com os seguintes métodos:
* FilmeRepository
    * findAll()
    * save()

### 4. Criação dos Controllers
Os controllers foram criados com o auxílio do Spring Web, com os seguintes métodos:
* FilmeController
    * findAll() 
    * save()

Ainda será implementado o método de exclusão de filmes.

## Execução do Projeto
Para executar a aplicação, basta clicar no arquivo run.bat, que irá executar o comando:
```shell
@echo off
echo Iniciando aplicação web (Gerenciador de Filmes)
start cmd /c "cd /d %~dp0 & call mvn spring-boot:run"
timeout 5
echo Abrindo o navegador
start http://localhost:8080/form
```

## Utilização da Aplicação
A aplicação possui uma interface simples, com um formulário para adicionar filmes e uma tabela para listar os filmes adicionados.
<br>
Obrigado pela atenção!