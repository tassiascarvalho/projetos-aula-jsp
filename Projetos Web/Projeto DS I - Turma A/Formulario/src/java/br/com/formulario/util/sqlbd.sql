CREATE TABLE CATEGORIA_PRODUTO(
id_categoria_produto serial,
nome_categoria_produto varchar(50),
descricao_categoria_produto varchar(100),
CONSTRAINT PK_CATEGORIA_PRODUTO 
PRIMARY KEY (id_categoria_produto));

CREATE TABLE GENERO(
id_genero serial primary key,
nome_genero varchar(50),
descricao_genero varchar(200));

create table administrador(
idadministrador serial primary key,
nomeadministrador varchar(60),
usuarioadministrador varchar(30),
senhaadministrador varchar(10));