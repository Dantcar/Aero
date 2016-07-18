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
 * @version 0.2
 * @author Décio Antonio de Carvalho
 * @since 06-Junho-2016
 */

/**
 * Método construtor
 * @author Dac
 */
public class Aeronave {
    private String idAeronave;
    private String prefixo;
    private Integer seatEconomyClasse;
    private Integer seatFirstClasse;
    private Integer seatBusinesClasse;
    private String modelo;
    private String fabricante;
    private String operadora;
    private Integer economyCol;
    private Integer firstCol;
    private Integer businesCol;
    private String layout;

    /**
     * Construtor padrão
     */
    public Aeronave() {
    }
    
    /**
     * Metodo construtor
     * @param idAeronave
     * @param prefixo
     * @param seatEconomyClasse
     * @param seatFirstClasse
     * @param seatBusinesClasse
     * @param modelo
     * @param fabricante
     * @param operadora
     * @param economyCol
     * @param firstCol
     * @param businesCol
     * @param layout 
     */
    public Aeronave(String idAeronave, String prefixo, Integer seatEconomyClasse, Integer seatFirstClasse, Integer seatBusinesClasse, String modelo, String fabricante, String operadora, Integer economyCol, Integer firstCol, Integer businesCol, String layout) {
        this.idAeronave = idAeronave;
        this.prefixo = prefixo;
        this.seatEconomyClasse = seatEconomyClasse;
        this.seatFirstClasse = seatFirstClasse;
        this.seatBusinesClasse = seatBusinesClasse;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.operadora = operadora;
        this.economyCol = economyCol;
        this.firstCol = firstCol;
        this.businesCol = businesCol;
        this.layout = layout;
    }

    public String getIdAeronave() {
        return idAeronave;
    }

    public void setIdAeronave(String idAeronave) {
        this.idAeronave = idAeronave;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public Integer getSeatEconomyClasse() {
        return seatEconomyClasse;
    }

    public void setSeatEconomyClasse(Integer seatEconomyClasse) {
        this.seatEconomyClasse = seatEconomyClasse;
    }

    public Integer getSeatFirstClasse() {
        return seatFirstClasse;
    }

    public void setSeatFirstClasse(Integer seatFirstClasse) {
        this.seatFirstClasse = seatFirstClasse;
    }

    public Integer getSeatBusinesClasse() {
        return seatBusinesClasse;
    }

    public void setSeatBusinesClasse(Integer seatBusinesClasse) {
        this.seatBusinesClasse = seatBusinesClasse;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public Integer getEconomyCol() {
        return economyCol;
    }

    public void setEconomyCol(Integer economyCol) {
        this.economyCol = economyCol;
    }

    public Integer getFirstCol() {
        return firstCol;
    }

    public void setFirstCol(Integer firstCol) {
        this.firstCol = firstCol;
    }

    public Integer getBusinesCol() {
        return businesCol;
    }

    public void setBusinesCol(Integer businesCol) {
        this.businesCol = businesCol;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }
     
    


     
    
}//fim classe Aeronave
