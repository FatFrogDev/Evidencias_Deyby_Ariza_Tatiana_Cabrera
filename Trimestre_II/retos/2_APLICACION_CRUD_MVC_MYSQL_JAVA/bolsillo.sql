drop database bolsillo;
create database if not exists bolsillo  charset=utf8mb4;

use bolsillo;

CREATE TABLE `usuario` (
  `idUsuario` int(11) primary key auto_increment,
  `nombreUsuario` varchar(30) NOT NULL,
  `apellidoUsuario` varchar(30) NOT NULL,
  tipoDoc varchar(30) NOT NULL,
  numDoc varchar(15)NOT NULL,
    `correoUsuario` varchar(20) NOT NULL,
  `passwordUsuario` varchar(20) NOT NULL,
    activo boolean NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
alter table usuario add unique (correoUsuario);


CREATE TABLE `bolsillo` (
  `idBolsillo` int(11) NOT NULL  primary key auto_increment,
  `saldo` float DEFAULT NULL,
  `nombreBolsillo` varchar(15) NOT NULL,
  activo boolean NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ALTER TABLE `bolsillo`
--  ADD CONSTRAINT `FKBanco` FOREIGN KEY (`idBanco`) REFERENCES `banco` (`idBanco`),
-- ADD CONSTRAINT `FKUsuario` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`);