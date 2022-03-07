# Anotações - Projeto Padrões de Projeto

## :memo: Informações
Agora é a sua hora de brilhar! Crie uma solução que explore o conceito de Padrões de Projeto na prática. Para isso, você pode reproduzir um dos projetos que criamos durante as aulas ou, caso se sinta preparado, desenvolver uma nova ideia do zero.

**Categoria:** Full-Stack

**Nível:** Intermediário


## :dart: Objetivo
O DEV aprenderá na prática a criar uma API REST e também se familiarizar com alguns dos principais Padrões de Projeto aplicados no ecossistema Spring;

## :white_check_mark: Requisitos
1. Java instalado;
2. Git e GitHub;
3. Familiaridade com Spring Boot;
4. Banco de Dados MySQL;

## :sparkles: Funcionalidades
1. Cada **Cliente** possui um id, nome e endereço.
2. Cada **Endereco** possui cep, logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd e siafi. Esses dados serão consumidos da API [ViaCep](https://viacep.com.br/ws) através do Feign; 
3. A Documentação da API é feita através do Spring Doc Open API e pode ser acessada pela url [http://localhost:8082/swagger-ui/index.html](http://localhost:8082/swagger-ui/index.html)

## :computer: Demonstração da execução
### Adicionar Cliente - POST
![put](https://user-images.githubusercontent.com/50773119/157113317-b3554da4-a3be-4985-8682-ba93c90f487f.gif)

### Listar Cliente - GET ONE
![get-one](https://user-images.githubusercontent.com/50773119/157113308-7142ab52-83cc-450f-8c22-71717ff44c0c.gif)

### Atualizar Cliente - PUT
![put](https://user-images.githubusercontent.com/50773119/157113289-c5c4e832-2d86-4514-89e3-80449b84963b.gif)
 
### Deletar Cliente - DELETE
![delete](https://user-images.githubusercontent.com/50773119/157113196-da0d5152-8088-4d4c-bcb7-be464db2da45.gif)

### Listar todos Clientes - GET
![get-all](https://user-images.githubusercontent.com/50773119/157113227-f5d43c8b-091b-419c-834b-db0cb0194a8b.gif)

### Print do Banco de Dados
![image](https://user-images.githubusercontent.com/50773119/157113155-1ae76aa5-c9cf-4539-9ab2-7e5b8570f0c6.png)
![image](https://user-images.githubusercontent.com/50773119/157113174-d1987576-51c6-45fb-809b-2ae7a62c7287.png)

### Demo - Visão Geral
![demo](https://user-images.githubusercontent.com/50773119/157113365-c9ecc69c-982e-44a2-8b39-e42a74b19619.gif)


## 👀 Observações
* A Porta de execução do Projeto foi configurada para 8082, é possível alterá-la no arquivo **application.properties**;
* As configurações do Banco de Dados estão descritas também no arquivo **application.properties**;

## :rocket: Acesse o projeto
[Clique aqui para acessar o projeto](./)
