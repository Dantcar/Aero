/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package Control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Voo;
import model.VooDAO;

/**
 * @version 0.1
 * @author Dac
 */
public class VooCtrl {
 
    public static boolean receberExisteVooNumero(String vooNumero){
        boolean resposta = false;
        VooDAO vooDAO = new VooDAO();
        resposta = vooDAO.buscarExisteVooNumero(vooNumero);
        return resposta;
    }
    
    public Voo receberVooNumero(String vooNumero){
       VooDAO vooDAO = new VooDAO();
       Voo voo = vooDAO.buscarVooNumero(vooNumero);
       return voo;
    }
    
    public void enviarNovoVoo(Voo voo){
        VooDAO vooDAO = new VooDAO();
        vooDAO.inserirVoo(voo);
    }
    
    public void alterarVooCtrl(Voo voo, String vooNumero){
       VooDAO vooDAO = new VooDAO();
       vooDAO.alterarVoo(voo, vooNumero);   
    }
    
    public void deletarVooCtrl(Voo voo, String vooNumero){
       VooDAO vooDAO = new VooDAO();
       vooDAO.deletarVoo(voo, vooNumero);
    }
    
    public static int receberNumeroVoo(){
        VooDAO vooDAO = new VooDAO();
        return vooDAO.buscarNumeroVoo();
    }
    
    public ArrayList populaComboVooNumero(){
        ArrayList lista;
        VooDAO vooDAO = new VooDAO();
        return lista = vooDAO.listarVooNumero();
    }
    
    public List<Voo> listaVoo(){
        VooDAO vooDAO = new VooDAO();
        List<Voo> lista = vooDAO.listarVoos();
        return lista;
    }
      
  
}//Final da Classe VooCtrl
