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
import model.Passageiro;
import model.PassageiroDAO;

public class PassageiroCtrl {

    public static boolean receberPesquisarPassageiroRG(String rg) {
        boolean resposta = false;
        PassageiroDAO passageiro = new PassageiroDAO();
        resposta = passageiro.buscarExistePassageiroRG(rg);
        return resposta;
    }

    public static Cliente receberClienteCPF(String cpf) throws ClassNotFoundException, SQLException {
        ClienteDAO cliDAO = new ClienteDAO();
        Cliente cliente = cliDAO.buscarClienteCPF(cpf);
        
        return cliente;
    }
    private Object passDAO;

    public void receberPassageiro(Passageiro passageiro) throws ClassNotFoundException, SQLException {
        PassageiroDAO passDAO = new PassageiroDAO();
        passDAO.inserirNovoPassageiro(passageiro);
    }

    public static Passageiro receberPassageiroRG(String rg) throws ClassNotFoundException, SQLException {
        PassageiroDAO passDAO = new PassageiroDAO();
        Passageiro passageiro = passDAO.buscarPassageiroRG(rg);
        return passageiro;
    }

    public static Cliente receberClienteRG(String rg) throws ClassNotFoundException, SQLException {
        ClienteDAO cliDAO = new ClienteDAO();
        Cliente cliente = cliDAO.buscarClienteRG(rg);
        System.out.println("Estamos no método do controle receberClienteRG em PassageiroCtrl " + rg + "\n");
        System.out.println("nome " + cliente.getNome() + "\n");
        System.out.println("Nascimento " + cliente.getNascimento() + "\n");
        return cliente;

    }
}
