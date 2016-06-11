package Control;

/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */


import model.Passagem;
import model.PassagemDAO;


/**
 *
 * @author Dac
 */
public class PassagemCtrl {
      
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
    
    public static Passagem receberPassagemNumero(String numeroPassagem){
        PassagemDAO passDAO = new PassagemDAO();
        Passagem passagem = passDAO.buscarPassagemNumero(numeroPassagem);
    return passagem;
    }
    
    public void alterarPassagemCtrl(Passagem passagem, String numeroPassagem){
        PassagemDAO passDAO = new PassagemDAO();
        passDAO.alterarPassagem(passagem, numeroPassagem);
    }
    
    public void deletarPassagemCtrl(Passagem passagem, String numeroPassagem){
        PassagemDAO passDAO = new PassagemDAO();
        passDAO.deletarPassagem(passagem, numeroPassagem);
    }
    
}
