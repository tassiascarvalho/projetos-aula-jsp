CREATE TABLE usuario(
idusuario serial primary key,
nomeusuario varchar(100),
datanascimentousuario date,
emailusuario varchar(100),
senhausuario varchar(10),
telefoneusuario varchar(14),
generousuario varchar(1),
caminhofotousuario varchar(3000),
sinteseusuario varchar(3000),
caminhocapausuario varchar(3000),
tiposeguidorusuario varchar(1));

CREATE TABLE publicacao(
idPublicacao serial primary key,
dataPublicacao date,
textoPublicacao varchar(1000),
tipoPublicacao int,
idUsuario int,
CONSTRAINT fk_publicacao_usuario 
FOREIGN KEY (idUsuario)
REFERENCES usuario(idUsuario)); 