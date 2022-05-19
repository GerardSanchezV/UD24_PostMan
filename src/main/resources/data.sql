DROP table IF EXISTS trabajadores;

create table trabajadores(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	puesto varchar(250),
	salario double default null);

insert into trabajadores (nombre, apellido,puesto,salario)values('Jose','Marin','Comercial',2234);
insert into trabajadores (nombre, apellido,puesto,salario)values('Juan','Lopez','Electricista',1580);
insert into trabajadores (nombre, apellido,puesto,salario)values('Guillem','Pascual','Programador',1280);
insert into trabajadores (nombre, apellido,puesto,salario)values('Jordi','Martin','Marketing',3234);
insert into trabajadores (nombre, apellido,puesto,salario)values('Jhonatan','Vicente','Mecanico',2234);