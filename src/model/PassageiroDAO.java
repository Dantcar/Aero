/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package model;

import static Control.Util.reduzString;
import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PassageiroDAO {

    private Connection conexao;
    private Statement stmt;
    private ResultSet rs;
    public int idPassageiroNow = 0;

    /**
     * método para encerrar Connection, Statement e ResutlSet
     */
    private void close() {
        try {
            if (rs != null) {
                rs.close();
            }

            if (stmt != null) {
                stmt.close();
            }

            if (conexao != null) {
                conexao.close();
            }
        } catch (Exception e) {
        }
    }//fim close()

    /**
     * Método para atualizar com o idPassageiro de maior valor ao iniciar o
     * programa
     *
     * @return
     */
    @SuppressWarnings("null")
    public int buscarIdPassageiroAtual() {
        int resposta = 0;
        String msg;
        msg = "";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;
        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, reduzString(msg + ex));
            Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery("SELECT * FROM passageiro ORDER BY 1 DESC"); //select * from DAC.CLIENTE order BY 1 DESC

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, reduzString(msg + ex));
            Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                idPassageiroNow = rs.getInt(1);
                resposta = idPassageiroNow;

                close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PassageiroDAO.class.getName()).log(Level.SEVERE, null, ex);
            msg = "" + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            close();
            resposta = 0;
        }

        return resposta;
    }//fim buscar idPassageiroAtual

    /**
     * Método para inserir novo passageiro na base de dados.
     *
     * @param passageiro
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void inserirNovoPassageiro(Passageiro passageiro) throws ClassNotFoundException, SQLException {
        String msg;

        int idPassageiro = buscarIdPassageiroAtual();
        System.out.println(idPassageiro);
        idPassageiro = idPassageiro + 1;

        System.out.println("\nEste id vai pro banco :" + idPassageiro);
        msg = "";
        conexao = DBAeroFast.getConnection();
        stmt = conexao.createStatement();
        String sql = "INSERT INTO passageiro VALUES ("
                //+ parseInt(passageiro.getIdCliente()) +", "
                + idPassageiro + ", "
                + "'" + passageiro.getNomePassageiro() + "', "
                + "'" + passageiro.getNascimentoPassageiro() + "', "
                + "'" + passageiro.getRgPassageiro() + "', "
                + "'" + passageiro.getTelefonePassageiro() + "', "
                + "'" + passageiro.getEmailPassageiro() + "', "
                + "'" + passageiro.getContatoNome() + "', "
                + "'" + passageiro.getContatoTelefone() + "', "
                + "'" + passageiro.getResponsavelFinanceiro() + "', "
                + "'" + passageiro.getResponsavelCPF() + "')";

        try {
            stmt.execute(sql);

            msg = msg + "Dados do passageiro inseridos com sucesso \n";
            // JOptionPane.showMessageDialog(null, msg );
        } catch (SQLException | HeadlessException e) {
            msg = reduzString(msg + e);
            msg = msg + "Erro de gravação no BD \n";
            // JOptionPane.showMessageDialog(null,msg );
        }
        close();
        if (conexao.isClosed()) {
            msg = msg + "Conexão ao banco fechada";
            JOptionPane.showMessageDialog(null, msg);
        }

    }//fim inserir passageiro

    /**
     * Método para encontrar um passageiro atravez do seu RG.
     *
     * @param rg
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Passageiro buscarPassageiroRG(String rg) throws ClassNotFoundException, SQLException {
        Passageiro passageiro = new Passageiro();
        String msg;
        msg = "";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        //stmt = conexao.createStatement();
        stmt = conexao.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        rs = stmt.executeQuery("SELECT * FROM passageiro WHERE rgpassageiro = '" + rg + "'");
        if (rs.first()) {
            //passageiro.idCliente
            passageiro.setIdPassageiro(rs.getString(1));
            //passageiro.nome;
            passageiro.setNomePassageiro(rs.getString(2));
            //passageiro.nascimento;
            passageiro.setNascimentoPassageiro(rs.getString(3));
            //passageiro.endereco;
            passageiro.setRgPassageiro(rs.getString(4));
            //clente.Numero;
            passageiro.setTelefonePassageiro(rs.getString(5));
            //passageiro.Bairro;
            passageiro.setEmailPassageiro(rs.getString(6));
            //passageiro.cidade;
            passageiro.setContatoNome(rs.getString(7));
            //passageiro.uf;
            passageiro.setContatoTelefone(rs.getString(8));
            //passageiro.cep;
            passageiro.setResponsavelFinanceiro(rs.getString(9));
            //passageiro.email;
            passageiro.setResponsavelCPF(rs.getString(10));

            close();

            return passageiro;

        } else {
            msg = "Passageiro não encontrado";
            JOptionPane.showMessageDialog(null, msg);
            close();
            return null;
        }

    }// fim buscar passageiro

    /**
     * Método para verificar a existencia de um RG de passageiro na base de dados
     * @param rg
     * @return 
     */
    public boolean buscarExistePassageiroRG(String rg) {
        boolean resposta = true;
        String msg;
        msg = "";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;
        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = reduzString(msg+ex);
            JOptionPane.showMessageDialog(null, reduzString(msg + ex));
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery("SELECT * FROM passageiro WHERE rgpassageiro = '" + rg + "'");
        } catch (SQLException ex) {
            msg = reduzString(msg+ex);
            JOptionPane.showMessageDialog(null, reduzString(msg + ex));
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                close();
                resposta = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            msg = "" + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            close();
            resposta = false;
        }

        return resposta;
    }//Fim buscarExistePassageiroRG
    
    /**
     * Método para realizar alterações na tabela passageiro,
     * enviando o parametro passageiro e rg.
     * @param passageiro
     * @param vrg
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public void alterarPassageiro(Passageiro passageiro, String vrg) throws ClassNotFoundException, SQLException{
        String msg;
        msg="";
        conexao = DBAeroFast.getConnection();
        stmt = conexao.createStatement();
        
        //String sql = "UPDATE passageiro SET " + "CPF = '"+ passageiro.getCpf()+ "' WHERE CPF = '" + vcpf + "'" ;    
        String sql = "UPDATE passageiro SET "
                //+ "idPassageiro = "+ parseInt(passageiro.getIdPassageiro())+", "
                + "nomePassageiro = '" + passageiro.getNomePassageiro() + "', "
                + "nascimentoPassageiro = '" + passageiro.getNascimentoPassageiro() + "', "
                + "rgPassageiro = '" + passageiro.getRgPassageiro() + "', "
                + "telefonePassageiro = '" + passageiro.getTelefonePassageiro() + "', "
                + "emailPassageiro = '" + passageiro.getEmailPassageiro() + "', "
                + "contatoNome = '" + passageiro.getContatoNome() + "', "
                + "contatoTelefone = '" + passageiro.getContatoTelefone() + "', "
                + "responsavelFinanceiro = '" + passageiro.getResponsavelFinanceiro() + "', "
                + "responsavelCPF = '" + passageiro.getResponsavelCPF() + "' "
                + " WHERE RGPASSAGEIRO = '" + vrg +"'";
        System.out.println(sql);
        try {
            stmt.execute(sql);
           
            msg = msg+"Dados do passageiro alterados com sucesso \n";
           // JOptionPane.showMessageDialog(null, msg );
        } catch (SQLException | HeadlessException e) {
            msg = reduzString(msg+e);
            msg = reduzString(msg);
            msg = msg+"Erro de gravação no BD \n";
           // JOptionPane.showMessageDialog(null,msg );
        }
        close();
        if (conexao.isClosed()){
         msg = msg+"Conexão ao banco fechada";
         JOptionPane.showMessageDialog(null,msg );   
        }
         
    }//fim alterar passageiro
    
    

}
