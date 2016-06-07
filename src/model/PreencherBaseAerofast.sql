select * from DAC.AERONAVE;
select * from DAC.VOO;
select * from DAC.CLIENTE;
select * from DAC.PASSAGEIRO;
select * from DAC.PASSAGEM;
select * from DAC.PAGAMENTO;

--Cliente
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (1, 'Décio Antonio de Carvalho', '05/07/1963', 'Rua Cisplatina', '615', 'Ipiranga', 'São Paulo', 'SP', '04211-040', 'Dantcar@gmail.com', '(11)97011-4390', '11.040.681-3', '082.407.688-57');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (2, 'dsf', '18/05/2016', 'Rua Ituiutaba', '33', 'Ipiranga', 'São Paulo', 'SP', '04211-010', 'fasdf@gff.com', '(11)11111-1111', '11.111.111-1', '082.407.688-56');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (3, 'José Almeida', '09/08/2010', 'Rua Etiópia', '222', 'Parque da Mooca', 'São Paulo', 'SP', '03122-020', 'sememail@gov.br', '(11)02033-4554', '34.353.454-3', '333.333.333-33');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (5, 'Bahia', '02/03/2000', 'Praça Comendador Marcelino Monteiro', '23', 'Jardim das Nações', 'Taubaté', 'SP', '12030-010', 'Bahia@uol.com', '(11)11111-1111', '44.444.444-4', '444.444.444-44');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (6, 'Décio', '25/05/2016', 'Rua Cisplatina', '90', 'Ipiranga', 'São Paulo', 'SP', '04211-040', 'jsdhfa@jfdk.cc', '(11)11111-1111', '11.111.111-1', '082.407.688-50');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (7, 'Lilian Gonçalves', '19/05/2016', 'Rua Nova de São Bento', '23', 'Nazaré', 'Salvador', 'BA', '40040-010', 'Lilian@fera.com', '(11)11111-1111', '11.111.111-1', '111.111.111-10');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (8, 'Geraldo', '20/11/1977', 'Rua Siqueira Campos', '43', 'Santo Antônio', 'Recife', 'PE', '50010-010', 'Geraldo@chico.com', '(21)21122-1212', '11.111.111-1', '111.111.111-00');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (9, 'Paula', '16/11/2006', 'Vila Elizabet', '12', 'Benfica', 'Fortaleza', 'CE', '60020-010', 'Pauloa@1.com', '(11)11111-1111', '11.111.111-1', '111.111.111-40');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (10, 'Ivy', '06/06/2013', 'Travessa Alberto Napolitano', 'casa 6', 'Ipiranga', 'São Paulo', 'SP', '04205-010', 'Ivy@Girl.com', '(11)11111-1111', '11.111.111-1', '777.777.777-77');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (12, 'Facebook', '16/05/2016', 'Rua Aimutong', '24', 'Tucuruvi', 'São Paulo', 'SP', '02340-010', 'Face@gmail.com', '(11)11111-1111', '11.111.111-1', '121.212.121-21');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (13, 'Sorte', '01/09/2010', 'Travessa Araújo Ribeiro', '34', 'Centro Histórico', 'Porto Alegre', 'RS', '90010-010', 'Sorte@uol.com', '(44)44444-4444', '34.123.345-6', '765.324.565-54');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (14, 'Adamastor', '21/12/1950', 'Rua Antônio Ronna', '56', 'Anchieta', 'Porto Alegre', 'RS', '90200-010', 'Ada@gmail.com', '(22)22222-2222', '45.435.245-2', '452.345.623-65');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (15, 'Agora Vai', '02/08/1990', 'Rua Voluntários da Pátria', '12', 'Floresta', 'Porto Alegre', 'RS', '90230-010', 'Vai@vava.com', '(12)12121-2122', '43.234.434-4', '345.453.433-22');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (16, 'Darly', '20/09/1999', 'Praça Miguel Delgado', '77', 'Santana', 'São Paulo', 'SP', '02403-000', 'geral@pena.com', '(77)77777-7777', '77.777.777-7', '777.777.777-69');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (16, 'Palhaço', '20/05/2016', 'Rua Nioac', '11', 'Sé', 'São Paulo', 'SP', '01020-020', 'Pa@gadfg.com', '(67)67676-7676', '67.676.767-6', '676.767.676-76');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (17, 'Palhaço 17', '20/05/2016', 'Rua das Carmelitas', '12', 'Sé', 'São Paulo', 'SP', '01020-010', 'pe@dk.com', '(32)42343-2423', '32.423.534-5', '324.234.234-23');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (18, 'Palhaço 18', '18/05/2016', 'Rua Siqueira Campos', '11', 'Centro Histórico', 'Porto Alegre', 'RS', '90010-000', 'Pc@g.com', '(12)02020-2020', '11.111.111-1', '121.111.111-22');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (20, 'Érica Editora', '14/08/1992', 'Rua São Gil', '159', 'Tatuapé', 'São Paulo', 'SP', '03401-030', 'producao@erica.com.br', '(11)06197-4060', '12.121.212-1', '900.876.555-55');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (21, 'Patricinha', '18/04/1994', 'Rua Durval Clemente', '80', 'Jardim São Paulo(Zona Norte)', 'São Paulo', 'SP', '02040-000', 'Paty@globo.com', '(12)12121-2122', '12.121.322-3', '346.457.687-64');

-- passageiro
INSERT INTO DAC.PASSAGEIRO (IDPASSAGEIRO, NOMEPASSAGEIRO, NASCIMENTOPASSAGEIRO, RGPASSAGEIRO, TELEFONEPASSAGEIRO, EMAILPASSAGEIRO, CONTATONOME, CONTATOTELEFONE, RESPONSAVELFINANCEIRO, RESPONSAVELCPF) 
	VALUES (2, 'Sorte', '01/09/2010', '34.123.345-6', '(44)44444-4444', 'Sorte@uol.com', 'Sr Arruda', '(11)02040-3030', 'Sorte', '765.324.565-54');
INSERT INTO DAC.PASSAGEIRO (IDPASSAGEIRO, NOMEPASSAGEIRO, NASCIMENTOPASSAGEIRO, RGPASSAGEIRO, TELEFONEPASSAGEIRO, EMAILPASSAGEIRO, CONTATONOME, CONTATOTELEFONE, RESPONSAVELFINANCEIRO, RESPONSAVELCPF) 
	VALUES (3, 'Darly da Vida', '12/12/2000', '77.777.777-7', '(77)77777-7777', 'geral@almapenada.com', 'Sr. Carlos', '(11)22222-2222', 'Décio Antonio de Carvalho', '082.407.688-57');

