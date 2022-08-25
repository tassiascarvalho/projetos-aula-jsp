CREATE TABLE pessoa(
idpessoa serial primary key,
nomepessoa varchar(120),
emailpessoa varchar(60),
senhapessoa varchar(10));

CREATE TABLE fisica(
idfisica serial primary key,
cpffisica varchar(14),
apelidofisica varchar(15),
idpessoa int,
CONSTRAINT fkpessoafisica 
FOREIGN KEY (idpessoa) 
REFERENCES pessoa(idpessoa));

CREATE TABLE juridica(
idjuridica serial primary key,
cnpjjuridica varchar(18),
representantejuridica varchar(100),
idpessoa int,
CONSTRAINT fkpessoajuridica 
FOREIGN KEY (idpessoa) 
REFERENCES pessoa(idpessoa));

CREATE TABLE produto(
idproduto serial primary key,
nomeproduto varchar(150),
valorproduto numeric(7,2), 
datafabricacaoproduto date,
idjuridica int,
CONSTRAINT fkjuridicaproduto
FOREIGN KEY (idjuridica)
REFERENCES juridica(idjuridica));

CREATE TABLE saida(
idsaida serial primary key,
chavesaida varchar(100),
natopsaida varchar(50),
dataemissaosaida date,
idfisica int,
statussaida char(1),
datacriacaosaida date,
CONSTRAINT fksaidafisica
FOREIGN KEY (idfisica)
REFERENCES fisica(idfisica));


CREATE TABLE itenssaida(
iditem serial primary key,
cfopitem int,m int,
qtditem int,
valorunitem numeric(7,2),
idproduto int,
idsaida int,
CONSTRAINT fkitensproduto
FOREIGN KEY (idproduto)
REFERENCES produto(idproduto),
CONSTRAINT fkitenssaida
FOREIGN KEY (idsaida)
REFERENCES saida(idsaida));

insert into itenssaida(idproduto, valorunitem, idproduto)
values (?, ?, ?);




















