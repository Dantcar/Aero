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

    /**
     * Construtor padrão
     */
    public Aeronave() {
    }
     
     /**
     * Método construtor 
     * @param idAeronave
     * @param prefixo
     * @param seatEconomyClasse
     * @param seatFirstClasse
     * @param seatBusinesClasse
     * @param modelo
     * @param fabricante
     * @param operadora 
     */
    public Aeronave(String idAeronave, String prefixo, Integer seatEconomyClasse, Integer seatFirstClasse, Integer seatBusinesClasse, String modelo, String fabricante, String operadora) {
        this.idAeronave = idAeronave;
        this.prefixo = prefixo;
        this.seatEconomyClasse = seatEconomyClasse;
        this.seatFirstClasse = seatFirstClasse;
        this.seatBusinesClasse = seatBusinesClasse;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.operadora = operadora;
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

     
    
}//fim classe Aeronave
