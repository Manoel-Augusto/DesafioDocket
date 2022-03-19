INSERT INTO tb_endereco (cidade, rua) values ('Rua Guajajaras', '197 – Centro – CEP 30180-100');
INSERT INTO tb_endereco (cidade, rua) values ('Av. Afonso Pena', '732 – 2º andar – Centro – CEP 30130-003');
INSERT INTO tb_endereco (cidade, rua) values ('Rua Maria da Conceição de São José', '155 – Centro – CEP 32041-300');
INSERT INTO tb_endereco (cidade, rua) values ('Rua Joaquim Camargos', '140 – Sala 03 – CEP 32041-440');
INSERT INTO tb_endereco (cidade, rua) values ('Av. João César de Oliveira', ' 1.310 – Loja 02 – Centro – CEP 32310-000');
INSERT INTO tb_endereco (cidade, rua) values ('Endereço: Av. General David Sarnoff', '49 – Centro – CEP 32210-110');

INSERT INTO tb_certidao (nome) values ('Certidão de Óbito');
INSERT INTO tb_certidao (nome) values ('Certidão de Casamento');
INSERT INTO tb_certidao (nome) values ('Certidão de Nascimento');


INSERT INTO tb_cartorio (nome, endereco_id) values ('7º Ofício do Registro de Imóveis', 1);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Registro Civil das Pessoas Naturais', 2);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Serviço do Registro de Títulos e Documentos', 3);
INSERT INTO tb_cartorio (nome, endereco_id) values ('2º Tabelionato de Notas', 4);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Serviço do 1º Ofício de Notas', 5);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Serviço de Protestos', 6);


INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (1,1);
INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (1,2);
INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (1,3);

INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (2,1);
INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (2,3);

INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (3,1);
INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (3,2);

INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (4,1);
INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (4,2);

INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (5,1);
INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (5,2);

INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (6,3);
INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (6,2);
INSERT INTO tb_cartorio_certidao (cartorio_id, certidao_id) values (6,1);

INSERT INTO tb_operador (nome, email, password) values ('Usuario de Teste', 'usuario_test@test.com', '123456789');

