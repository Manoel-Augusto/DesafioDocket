INSERT INTO tb_endereco (cidade, rua) values ('Brasília', 'Lagoa Linda');
INSERT INTO tb_endereco (cidade, rua) values ('São Paulo', 'rua são camilo');
INSERT INTO tb_endereco (cidade, rua) values ('Planaltina', 'setor luzas');
INSERT INTO tb_endereco (cidade, rua) values ('Curitiba', 'avenida Joaquim Fernandes');
INSERT INTO tb_endereco (cidade, rua) values ('Curitiba', 'avenida Joaquim Fernandes');
INSERT INTO tb_endereco (cidade, rua) values ('Curitiba', 'avenida Joaquim Fernandes');

INSERT INTO tb_certidao (nome) values ('Certidão de Óbito');
INSERT INTO tb_certidao (nome) values ('Certidão de Casamento');
INSERT INTO tb_certidao (nome) values ('Certidão de Nascimento');


INSERT INTO tb_cartorio (nome, endereco_id) values ('Cartório do 9° Ofício de Registro Civil', 1);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Cartório do 9° Ofício de Registro Civil', 2);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Cartório do 9° Ofício de Registro Civil', 3);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Cartório do 9° Ofício de Registro Civil', 4);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Cartório do 9° Ofício de Registro Civil', 5);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Cartório do 9° Ofício de Registro Civil', 6);


INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (1,1);
INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (2,2);
INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (3,3);