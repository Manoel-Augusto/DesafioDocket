INSERT INTO tb_endereco (rua, numero, bairro, cep) values ('Rua Rio de Janeiro', 1611,  'Lourdes',  '30160-042');
INSERT INTO tb_endereco (rua, numero, bairro, cep) values ('Av. Francisco Sales', 244,  'Floresta',  '30150-220');
INSERT INTO tb_endereco (rua, numero, bairro, cep) values ('Rua São Paulo',  1.620, 'Lourdes',  '30170-132');
INSERT INTO tb_endereco (rua, numero, bairro, cep) values ('R. Dos Goitacazes', 43, 'Centro',  '30190-050');
INSERT INTO tb_endereco (rua, numero, bairro, cep) values ('Rua Guajajaras', 197, 'Centro',  '30180-100');
INSERT INTO tb_endereco (rua, numero, bairro, cep) values ('Rua Maria da Conceição de São José', 155, 'Centro',  '32041-300');

INSERT INTO tb_certidao (nome) values ('Certidão de Nascimento');
INSERT INTO tb_certidao (nome) values ('Certidão de Casamento');
INSERT INTO tb_certidao (nome) values ('Certidão de Óbito');

INSERT INTO tb_cartorio (nome, endereco_id) values ('Serviço do 1º Ofício do Registro de Imóveis', 1);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Serviço de Registro Civil das Pessoas Naturais', 2);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Serviço de Registro Civil das Pessoas Naturais - 3º Subdistrito', 3);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Serviço do 2º Ofício de Registro de Títulos e Documentos', 4);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Serviço do 1º Ofício de Notas', 5);
INSERT INTO tb_cartorio (nome, endereco_id) values ('Serviço do 1º Ofício de Notas', 6);

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
