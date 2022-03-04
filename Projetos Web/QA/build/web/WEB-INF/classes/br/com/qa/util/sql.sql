create table  administrador (
idadministrador serial primary key,
nomeadministrador character varying,
cpfadministrador character(14),
loginadministrador character varying,
senhaadministrador character varying);

create table  pessoa(
idpessoa serial primary key,
nomepessoa character varying(50),
cpfpessoa character varying(14),
loginpessoa character varying(30),
senhapessoa character varying(20),
tipopessoa character varying(1));

create table  cliente (
idcliente serial primary key,
rgcliente character varying(13),
cidadecliente character varying(50),
quantidadedependentescliente integer,
idpessoa integer NOT NULL,
constraint fkclientepessoa foreign key (idpessoa) references pessoa(idpessoa));

create table categoria(
idcategoria serial,
descricaocategoria varchar(20),
constraint pkcategoria primary key(idcategoria));


CREATE TABLE genero(
idgenero serial NOT NULL PRIMARY KEY,
nomegenero varchar (300) NOT NULL,
descricaogenero varchar (1000));


CREATE TABLE filme(
idfilme serial NOT NULL,
nomefilme varchar (100) NOT NULL,
duracaofilme integer,
sinopsefilme varchar (1000),
classificacaofilme varchar (100),
idgenero int,
idcategoria int,
CONSTRAINT pkfilme PRIMARY KEY (idfilme),
CONSTRAINT fkfilmegenero FOREIGN KEY(idgenero) REFERENCES genero(idgenero)
CONSTRAINT fkfilmecategoria FOREIGN KEY(idcategoria) REFERENCES categoria(idcategoria));

create table pergunta(
idpergunta serial,
descricaopergunta varchar(500),
idcategoria integer,
constraint pkpergunta primary key(idpergunta),
constraint fkperguntacategoria foreign key (idcategoria) references categoria(idcategoria));

create table resposta(
idresposta serial,
descricaoresposta varchar(200),
respostacorreta varchar(1),
idpergunta integer,
constraint pkresposta primary key(idresposta),
constraint fkrespostapergunta foreign key(idpergunta) references pergunta(idpergunta));

create table jogo(
idjogo serial,
idusuario integer,
qtdacertos integer,
qtderros integer,
constraint pkjogo primary key(idjogo),
constraint fkjogousuario foreign key(idjogo) references usuario(idusuario));

create table perguntasjogo(
idperguntasjogo serial,
idpergunta integer,
idjogo integer,
constraint pkperguntasjogo primary key(idperguntasjogo),
constraint fkperguntasjogopergunta  foreign key(idpergunta) references pergunta(idpergunta),
constraint fkperguntasjogojogo foreign key(idjogo) references jogo(idjogo));








