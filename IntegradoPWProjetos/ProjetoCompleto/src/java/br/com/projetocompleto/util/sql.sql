CREATE TABLE pessoa(
idpessoa serial primary key,
nomepessoa varchar(120),
emailpessoa varchar(60));

CREATE TABLE fisica(
idfisica serial primaryr key,
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




