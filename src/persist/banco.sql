create database banco;

use banco;

create table funcionario(
id int not null auto_increment,
nome varchar(50),
matricula int,
salario double,
primary key (id)
);

create table dependente(
id int not null auto_increment,
nome varchar(50),
idade int,
fk_fun int,
primary key (id),
foreign key (fk_fun) references funcionario(id) 
);