--- Nome do banco bdupa
CREATE TABLE ESPECIALIDADE(
idEspecialidade serial,
nomeEspecialidade varchar(60),
descricaoEspecialidade varchar(200),
CONSTRAINT pk_especialidade PRIMARY KEY (idEspecialidade));

create table sala(
idsala serial primary key,
numerosala int);