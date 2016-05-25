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
import model.Cliente;
import model.ClienteDAO;

/**
 *
 * @author Dac
 */
public class ClienteCtrl {
    private Object CliDAO;
    
     public void receberCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.inserirNovoCliente(cliente);
    }
     
     public Cliente receberClienteCPF(String cpf) throws ClassNotFoundException, SQLException{
        ClienteDAO cliDAO = new ClienteDAO();
        Cliente cliente = cliDAO.buscarClienteCPF(cpf);
        return cliente;
    }
   
}
