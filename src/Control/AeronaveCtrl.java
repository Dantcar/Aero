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

       
     public void receberAeronave(Aeronave aeronave) throws ClassNotFoundException, SQLException {
        AeronaveDAO aeroDAO = new AeronaveDAO();
        aeroDAO.inserirNovaAeronave(aeronave);
    }
    
    public static Aeronave receberAeronavePrefixo(String prefixo) throws ClassNotFoundException, SQLException {
        AeronaveDAO aeroDAO = new AeronaveDAO();
        Aeronave aeronave = aeroDAO.buscarAeronavePrefixo(prefixo);
        //System.out.println("Estamos no método do controle receberClienteRG em PassageiroCtrl " + rg + "\n");
        //System.out.println("nome " + cliente.getNome() + "\n");
        //System.out.println("Nascimento " + cliente.getNascimento() + "\n");
        return aeronave;
    }
    
    public void alterarAeronaveCtrl(Aeronave aeronave, String prefixo) throws SQLException{
        AeronaveDAO aeroDAO = new AeronaveDAO();
        aeroDAO.alterarAeronave(aeronave, prefixo);
    }
    
    public void deletarAeronaveCtrl(Aeronave aeronave, String prefixo) throws SQLException{
       AeronaveDAO aeroDAO = new AeronaveDAO();
       aeroDAO.deletarAeronave(aeronave, prefixo);
        
    }
    
}

