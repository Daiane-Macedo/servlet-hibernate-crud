create table dac.usuario(
	id int auto_increment primary key,
	nome varchar(255) not null,
	cpf bigint not null,
	senha varchar(255) not null,
	email varchar(255) not null,
	matricula bigint not null,
	pendencia varchar(255)
);

create table dac.estacao(
	id int auto_increment primary key,
	capacidade int not null,
	qtd_slots_disp int not null,
	ativa boolean not null DEFAULT 1,
	nome varchar(255) not null,
	latitude varchar(255),
	longitude varchar(255),
	localizacao varchar(255)
);

create table dac.bicicleta(
	id int auto_increment primary key,
	ativa boolean not null DEFAULT 1,
	em_uso boolean not null DEFAULT 0,
	id_estacao int not null,
	codigo int not null
	-- foreign key(id_estacao) references estacao(id)
);

create table dac.historico(
	id int auto_increment primary key,
	acao varchar(255),
	data_inicio date not null,
	data_fim date,
	matricula int not null,
	pendencia varchar(255),
	id_bicicleta int,
	id_estacao int,
	id_usuario int,
	foreign key (id_bicicleta) references bicicleta(id),
	foreign key (id_estacao) references estacao(id)
	-- foreign key (id_usuario) references usuario(id)
);

create table dac.historico_bike(
	id int auto_increment primary key,
	data date not null,
	motivo_retirada varchar(255) not null,
	id_bicicleta int not null,
	foreign key (id_bicicleta) references bicicleta(id)
);

create table dac.punicao(
	id int auto_increment primary key,
	ativa boolean not null,
	inicio date not null,
	fim date,
	razao varchar(255) not null,
	id_historico int not null,
	id_usuario int not null,
	foreign key (id_historico) references historico(id),
	foreign key (id_usuario) references usuario(id)
);

create table dac.administrador(
	id int auto_increment primary key,
	nome varchar(255) not null,
	cpf varchar(255) not null,
	senha varchar(255) not null
);

