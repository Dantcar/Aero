/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Julho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package model;

/**
 *
 * @author deciodecarvalho
 */
public class AssentoAeronave {
    
    private String numVoo;
    private int economicaAssentos;
    private int businessAssentos;
    private int firstAssentos;
    private String fullVooAssentos;
    private String vagosVooAssentos;
    private String reservadosVooAssentos;
    private String totalAssentos;
    

    public AssentoAeronave() {
    }

    public AssentoAeronave(String numVoo, int economicaAssentos, int businessAssentos, int firstAssentos, String fullVooAssentos, String vagosVooAssentos, String reservadosVooAssentos, String totalAssentos) {
        this.numVoo = numVoo;
        this.economicaAssentos = economicaAssentos;
        this.businessAssentos = businessAssentos;
        this.firstAssentos = firstAssentos;
        this.fullVooAssentos = fullVooAssentos;
        this.vagosVooAssentos = vagosVooAssentos;
        this.reservadosVooAssentos = reservadosVooAssentos;
        this.totalAssentos = totalAssentos;
    }

    public String getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(String numVoo) {
        this.numVoo = numVoo;
    }

    public int getEconomicaAssentos() {
        return economicaAssentos;
    }

    public void setEconomicaAssentos(int economicaAssentos) {
        this.economicaAssentos = economicaAssentos;
    }

    public int getBusinessAssentos() {
        return businessAssentos;
    }

    public void setBusinessAssentos(int businessAssentos) {
        this.businessAssentos = businessAssentos;
    }

    public int getFirstAssentos() {
        return firstAssentos;
    }

    public void setFirstAssentos(int firstAssentos) {
        this.firstAssentos = firstAssentos;
    }

    public String getFullVooAssentos() {
        return fullVooAssentos;
    }

    public void setFullVooAssentos(String fullVooAssentos) {
        this.fullVooAssentos = fullVooAssentos;
    }

    public String getVagosVooAssentos() {
        return vagosVooAssentos;
    }

    public void setVagosVooAssentos(String vagosVooAssentos) {
        this.vagosVooAssentos = vagosVooAssentos;
    }

    public String getReservadosVooAssentos() {
        return reservadosVooAssentos;
    }

    public void setReservadosVooAssentos(String reservadosVooAssentos) {
        this.reservadosVooAssentos = reservadosVooAssentos;
    }

    public String getTotalAssentos() {
        return totalAssentos;
    }

    public void setTotalAssentos(String totalAssentos) {
        this.totalAssentos = totalAssentos;
    }

    
}
