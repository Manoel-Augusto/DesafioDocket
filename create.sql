create table tb_certidao (id bigint generated by default as identity, name varchar(255), primary key (id));
create table tb_operador (id bigint generated by default as identity, name varchar(255), primary key (id));
create table tb_cartorio (id  bigserial not null, nome varchar(255), endereco_id int8, primary key (id));
create table tb_certidao (id  bigserial not null, nome varchar(255), primary key (id));
create table tb_endereco (id  bigserial not null, cidade varchar(255), rua varchar(255), primary key (id));
create table tb_operador (id  bigserial not null, name varchar(255), primary key (id));
alter table tb_cartorio add constraint FKmvqmcqd61onye3jfr6phyw6q7 foreign key (endereco_id) references tb_endereco;
INSERT INTO tb_endereco (CIDADE, RUA) VALUES('Planaltina', 'Estancia');
INSERT INTO tb_cartorio (NOME, ENDERECO_ID ) VALUES('Cartório do 9° Ofício de Registro Civil', 1, 1);
INSERT INTO tb_certidao (NOME, CARTORIO_ID) VALUES('Certidão de Casamento', 1);
INSERT INTO tb_certidao (NOME, CARTORIO_ID) VALUES('Certidão de Obito');*/;
create table tb_cartorio (id  bigserial not null, nome varchar(255), endereco_id int8, primary key (id));
create table tb_certidao (id  bigserial not null, nome varchar(255), primary key (id));
create table tb_endereco (id  bigserial not null, cidade varchar(255), rua varchar(255), primary key (id));
create table tb_operador (id  bigserial not null, name varchar(255), primary key (id));
alter table tb_cartorio add constraint FKmvqmcqd61onye3jfr6phyw6q7 foreign key (endereco_id) references tb_endereco;
INSERT INTO tb_endereco (CIDADE, RUA) VALUES('Planaltina', 'Estancia');
INSERT INTO tb_cartorio (NOME, ENDERECO_ID ) VALUES('Cartório do 9° Ofício de Registro Civil', 1, 1);
INSERT INTO tb_certidao (NOME, CARTORIO_ID) VALUES('Certidão de Casamento', 1);
INSERT INTO tb_certidao (NOME, CARTORIO_ID) VALUES('Certidão de Obito');*/;
create table tb_cartorio (id  bigserial not null, nome varchar(255), endereco_id int8, primary key (id));
create table tb_certidao (id  bigserial not null, nome varchar(255), primary key (id));
create table tb_endereco (id  bigserial not null, cidade varchar(255), rua varchar(255), primary key (id));
create table tb_operador (id  bigserial not null, name varchar(255), primary key (id));
alter table tb_cartorio add constraint FKmvqmcqd61onye3jfr6phyw6q7 foreign key (endereco_id) references tb_endereco;
INSERT INTO tb_endereco (CIDADE, RUA) VALUES('Planaltina', 'Estancia');
INSERT INTO tb_cartorio (NOME, ENDERECO_ID ) VALUES('Cartório do 9° Ofício de Registro Civil', 1, 1);
INSERT INTO tb_certidao (NOME, CARTORIO_ID) VALUES('Certidão de Casamento', 1);
INSERT INTO tb_certidao (NOME, CARTORIO_ID) VALUES('Certidão de Obito');*/;