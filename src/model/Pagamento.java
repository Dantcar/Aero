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
public class Pagamento {
  private String idPagamento;
  private String dataPagamento;
  private String nomePagador;
  private String rgPagador;
  private String cpfPagador;
  private float vlTotal;
  private String formaPagamento;
  private String referenciaPagamento;

    public Pagamento() {
    }
/**
 * 
 * @param idPagamento
 * @param dataPagamento
 * @param nomePagador
 * @param rgPagador
 * @param cpfPagador
 * @param vlTotal
 * @param formaPagamento
 * @param referenciaPagamento 
 */
    public Pagamento(String idPagamento, String dataPagamento, String nomePagador, 
        String rgPagador, String cpfPagador, float vlTotal, String formaPagamento, 
        String referenciaPagamento) {
        
        this.idPagamento = idPagamento;
        this.dataPagamento = dataPagamento;
        this.nomePagador = nomePagador;
        this.rgPagador = rgPagador;
        this.cpfPagador = cpfPagador;
        this.vlTotal = vlTotal;
        this.formaPagamento = formaPagamento;
        this.referenciaPagamento = referenciaPagamento;
    }

    public String getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(String idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getNomePagador() {
        return nomePagador;
    }

    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }

    public String getRgPagador() {
        return rgPagador;
    }

    public void setRgPagador(String rgPagador) {
        this.rgPagador = rgPagador;
    }

    public String getCpfPagador() {
        return cpfPagador;
    }

    public void setCpfPagador(String cpfPagador) {
        this.cpfPagador = cpfPagador;
    }

    public float getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(float vlTotal) {
        this.vlTotal = vlTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getReferenciaPagamento() {
        return referenciaPagamento;
    }

    public void setReferenciaPagamento(String referenciaPagamento) {
        this.referenciaPagamento = referenciaPagamento;
    }
    
  
}
