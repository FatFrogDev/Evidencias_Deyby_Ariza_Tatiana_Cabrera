drop database bolsillo;
create database if not exists bolsillo  charset=utf8mb4;

use bolsillo;

CREATE TABLE `usuario` (
  `idUsuario` int(11) primary key auto_increment,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `tipoDoc` varchar(30) NOT NULL,
  `numDoc` varchar(15)NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `activo` boolean NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table usuario add unique (email);


CREATE TABLE `bolsillo` (
  `idBolsillo` int(11) NOT NULL  primary key auto_increment,
  `saldo` float DEFAULT NULL DEFAULT(0),
  `nombre` varchar(15) NOT NULL,
  `activo` boolean NOT NULL DEFAULT(true),
  `idUsuario` int (11) not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


alter table usuario add unique (idUsuario);

ALTER TABLE `bolsillo`
ADD CONSTRAINT `FKUsuario` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`);

use bolsillo;
insert into usuario (nombre, apellido, tipoDoc,numDoc,email, password, activo) 
VALUES("Jaime", "Urtado", "CC", "1058241571", "jaime58@hotmail.com", "123", 1);

insert into usuario (nombre, apellido, tipoDoc,numDoc,email, password, activo)
VALUES("Kimberly", "Caicedo"," TI", "1000118795", "kimbc@yahoo.es", "mateo35", 1);


-- Usuarios
insert into bolsillo (saldo, nombre, activo,  idUsuario)  values(1350,  "Nequi", 1, 1);
insert into bolsillo (saldo, nombre, activo,  idUsuario)  VALUES(250000, "Daviplata", 1, 2);

-- SELECT * from bolsillo as b  inner JOIN usuario as u on b.idUsuario=u.idUsuario WHERE b.nombre="Nequi" ;
-- SELECT * from bolsillo as b  inner JOIN usuario as u on b.idUsuario=u.idUsuario WHERE b.nombre="Daviplata" ;

--  
--  SELECT * FROM usuario as u inner join bolsillo as b on u.`idUsuario`=b.`idUsuario` WHERE b.nombre="Daviplata";
