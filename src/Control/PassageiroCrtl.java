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
import model.Passageiro;
import model.PassageiroDAO;

public class PassageiroCrtl {
    private Object passDAO;
    
    public void receberPassageiro(Passageiro passageiro) throws ClassNotFoundException, SQLException{
        PassageiroDAO passDAO = new PassageiroDAO();
        passDAO.inserirNovoPassageiro(passageiro);
    }
    
    
}
