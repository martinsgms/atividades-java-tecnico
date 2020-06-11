create database ideal;
show databases;
use ideal;

create table cliente(
	idcliente int primary key auto_increment,
	nome varchar(50),
    telefone varchar(20),
    email varchar(50)
);

show tables;
desc cliente;

insert into cliente(nome, telefone, email)
values('João da Silva','97252-1315','jo@gmail.com');

select * from cliente;