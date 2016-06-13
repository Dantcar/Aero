-- select * from DAC.AERONAVE;
--DROP TABLE CLIENTE
CREATE TABLE CLIENTE (
idCliente int not null, 
nome VARCHAR(60)not null,
nascimento VARCHAR(10)not null,
endereco VARCHAR(60)not null,
numero VARCHAR(30)not null,
bairro VARCHAR(60)not null,
cidade VARCHAR(60)not null,
uf VARCHAR(2)not null,
cep VARCHAR(10)not null,
email VARCHAR(60)not null,
telefone VARCHAR(20)not null,
RG VARCHAR(16),
CPF VARCHAR(18)not null primary key
)

-- DROP TABLE aeronave
CREATE TABLE AERONAVE(
idAeronave int not null,
prefixo VARCHAR(8)not null primary key,
seatEconomyClasse int,
seatFirstClasse int,
seatBusinesClasse int,
modelo VARCHAR(50),
fabricante VARCHAR(50),
operadora VARCHAR(60)
)

-- DROP TABLE ENDCEP
CREATE TABLE endcep(
idCep int not null,
endereco VARCHAR(60)not null,
complemento VARCHAR(60)not null,
bairro VARCHAR(60)not null,
cidade VARCHAR(60)not null,
uf VARCHAR(2)not null,
cep VARCHAR(8)not null primary key
)

-- DROP TABLE PAGAMENTO
CREATE TABLE PAGAMENTO(
idPagamento int not null,
dataPagamento VARCHAR(10) not null,
nomePagador VARCHAR(60) not null,
rgPagador VARCHAR(18) not null,
cpfPagador VARCHAR(14)not null primary key,
vlTotal float,
formaPagamento VARCHAR(20)not null,
referenciaPagamento VARCHAR(20) not null
)

-- DROP TABLE PASSAGEIRO
CREATE TABLE PASSAGEIRO(
idPassageiro int not null,
nomePassageiro VARCHAR(60) not null,
nascimentoPassageiro VARCHAR(10) not null,
rgPassageiro VARCHAR(16) not null primary key,
telefonePassageiro VARCHAR(18) not null,
emailPassageiro VARCHAR(60) not null,
contatoNome VARCHAR(40) not null,
contatoTelefone VARCHAR(18) not null,
responsavelFinanceiro VARCHAR(60) not null,
responsavelCPF VARCHAR(18) not null
)

-- DROP TABLE PASSAGEM
CREATE TABLE PASSAGEM(
    idPassagem int not null,
    NumeroPassagem VARCHAR(20) not null primary key,
    nomePassageiro VARCHAR(60) not null,
    rgPassageiro VARCHAR(16) not null,
    reserva VARCHAR(12) not null,
    vooNumero VARCHAR(12) not null,
    CiaAerea VARCHAR(60) not null,
    assentoNumero VARCHAR(4) not null,
    classe VARCHAR(17) not null,
    tarifa float,
    dataPassagem VARCHAR(10) not null,
    partidaAeroporto VARCHAR(60) not null,
    partidaSiglaAeroporto VARCHAR(10) not null,
    partidaData VARCHAR(10) not null,
    partidaHora VARCHAR(8) not null,
    partidaPortao VARCHAR(10) not null,
    chegadaAeroporto VARCHAR(8) not null,
    chegadaSiglaAeroporto VARCHAR(60) not null,
    chegadaData VARCHAR(10) not null,
    chegadaHora VARCHAR(8) not null,
    chegadaPortao VARCHAR(10) not null,   
    EscalasVoo VARCHAR(60) not null,
    ObservacaoPassagem VARCHAR(600) not null
)

-- DROP TABLE VOO
CREATE TABLE VOO(
    idVoo  int not null,
    numeroVoo  VARCHAR(12) not null primary key,
    ciaAerea  VARCHAR(60) not null,
    prefixo VARCHAR(8)not null,
    dataPartida  VARCHAR(10) not null,
    horaPartida  VARCHAR(8) not null,
    aeroportoPartida  VARCHAR(60) not null,
    aeroportoPartidaSigla  VARCHAR(10) not null,
    portaoPartida  VARCHAR(10),
    dataChegada  VARCHAR(10) not null,
    horaChegada  VARCHAR(8) not null,
    aeroportoChegada  VARCHAR(60) not null,
    aeroportoChegadaSigla  VARCHAR(10) not null,
    portaoChegada  VARCHAR(8),
    escalasVoo  VARCHAR(60), 
    tarifaE  float,
    tarifaB  float,
    tarifaF  float
)


--Insert Voo

INSERT INTO DAC.VOO (IDVOO, NUMEROVOO, CIAAEREA, PREFIXO, DATAPARTIDA, HORAPARTIDA, AEROPORTOPARTIDA, AEROPORTOPARTIDASIGLA, PORTAOPARTIDA, DATACHEGADA, HORACHEGADA, AEROPORTOCHEGADA, AEROPORTOCHEGADASIGLA, PORTAOCHEGADA, ESCALASVOO, TARIFAE, TARIFAB, TARIFAF) 
	VALUES (1, '1000', 'Gol Linhas Aéreas Inteligentes S.A', 'PR-GEA', '22/06/2016', '09:38', 'RECIFE - GUARARAPES-GILBERTO FREYRE INTERNATIONAL BRAZIL ', 'REC', 'P05', '22/06/2016', '09:38', 'PORTO ALEGRE - SALGADO FILHO INTERNATIONAL AIRPORT BRAZIL ', 'POA', 'Gate A', 'Viracopos São Paulo', 1200.23, 1450.32, 3500.1);
INSERT INTO DAC.VOO (IDVOO, NUMEROVOO, CIAAEREA, PREFIXO, DATAPARTIDA, HORAPARTIDA, AEROPORTOPARTIDA, AEROPORTOPARTIDASIGLA, PORTAOPARTIDA, DATACHEGADA, HORACHEGADA, AEROPORTOCHEGADA, AEROPORTOCHEGADASIGLA, PORTAOCHEGADA, ESCALASVOO, TARIFAE, TARIFAB, TARIFAF) 
	VALUES (1001, '1001', 'Gol Linhas Aéreas Inteligentes S/A', 'PR-GGV', '25/06/2016', '14:20', 'SAO PAULO - CONGONHAS BRAZIL ', 'CGH', 'P2', '07/06/2016', '14:20', 'RIO DE JANEIRO - GALEAO BRAZIL ', 'GIG', 'Gate 2', 'Sem Escalas.', 440.56, 0.0, 0.0);

-- Insert Aeronave

INSERT INTO DAC.AERONAVE (IDAERONAVE, PREFIXO, SEATECONOMYCLASSE, SEATFIRSTCLASSE, SEATBUSINESCLASSE, MODELO, FABRICANTE, OPERADORA) 
	VALUES (1, 'PR-GEA', 100, 20, 50, 'B737-700', 'Boeing', 'Gol Linhas Aéreas Inteligentes S.A');
INSERT INTO DAC.AERONAVE (IDAERONAVE, PREFIXO, SEATECONOMYCLASSE, SEATFIRSTCLASSE, SEATBUSINESCLASSE, MODELO, FABRICANTE, OPERADORA) 
	VALUES (2, 'PR-GEC', 100, 20, 50, 'B737-700', 'Boeing', 'Gol Linhas Aéreas Inteligentes S/A');
INSERT INTO DAC.AERONAVE (IDAERONAVE, PREFIXO, SEATECONOMYCLASSE, SEATFIRSTCLASSE, SEATBUSINESCLASSE, MODELO, FABRICANTE, OPERADORA) 
	VALUES (3, 'PR-GIF', 100, 20, 50, 'B737-700', 'Boeing', 'Gol Linhas Aéreas Inteligentes S/A');
INSERT INTO DAC.AERONAVE (IDAERONAVE, PREFIXO, SEATECONOMYCLASSE, SEATFIRSTCLASSE, SEATBUSINESCLASSE, MODELO, FABRICANTE, OPERADORA) 
	VALUES (4, 'PR-GIP', 120, 10, 40, 'B737-800', 'Boeing', 'Gol Linhas Aéreas Inteligentes S/A');
INSERT INTO DAC.AERONAVE (IDAERONAVE, PREFIXO, SEATECONOMYCLASSE, SEATFIRSTCLASSE, SEATBUSINESCLASSE, MODELO, FABRICANTE, OPERADORA) 
	VALUES (5, 'PR-GOT', 120, 10, 40, 'B737-800', 'Boeing', 'Gol Linhas Aéreas Inteligentes S/A');
INSERT INTO DAC.AERONAVE (IDAERONAVE, PREFIXO, SEATECONOMYCLASSE, SEATFIRSTCLASSE, SEATBUSINESCLASSE, MODELO, FABRICANTE, OPERADORA) 
	VALUES (6, 'PR-GGA', 120, 10, 40, 'B737-800 SFP', 'Boeing', 'Gol Linhas Aéreas Inteligentes S/A');
INSERT INTO DAC.AERONAVE (IDAERONAVE, PREFIXO, SEATECONOMYCLASSE, SEATFIRSTCLASSE, SEATBUSINESCLASSE, MODELO, FABRICANTE, OPERADORA) 
	VALUES (7, 'PR-GGV', 120, 20, 40, 'B737-800 SFP', 'Boeing', 'Gol Linhas Aéreas Inteligentes S/A');


-- insert Cliente
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (1, 'Mario Almeida', '15/11/1954', 'Largo do Pelourinho', '70', 'Pelourinho', 'Salvador', 'BA', '40026-280', 'baiano@uou.com', '(74)98523-6644', '55.555.555-5', '555.555.555-55');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (1, 'dfsdf', '18/05/2016', 'Rua Maviael Prudente de Souza', '343', 'Vila Mariana', 'São Paulo', 'SP', '04020-010', 'dfafads@gm.com', '(11)11111-1111', '11.111.111-1', '232.323.232-33');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (1, 'dfadsf', '17/05/2016', 'Rua Maviael Prudente de Souza', '', 'Vila Mariana', 'São Paulo', 'SP', '04020-010', 'dkfd@gmail.com', '(11)11111-1111', '11.111.111-1', '082.407.688-51');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (2, 'Daniella Maratz', '27/11/1995', 'Rua Senador Jaguaribe', '29', 'Moura Brasil', 'Fortaleza', 'CE', '60010-010', 'DaniCeara@uol.com', '(50)98989-8989', '22.222.222-2', '222.222.222-22');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (3, 'Mario Sergio', '06/08/1990', 'Rua Engenheiro Portela', '1000', 'Setor Central', 'Anápolis', 'GO', '75024-970', 'MarioSergio@gmail.com', '(11)03030-4050', '99.999.999-9', '999.999.999-90');

-- insert passageiro

INSERT INTO DAC.PASSAGEIRO (IDPASSAGEIRO, NOMEPASSAGEIRO, NASCIMENTOPASSAGEIRO, RGPASSAGEIRO, TELEFONEPASSAGEIRO, EMAILPASSAGEIRO, CONTATONOME, CONTATOTELEFONE, RESPONSAVELFINANCEIRO, RESPONSAVELCPF) 
	VALUES (2, 'Mario Sergio', '06/08/1990', '99.999.999-9', '(11)03030-4050', 'MarioSergio@gmail.com', 'Dona Coisa', '(21)31231-3213', 'Mario Sergio', '999.999.999-90');

