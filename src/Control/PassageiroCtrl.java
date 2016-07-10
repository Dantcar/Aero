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
import model.Cliente;
import model.ClienteDAO;
import model.Passageiro;
import model.PassageiroDAO;

public class PassageiroCtrl {

    /**
     * Método para controlar busca de passageiro enviando rg.
     *
     * @param rg
     * @return
     */
    public static boolean receberPesquisarPassageiroRG(String rg) {
        boolean resposta = false;
        PassageiroDAO passageiro = new PassageiroDAO();
        resposta = passageiro.buscarExistePassageiroRG(rg);
        return resposta;
    }

    /**
     * Método para controlar busca de cliente fornecendo um cpf.
     *
     * @param cpf
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Cliente receberClienteCPF(String cpf) throws ClassNotFoundException, SQLException {
        ClienteDAO cliDAO = new ClienteDAO();
        Cliente cliente = cliDAO.buscarClienteCPF(cpf);

        return cliente;
    }
    private Object passDAO;

    /*
     * Método para controlar o recebimento de passageiro a ser incluido na base.
     * @param passageiro
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public void receberPassageiro(Passageiro passageiro) throws ClassNotFoundException, SQLException {
        PassageiroDAO passDAO = new PassageiroDAO();
        passDAO.inserirNovoPassageiro(passageiro);
    }

    /**
     * Método de controle para receber um passageiro ao enviar seu rg.
     *
     * @param rg
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Passageiro receberPassageiroRG(String rg) throws ClassNotFoundException, SQLException {
        PassageiroDAO passDAO = new PassageiroDAO();
        Passageiro passageiro = passDAO.buscarPassageiroRG(rg);
        return passageiro;
    }

    /**
     * Método de controle para receber os dados de cliente ao enviar seu rg.
     *
     * @param rg
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Cliente receberClienteRG(String rg) throws ClassNotFoundException, SQLException {
        ClienteDAO cliDAO = new ClienteDAO();
        Cliente cliente = cliDAO.buscarClienteRG(rg);
        return cliente;
    }

    /**
     * Método de controle da alteração de um passageiro passando o seu rg.
     *
     * @param passageiro
     * @param rg
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void alterarPassageiroCtrl(Passageiro passageiro, String rg) throws ClassNotFoundException, SQLException {
        PassageiroDAO passDAO = new PassageiroDAO();
        passDAO.alterarPassageiro(passageiro, rg);
    }

    /**
     * Método de controle para exclusão de um passageiro ao enviar seu rg.
     *
     * @param passageiro
     * @param rg
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void deletarPassageiroCtrl(Passageiro passageiro, String rg) throws ClassNotFoundException, SQLException {
        PassageiroDAO passDAO = new PassageiroDAO();
        passDAO.deletarPassageiro(passageiro, rg);
    }

    public List listaPassageiroNome(String nomePassageiro) {
      PassageiroDAO passageiroDAO = new PassageiroDAO();
        List<Passageiro> lista = passageiroDAO.listarNomePassageiro(nomePassageiro);
        return lista;  
        
    }

    public List listarTodosPassageiros() {
        PassageiroDAO passageiroDAO = new PassageiroDAO();
        List<Passageiro> lista = passageiroDAO.listarTodosPassageiros();
        return lista;
    }

    public ArrayList populaComboPassageiroNome() {
        ArrayList lista;
        PassageiroDAO passageiroDAO = new PassageiroDAO();
        return lista = passageiroDAO.findComboNomePassageiro();

    }

}
