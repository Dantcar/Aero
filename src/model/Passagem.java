/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programacao Orientada a Objetos - Avancada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package model;

/**
 * @version 0.1
 * @author Décio Antonio de Carvalho
 * @since 13- Junho-2016
 */
public class Passagem {
  private String idPassagem;            //<== id                                1
  private String NumeroPassagem;        //<=== Número Passagem                  2
  private String nomePassageiro;        //<=== buscar em Passageiro             3
  private String rgPassageiro;          //<=== Buscar em Passageiro             4
  private String reserva;               //<=== reserva                          5
  private String vooNumero;             //<=== buscar em voo Partida            6
  private String CiaAerea;              //<=== Companhia Aérea                  7
  private String assentoNumero;         //<=== buscar em Aeronave               8
  private String classe;                //<=== buscar em avião                  9
  private String tarifa;                //<=== buscar em Voo                    10
  private String dataPassagem;          //<== DataPartida buscar em voo         11
  private String partidaAeroporto;      //<=== Aeroporto Partida buscar em voo  12 
  private String partidaSiglaAeroporto; //<=== Aeroporto Partida buscar em voo  13
  private String partidaData;           //<=== Data Partida buscar em Voo       14
  private String partidaHora;           //<=== Hora Partida buscar em voo       15
  private String partidaPortao;         //<=== Portao Partida buscar em Voo     16
  private String chegadaAeroporto;      //<=== Aeroporto Chegada buscar em voo  17
  private String chegadaSiglaAeroporto; //<=== Aeroporto Partida buscar em voo  18
  private String chegadaData;           //<=== Data Chegada buscar em Voo       19
  private String chegadaHora;           //<=== Hora Chegada buscar em Voo       20
  private String chegadaPortao;         //<=== Portao Partida buscar em Voo     21      
  private String EscalasVoo;            //<=== Escalas buscar em Voo            22
  private String ObservacaoPassagem;

    
  
  /**
   * Construtor Padrao
   */
    public Passagem() {
    }
    /**
     * 
     * @param idPassagem
     * @param NumeroPassagem
     * @param nomePassageiro
     * @param rgPassageiro
     * @param reserva
     * @param vooNumero
     * @param CiaAerea
     * @param assentoNumero
     * @param classe
     * @param tarifa
     * @param dataPassagem
     * @param partidaAeroporto
     * @param partidaSiglaAeroporto
     * @param partidaData
     * @param partidaHora
     * @param partidaPortao
     * @param chegadaAeroporto
     * @param chegadaSiglaAeroporto
     * @param chegadaData
     * @param chegadaHora
     * @param chegadaPortao
     * @param EscalasVoo
     * @param ObservacaoPassagem 
     */
    public Passagem(String idPassagem, String NumeroPassagem, String nomePassageiro, String rgPassageiro, String reserva, String vooNumero, String CiaAerea, String assentoNumero, String classe, String tarifa, String dataPassagem, String partidaAeroporto, String partidaSiglaAeroporto, String partidaData, String partidaHora, String partidaPortao, String chegadaAeroporto, String chegadaSiglaAeroporto, String chegadaData, String chegadaHora, String chegadaPortao, String EscalasVoo, String ObservacaoPassagem) {
        this.idPassagem = idPassagem;
        this.NumeroPassagem = NumeroPassagem;
        this.nomePassageiro = nomePassageiro;
        this.rgPassageiro = rgPassageiro;
        this.reserva = reserva;
        this.vooNumero = vooNumero;
        this.CiaAerea = CiaAerea;
        this.assentoNumero = assentoNumero;
        this.classe = classe;
        this.tarifa = tarifa;
        this.dataPassagem = dataPassagem;
        this.partidaAeroporto = partidaAeroporto;
        this.partidaSiglaAeroporto = partidaSiglaAeroporto;
        this.partidaData = partidaData;
        this.partidaHora = partidaHora;
        this.partidaPortao = partidaPortao;
        this.chegadaAeroporto = chegadaAeroporto;
        this.chegadaSiglaAeroporto = chegadaSiglaAeroporto;
        this.chegadaData = chegadaData;
        this.chegadaHora = chegadaHora;
        this.chegadaPortao = chegadaPortao;
        this.EscalasVoo = EscalasVoo;
        this.ObservacaoPassagem = ObservacaoPassagem;
    }
    
    
    
    public String getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(String idPassagem) {
        this.idPassagem = idPassagem;
    }

    public String getNumeroPassagem() {
        return NumeroPassagem;
    }

    public void setNumeroPassagem(String NumeroPassagem) {
        this.NumeroPassagem = NumeroPassagem;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getRgPassageiro() {
        return rgPassageiro;
    }

    public void setRgPassageiro(String rgPassageiro) {
        this.rgPassageiro = rgPassageiro;
    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public String getVooNumero() {
        return vooNumero;
    }

    public void setVooNumero(String vooNumero) {
        this.vooNumero = vooNumero;
    }

    public String getCiaAerea() {
        return CiaAerea;
    }

    public void setCiaAerea(String CiaAerea) {
        this.CiaAerea = CiaAerea;
    }

    public String getAssentoNumero() {
        return assentoNumero;
    }

    public void setAssentoNumero(String assentoNumero) {
        this.assentoNumero = assentoNumero;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getDataPassagem() {
        return dataPassagem;
    }

    public void setDataPassagem(String dataPassagem) {
        this.dataPassagem = dataPassagem;
    }

    public String getPartidaAeroporto() {
        return partidaAeroporto;
    }

    public void setPartidaAeroporto(String partidaAeroporto) {
        this.partidaAeroporto = partidaAeroporto;
    }

    public String getPartidaSiglaAeroporto() {
        return partidaSiglaAeroporto;
    }

    public void setPartidaSiglaAeroporto(String partidaSiglaAeroporto) {
        this.partidaSiglaAeroporto = partidaSiglaAeroporto;
    }

    public String getPartidaData() {
        return partidaData;
    }

    public void setPartidaData(String partidaData) {
        this.partidaData = partidaData;
    }

    public String getPartidaHora() {
        return partidaHora;
    }

    public void setPartidaHora(String partidaHora) {
        this.partidaHora = partidaHora;
    }

    public String getPartidaPortao() {
        return partidaPortao;
    }

    public void setPartidaPortao(String partidaPortao) {
        this.partidaPortao = partidaPortao;
    }

    public String getChegadaAeroporto() {
        return chegadaAeroporto;
    }

    public void setChegadaAeroporto(String chegadaAeroporto) {
        this.chegadaAeroporto = chegadaAeroporto;
    }

    public String getChegadaSiglaAeroporto() {
        return chegadaSiglaAeroporto;
    }

    public void setChegadaSiglaAeroporto(String chegadaSiglaAeroporto) {
        this.chegadaSiglaAeroporto = chegadaSiglaAeroporto;
    }

    public String getChegadaData() {
        return chegadaData;
    }

    public void setChegadaData(String chegadaData) {
        this.chegadaData = chegadaData;
    }

    public String getChegadaHora() {
        return chegadaHora;
    }

    public void setChegadaHora(String chegadaHora) {
        this.chegadaHora = chegadaHora;
    }

    public String getChegadaPortao() {
        return chegadaPortao;
    }

    public void setChegadaPortao(String chegadaPortao) {
        this.chegadaPortao = chegadaPortao;
    }

    public String getEscalasVoo() {
        return EscalasVoo;
    }

    public void setEscalasVoo(String EscalasVoo) {
        this.EscalasVoo = EscalasVoo;
    }

    public String getObservacaoPassagem() {
        return ObservacaoPassagem;
    }

    public void setObservacaoPassagem(String ObservacaoPassagem) {
        this.ObservacaoPassagem = ObservacaoPassagem;
    }

    
}//Fim Classe Passagem
