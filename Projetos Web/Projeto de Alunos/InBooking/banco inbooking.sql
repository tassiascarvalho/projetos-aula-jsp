create table editora(
ideditora serial primary key not null,
nomeeditora varchar(100) not null
);
create table livro (
idlivro serial primary key not null,
id_editora integer not null,
titulolivro varchar (40) not null,
isbnlivro varchar (13) not null,
anopublicacaolivro varchar (4) not null,
idiomalivro varchar (20) not null,
capituloslivro integer not null,
paginaslivro integer not null,
sinopselivro varchar (1000) not null,
anoedicaolivro integer not null,
numeroedicaolivro integer not null,
constraint fk_id_editora foreign key (id_editora) references editora
);

create table pessoa (
idpessoa serial primary key not null,
nomepessoa varchar (100) not null,
responsavelpessoa varchar (100) not null,
telefoneresponsavelpessoa varchar (11) not null,
ceppessoa varchar (10) not null,
cpfpessoa varchar (11) not null,
telefonepessoa varchar (10),
celularpessoa varchar (11) not null,
enderecopessoa varchar (100) not null,
bairropessoa varchar (30) not null,
cidadepessoa varchar (30) not null,
estadopessoa varchar (2) not null,
numeroendpessoa varchar (6) not null,
sexopessoa varchar (20) not null,
emailpessoa varchar (50) not null,
senhapessoa varchar (15) not null,
datanascimentopessoa date not null,
statuspessoa varchar (15) not null,
perfilpessoa varchar (15) not null
);
create table autor (
idautor serial primary key not null,
pseudonimoautor varchar (100) not null,
nacionalidadeautor varchar (40) not null,
nomeautor varchar (20) not null,
sobrenomeautor varchar (20) not null
);

create table livro_autor(
id_autor integer not null,
id_livro integer not null,
constraint fk_id_autor foreign key (id_autor) references autor,
constraint fk_id_livro foreign key (id_livro) references livro
);

create table genero(
idgenero serial primary key not null,
descricaogenero varchar (100) not null
);

create table livro_genero(
id_genero integer not null,
id_livro integer not null,
constraint fk_id_livro foreign key (id_livro) references livro,
constraint fk_id_genero foreign key (id_genero) references genero
);

create table acervo(
idacervo serial primary key not null,
id_livro integer not null,
quantidadeacervo integer not null,
statuslivroacervo varchar (15) not null,
disponibilidadeacervo integer not null,
constraint fk_id_livro foreign key (id_livro) references livro
);

create table reserva(
idreserva serial primary key not null,
id_pessoa integer not null,
id_acervo integer not null,
datareserva date not null,
tempolimiteretirada date not null,
constraint fk_id_pessoa foreign key (id_pessoa) references pessoa,
constraint fk_id_acervo foreign key (id_acervo) references acervo
);
create table pessoareserva(
id_pessoa integer not null,
id_reserva integer not null,
classificacaoreserva integer not null,
constraint fk_id_pessoa foreign key (id_pessoa) references pessoa,
constraint fk_id_reserva foreign key (id_reserva) references reserva
);

create table emprestimo(
idemprestimo serial primary key not null,
id_acervo integer not null,
id_clientepessoa integer not null,
id_funcionariopessoa integer not null,
dataemprestimo date not null,
datadevolucao date not null,
statusemprestimo varchar(15) not null,
constraint fk_id_acervo foreign key (id_acervo) references acervo,
constraint fk_id_clientepessoa foreign key (id_clientepessoa) references pessoa,
constraint fk_id_funcionariopessoa foreign key (id_funcionariopessoa) references pessoa
);

create table multa(
idmulta serial primary key not null,
id_emprestimo integer not null,
valormulta integer not null
);

create table configuracoesemprestimo(
idconfiguracao serial primary key not null,
valormultapadrao integer not null,
tempolimiteretiradareserva date not null,
tempodevolucaoemprestimo date not null
);