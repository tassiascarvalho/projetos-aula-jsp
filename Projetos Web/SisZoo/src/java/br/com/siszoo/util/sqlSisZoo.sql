create table especie (
	id_especie serial not null,
	nome_especie varchar(100) not null,
	descricao_especie varchar(1000) not null,
	constraint pk_especie primary key (id_especie)
);
create table animal (
	id_animal serial not null,
	nome_animal varchar(100),
	data_nascimento_animal Date,
	peso_animal decimal,
	constraint pk_animal primary key (id_animal)
);