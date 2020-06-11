create database ideal;
show databases;
use ideal;

create table cliente(
	idcliente int primary key auto_increment,
	nome varchar(50),
	telefone varchar(20),
	email varchar(50)
);

desc cliente;

insert into cliente(nome,telefone,email)
values
('Lorena','963197858','lorenaandradedecastro@gmail.com');

select * from cliente;

create table usuario(
	iduser int primary key auto_increment,
    nome varchar(50),
	user varchar(20),
    senha varchar(20)
);

insert into usuario(nome,user,senha) 
values ('Pedro Pedreira', 'pepe','12345'),
('Maria do Socorro Silva','maryhelp','54321');