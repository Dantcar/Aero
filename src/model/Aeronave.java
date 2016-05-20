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
 * @since 09-abr-2016
 */
public class Aeronave {
    String idAeronave;
    String prefixo;
    int seatEconomyClasse;
    int seatFirstClasse;
    int seatBusinesClasse;
    String modelo;
    String fabricante;

    public Aeronave() {
    }

    
    /**
     *
     * @param idAeronave
     * @param prefixo
     * @param seatEconomyClasse
     * @param seatFirstClasse
     * @param seatBusinesClasse
     * @param Modelo
     * @param fabricante
     */
    public Aeronave(String idAeronave, String prefixo, int seatEconomyClasse, int seatFirstClasse, int seatBusinesClasse, String Modelo, String fabricante) {
        this.idAeronave = idAeronave;
        this.prefixo = prefixo;
        this.seatEconomyClasse = seatEconomyClasse;
        this.seatFirstClasse = seatFirstClasse;
        this.seatBusinesClasse = seatBusinesClasse;
        this.modelo = Modelo;
        this.fabricante = fabricante;
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

    public int getSeatEconomyClasse() {
        return seatEconomyClasse;
    }

    public void setSeatEconomyClasse(int seatEconomyClasse) {
        this.seatEconomyClasse = seatEconomyClasse;
    }

    public int getSeatFirstClasse() {
        return seatFirstClasse;
    }

    public void setSeatFirstClasse(int seatFirstClasse) {
        this.seatFirstClasse = seatFirstClasse;
    }

    public int getSeatBusinesClasse() {
        return seatBusinesClasse;
    }

    public void setSeatBusinesClasse(int seatBusinesClasse) {
        this.seatBusinesClasse = seatBusinesClasse;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
          
}//fim classe Aeronave
