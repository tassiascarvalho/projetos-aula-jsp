CREATE TABLE pessoa (
id_pessoa SERIAL NOT NULL,
senha_pessoa VARCHAR(10) NOT NULL,
telefone_pessoa VARCHAR(12),
nome_pessoa VARCHAR(50) NOT NULL,
email_pessoa VARCHAR(50),
nome_usuario VARCHAR(15),
CONSTRAINT pk_pessoa PRIMARY KEY (id_pessoa)
);
CREATE TABLE pessoa_juridica (
id_pessoa_juridica SERIAl NOT NULL,
razao_social_pessoa_juridica VARCHAR(50),
cpnj_pessoa_juridica VARCHAR(30),
avaliacao_pessoa_juridica numeric (10,2),
imagem_pessoa_j varchar (200),
id_pessoa INTEGER NOT NULL,
CONSTRAINT pk_pessoa_juridica PRIMARY KEY (id_pessoa_juridica),
CONSTRAINT fk_pessoa FOREIGN KEY (id_pessoa) REFERENCES pessoa (id_pessoa)
);
CREATE TABLE pesso_fisica (
id_pessoa_fisica SERIAL NOT NULL,
sexo_pessoa_fisica VARCHAR(10) NOT NULL,
data_nascimento_pessoa_fisica DATE NOT NULL,
cpf_pessoa_fisica VARCHAR(17) NOT NULL,
imagem_pessoa_f varchar (200),
id_pessoa INTEGER NOT NULL,
CONSTRAINT pk_pessoa_fisica PRIMARY KEY(id_pessoa_fisica),
CONSTRAINT fk_pessoa FOREIGN KEY (id_pessoa) REFERENCES pessoa(id_pessoa)
);
CREATE TABLE categoria (
id_categoria SERIAL NOT NULL,
descricao_categoria VARCHAR(500) NOT NULL,
nome_categoria VARCHAR(30) NOT NULL,
CONSTRAINT pk_categoria PRIMARY KEY (id_categoria)
);

CREATE TABLE administrador(
id_adm SERIAL NOT NULL,
nome_adm VARCHAR(50) NOT NULL,
login_adm VARCHAR(10) NOT NULL,
senha_adm VARCHAR(10) NOT NULL,
CONSTRAINT pk_adm PRIMARY KEY (id_adm)
);

CREATE TABLE produto(
id_produto SERIAL NOT NULL,
id_pessoa_f NUMERIC,
id_pessoa_j NUMERIC,
nome_produto VARCHAR (1000)  NOT NULL,
categoria_produto VARCHAR (1000)  NOT NULL,
tamanho_produto VARCHAR (10000)  NOT NULL,
peso_produto VARCHAR (300)  NOT NULL,
valor_locacao_dia DECIMAL (5,2),
cor_produto VARCHAR(100)  NOT NULL,
descricao_produto VARCHAR (5000) NOT NULL,
referencia_produto VARCHAR (100)  NOT NULL  NOT NULL,
disponibilidade VARCHAR (150)  NOT NULL,
periodo_locacao DATE ,
imagem_produto VARCHAR (2000) NOT NULL,
quantidade_produto NUMERIC (1000) NOT NULL,
CONSTRAINT pk_produto PRIMARY KEY (id_produto)    
);


CREATE TABLE pedido (
id_pedido SERIAL NOT NULL,
id_pessoa_f NUMERIC NOT NULL,
id_pessoa_j NUMERIC NOT NULL,
id_produto NUMERIC NOT NULL,
valor_locacao VARCHAR(50),
data_inicio DATE,
data_limite DATE,
total_dias VARCHAR(30), 
endereco_local VARCHAR (100),
numero_local VARCHAR (50),
bairro_local VARCHAR (50),
cidade_local VARCHAR (100),
estado_local VARCHAR (50),
pais_local VARCHAR (50),
cep_local VARCHAR (50),
nome_pessoa_f VARCHAR (100),
telefone_pessoa_f VARCHAR (100),
cpf VARCHAR (100),
email_pessoa_f VARCHAR (100),
nome_pessoa_j VARCHAR (100),
razao_social VARCHAR (100),
email_pessoa_j VARCHAR (100),
telefone_pessoa_j VARCHAR (100),
nome_produto VARCHAR (100),
imagem_produto VARCHAR (100),
categoria_produto VARCHAR (100),
tamanho_produto VARCHAR (100),
peso_produto VARCHAR (100),
cor_produto VARCHAR (100),
cnpj VARCHAR(100),
situacao VARCHAR(100),
CONSTRAINT pk_pedido PRIMARY KEY (id_pedido) 
);

CREATE TABLE mensagem (
id_mensagem SERIAL NOT NULL,
mensagem VARCHAR(1000),
id_emissor NUMERIC,
id_receptor NUMERIC,
CONSTRAINT pk_mensagem PRIMARY KEY (id_mensagem) 
);

select p.* from pedido p order by p.nome_produto;



SELECT * FROM produto;
INSERT INTO administrador (nome_adm, login_adm, senha_adm) VALUES ('Douglas','doug','douglas123' );
SELECT * FROM administrador;

select m.* from mensagem m where (id_emissor=1 and id_receptor=2) or (id_emissor=2 and id_receptor=1) order by m.id_mensagem;