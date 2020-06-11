create database infox;

use infox;

create table tbusuarios(
iduser int primary key auto_increment,
usuario varchar(50) null null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null
);
describe tbusuarios;
insert into tbusuarios(usuario,fone,login,senha)
values('mariana brito','4616-3500','damari','321');

select * from tbusuarios;

update tbusuarios set fone='88888-8888' where iduser=2;

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar(100),
fonecli varchar(50) not null,
emailcli varchar(50)
);

select * from tbclientes;
insert into tbclientes(nomecli,endcli,fonecli,emailcli)
values('Linux torvalds','rua tux, 2015','99999-9999','linus@linux.com');

select * from tbclientes;

create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
defeito varchar (150) not null,
servico varchar(150),
tecnico varchar(30),
valor decimal(10,2),
idcli int not null,
foreign key(idcli) references tbclientes(idcli)
);
describe tbos;

insert into tbos(equipamento,defeito,servico,tecnico,valor,idcli)
values('notebook','não liga','troca da fonte','Zé',90.50,1);

select * from tbos;

select
o.os,equipamento,defeito,servico,valor,
c.nomecli,fonecli
from tbos as o
inner join tbclientes c
on (o.idcli=c.idcli);



























































