
-- CURRENT SQLID

-- DROP TABLE CLIENTE
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
fabricante VARCHAR(50)
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

 
---Classes Model AeroFast
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
public class Cliente {
   private String idCliente;
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