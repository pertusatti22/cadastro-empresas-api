insert into endereco (logradouro, numero, bairro, cidade, estado, cep) values ('Rua Três', '338', 'Vila Industrial', 'Piracicaba','SP','13412233');
insert into endereco (logradouro, numero, bairro, cidade, estado, cep) values ('Rua Ulisses Bueno', '175', 'Vila Rosa', 'Aparecida de Goiânia','GO','74935870');
insert into endereco (logradouro, numero, bairro, cidade, estado, cep) values ('Rua Domingos Vendemiati', '154', 'Parque Recanto do Parrilho', 'Jundiaí','SP','13219051');
insert into endereco (logradouro, numero, bairro, cidade, estado, cep) values ('Rua Ângelo Alberto Nesti', '639', 'Bussocaba', 'Osasco','SP','06053060');
insert into endereco (logradouro, numero, bairro, cidade, estado, cep) values ('SQN 507, Bl C', '500', 'Asa Norte', 'Brasília','DF','71020050');
insert into endereco (logradouro, numero, bairro, cidade, estado, cep) values ('CA 5', '103', 'Centro de Atividades', 'Brasília','DF','71440650');
insert into pessoa (id, type, endereco_id) values (1, 'JURIDICA', 1);
insert into pessoa (id, type, endereco_id) values (2, 'FISICA', 2);
insert into pessoa (id, type, endereco_id) values (3, 'JURIDICA', 3);
insert into pessoa (id, type, endereco_id) values (4, 'JURIDICA', 4);
insert into pessoa (id, type, endereco_id) values (5, 'JURIDICA', 5);
insert into pessoa (id, type, endereco_id) values (6, 'FISICA', 6);
insert into pessoa_juridica (cnpj, nome_fantasia, razao_social, telefone, id) values ('11941838000104', 'Elisa e Flávia Pães e Doces ME', 'Pães e Doces', '(19) 9 8838-0630', 1);
insert into pessoa_fisica (cpf, nome_completo, id) values ('76367980008', 'Mirella Kamilly Letícia Barbosa', 2);
insert into pessoa_juridica (cnpj, nome_fantasia, razao_social, telefone, id) values ('92456516000163', 'Arthur e Andreia Telas Ltda', 'Telas','11995726906', 3);
insert into pessoa_juridica (cnpj, nome_fantasia, razao_social, id) values ('87009263000140', 'Lavínia e Tereza Locações de Automóveis Ltda', 'Loc., Auto', 4);
insert into pessoa_juridica (cnpj, nome_fantasia, razao_social, telefone, id) values ('63458851000115', 'JP Gestão Ltda', 'JP Gestão','61992224334', 5);
insert into pessoa_fisica (cpf, nome_completo, id) values ('00000000000', 'Jackson Pertusatti', 6);
insert into sociedade (pessoa_id, pessoa_juridica_id) values (2, 1);
insert into sociedade (pessoa_id, pessoa_juridica_id) values (4, 3);
insert into sociedade (pessoa_id, pessoa_juridica_id) values (6, 5);
