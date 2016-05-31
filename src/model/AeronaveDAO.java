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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * *
 *
 * @author deciodecarvalho
 */
public class AeronaveDAO {

    private Connection conexao;
    private Statement stmt;
    private ResultSet rs;
    public int idAeronaveNow = 0;

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

    public int buscarIdAeronaveAtual() {
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
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery("SELECT * FROM aeronave ORDER BY 1 DESC"); //select * from DAC.AERONAVE order BY 1 DESC

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, reduzString(msg + ex));
            Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (rs.first()) {
                idAeronaveNow = rs.getInt(1);
                resposta = idAeronaveNow;

                close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            msg = "" + ex;
            JOptionPane.showMessageDialog(null, reduzString(msg));
            close();
            resposta = 0;
        }
        return resposta;

    }//fim buscar idAeronaveAtual
    
    public boolean buscarExisteAeronavePrefixo(String prefixo){
        boolean resposta = true;
        String msg;
        
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;
            try {
                 stmt =conexao.createStatement(
                 ResultSet.TYPE_SCROLL_INSENSITIVE,
                 ResultSet.CONCUR_READ_ONLY);
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, reduzString(msg + ex));
                 Logger.getLogger(AeronaveDAO.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            
            return resposta;
    }
    
}
