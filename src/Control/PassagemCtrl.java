package Control;

/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */


import java.util.ArrayList;
import java.util.List;
import model.Passagem;
import model.PassagemDAO;


/**
 *
 * @author Dac
 */
public class PassagemCtrl {
    
    public void enviarNovaPassagem(Passagem passagem){
        PassagemDAO passagemDAO = new PassagemDAO();
        passagemDAO.inserirNovaPassagem(passagem);
    }
    
    public int receberIdAtual(){
        int resposta;
       PassagemDAO passagemDAO = new PassagemDAO();
        return resposta = passagemDAO.buscarIdPassagemAtual(); 
    }
    
    /**
     * Método buscar se existe passagem fornecendo seu número
     * @param numeroPassagem
     * @return 
     */
    public static boolean receberPesquisarPassagemNumero(String numeroPassagem){
        boolean resposta = false;
        PassagemDAO passagem = new PassagemDAO();
        resposta = passagem.buscarExistePassagemNumero(numeroPassagem);
        return resposta;
    }
    /**
     * Método para controlar a busca de uma passagem
     * @param numeroPassagem
     * @return 
     */
    public static Passagem receberPassagemNumero(String numeroPassagem){
        PassagemDAO passDAO = new PassagemDAO();
        Passagem passagem = passDAO.buscarPassagemNumero(numeroPassagem);
    return passagem;
    }
    
    /**
     * Método para controlar a alteração de uma passagem
     * @param passagem
     * @param numeroPassagem 
     */
    public void alterarPassagemCtrl(Passagem passagem, String numeroPassagem){
        PassagemDAO passDAO = new PassagemDAO();
        passDAO.alterarPassagem(passagem, numeroPassagem);
    }
    
    /**
     * Método para controlar a exclusão de uma passagem pelo número dela.
     * @param passagem
     * @param numeroPassagem 
     */
    public void deletarPassagemCtrl(String numeroPassagem){
        PassagemDAO passDAO = new PassagemDAO();
        passDAO.deletarPassagem(numeroPassagem);
    }

    public int receberNumeroPassagem() {
        int resposta;
        PassagemDAO passagemDAO = new PassagemDAO();
        return resposta = passagemDAO.buscarNumPassagemAtual();
    }

    public float recebeValorClasseVoo(String disponivel) {
        float resposta;
        PassagemDAO passagemDAO = new PassagemDAO();
        return resposta = passagemDAO.buscarValorPassagemVoo();
    }
    
    public ArrayList populaComboNumeroPassagem(){
        ArrayList lista;
        PassagemDAO passagemDAO = new PassagemDAO();
        return lista = passagemDAO.findComboNumeroPassagem();
    }
    
    public ArrayList populaComboGenerico(String campo){
        ArrayList lista;
        PassagemDAO passagemDAO = new PassagemDAO();
        return lista = passagemDAO.findComboGenericoPassagem(campo);
    }

    public List<Passagem>   receberListaPassagens(){
       PassagemDAO passDAO = new PassagemDAO();
       List<Passagem> lista = passDAO.listarPassagens();
       return lista;    
    }
    public List<Passagem> listarPassagens() {
        PassagemDAO passDAO = new PassagemDAO();
        List<Passagem> lista = passDAO.listarPassagens();
        return lista;
    }
     public List<Passagem> listarPassagemNumero(String numero) {
        PassagemDAO passDAO = new PassagemDAO();
        List<Passagem> lista = passDAO.listarPassagem(numero);
        return lista;
    }
      public List<Passagem> listarPassagemNome(String nome) {
        PassagemDAO passDAO = new PassagemDAO();
        List<Passagem> lista = passDAO.listarPassagemNome(nome);
        return lista;
    }

    public ArrayList populaComboNomePassagem() {
       ArrayList lista;
        PassagemDAO passagemDAO = new PassagemDAO();
        return lista = passagemDAO.findComboNomePassageiro();
        
        
    }
}
