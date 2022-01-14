# Demo Requisições HTTPS Java Web com Spring boot

Primeiro projeto java web utilizando a framework Spring Boot com as dependências **Java Web**, **Spring Data JPA** e **H2 Database**.

Este projeto foi desenvolvido para entender como funciona as etapas de construção de uma aplicação que permite realizar requisições HTTPS de uma maneira bem simples. Logo, ele simula um relacionamento entre entidades _usuários_ e seus respectivos _departamentos_ para permitir que sejam feitas as requisições HTTPS. Nele, foi utilizado o H2 database que é um banco de dados em memória para armazenar as entidades (tabelas) _user_ e _department_ para as simulações das requisições. Com isso, através da biblioteca Spring Data JPA, foi feito o mapeamento _objeto relacional_ dessas entidades.

Neste mini projeto as requisições como GET para pegar todos os dados da tabela _user_ foi implementado, GET através do _id_ para requisitar apenas um usuário específico também foi implementado e a inserção de um usuário através do método POST, também foi implementado. 
