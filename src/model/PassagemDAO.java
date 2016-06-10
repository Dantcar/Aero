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
 *
 * @author Dac
 */
public class PassagemDAO {
    private Connection conexao;
    private Statement stmt;
    private ResultSet rs;
    public int idPassagemNow = 0;

    public PassagemDAO() {
    }

        
    /**
     * método para encerrar Connection, Statement e ResutlSet
     */
    private void close() {
        String msg ="";
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
            msg = msg + e + "\n";
            msg = reduzString(msg);
        }
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, msg); 
        }
        msg="";
    }//fim close()
    
    /**
     * Método para buscar o idPassagem atual
     * @return 
     */
     public int buscarIdPassagemAtual(){
        int resposta = 0;
        String msg = "";
        String sql = "SELECT * FROM passagem ORDER BY 1 DESC";
        conexao = DBAeroFast.getConnection();
        ResultSet rs;
        rs = null;
        
        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
             msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            if (rs.first()) {
                idPassagemNow = rs.getInt(1);
                resposta = idPassagemNow;
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         close();
        
        try {   
            if(conexao.isClosed()){
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, msg); 
        }
        msg="";
        
        return resposta;
    }//fim método buscarIDPassagemAtual
    
    /**
     * Método que encontra a passagem se existir passando como parametro o 
     * número da passagem.
     * @param numeroPassagem
     * @return 
     */
    public boolean buscarExistePassagemNumero(String numeroPassagem) {
       boolean resposta = false;
       
       String msg = "";
       String sql = "SELECT * FROM passagem WHERE prefixo = '" + numeroPassagem + "'";
       conexao = DBAeroFast.getConnection();
       ResultSet rs;
       rs = null;
       
        try {
            stmt = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            if (rs.first()){
                resposta = false;
            }
        } catch (SQLException ex) {
            msg = "" + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        close();
        
        try {
            if (!conexao.isClosed()) {
                msg = msg + "Conexão ao banco nao  fechada.\n";
            }
        } catch (SQLException ex) {
            msg = msg + ex;
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, reduzString(msg)); 
        }
        msg="";
        
      return resposta; 
    }// fim buscarExistePassagemNumero

    
    
    public void inserirNovaPassagem(String numeroPassagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Passagem buscarNovaPassagem(String numeroPassagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void alterarPassagem(Passagem passagem, String vnumeroPassagem) {
        String msg = "";
        conexao = DBAeroFast.getConnection();
        
        try {            
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "UPDATE passagem SET "
                + "numeropassagem = '" + passagem.getNumeroPassagem() + "', "
                + "nomepassageiro = '" + passagem.getNomePassageiro() + "', "
                + "rgpassageiro = '" + passagem.getRgPassageiro() + "', "
                + "reserva = '" + passagem.getReserva() + "', "
                + "voonumero = '" + passagem.getVooNumero() + "', "
                + "ciaaerea = '" + passagem.getCiaAerea() + "', "
                + "assentonumero = '" + passagem.getAssentoNumero() + "', "
                + "classe = '" + passagem.getClasse() + "',"
                + "tarifa = " + passagem.getTarifa() + ", "
                + "datapassagem = '" + passagem.getDataPassagem() + "', "
                + "partidaaeroporto = '" + passagem.getPartidaAeroporto() + "', "
                + "partidasiglaaeroporto = '" + passagem.getPartidaSiglaAeroporto() + "', "
                + "partidadata = '" + passagem.getPartidaData() + "', "
                + "partidaportao = '" + passagem.getPartidaPortao() + "', "
                + "chegadaaeroporto = '" + passagem.getChegadaAeroporto() + "', "
                + "chegadasiglaaeroporto = '" + passagem.getChegadaSiglaAeroporto() + "', "
                + "chegadadata = '" + passagem.getChegadaData() + "', "
                + "chegadahora = '" + passagem.getChegadaHora() + "', "
                + "chegadaportao = '" + passagem.getChegadaPortao() + "', "
                + "escalasvoo = '" + passagem.getEscalasVoo() + "' "
                + " WHERE numeropassagem = '" + vnumeroPassagem + "'";
        
        try {
            stmt.executeUpdate(sql);
            System.out.println("Esta é minha SQL: " + sql);
            msg = msg + "Dados da passagem alterados com sucesso. \n";
        } catch (SQLException ex) {
            msg = reduzString(msg + ex);
            msg = reduzString(msg);
            msg = msg + "Erro de gravação no BD. \n"; // JOptionPane.showMessageDialog(null,msg );
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        close();
        try {
            if (conexao.isClosed()) {
             msg = msg + "Conexão ao banco fechada" +"\n";  
            }
        } catch (SQLException ex) {
            msg = msg + ex + "\n";
            msg = reduzString(msg);
            Logger.getLogger(PassagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ("".equals(msg)){
        }else{
            JOptionPane.showMessageDialog(null, msg); 
        }
        msg = "";
    }// fim método alterarPassagem

    
    public void deletarPassagem(Passagem passagem, String numeroPassagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}//fim Classe PassagemDAO 
