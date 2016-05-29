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
 *
 * @author Dac
 */
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
public static int vidCliente;

    public Passageiro() {
    }

    /**
     * 
     * @param idPassageiro
     * @param nomePassageiro
     * @param nascimentoPassageiro
     * @param rgPassageiro
     * @param telefonePassageiro
     * @param emailPassageiro
     * @param contatoNome
     * @param contatoTelefone
     * @param responsavelFinanceiro
     * @param responsavelCPF 
     */
    public Passageiro(String idPassageiro, String nomePassageiro, String nascimentoPassageiro, String rgPassageiro, String telefonePassageiro, String emailPassageiro, String contatoNome, String contatoTelefone, String responsavelFinanceiro, String responsavelCPF) {
        this.idPassageiro = idPassageiro;
        this.nomePassageiro = nomePassageiro;
        this.nascimentoPassageiro = nascimentoPassageiro;
        this.rgPassageiro = rgPassageiro;
        this.telefonePassageiro = telefonePassageiro;
        this.emailPassageiro = emailPassageiro;
        this.contatoNome = contatoNome;
        this.contatoTelefone = contatoTelefone;
        this.responsavelFinanceiro = responsavelFinanceiro;
        this.responsavelCPF = responsavelCPF;
    }

    public String getIdPassageiro() {
        return idPassageiro;
    }

    public void setIdPassageiro(String idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getNascimentoPassageiro() {
        return nascimentoPassageiro;
    }

    public void setNascimentoPassageiro(String nascimentoPassageiro) {
        this.nascimentoPassageiro = nascimentoPassageiro;
    }

    public String getRgPassageiro() {
        return rgPassageiro;
    }

    public void setRgPassageiro(String rgPassageiro) {
        this.rgPassageiro = rgPassageiro;
    }

    public String getTelefonePassageiro() {
        return telefonePassageiro;
    }

    public void setTelefonePassageiro(String telefonePassageiro) {
        this.telefonePassageiro = telefonePassageiro;
    }

    public String getEmailPassageiro() {
        return emailPassageiro;
    }

    public void setEmailPassageiro(String emailPassageiro) {
        this.emailPassageiro = emailPassageiro;
    }

    public String getContatoNome() {
        return contatoNome;
    }

    public void setContatoNome(String contatoNome) {
        this.contatoNome = contatoNome;
    }

    public String getContatoTelefone() {
        return contatoTelefone;
    }

    public void setContatoTelefone(String contatoTelefone) {
        this.contatoTelefone = contatoTelefone;
    }

    public String getResponsavelFinanceiro() {
        return responsavelFinanceiro;
    }

    public void setResponsavelFinanceiro(String responsavelFinanceiro) {
        this.responsavelFinanceiro = responsavelFinanceiro;
    }

    public String getResponsavelCPF() {
        return responsavelCPF;
    }

    public void setResponsavelCPF(String responsavelCPF) {
        this.responsavelCPF = responsavelCPF;
    }
   
}

