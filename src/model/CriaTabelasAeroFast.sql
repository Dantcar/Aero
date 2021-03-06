-- REVISÃO 30-MAIO-2016
-- CURRENT SQLID
-- select * from DAC.AERONAVE;
--DROP TABLE CLIENTE       --Tabela 1
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
telefone VARCHAR(18)not null,
RG VARCHAR(16)not null,
CPF VARCHAR(18)not null primary key
)

-- DROP TABLE aeronave      --Tabela 2
CREATE TABLE AERONAVE(
idAeronave int not null,
prefixo VARCHAR(12)not null primary key,
seatEconomyClasse int not null,
seatFirstClasse int not null,
seatBusinesClasse int not null,
modelo VARCHAR(50) not null,
fabricante VARCHAR(50) not null
)


-- DROP TABLE ENDCEP     --Tabela 3
CREATE TABLE endcep(
idCep int not null,
endereco VARCHAR(60)not null,
complemento VARCHAR(60)not null,
bairro VARCHAR(60)not null,
cidade VARCHAR(60)not null,
uf VARCHAR(2)not null,
cep VARCHAR(10)not null primary key
)

-- DROP TABLE PAGAMENTO      --Tabela 4
CREATE TABLE PAGAMENTO(
idPagamento int not null,
dataPagamento VARCHAR(10) not null,
nomePagador VARCHAR(60) not null,
rgPagador VARCHAR(16) not null,
cpfPagador VARCHAR(18)not null primary key,
vlTotal float,
formaPagamento VARCHAR(20)not null,
referenciaPagamento VARCHAR(20) not null
)
 
-- DROP TABLE PASSAGEIRO      --Tabela 5
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

-- DROP TABLE PASSAGEM     --Tabela 6
CREATE TABLE PASSAGEM(
    idPassagem int not null,
    NumeroPassagem VARCHAR(20) not null primary key,
    nomePassageiro VARCHAR(60) not null,
    rgPassageiro VARCHAR(16) not null,
    reserva VARCHAR(14) not null,
    vooNumero VARCHAR(14) not null,
    CiaAerea VARCHAR(20) not null,
    assentoNumero VARCHAR(4) not null,
    classe VARCHAR(20) not null,
    tarifa float,
    dataPassagem VARCHAR(10) not null,
    partidaAeroporto VARCHAR(30) not null,
    partidaSiglaAeroporto VARCHAR(10) not null,
    partidaData VARCHAR(10) not null,
    partidaHora VARCHAR(10) not null,
    partidaPortao VARCHAR(10) not null,
    chegadaAeroporto VARCHAR(10) not null,
    chegadaSiglaAeroporto VARCHAR(30) not null,
    chegadaData VARCHAR(10) not null,
    chegadaHora VARCHAR(10) not null,
    chegadaPortao VARCHAR(10) not null,   
    EscalasVoo VARCHAR(60) not null
)

-- DROP TABLE VOO     --Tabela 7
CREATE TABLE VOO(
    idVoo  int not null,
    numeroVoo  VARCHAR(14) not null,
    ciaAerea  VARCHAR(20) not null,
    prefixoAeronaveVoo VARCHAR(12) not null,
    dataPartida  VARCHAR(10) not null,
    horaPartida  VARCHAR(10) not null,
    aeroportoPartida  VARCHAR(30) not null,
    aeroportoPartidaSigla  VARCHAR(10) not null,
    portaoPartida  VARCHAR(10) not null,
    dataChegada  VARCHAR(10) not null,
    horaChegada  VARCHAR(10) not null,
    aeroportoChegada  VARCHAR(30) not null,
    aeroportoChegadaSigla  VARCHAR(10) not null,
    portaoChegada  VARCHAR(10) not null,
    escalasVoo  VARCHAR(60) not null, 
    tarifaE  float,
    tarifaB  float,
    tarifaF  float
)
---Classes Model AeroFast


/*
public class Cliente {
   private String idCliente
   private String nome;
   private String nascimento;
   private String Endereco;
   private String Numero;
   private String Bairro;
   private String cidade;
   private String uf;
   private String cep;
   private String email;
   private String telefone;
   private String rg;
   private String cpf;
*/

/*
public class Aeronave {
    String idAeronave;
    String prefixo;
    int seatEconomyClasse;
    int seatFirstClasse;
    int seatBusinesClasse;
    String modelo;
    String fabricante;
*/

/*
public class EndCep {
 private String endereco;
   private String bairro;
   private String complemento;
   private String cidade;
   private String uf;
   private String cep; 
*/

/*
public class Pagamento {
  private String idPagamento;
  private String dataPagamento;
  private String nomePagador;
  private String rgPagador;
  private String cpfPagador;
  private float vlTotal;
  private String formaPagamento;
  private String referenciaPagamento;
*/

/*
public class Passageiro {
private String idPassageiro;
private String nomePassageiro;
private String nascimentoPassageiro;
private String rgPassageiro;
private String telefonePassageiro;
private String emailPassageiro;
private String contatoNome;
private String contatoTelefone;
private String responsavelFinanceiro;
private String responsavelCPF;
*/

/*
public class Passagem {
  private String idPassagem;
  private String NumeroPassagem;        //<=== Número Passagem
  private String nomePassageiro;        //<=== buscar em Passageiro
  private String rgPassageiro;          //<=== Buscar em Passageiro
  private String reserva;               //<=== 
  private String vooNumero;             //<=== buscar em voo Partida
  private String CiaAerea;              //<=== 
  private String assentoNumero;         //<=== buscar em Aeronave
  private String classe;                //<=== buscar em avião
  private String tarifa;                //<=== buscar em Voo
  private String dataPassagem;          //<== DataPartida buscar em voo
  private String partidaAeroporto;      //<=== Aeroporto Partida buscar em voo 
  private String partidaSiglaAeroporto; //<=== Aeroporto Partida buscar em voo
  private String partidaData;           //<=== Data Partida buscar em Voo
  private String partidaHora;           //<=== Hora Partida buscar em voo
  private String partidaPortao;         //<=== Portao Partida buscar em Voo
  private String chegadaAeroporto;      //<=== Aeroporto Chegada buscar em voo
  private String chegadaSiglaAeroporto; //<=== Aeroporto Partida buscar em voo
  private String chegadaData;           //<=== Data Chegada buscar em Voo
  private String chegadaHora;           //<=== Hora Chegada buscar em Voo
  private String chegadaPortao;         //<=== Portao Partida buscar em Voo       
  private String EscalasVoo;            //<=== Escalas buscar em Voo
*/
/*
public class Voo {
  private String idVoo;
  private String numeroVoo;
  private String ciaAerea;
  private String dataPartida;
  private String horaPartida;
  private String aeroportoPartida;
  private String aeroportoPartidaSigla;
  private String portaoPartida;
  private String dataChegada;
  private String horaChegada;
  private String aeroportoChegada;
  private String aeroportoChegadaSigla;
  private String portaoChegada;
  private String escalasVoo; 
  private String tarifaE;
  private String tarifaB;
  private String tarifaF;
*/
