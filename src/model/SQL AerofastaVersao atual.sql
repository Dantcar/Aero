-- select * from DAC.AERONAVE;
--DROP TABLE CLIENTE
CREATE TABLE CLIENTE (
idCliente int not null, 
nome VARCHAR(60)not null,
nascimento VARCHAR(8)not null,
endereco VARCHAR(60)not null,
numero VARCHAR(30)not null,
bairro VARCHAR(60)not null,
cidade VARCHAR(60)not null,
uf VARCHAR(2)not null,
cep VARCHAR(8)not null,
email VARCHAR(60)not null,
telefone VARCHAR(15)not null,
RG VARCHAR(12),
CPF VARCHAR(14)not null primary key
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
dataPagamento VARCHAR(8) not null,
nomePagador VARCHAR(60) not null,
rgPagador VARCHAR(12) not null,
cpfPagador VARCHAR(14)not null primary key,
vlTotal float,
formaPagamento VARCHAR(20)not null,
referenciaPagamento VARCHAR(20) not null
)

-- DROPE TABLE PASSAGEIRO
CREATE TABLE PASSAGEIRO(
idPassageiro int not null,
nomePassageiro VARCHAR(60) not null,
nascimentoPassageiro VARCHAR(8) not null,
rgPassageiro VARCHAR(12) not null primary key,
telefonePassageiro VARCHAR(15) not null,
emailPassageiro VARCHAR(8) not null,
contatoNome VARCHAR(8) not null,
contatoTelefone VARCHAR(15) not null,
responsavelFinanceiro VARCHAR(60) not null,
responsavelCPF VARCHAR(14) not null
)

-- DROP TABLE PASSAGEM
CREATE TABLE PASSAGEM(
    idPassagem int not null,
    NumeroPassagem VARCHAR(20) not null primary key,
    nomePassageiro VARCHAR(60) not null,
    rgPassageiro VARCHAR(12) not null,
    reserva VARCHAR(12) not null,
    vooNumero VARCHAR(12) not null,
    CiaAerea VARCHAR(60) not null,
    assentoNumero VARCHAR(4) not null,
    classe VARCHAR(17) not null,
    tarifa float,
    dataPassagem VARCHAR(8) not null,
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
    EscalasVoo VARCHAR(60) not null
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


