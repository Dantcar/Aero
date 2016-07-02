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
import model.Aeronave;
import model.AeronaveDAO;

/**
 *
 * @author Dac
 */
public class AeronaveCtrl {
    
  /**
   * Método controle receber consulta Aeronave atravéz do envio do prefixo.
   * @param prefixo
   * @return 
   */
    public static boolean receberPesquisarAeronavePrefixo(String prefixo) {
        boolean resposta = false;
        AeronaveDAO aeronave = new AeronaveDAO();
        resposta = aeronave.buscarExisteAeronavePrefixo(prefixo);
        return resposta;
    }

     /**
      * Método para controlar inserir nova aeronave
      * @param aeronave 
      */ 
     public void receberAeronave(Aeronave aeronave){
        AeronaveDAO aeroDAO = new AeronaveDAO();
        aeroDAO.inserirNovaAeronave(aeronave);
    }
    
    public static Aeronave receberAeronavePrefixo(String prefixo){
        AeronaveDAO aeroDAO = new AeronaveDAO();
        Aeronave aeronave = aeroDAO.buscarAeronavePrefixo(prefixo);
        //System.out.println("Estamos no método do controle receberClienteRG em PassageiroCtrl " + rg + "\n");
        //System.out.println("nome " + cliente.getNome() + "\n");
        //System.out.println("Nascimento " + cliente.getNascimento() + "\n");
        return aeronave;
    }
    
    public void alterarAeronaveCtrl(Aeronave aeronave, String prefixo){
        AeronaveDAO aeroDAO = new AeronaveDAO();
        aeroDAO.alterarAeronave(aeronave, prefixo);
    }
    
    public void deletarAeronaveCtrl(Aeronave aeronave, String prefixo){
       AeronaveDAO aeroDAO = new AeronaveDAO();
       aeroDAO.deletarAeronave(aeronave, prefixo);
        
    }
    
    public ArrayList populaComboPrefixoAeronave(){
        ArrayList lista;
        AeronaveDAO aeronaveDAO = new AeronaveDAO();
        return lista = aeronaveDAO.findComboAeronave();
    }
    
    /**
     * Método para controlar a listagem de aeronaves pelo prefixo.
     * @param prefixo
     * @return 
     */
    public List<Aeronave> listarAeronavePrefixo(String prefixo){
        AeronaveDAO aeroDAO = new AeronaveDAO();
        List<Aeronave> lista = aeroDAO.listarAeronavePrefixo(prefixo);
        return lista;
    }
    
    public List<Aeronave> listarAeronavesTodas(){
        AeronaveDAO aeroDAO = new AeronaveDAO();
        List<Aeronave> lista = aeroDAO.listarTodasAeronaves();
        return lista; 
    }
    
}

