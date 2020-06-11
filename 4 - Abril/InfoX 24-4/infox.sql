create database infox;
use infox;
create table tbusuarios(
iduser int(11) primary key auto_increment,
usuario varchar(50),
fone varchar(15),
login varchar(15),
senha varchar(15),
perfil varchar(20)
);

insert into tbusuarios(usuario,fone,login,senha,perfil)
values
('joão da silva','91111-11111','jo','123','admin'),
('maria oliveira','92222-11111','mary','321','user');

desc tbusuarios;

create table tbclientes(
idcli int(11) primary key auto_increment,
nomecli varchar(50),
endcli varchar(100),
fonecli varchar(50),
emailcli varchar(50)
);

desc tbclientes;

create table tbos(
os int(11) primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
defeito varchar(150) not null,
servico varchar(150),
tecnico varchar(30),
valor decimal(10,2),
idcli int(11) not null,
foreign key(idcli) references tbclientes(idcli)
);

desc tbos;