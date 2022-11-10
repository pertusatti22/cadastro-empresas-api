insert into endereco (logradouro, numero, bairro, cidade, estado, cep) values ('Rua Três', '338', 'Vila Industrial', 'Piracicaba','SP','13412233');
insert into endereco (logradouro, numero, bairro, cidade, estado, cep) values ('Rua Ulisses Bueno', '175', 'Vila Rosa', 'Aparecida de Goiânia','GO','74935870');
insert into pessoa (type, endereco_id) values ('juridica', 1);
insert into pessoa (type, endereco_id) values ('fisica', 2);
insert into pessoa_juridica (cnpj, nome_fantasia, razao_social, id) values ('11.941.838/0001-04', 'Elisa e Flávia Pães e Doces ME', 'Pães e Doces', 1);
insert into pessoa_fisica (cpf, nome_completo, id) values ('763.679.800-08', 'Mirella Kamilly Letícia Barbosa', 2);
insert into empresa(telefone, empresa_id, socio_id) values('(19) 9 8838-0630', 1, 2);
