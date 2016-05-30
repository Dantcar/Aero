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
 * @version 0.4
 * @author Décio Antonio de Carvalho
 * @since 23-Maio-2016
 */


public class Voo {
  private String idVoo;
  private String numeroVoo;
  private String ciaAerea;
  private String prefixoAeronaveVoo;
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
    public Voo() {
    }

    /**
     * Método Construtor VOO
     * @param idVoo
     * @param numeroVoo
     * @param ciaAerea
     * @param prefixoAeronaveVoo
     * @param dataPartida
     * @param horaPartida
     * @param aeroportoPartida
     * @param aeroportoPartidaSigla
     * @param portaoPartida
     * @param dataChegada
     * @param horaChegada
     * @param aeroportoChegada
     * @param aeroportoChegadaSigla
     * @param portaoChegada
     * @param escalasVoo
     * @param tarifaE
     * @param tarifaB
     * @param tarifaF 
     */
    public Voo(String idVoo, String numeroVoo, String ciaAerea, String prefixoAeronaveVoo, String dataPartida, String horaPartida, String aeroportoPartida, String aeroportoPartidaSigla, String portaoPartida, String dataChegada, String horaChegada, String aeroportoChegada, String aeroportoChegadaSigla, String portaoChegada, String escalasVoo, String tarifaE, String tarifaB, String tarifaF) {
        this.idVoo = idVoo;
        this.numeroVoo = numeroVoo;
        this.ciaAerea = ciaAerea;
        this.prefixoAeronaveVoo = prefixoAeronaveVoo;
        this.dataPartida = dataPartida;
        this.horaPartida = horaPartida;
        this.aeroportoPartida = aeroportoPartida;
        this.aeroportoPartidaSigla = aeroportoPartidaSigla;
        this.portaoPartida = portaoPartida;
        this.dataChegada = dataChegada;
        this.horaChegada = horaChegada;
        this.aeroportoChegada = aeroportoChegada;
        this.aeroportoChegadaSigla = aeroportoChegadaSigla;
        this.portaoChegada = portaoChegada;
        this.escalasVoo = escalasVoo;
        this.tarifaE = tarifaE;
        this.tarifaB = tarifaB;
        this.tarifaF = tarifaF;
    }

    public String getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(String idVoo) {
        this.idVoo = idVoo;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getCiaAerea() {
        return ciaAerea;
    }

    public void setCiaAerea(String ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public String getPrefixoAeronaveVoo() {
        return prefixoAeronaveVoo;
    }

    public void setPrefixoAeronaveVoo(String prefixoAeronaveVoo) {
        this.prefixoAeronaveVoo = prefixoAeronaveVoo;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getAeroportoPartida() {
        return aeroportoPartida;
    }

    public void setAeroportoPartida(String aeroportoPartida) {
        this.aeroportoPartida = aeroportoPartida;
    }

    public String getAeroportoPartidaSigla() {
        return aeroportoPartidaSigla;
    }

    public void setAeroportoPartidaSigla(String aeroportoPartidaSigla) {
        this.aeroportoPartidaSigla = aeroportoPartidaSigla;
    }

    public String getPortaoPartida() {
        return portaoPartida;
    }

    public void setPortaoPartida(String portaoPartida) {
        this.portaoPartida = portaoPartida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public String getAeroportoChegada() {
        return aeroportoChegada;
    }

    public void setAeroportoChegada(String aeroportoChegada) {
        this.aeroportoChegada = aeroportoChegada;
    }

    public String getAeroportoChegadaSigla() {
        return aeroportoChegadaSigla;
    }

    public void setAeroportoChegadaSigla(String aeroportoChegadaSigla) {
        this.aeroportoChegadaSigla = aeroportoChegadaSigla;
    }

    public String getPortaoChegada() {
        return portaoChegada;
    }

    public void setPortaoChegada(String portaoChegada) {
        this.portaoChegada = portaoChegada;
    }

    public String getEscalasVoo() {
        return escalasVoo;
    }

    public void setEscalasVoo(String escalasVoo) {
        this.escalasVoo = escalasVoo;
    }

    public String getTarifaE() {
        return tarifaE;
    }

    public void setTarifaE(String tarifaE) {
        this.tarifaE = tarifaE;
    }

    public String getTarifaB() {
        return tarifaB;
    }

    public void setTarifaB(String tarifaB) {
        this.tarifaB = tarifaB;
    }

    public String getTarifaF() {
        return tarifaF;
    }

    public void setTarifaF(String tarifaF) {
        this.tarifaF = tarifaF;
    }

    
    
}